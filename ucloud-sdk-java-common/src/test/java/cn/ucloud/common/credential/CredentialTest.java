package cn.ucloud.common.credential;

import static org.junit.Assert.*;

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.request.Request;
import org.junit.Assert;
import org.junit.Test;

public class CredentialTest {

    private static final String pubKey = "ucloudsomeone@example.com1296235120854146120";
    private static final String priKey = "46f09bb9fab4f12dfc160dae12273d5332b5debe";

    static class DemoRequest extends Request {

        DemoRequest() {
            super();
        }

        @UCloudParam("Region")
        private String region;

        @UCloudParam("Limit")
        private Integer limit;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }
    }

    @Test
    public void verifyAc() throws UCloudException {
        Credential cred = new Credential(pubKey, priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        DemoRequest request = new DemoRequest();
        request.setAction("DescribeUHostInstance");
        request.setRegion("cn-bj2");
        request.setLimit(10);

        assertEquals("cba5cf5ec4d4233d206b1b54951e3787350a642f", cred.verifyAc(request));
    }
}
