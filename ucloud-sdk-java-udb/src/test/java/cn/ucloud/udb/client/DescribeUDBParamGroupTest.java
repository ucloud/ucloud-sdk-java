package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBInstanceByHostIpParam;
import cn.ucloud.udb.model.DescribeUDBParamGroupParam;
import cn.ucloud.udb.model.DescribeUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:44
 **/
public class DescribeUDBParamGroupTest {

    private UDBClient client;

    private DescribeUDBParamGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBParamGroupParam("cn-sh2", 10,0);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUDBParamGroup() {
        try {
            DescribeUDBParamGroupResult result = client.describeUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBParamGroupCall() {
        client.describeUDBParamGroup(param, new UcloudHandler<DescribeUDBParamGroupResult>() {
            @Override
            public Object success(DescribeUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBParamGroupResult result) {
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