package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DeleteUDBCInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceByHostIpParam;
import cn.ucloud.udb.model.DescribeUDBInstanceByHostIpResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:16
 **/
public class DescribeUDBInstanceByHostIpTest {

    private UDBClient client;

    private DescribeUDBInstanceByHostIpParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceByHostIpParam("cn-sh2", "cn-sh2-02", "10.23.148.134");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 describle udb instance from host ip error
    @Test
    public void describeUDBInstanceByHostIp() {
        try {
            DescribeUDBInstanceByHostIpResult result = client.describeUDBInstanceByHostIp(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceByHostIpCallback() {
        client.describeUDBInstanceByHostIp(param, new UcloudHandler<DescribeUDBInstanceByHostIpResult>() {
            @Override
            public Object success(DescribeUDBInstanceByHostIpResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceByHostIpResult result) {
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