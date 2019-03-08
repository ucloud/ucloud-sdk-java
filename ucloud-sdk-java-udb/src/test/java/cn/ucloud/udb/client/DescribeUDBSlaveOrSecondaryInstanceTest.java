package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DescribeUDBSlaveOrSecondaryInstanceParam;
import cn.ucloud.udb.model.DescribeUDBSlaveOrSecondaryInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:52
 **/
public class DescribeUDBSlaveOrSecondaryInstanceTest {
    private UDBClient client;

    private DescribeUDBSlaveOrSecondaryInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBSlaveOrSecondaryInstanceParam(
                "cn-sh2", "udb-5yb2i0vn", "mongo");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBSlaveOrSecondaryInstance() {
        try {
            DescribeUDBSlaveOrSecondaryInstanceResult result =
                    client.describeUDBSlaveOrSecondaryInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBSlaveOrSecondaryInstanceCallback() {
        client.describeUDBSlaveOrSecondaryInstance(param,
                new UcloudHandler<DescribeUDBSlaveOrSecondaryInstanceResult>() {
                    @Override
                    public Object success(DescribeUDBSlaveOrSecondaryInstanceResult result) {
                        JSONComparator.jsonComparator(result);
                        return null;
                    }

                    @Override
                    public Object failed(DescribeUDBSlaveOrSecondaryInstanceResult result) {
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