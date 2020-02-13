package cn.ucloud.ubill.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoParam;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2020/2/13 12:01 下午
 * @describe:
 **/
public class DescribeOrderDetailInfoTest {

    private UBillClient client;

    private DescribeOrderDetailInfoParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUBillClient.getUBillClient();
        param = new DescribeOrderDetailInfoParam();
        param.setProjectId("org-izug1m");
        param.setBeginTime(1577811661);
        param.setEndTime(1581566727);
    }


    @Test
    public void describeOrderDetailInfo() {
        try {
            DescribeOrderDetailInfoResult result = client.describeOrderDetailInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }

    @Test
    public void testDescribeOrderDetailInfo() {
        client.describeOrderDetailInfo(param, new UcloudHandler<DescribeOrderDetailInfoResult>() {
            @Override
            public Object success(DescribeOrderDetailInfoResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeOrderDetailInfoResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                Assert.assertNull(e);
                return null;
            }
        }, false);
    }
}