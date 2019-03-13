package cn.ucloud.udb.client;


import cn.ucloud.udb.model.EnableUDBRWSplittingParam;
import cn.ucloud.udb.model.GrantAccountPrivilegesParam;
import cn.ucloud.udb.model.GrantAccountPrivilegesResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:43
 **/
public class GrantAccountPrivilegesTest {

    private UDBClient client;

    private GrantAccountPrivilegesParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new GrantAccountPrivilegesParam("cn-sh2", "sdk-java",
                "sdk-java-test","udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 没有sqlserver 实例
    @Test
    public void grantAccountPrivileges() {
        try {
            GrantAccountPrivilegesResult result = client.grantAccountPrivileges(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void grantAccountPrivilegesCallback() {
    }
}