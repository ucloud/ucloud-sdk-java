package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBSplittingInfoParam;
import cn.ucloud.udb.model.DescribeUDBSplittingInfoResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:05
 **/
public class DescribeUDBSplittingInfoTest {

    private UDBClient client;

    private DescribeUDBSplittingInfoParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBSplittingInfoParam("cn-sh2", "cn-sh2-02",
                "udb-04wyi5pz");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBSplittingInfo() {
        try {
            DescribeUDBSplittingInfoResult result = client.describeUDBSplittingInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}