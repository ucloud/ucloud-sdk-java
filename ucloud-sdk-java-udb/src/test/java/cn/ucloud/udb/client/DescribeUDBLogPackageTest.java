package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBLogBackupURLParam;
import cn.ucloud.udb.model.DescribeUDBLogPackageParam;
import cn.ucloud.udb.model.DescribeUDBLogPackageResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:40
 **/
public class DescribeUDBLogPackageTest {

    private UDBClient client;

    private DescribeUDBLogPackageParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBLogPackageParam("cn-sh2", 100, 0);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void deleteUDBLogPackage() {
        DescribeUDBLogPackageResult result = null;
        try {
            result = client.describeUDBLogPackage(param);
        } catch (Exception e) {
            assertNull(e);
        }
        JSONComparator.jsonComparator(result);
    }

    @Test
    public void deleteUDBLogPackageCallback() {
        client.describeUDBLogPackage(param, new UcloudHandler<DescribeUDBLogPackageResult>() {
            @Override
            public Object success(DescribeUDBLogPackageResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBLogPackageResult result) {
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