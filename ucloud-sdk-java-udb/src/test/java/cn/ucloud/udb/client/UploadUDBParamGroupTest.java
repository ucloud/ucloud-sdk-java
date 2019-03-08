package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteDBTransferTaskParam;
import cn.ucloud.udb.model.UploadUDBParamGroupParam;
import cn.ucloud.udb.model.UploadUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 15:18
 **/
public class UploadUDBParamGroupTest {

    private UDBClient client;

    private UploadUDBParamGroupParam param;


    private String content = "W215c3FsXQpkZWZhdWx0LWNoYXJhY3Rlci1zZXQ" +
            "9dXRmOApbbXlzcWxkXQpwb3J0ID0gMzMwNgpiYXNlZGlyPUQ6XG15c3Fs" +
            "XG15c3FsLTUuNi4xNy13aW54NjQKZGF0YWRpcj1EOlxteXNxbFxteXNxb" +
            "C01LjYuMTctd2lueDY0XGRhdGEKbWF4X2Nvbm5lY3Rpb25zPTIwMApjaGF" +
            "yYWN0ZXItc2V0LXNlcnZlcj11dGY4Cg==";

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new UploadUDBParamGroupParam("cn-sh2", "cn-sh2-02","mysql-5.5",
                "peggypig-up","sdk-java-upload",content);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void uploadUDBParamGroup() {
        try {
            UploadUDBParamGroupResult result = client.uploadUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void uploadUDBParamGroupCallback() {
        client.uploadUDBParamGroup(param, new UcloudHandler<UploadUDBParamGroupResult>() {
            @Override
            public Object success(UploadUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UploadUDBParamGroupResult result) {
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