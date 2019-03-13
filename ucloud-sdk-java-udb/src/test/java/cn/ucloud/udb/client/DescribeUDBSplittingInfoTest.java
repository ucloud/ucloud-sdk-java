package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBInstanceStateParam;
import cn.ucloud.udb.model.DescribeUDBSplittingInfoParam;
import cn.ucloud.udb.model.DescribeUDBSplittingInfoResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:05
 **/
public class DescribeUDBSplittingInfoTest {

    private UDBClient client;

    private DescribeUDBSplittingInfoParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBSplittingInfoParam("cn-sh2", "cn-sh2-02",
                "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void describeUDBSplittingInfo() {
        try {
            DescribeUDBSplittingInfoResult result = client.describeUDBSplittingInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBSplittingInfoCallback() {
        client.describeUDBSplittingInfo(param, new UcloudHandler<DescribeUDBSplittingInfoResult>() {
            @Override
            public Object success(DescribeUDBSplittingInfoResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBSplittingInfoResult result) {
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