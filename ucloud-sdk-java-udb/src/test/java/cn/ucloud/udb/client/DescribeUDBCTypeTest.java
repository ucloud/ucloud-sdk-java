package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBCPriceParam;
import cn.ucloud.udb.model.DescribeUDBCTypeParam;
import cn.ucloud.udb.model.DescribeUDBCTypeResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:50
 **/
public class DescribeUDBCTypeTest {

    private UDBClient client;

    private DescribeUDBCTypeParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBCTypeParam("cn-sh2", "cn-sh2-02");
        param.setProjectId("org-izug1m");
    }
    // todo 测试 没有权限
    @Test
    public void describeUDBCType() {
        try {
            DescribeUDBCTypeResult result = client.describeUDBCType(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBCTypeCallback() {
        client.describeUDBCType(param, new UcloudHandler<DescribeUDBCTypeResult>() {
            @Override
            public Object success(DescribeUDBCTypeResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBCTypeResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        },false);
    }
}