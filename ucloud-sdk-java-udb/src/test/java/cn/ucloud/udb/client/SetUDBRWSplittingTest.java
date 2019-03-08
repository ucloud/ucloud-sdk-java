package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DisableUDBRWSplittingParam;
import cn.ucloud.udb.model.SetUDBRWSplittingParam;
import cn.ucloud.udb.model.SetUDBRWSplittingResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:23
 **/
public class SetUDBRWSplittingTest {

    private UDBClient client;

    private SetUDBRWSplittingParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        List<String> dbIds = new ArrayList<>();
        dbIds.add("udb-zahyyi04");
        dbIds.add("udb-qlrgw3lo");
        List<Integer> readPercents = new ArrayList<>();
        readPercents.add(10);
        readPercents.add(90);
        param = new SetUDBRWSplittingParam("cn-sh2", "cn-sh2-02",
                "udb-zahyyi04","Custom",dbIds);
        param.setReadPercents(readPercents);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void setUDBRWSplitting() {
        try {
            SetUDBRWSplittingResult result = client.setUDBRWSplitting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void setUDBRWSplittingCallback() {
        client.setUDBRWSplitting(param, new UcloudHandler<SetUDBRWSplittingResult>() {
            @Override
            public Object success(SetUDBRWSplittingResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(SetUDBRWSplittingResult result) {
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