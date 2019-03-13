package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.ListUDBConfigSvrParam;
import cn.ucloud.udb.model.ModifySqlserverPasswordParam;
import cn.ucloud.udb.model.ModifySqlserverPasswordResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:12
 **/
public class ModifySqlserverPasswordTest {

    private UDBClient client;

    private ModifySqlserverPasswordParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ModifySqlserverPasswordParam("cn-sh2", "cn-sh2-02","udb-h3q25faw",
                "test","sdk-java");
        param.setProjectId("org-izug1m");
    }
    // todo 测试 没有sqlserver实例
    @Test
    public void modifySqlserverPassword() {
        try {
            ModifySqlserverPasswordResult result = client.modifySqlserverPassword(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }

    }

    @Test
    public void modifySqlserverPasswordCallback() {
        client.modifySqlserverPassword(param, new UcloudHandler<ModifySqlserverPasswordResult>() {
            @Override
            public Object success(ModifySqlserverPasswordResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ModifySqlserverPasswordResult result) {
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