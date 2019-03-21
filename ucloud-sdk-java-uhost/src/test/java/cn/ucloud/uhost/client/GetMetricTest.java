package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.GetMetricParam;
import cn.ucloud.uhost.model.GetMetricResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-15 16:06
 **/
public class GetMetricTest {

    private UhostClient client;

    private GetMetricParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> metricNames = new ArrayList<>();
        metricNames.add("NetPacketIn");
        param = new GetMetricParam("cn-sh2", "cn-sh2-02",
                "uhost-dwomflqt", "uhost",metricNames);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void getMetric() {
        try {
            GetMetricResult result = client.getMetric(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}