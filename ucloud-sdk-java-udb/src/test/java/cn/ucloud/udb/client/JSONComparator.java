package cn.ucloud.udb.client;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:32
 **/
public class JSONComparator {

    public static void jsonComparator(BaseResponseResult result) {
        try {
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}
