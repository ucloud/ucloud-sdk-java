package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DeleteUDBBackupParam;
import cn.ucloud.udb.model.DescribeUDBCPriceParam;
import cn.ucloud.udb.model.DescribeUDBCPriceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:48
 **/
public class DescribeUDBCPriceTest {

    private UDBClient client;

    private DescribeUDBCPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBCPriceParam("cn-sh2", "cn-sh2-02");
        param.setProjectId("org-izug1m");
    }
    // todo 测试  没有权限
    @Test
    public void describeUDBCPrice() {
        try {
            DescribeUDBCPriceResult result = client.describeUDBCPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBCPriceCallback() {
        client.describeUDBCPrice(param, new UcloudHandler<DescribeUDBCPriceResult>() {
            @Override
            public Object success(DescribeUDBCPriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBCPriceResult result) {
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