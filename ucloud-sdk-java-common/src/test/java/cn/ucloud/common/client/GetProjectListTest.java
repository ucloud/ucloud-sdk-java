package cn.ucloud.common.client;

import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-11-13 15:29
 **/
public class GetProjectListTest {

    private UcloudClient client;

    @Before
    public void initData() {
        client = new DefaultUcloudClient(new UcloudConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
    }

    @Test
    public void getProjectList() {
        try {
            GetProjectListResult getProjectListResult = client.getProjectList();
            JSONComparator.jsonComparator(getProjectListResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}