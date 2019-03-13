package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBInstanceUpgradePriceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceUpgradePriceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:31
 **/
public class DescribeUDBInstanceUpgradePriceTest {

    private UDBClient client;

    private DescribeUDBInstanceUpgradePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceUpgradePriceParam("cn-sh2", "udb-h3q25faw",
                1000, 30);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceUpgradePrice() {
        try {
            DescribeUDBInstanceUpgradePriceResult result = client.describeUDBInstanceUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceUpgradePriceCallback() {
        client.describeUDBInstanceUpgradePrice(param, new UcloudHandler<DescribeUDBInstanceUpgradePriceResult>() {
            @Override
            public Object success(DescribeUDBInstanceUpgradePriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceUpgradePriceResult result) {
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