package cn.ucloud.ubill.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoParam;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoResult;
import cn.ucloud.ubill.model.GetBillDataFileUrlParam;
import cn.ucloud.ubill.model.GetBillDataFileUrlResult;

/**
 * @author: codezhang
 * @date: 2020/2/13 11:59 上午
 * @describe:
 **/
public class DefaultUBillClient extends DefaultUcloudClient implements UBillClient {

    public DefaultUBillClient(UcloudConfig config) {
        super(config);
    }

    @Override
    public DescribeOrderDetailInfoResult describeOrderDetailInfo(DescribeOrderDetailInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeOrderDetailInfoResult.class);
        return (DescribeOrderDetailInfoResult) http.doPost(param, config, null);
    }

    @Override
    public void describeOrderDetailInfo(DescribeOrderDetailInfoParam param, UcloudHandler<DescribeOrderDetailInfoResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeOrderDetailInfoResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetBillDataFileUrlResult getBillDataFileUrl(GetBillDataFileUrlParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetBillDataFileUrlResult.class);
        return (GetBillDataFileUrlResult) http.doPost(param, config, null);
    }

    @Override
    public void getBillDataFileUrl(GetBillDataFileUrlParam param, UcloudHandler<GetBillDataFileUrlResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetBillDataFileUrlResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
