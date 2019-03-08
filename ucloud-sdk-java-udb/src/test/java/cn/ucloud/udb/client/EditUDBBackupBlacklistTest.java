package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DescribeUDBInstanceParam;
import cn.ucloud.udb.model.EditUDBBackupBlacklistParam;
import cn.ucloud.udb.model.EditUDBBackupBlacklistResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:15
 **/
public class EditUDBBackupBlacklistTest {

    private UDBClient client;

    private EditUDBBackupBlacklistParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        List<EditUDBBackupBlacklistParam.Blacklist> blacklist = new ArrayList<>();
        blacklist.add(new EditUDBBackupBlacklistParam.Blacklist("admin","%"));
        param = new EditUDBBackupBlacklistParam("cn-sh2", "udb-h3q25faw",blacklist);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void editUDBBackupBlacklist() {
        try {
            EditUDBBackupBlacklistResult result = client.editUDBBackupBlacklist(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void editUDBBackupBlacklistCallback() {
        client.editUDBBackupBlacklist(param, new UcloudHandler<EditUDBBackupBlacklistResult>() {
            @Override
            public Object success(EditUDBBackupBlacklistResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(EditUDBBackupBlacklistResult result) {
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