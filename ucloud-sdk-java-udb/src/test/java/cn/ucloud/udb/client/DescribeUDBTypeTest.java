package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBTypeParam;
import cn.ucloud.udb.model.DescribeUDBTypeResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:10
 **/
public class DescribeUDBTypeTest {

    private UDBClient client;

    private DescribeUDBTypeParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBTypeParam("cn-sh2", "cn-sh2-02");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBCType() {
        try {
            DescribeUDBTypeResult result = client.describeUDBType(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBCTypeCallback() {
        client.describeUDBType(param, new UcloudHandler<DescribeUDBTypeResult>() {
            @Override
            public Object success(DescribeUDBTypeResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBTypeResult result) {
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