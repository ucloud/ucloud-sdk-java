package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UnetConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-25 18:57
 **/

public class DefaultUnetClient implements UnetClient {

    private UnetConfig config;

    public DefaultUnetClient(UnetConfig config) {
        this.config = config;
    }


    @Override
    public AllocateEIPResult allocateEIP(AllocateEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateEIPResult.class);
        AllocateEIPResult result = (AllocateEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateEIP(AllocateEIPParam param, UcloudHandler<AllocateEIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeEIPResult describeEIP(DescribeEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeEIPResult.class);
        DescribeEIPResult result = (DescribeEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeEIP(DescribeEIPParam param, UcloudHandler<DescribeEIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateEIPAttributeResult updateEIPAttribute(UpdateEIPAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateEIPAttributeResult.class);
        UpdateEIPAttributeResult result = (UpdateEIPAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateEIPAttribute(UpdateEIPAttributeParam param, UcloudHandler<UpdateEIPAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateEIPAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReleaseEIPResult releaseEIP(ReleaseEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseEIPResult.class);
        ReleaseEIPResult result = (ReleaseEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void releaseEIP(ReleaseEIPParam param, UcloudHandler<ReleaseEIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BaseRequestParam bindEIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void bindEIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam unBindEIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void unBindEIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam modifyEIPBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void modifyEIPBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam modifyEIPWeight(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void modifyEIPWeight(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPPrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPPrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPUpgradePrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPUpgradePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPPayMode(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPPayMode(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam setEIPPayMode(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void setEIPPayMode(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam allocateVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam releaseVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam createBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam deleteBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam allocateShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam resizeShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void resizeShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public ReleaseShareBandwidthResult releaseShareBandwidth(ReleaseShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseShareBandwidthResult.class);
        ReleaseShareBandwidthResult result = (ReleaseShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void releaseShareBandwidth(ReleaseShareBandwidthParam param, UcloudHandler<ReleaseShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AssociateEIPWithShareBandwidthResult associateEIPWithShareBandwidth(AssociateEIPWithShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AssociateEIPWithShareBandwidthResult.class);
        AssociateEIPWithShareBandwidthResult result = (AssociateEIPWithShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void associateEIPWithShareBandwidth(AssociateEIPWithShareBandwidthParam param, UcloudHandler<AssociateEIPWithShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AssociateEIPWithShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public DisassociateEIPWithShareBandwidthResult disassociateEIPWithShareBandwidth(DisassociateEIPWithShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DisassociateEIPWithShareBandwidthResult.class);
        DisassociateEIPWithShareBandwidthResult result = (DisassociateEIPWithShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void disassociateEIPWithShareBandwidth(DisassociateEIPWithShareBandwidthParam param, UcloudHandler<DisassociateEIPWithShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DisassociateEIPWithShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeBandwidthUsageResult describeBandwidthUsage(DescribeBandwidthUsageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthUsageResult.class);
        DescribeBandwidthUsageResult result = (DescribeBandwidthUsageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeBandwidthUsage(DescribeBandwidthUsageParam param, UcloudHandler<DescribeBandwidthUsageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthUsageResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteFirewallResult deleteFirewall(DeleteFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteFirewallResult.class);
        DeleteFirewallResult result = (DeleteFirewallResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteFirewall(DeleteFirewallParam param, UcloudHandler<DeleteFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteFirewallResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateFirewallAttributeResult updateFirewallAttribute(UpdateFirewallAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallAttributeResult.class);
        UpdateFirewallAttributeResult result = (UpdateFirewallAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateFirewallAttribute(UpdateFirewallAttributeParam param, UcloudHandler<UpdateFirewallAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateFirewallResult updateFirewall(UpdateFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallResult.class);
        UpdateFirewallResult result = (UpdateFirewallResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateFirewall(UpdateFirewallParam param, UcloudHandler<UpdateFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeFirewallResourceResult describeFirewallResource(DescribeFirewallResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResourceResult.class);
        DescribeFirewallResourceResult result = (DescribeFirewallResourceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeFirewallResource(DescribeFirewallResourceParam param, UcloudHandler<DescribeFirewallResourceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResourceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeFirewallResult describeFirewall(DescribeFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResult.class);
        DescribeFirewallResult result = (DescribeFirewallResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeFirewall(DescribeFirewallParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GrantFirewallResult grantFirewall(GrantFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GrantFirewallResult.class);
        GrantFirewallResult result = (GrantFirewallResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void grantFirewall(GrantFirewallParam param, UcloudHandler<GrantFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GrantFirewallResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateFirewallResult createFirewall(CreateFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateFirewallResult.class);
        CreateFirewallResult result = (CreateFirewallResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createFirewall(CreateFirewallParam param, UcloudHandler<CreateFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateFirewallResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

}
