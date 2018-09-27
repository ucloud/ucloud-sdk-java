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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
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
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteBandwidthPackageResult deleteBandwidthPackage(DeleteBandwidthPackageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteBandwidthPackageResult.class);
        DeleteBandwidthPackageResult result = (DeleteBandwidthPackageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteBandwidthPackage(DeleteBandwidthPackageParam param, UcloudHandler<DeleteBandwidthPackageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteBandwidthPackageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public AllocateShareBandwidthResult allocateShareBandwidth(AllocateShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateShareBandwidthResult.class);
        AllocateShareBandwidthResult result = (AllocateShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateShareBandwidth(AllocateShareBandwidthParam param, UcloudHandler<AllocateShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeShareBandwidthResult describeShareBandwidth(DescribeShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeShareBandwidthResult.class);
        DescribeShareBandwidthResult result = (DescribeShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeShareBandwidth(DescribeShareBandwidthParam param, UcloudHandler<DescribeShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeShareBandwidthResult resizeShareBandwidth(ResizeShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeShareBandwidthResult.class);
        ResizeShareBandwidthResult result = (ResizeShareBandwidthResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void resizeShareBandwidth(ResizeShareBandwidthParam param, UcloudHandler<ResizeShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
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
