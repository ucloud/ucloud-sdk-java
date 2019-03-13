package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeDBTransferTaskParam;
import cn.ucloud.udb.model.DescribePromoteToHAPriceParam;
import cn.ucloud.udb.model.DescribePromoteToHAPriceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:01
 **/
public class DescribePromoteToHAPriceTest {

    private UDBClient client;

    private DescribePromoteToHAPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribePromoteToHAPriceParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describePromoteToHAPrice() {
        try {
            DescribePromoteToHAPriceResult result = client.describePromoteToHAPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describePromoteToHAPriceCallback() {
        client.describePromoteToHAPrice(param, new UcloudHandler<DescribePromoteToHAPriceResult>() {
            @Override
            public Object success(DescribePromoteToHAPriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribePromoteToHAPriceResult result) {
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