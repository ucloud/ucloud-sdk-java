package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.GetLinesParam;
import cn.ucloud.pathx.model.GetLinesResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.GetLines 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class GetLinesTest {

private PATHXClient client;

private GetLinesParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
param = new GetLinesParam();
param.setProjectId("org-izug1m");
}


@Test
public void getLines() {
try {
GetLinesResult result = client.getLines(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void getLinesCallback() {
client.getLines(param, new UcloudHandler
<GetLinesResult>() {
@Override
public Object success(GetLinesResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(GetLinesResult result) {
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