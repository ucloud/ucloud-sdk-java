package cn.ucloud.common.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.model.GetProjectListParam;
import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.model.GetRegionResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.common.pojo.UcloudConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: codezhang
 * @date: 2019/10/31 11:16 上午
 * @describe:
 **/
public class DoActionTest {


    private UcloudClient client;

    @Before
    public void initData() {
        client = new DefaultUcloudClient(new UcloudConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
    }

    @Test
    public void doAction() {
        try {
            GetProjectListResult getProjectListResult = (GetProjectListResult) client.doAction(new GetProjectListParam(),
                    GetProjectListResult.class);
            JSONComparator.jsonComparator(getProjectListResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doActionCallback() {
        client.doAction(new GetProjectListParam(), GetProjectListResult.class,
                new UcloudHandler<GetRegionResult>() {
                    @Override
                    public Object success(GetRegionResult result) {
                        JSONComparator.jsonComparator(result);
                        return null;
                    }

                    @Override
                    public Object failed(GetRegionResult result) {
                        JSONComparator.jsonComparator(result);
                        return null;
                    }

                    @Override
                    public Object error(Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                });
    }
}
