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
    public BindEIPResult bindEIP(BindEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BindEIPResult.class);
        BindEIPResult result = (BindEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void bindEIP(BindEIPParam param, UcloudHandler<BindEIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BindEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UnBindEIPResult unBindEIP(UnBindEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UnBindEIPResult.class);
        UnBindEIPResult result = (UnBindEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void unBindEIP(UnBindEIPParam param, UcloudHandler<UnBindEIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UnBindEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyEIPBandwidthResult modifyEIPBandwidth(ModifyEIPBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyEIPBandwidthResult.class);
        ModifyEIPBandwidthResult result = (ModifyEIPBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyEIPBandwidth(ModifyEIPBandwidthParam param, UcloudHandler<ModifyEIPBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyEIPBandwidthResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyEIPWeightResult modifyEIPWeight(ModifyEIPWeightParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyEIPWeightResult.class);
        ModifyEIPWeightResult result = (ModifyEIPWeightResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyEIPWeight(ModifyEIPWeightParam param, UcloudHandler<ModifyEIPWeightResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyEIPWeightResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetEIPPriceResult getEIPPrice(GetEIPPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetEIPPriceResult.class);
        GetEIPPriceResult result = (GetEIPPriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getEIPPrice(GetEIPPriceParam param, UcloudHandler<GetEIPPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetEIPPriceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetEIPUpgradePriceResult getEIPUpgradePrice(GetEIPUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetEIPUpgradePriceResult.class);
        GetEIPUpgradePriceResult result = (GetEIPUpgradePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getEIPUpgradePrice(GetEIPUpgradePriceParam param, UcloudHandler<GetEIPUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetEIPUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetEIPPayModeResult getEIPPayMode(GetEIPPayModeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetEIPPayModeResult.class);
        GetEIPPayModeResult result = (GetEIPPayModeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getEIPPayMode(GetEIPPayModeParam param, UcloudHandler<GetEIPPayModeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetEIPPayModeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public SetEIPPayModeResult setEIPPayMode(SetEIPPayModeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SetEIPPayModeResult.class);
        SetEIPPayModeResult result = (SetEIPPayModeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void setEIPPayMode(SetEIPPayModeParam param, UcloudHandler<SetEIPPayModeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SetEIPPayModeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AllocateVIPResult allocateVIP(AllocateVIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateVIPResult.class);
        AllocateVIPResult result = (AllocateVIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateVIP(AllocateVIPParam param, UcloudHandler<AllocateVIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateVIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVIPResult describeVIP(DescribeVIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVIPResult.class);
        DescribeVIPResult result = (DescribeVIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVIP(DescribeVIPParam param, UcloudHandler<DescribeVIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReleaseVIPResult releaseVIP(ReleaseVIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseVIPResult.class);
        ReleaseVIPResult result = (ReleaseVIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void releaseVIP(ReleaseVIPParam param, UcloudHandler<ReleaseVIPResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseVIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateBandwidthPackageResult createBandwidthPackage(CreateBandwidthPackageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateBandwidthPackageResult.class);
        CreateBandwidthPackageResult result = (CreateBandwidthPackageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createBandwidthPackage(CreateBandwidthPackageParam param, UcloudHandler<CreateBandwidthPackageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateBandwidthPackageResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeBandwidthPackageResult describeBandwidthPackage(DescribeBandwidthPackageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthPackageResult.class);
        DescribeBandwidthPackageResult result = (DescribeBandwidthPackageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeBandwidthPackage(DescribeBandwidthPackageParam param, UcloudHandler<DescribeBandwidthPackageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthPackageResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
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
    public BaseRequestParam releaseShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam associateEIPWithShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void associateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam disassociateEIPWithShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void disassociateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeBandwidthUsage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeBandwidthUsage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam deleteFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam updateFirewallAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateFirewallAttribute(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam updateFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeFirewallResource(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeFirewallResource(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam grantFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void grantFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam createFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }
}
