package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBBackupParam;
import cn.ucloud.udb.model.DescribeUDBBackupResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:04
 **/
public class DescribeUDBBackupTest {

    private UDBClient client;

    private DescribeUDBBackupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBBackupParam("cn-sh2", 100,0);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBBackup() {
        try {
            DescribeUDBBackupResult result = client.describeUDBBackup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }

    }

    @Test
    public void describeUDBBackupCallback() {
        client.describeUDBBackup(param, new UcloudHandler<DescribeUDBBackupResult>() {
            @Override
            public Object success(DescribeUDBBackupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBBackupResult result) {
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