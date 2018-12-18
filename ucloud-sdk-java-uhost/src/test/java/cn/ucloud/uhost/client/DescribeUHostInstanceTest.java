package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.DescribeUHostInstanceParam;
import cn.ucloud.uhost.model.DescribeUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 10:33
 **/
public class DescribeUHostInstanceTest {

    private UhostClient client;

    private DescribeUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUHostInstanceParam("cn-sh2");
        param.setProjectId("org-pbmy1g");
    }

    @Test
    public void describeUHostInstance() {
        try {
            DescribeUHostInstanceResult describeUHostInstanceResult = client.describeUHostInstance(param);
            System.out.println(describeUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void describeUHostInstanceCallBack() {
        client.describeUHostInstance(param, new UcloudHandler<DescribeUHostInstanceResult>() {
            @Override
            public Object success(DescribeUHostInstanceResult result) {
                System.out.println(result);
                return null;
            }

            @Override
            public Object failed(DescribeUHostInstanceResult result) {
                System.out.println(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println(e);
                return null;
            }
        });

        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}