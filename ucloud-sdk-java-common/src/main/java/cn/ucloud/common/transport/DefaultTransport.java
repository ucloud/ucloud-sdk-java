/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.common.transport;

import cn.ucloud.common.exception.TransportException;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;

import com.google.gson.Gson;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/** DefaultTransport is the default implementation of transport */
public class DefaultTransport implements Transport {

    private static final String HEADER_REQUEST_ID = "X-UCLOUD-REQUEST-UUID";

    private String baseUrl;

    private String userAgent;

    private CloseableHttpClient httpClient;

    public DefaultTransport(String baseUrl, String userAgent) {
        this.setBaseUrl(baseUrl);
        this.setUserAgent(userAgent);
        this.httpClient = HttpClients.createDefault();
    }

    @Override
    public Response invoke(Request request, Class<? extends Response> clazz)
            throws UCloudException {
        HttpPost httpPost = new HttpPost(this.getBaseUrl());

        // inject user agent
        String ua =
                String.format("Java/%s Java-SDK/%s", System.getProperty("java.version"), "1.0.0");
        if (!StringUtils.isEmpty(this.getUserAgent())) {
            ua = ua.concat(" ").concat(this.getUserAgent());
        }
        httpPost.setHeader(HTTP.USER_AGENT, ua);

        // build request body
        Map<String, Object> params = request.encode();
        StringEntity entity = new StringEntity(new Gson().toJson(params), StandardCharsets.UTF_8);
        entity.setContentType(ContentType.APPLICATION_JSON.getMimeType());
        httpPost.setHeader(HTTP.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());
        httpPost.setEntity(entity);

        // invoke http requesting
        CloseableHttpResponse httpResponse;
        try {
            httpResponse = this.getHttpClient().execute(httpPost);
        } catch (Exception e) {
            throw new TransportException("http error", e);
        }

        String requestId;
        if (httpResponse.getLastHeader(HEADER_REQUEST_ID) != null) {
            requestId = httpResponse.getLastHeader(HEADER_REQUEST_ID).getValue();
        }

        // check http status
        StatusLine httpStatus = httpResponse.getStatusLine();
        if (httpStatus.getStatusCode() >= 400) {
            throw new UCloudException(
                    String.format(
                            "http error, status code %d %s",
                            httpStatus.getStatusCode(), httpStatus.getReasonPhrase()));
        }

        // decode response
        String content = null;
        try {
            content = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        } catch (IOException e) {
            throw new UCloudException("http error", e);
        }
        Response response = new Gson().fromJson(content, clazz);
        response.setRequestId(requestId);
        return response;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(CloseableHttpClient httpClient) {
        this.httpClient = httpClient;
    }
}
