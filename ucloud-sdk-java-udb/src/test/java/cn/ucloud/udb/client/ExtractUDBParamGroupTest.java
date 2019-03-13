package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBInstanceParam;
import cn.ucloud.udb.model.ExtractUDBParamGroupParam;
import cn.ucloud.udb.model.ExtractUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:24
 **/
public class ExtractUDBParamGroupTest {

    private UDBClient client;

    private ExtractUDBParamGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ExtractUDBParamGroupParam("cn-sh2", "cn-sh2-02",1);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void extractUDBParamGroup() {
        try {
            ExtractUDBParamGroupResult result = client.extractUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void extractUDBParamGroupCallback() {
        client.extractUDBParamGroup(param, new UcloudHandler<ExtractUDBParamGroupResult>() {
            @Override
            public Object success(ExtractUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ExtractUDBParamGroupResult result) {
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