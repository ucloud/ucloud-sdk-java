package cn.ucloud.ubill.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoResult;
import cn.ucloud.ubill.model.GetBillDataFileUrlParam;
import cn.ucloud.ubill.model.GetBillDataFileUrlResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2020/2/13 1:18 下午
 * @describe:
 **/
public class GetBillDataFileUrlTest {

    private UBillClient client;

    private GetBillDataFileUrlParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUBillClient.getUBillClient();
        param = new GetBillDataFileUrlParam(1581566727,1);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void getBillDataFileUrl() {
        try {
            GetBillDataFileUrlResult result = client.getBillDataFileUrl(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void testGetBillDataFileUrl() {
        client.getBillDataFileUrl(param, new UcloudHandler<GetBillDataFileUrlResult>() {
            @Override
            public Object success(GetBillDataFileUrlResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetBillDataFileUrlResult result) {
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