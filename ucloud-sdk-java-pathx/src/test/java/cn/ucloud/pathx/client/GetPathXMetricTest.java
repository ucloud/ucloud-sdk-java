package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetPathXMetricParam;
import cn.ucloud.pathx.model.GetPathXMetricResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetPathXMetric 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetPathXMetricTest {

    private PATHXClient client;

    private GetPathXMetricParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String resourceId = "cn-sh2";
        Integer beginTime = 1;
        Integer endTime = 1;
        String resourceType = "upath";
        String lineId = "line_hk_cn-gd";
        List<String> metricNames = new ArrayList<>();
        metricNames.add("NetworkOut");
        metricNames.add("NetworkIn");
        metricNames.add("NetworkOutUsage");
        metricNames.add("NetworkInUsage");
        metricNames.add("TCPDelay");
        metricNames.add("InputRetransmitRate");
        metricNames.add("OutputRetransmitRate");
        metricNames.add("TCPConNum");
        param = new GetPathXMetricParam(projectId, resourceId, beginTime, endTime,
                resourceType, lineId,metricNames);
    }
    @Test
    public void getPathXMetric() {
        try {
            GetPathXMetricResult result = client.getPathXMetric(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}