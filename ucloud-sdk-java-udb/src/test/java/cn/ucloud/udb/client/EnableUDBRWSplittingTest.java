package cn.ucloud.udb.client;

import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DescribeUDBInstanceUpgradePriceParam;
import cn.ucloud.udb.model.EnableUDBRWSplittingParam;
import cn.ucloud.udb.model.EnableUDBRWSplittingResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:21
 **/
public class EnableUDBRWSplittingTest {

    private UDBClient client;

    private EnableUDBRWSplittingParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new EnableUDBRWSplittingParam("cn-sh2", "cn-sh2-02",
                "udb-zahyyi04");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void enableUDBRWSplitting() {
        try {
            EnableUDBRWSplittingResult result = client.enableUDBRWSplitting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void enableUDBRWSplittingCallback() {
    }
}