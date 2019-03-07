package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DescribeUDBInstancePhpMyAdminURLParam;
import cn.ucloud.udb.model.DescribeUDBInstancePhpMyAdminURLResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:34
 **/
public class DescribeUDBInstancePhpMyAdminURLTest {


    private UDBClient client;

    private DescribeUDBInstancePhpMyAdminURLParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstancePhpMyAdminURLParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstancePhpMyAdminURL() {
        try {
            DescribeUDBInstancePhpMyAdminURLResult result = client.describeUDBInstancePhpMyAdminURL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstancePhpMyAdminURLCallback() {
        client.describeUDBInstancePhpMyAdminURL(param, new UcloudHandler<DescribeUDBInstancePhpMyAdminURLResult>() {
            @Override
            public Object success(DescribeUDBInstancePhpMyAdminURLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstancePhpMyAdminURLResult result) {
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