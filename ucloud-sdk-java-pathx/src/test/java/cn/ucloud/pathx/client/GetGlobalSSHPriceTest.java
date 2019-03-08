package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.GetGlobalSSHPriceParam;
import cn.ucloud.pathx.model.GetGlobalSSHPriceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.GetGlobalSSHPrice 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class GetGlobalSSHPriceTest {

private PATHXClient client;

private GetGlobalSSHPriceParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    Integer quantity = 1;
                    String chargeType = "cn-sh2";
param = new GetGlobalSSHPriceParam( quantity, chargeType);
param.setProjectId("org-izug1m");
}


@Test
public void getGlobalSSHPrice() {
try {
GetGlobalSSHPriceResult result = client.getGlobalSSHPrice(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void getGlobalSSHPriceCallback() {
client.getGlobalSSHPrice(param, new UcloudHandler
<GetGlobalSSHPriceResult>() {
@Override
public Object success(GetGlobalSSHPriceResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(GetGlobalSSHPriceResult result) {
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