package cn.ucloud.common.util;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:32
 **/
public class JSONComparator {

    private static final Logger logger = LoggerFactory.getLogger(JSONComparator.class.getName());

    public static void jsonComparator(BaseResponseResult result) {
        try {
            Gson gson = new GsonBuilder().serializeNulls().create();
            logger.info("result 2 json:{}",gson.toJson(result));
            JSONAssert.assertEquals(result.getResponseContent(), gson.toJson(result), JSONCompareMode.LENIENT);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}
