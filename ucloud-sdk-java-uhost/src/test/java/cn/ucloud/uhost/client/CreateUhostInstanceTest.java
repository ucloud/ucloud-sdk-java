package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.CreateUHostInstanceParam;
import cn.ucloud.uhost.model.CreateUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 17:43
 **/
public class CreateUhostInstanceTest {

    private UhostClient client;

    private CreateUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateUHostInstanceParam("cn-sh2","cn-sh2-02","uimage-xh0qwn");
        param.setName("java-sdk-test-aaa");
        param.setPassword("123456ab");
        param.setProjectId("org-o1ftjk");
        param.setLoginMode("Password");
        param.setChargeType("Dynamic");
        param.setMaxCount(2);
        List diskList =new ArrayList<CreateUHostInstanceParam.UhostDisk>();
        CreateUHostInstanceParam.UhostDisk disk = new CreateUHostInstanceParam.UhostDisk(25,
                "LOCAL_SSD",false);
        diskList.add(disk);
        param.setDisks(diskList);
        param.setVpcId("uvnet-eeznzuup");
        param.setSubnetId("subnet-ndvpszog");
        CreateUHostInstanceParam.EIP eip = new CreateUHostInstanceParam.EIP();
        eip.setBandwidth(2);
        eip.setPayMode("Bandwidth");
        eip.setOperatorName("Bgp");
        param.setEip(eip);
    }


    @Test
    public void createUHostInstance() {
        try {
            CreateUHostInstanceResult result = client.createUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}