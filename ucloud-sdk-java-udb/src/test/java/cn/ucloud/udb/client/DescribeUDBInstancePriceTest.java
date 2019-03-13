package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBInstancePhpMyAdminURLParam;
import cn.ucloud.udb.model.DescribeUDBInstancePriceParam;
import cn.ucloud.udb.model.DescribeUDBInstancePriceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:11
 **/
public class DescribeUDBInstancePriceTest {

    private UDBClient client;

    private DescribeUDBInstancePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstancePriceParam("cn-sh2", "cn-sh2-02",
                1000,20,"mongodb-3.2");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describeUDBInstancePrice() {
        try {
            DescribeUDBInstancePriceResult result = client.describeUDBInstancePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstancePriceCallback() {
        client.describeUDBInstancePrice(param, new UcloudHandler<DescribeUDBInstancePriceResult>() {
            @Override
            public Object success(DescribeUDBInstancePriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstancePriceResult result) {
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