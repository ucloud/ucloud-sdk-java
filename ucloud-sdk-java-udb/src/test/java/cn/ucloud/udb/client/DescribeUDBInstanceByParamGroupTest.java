package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBInstanceByParamGroupParam;
import cn.ucloud.udb.model.DescribeUDBInstanceByParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:20
 **/
public class DescribeUDBInstanceByParamGroupTest {

    private UDBClient client;

    private DescribeUDBInstanceByParamGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceByParamGroupParam("cn-sh2", "cn-sh2-02", 29);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceByParamGroup() {
        try {
            DescribeUDBInstanceByParamGroupResult result = client.describeUDBInstanceByParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceByParamGroupCallback() {
        client.describeUDBInstanceByParamGroup(param, new UcloudHandler<DescribeUDBInstanceByParamGroupResult>() {
            @Override
            public Object success(DescribeUDBInstanceByParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceByParamGroupResult result) {
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