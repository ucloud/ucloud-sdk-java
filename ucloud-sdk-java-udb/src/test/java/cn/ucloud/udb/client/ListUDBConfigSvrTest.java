package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBCPriceParam;
import cn.ucloud.udb.model.ListUDBConfigSvrParam;
import cn.ucloud.udb.model.ListUDBConfigSvrResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 11:05
 **/
public class ListUDBConfigSvrTest {

    private UDBClient client;

    private ListUDBConfigSvrParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ListUDBConfigSvrParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }
    // todo 测试Get names error
    @Test
    public void listUDBConfigSvr() {
        try {
            ListUDBConfigSvrResult result = client.listUDBConfigSvr(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void listUDBConfigSvrCallback() {
        client.listUDBConfigSvr(param, new UcloudHandler<ListUDBConfigSvrResult>() {
            @Override
            public Object success(ListUDBConfigSvrResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListUDBConfigSvrResult result) {
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