package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeDBTransferTaskParam;
import cn.ucloud.udb.model.DescribeDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 16:39
 **/
public class DescribeDBTransferTaskTest {

    private UDBClient client;

    private DescribeDBTransferTaskParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeDBTransferTaskParam("cn-sh2", "cn-sh2-02", 10, 0);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeDBTransferTask() {
        try {
            DescribeDBTransferTaskResult result = client.describeDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }

    }

    @Test
    public void describeDBTransferTaskCallback() {
        client.describeDBTransferTask(param, new UcloudHandler<DescribeDBTransferTaskResult>() {
            @Override
            public Object success(DescribeDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeDBTransferTaskResult result) {
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