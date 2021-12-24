package cn.ucloud.common.client;

import static org.junit.Assert.assertEquals;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;
import cn.ucloud.common.transport.DefaultTransport;
import org.apache.http.*;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Test;
import org.mockito.Mockito;

public class ClientTest {

    @Test
    public void testCaseOK() {
        Request request = new Request();
        request.setAction("GetRegion");

        Response response = new Response();
        response.setRetCode(0);
        this.testInvoke(request, response, null, false);
    }

    @Test
    public void testCaseNotFound() {
        Request request = new Request();
        request.setAction("NotFound");

        Response response = new Response();
        response.setRetCode(161);
        this.testInvoke(request, response, null, true);
    }

    @Test
    public void testCaseException() {
        Request request = new Request();
        request.setAction("GetRegion");

        Response response = new Response();
        response.setRetCode(0);
        this.testInvoke(request, response, new HttpException("some exception occurs") {}, true);
    }

    @Test
    public void testCaseRemote() {
        Request request = new Request();
        request.setAction("GetRegion");

        Response response = new Response();
        response.setRetCode(0);
        this.testInvoke(request, null, null, false);
    }

    public void testInvoke(
            Request request, Response response, Exception injectedException, Boolean hasException) {
        Config config = new Config();
        config.setUserAgent("Demo/0.42");
        Credential credential =
                new Credential(
                        System.getenv("UCLOUD_PUBLIC_KEY"), System.getenv("UCLOUD_PRIVATE_KEY"));
        DefaultClient client = new DefaultClient(config, credential);
        DefaultTransport transport = (DefaultTransport) client.getTransport();

        if (injectedException != null) {
            // inject exception into http client of transport
            CloseableHttpClient httpClient = Mockito.mock(CloseableHttpClient.class);
            try {
                HttpPost httpPost = new HttpPost();
                Mockito.doThrow(injectedException).when(httpClient).execute(httpPost);
            } catch (Exception e) {
                e.printStackTrace();
            }
            transport.setHttpClient(httpClient);
        } else if (response != null) {
            transport = Mockito.mock(DefaultTransport.class);
            try {
                Mockito.when(transport.invoke(request, response.getClass())).thenReturn(response);
            } catch (UCloudException e) {
                e.printStackTrace();
            }
        } else {
            response = new Response();
        }

        client.setTransport(transport);

        try {
            client.invoke(request, response.getClass());
        } catch (UCloudException e) {
            e.printStackTrace();
            assertEquals(true, hasException);
            return;
        }
        assertEquals(false, hasException);
    }
}
