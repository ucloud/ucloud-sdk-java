package cn.ucloud.common.accessor;

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

class DemoRequest extends Request {

    @UCloudParam("Name")
    private String name;

    @UCloudParam("CPU")
    private Integer cpu;

    @UCloudParam("Size")
    private Double size;

    @UCloudParam("UHostIds")
    private List<String> uhostIds;

    @UCloudParam("Led")
    private Led led;

    @UCloudParam("NetworkInterface")
    private List<NetworkInterface> networkInterface;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public List<String> getUhostIds() {
        return uhostIds;
    }

    public void setUhostIds(List<String> uhostIds) {
        this.uhostIds = uhostIds;
    }

    public Led getLed() {
        return led;
    }

    public void setLed(Led led) {
        this.led = led;
    }

    public List<NetworkInterface> getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(List<NetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
    }

    static class Led extends Request {

        @UCloudParam("Enabled")
        private Boolean enabled;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }

    static class NetworkInterface extends Request {

        @UCloudParam("Bandwidth")
        private Integer bandwidth;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }
    }

    DemoRequest() {
        super();
    }
}

class DemoResponse extends Response {}

public class RequestTest {

    @Test
    public void testRequest() {
        DemoRequest request = new DemoRequest();

        request.setName("foo");
        request.setCpu(1);
        request.setSize(42.0);
        request.setUhostIds(Arrays.asList("uhost-xxx", "uhost-yyy"));

        DemoRequest.Led led = new DemoRequest.Led();
        led.setEnabled(true);
        request.setLed(led);

        DemoRequest.NetworkInterface ni = new DemoRequest.NetworkInterface();
        ni.setBandwidth(42);
        request.setNetworkInterface(Collections.singletonList(ni));

        request.setAction("Foo");
        request.setPublicKey("keyfoobar42==");
        request.setSignature("sig42==");
        Assert.assertEquals("Foo", request.getAction());
        Assert.assertEquals("keyfoobar42==", request.getPublicKey());
        Assert.assertEquals("sig42==", request.getSignature());

        request.withMaxRetries(3);
        request.withTimeout(30);
        Assert.assertEquals(new Integer(30), request.loadTimeout());

        Map<String, Object> expected = new HashMap<>();
        expected.put("Name", "foo");
        expected.put("Size", 42.0);
        expected.put("Led.Enabled", true);
        expected.put("CPU", 1);
        expected.put("UHostIds.0", "uhost-xxx");
        expected.put("UHostIds.1", "uhost-yyy");
        expected.put("NetworkInterface.0.Bandwidth", 42);
        expected.put("Action", "Foo");
        expected.put("PublicKey", "keyfoobar42==");
        expected.put("Signature", "sig42==");

        try {
            Map<String, Object> result = request.encode();
            Assert.assertEquals(expected, result);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }

    @Test
    public void testResponse() {
        Response response = new Response();

        response.setRequestId("xxxx-xxxx");
        Assert.assertEquals("xxxx-xxxx", response.getRequestId());

        response.setRetCode(42);
        Assert.assertEquals(new Integer(42), response.getRetCode());

        response.setAction("foo");
        Assert.assertEquals("foo", response.getAction());

        response.setMessage("...");
        Assert.assertEquals("...", response.getMessage());
    }
}
