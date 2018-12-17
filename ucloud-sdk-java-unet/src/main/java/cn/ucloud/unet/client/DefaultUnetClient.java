package cn.ucloud.unet.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.unet.model.*;
import cn.ucloud.unet.pojo.UnetConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-25 18:57
 **/

public class DefaultUnetClient extends DefaultUcloudClient implements UnetClient {

    private UnetConfig config;

    public DefaultUnetClient(UnetConfig config) {
        super(config);
        this.config = config;
    }


    @Override
    public AllocateEIPResult allocateEIP(AllocateEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateEIPResult.class);
        return (AllocateEIPResult) http.doGet(param, config, null);
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
        return (DescribeEIPResult) http.doGet(param, config, null);
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
        return (UpdateEIPAttributeResult) http.doGet(param, config, null);
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
        return (ReleaseEIPResult) http.doGet(param, config, null);
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
        return (BindEIPResult) http.doGet(param, config, null);
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
        return (UnBindEIPResult) http.doGet(param, config, null);
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
        return (ModifyEIPBandwidthResult) http.doGet(param, config, null);
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
        return (ModifyEIPWeightResult) http.doGet(param, config, null);
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
        return (GetEIPPriceResult) http.doGet(param, config, null);
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
        return (GetEIPUpgradePriceResult) http.doGet(param, config, null);
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
        return (GetEIPPayModeResult) http.doGet(param, config, null);
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
        return (SetEIPPayModeResult) http.doGet(param, config, null);
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
        return (AllocateVIPResult) http.doGet(param, config, null);
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
        return (DescribeVIPResult) http.doGet(param, config, null);
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
        return (ReleaseVIPResult) http.doGet(param, config, null);
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
        return (CreateBandwidthPackageResult) http.doGet(param, config, null);
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
        return (DescribeBandwidthPackageResult) http.doGet(param, config, null);
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
        return (DeleteBandwidthPackageResult) http.doGet(param, config, null);
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
        return (AllocateShareBandwidthResult) http.doGet(param, config, null);
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
        return (DescribeShareBandwidthResult) http.doGet(param, config, null);
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
        return (ResizeShareBandwidthResult) http.doGet(param, config, null);
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
        return (ReleaseShareBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void releaseShareBandwidth(ReleaseShareBandwidthParam param, UcloudHandler<ReleaseShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AssociateEIPWithShareBandwidthResult associateEIPWithShareBandwidth(AssociateEIPWithShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AssociateEIPWithShareBandwidthResult.class);
        return (AssociateEIPWithShareBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void associateEIPWithShareBandwidth(AssociateEIPWithShareBandwidthParam param, UcloudHandler<AssociateEIPWithShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AssociateEIPWithShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public DisassociateEIPWithShareBandwidthResult disassociateEIPWithShareBandwidth(DisassociateEIPWithShareBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DisassociateEIPWithShareBandwidthResult.class);
        return (DisassociateEIPWithShareBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void disassociateEIPWithShareBandwidth(DisassociateEIPWithShareBandwidthParam param, UcloudHandler<DisassociateEIPWithShareBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DisassociateEIPWithShareBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeBandwidthUsageResult describeBandwidthUsage(DescribeBandwidthUsageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthUsageResult.class);
        return (DescribeBandwidthUsageResult) http.doGet(param, config, null);
    }

    @Override
    public void describeBandwidthUsage(DescribeBandwidthUsageParam param, UcloudHandler<DescribeBandwidthUsageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeBandwidthUsageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteFirewallResult deleteFirewall(DeleteFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteFirewallResult.class);
        return (DeleteFirewallResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteFirewall(DeleteFirewallParam param, UcloudHandler<DeleteFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteFirewallResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateFirewallAttributeResult updateFirewallAttribute(UpdateFirewallAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallAttributeResult.class);
        return (UpdateFirewallAttributeResult) http.doGet(param, config, null);
    }

    @Override
    public void updateFirewallAttribute(UpdateFirewallAttributeParam param, UcloudHandler<UpdateFirewallAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallAttributeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateFirewallResult updateFirewall(UpdateFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallResult.class);
        return (UpdateFirewallResult) http.doGet(param, config, null);
    }

    @Override
    public void updateFirewall(UpdateFirewallParam param, UcloudHandler<UpdateFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateFirewallResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeFirewallResourceResult describeFirewallResource(DescribeFirewallResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResourceResult.class);
        return (DescribeFirewallResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeFirewallResource(DescribeFirewallResourceParam param, UcloudHandler<DescribeFirewallResourceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResourceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeFirewallResult describeFirewall(DescribeFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResult.class);
        return (DescribeFirewallResult) http.doGet(param, config, null);
    }

    @Override
    public void describeFirewall(DescribeFirewallParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeFirewallResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GrantFirewallResult grantFirewall(GrantFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GrantFirewallResult.class);
        return (GrantFirewallResult) http.doGet(param, config, null);
    }

    @Override
    public void grantFirewall(GrantFirewallParam param, UcloudHandler<GrantFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GrantFirewallResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateFirewallResult createFirewall(CreateFirewallParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateFirewallResult.class);
        return (CreateFirewallResult) http.doGet(param, config, null);
    }

    @Override
    public void createFirewall(CreateFirewallParam param, UcloudHandler<CreateFirewallResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateFirewallResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

}
