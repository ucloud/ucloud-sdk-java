package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBCInstanceParam;
import cn.ucloud.udb.model.DescribeUDBCInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:45
 **/
public class DescribeUDBCInstanceTest {

    private UDBClient client;

    private DescribeUDBCInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBCInstanceParam("cn-sh2");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 没有UDBC
    @Test
    public void describeUDBCInstance() {
        try {
            DescribeUDBCInstanceResult result = client.describeUDBCInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBCInstanceCallback() {
        client.describeUDBCInstance(param, new UcloudHandler<DescribeUDBCInstanceResult>() {
            @Override
            public Object success(DescribeUDBCInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBCInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}