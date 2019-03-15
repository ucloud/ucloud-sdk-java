package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.DescribeUDredisUpgradePriceParam;
import cn.ucloud.umem.model.DescribeUDredisUpgradePriceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.DescribeUDredisUpgradePrice 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUDredisUpgradePriceTest {

private UMEMClient client;

private DescribeUDredisUpgradePriceParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    Integer size = 1;
                    String spaceId = "cn-sh2";
param = new DescribeUDredisUpgradePriceParam( region, size, spaceId);
param.setProjectId("org-izug1m");
}


@Test
public void describeUDredisUpgradePrice() {
try {
DescribeUDredisUpgradePriceResult result = client.describeUDredisUpgradePrice(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}