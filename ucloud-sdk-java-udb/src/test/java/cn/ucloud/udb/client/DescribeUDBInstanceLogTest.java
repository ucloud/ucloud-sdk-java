package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBInstanceLogParam;
import cn.ucloud.udb.model.DescribeUDBInstanceLogResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:27
 **/
public class DescribeUDBInstanceLogTest {

    private UDBClient client;

    private DescribeUDBInstanceLogParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceLogParam("cn-sh2", "udb-vh2tznqa", 1551783710,
                "slow");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceLog() {
        try {
            DescribeUDBInstanceLogResult result = client.describeUDBInstanceLog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}