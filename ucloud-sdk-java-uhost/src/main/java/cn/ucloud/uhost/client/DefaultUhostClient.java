package cn.ucloud.uhost.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.uhost.model.*;
import cn.ucloud.uhost.pojo.UhostConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 10:57
 **/

public class DefaultUhostClient extends DefaultUcloudClient implements UhostClient {

    /**
     * uhost配置
     */
    private UhostConfig config;


    public DefaultUhostClient(UhostConfig config) {
        super(config);
        this.config = config;
    }


    @Override
    public GetUhostInstanceVncInfoResult getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        return (GetUhostInstanceVncInfoResult) http.doGet(param, config, null);
    }

    @Override
    public void getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param, UcloudHandler<GetUhostInstanceVncInfoResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        return (StartUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void startUHostInstance(StartUHostInstanceParam param, UcloudHandler<StartUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RebootUHostInstanceResult rebootUHostInstance(RebootUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        return (RebootUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void rebootUHostInstance(RebootUHostInstanceParam param, UcloudHandler<RebootUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public StopUHostInstanceResult stopUHostInstance(StopUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        return (StopUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void stopUHostInstance(StopUHostInstanceParam param, UcloudHandler<StopUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUHostTagsResult describeUHostTags(DescribeUHostTagsParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        return (DescribeUHostTagsResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUHostTags(StopUHostInstanceParam param, UcloudHandler<DescribeUHostTagsResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {

        }
    }

    @Override
    public CreateUHostInstanceResult createUHostInstance(CreateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        return (CreateUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUHostInstance(CreateUHostInstanceParam param, UcloudHandler<CreateUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        try {
            http.doGet(param, config, null);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceTagResult modifyUHostInstanceTag(ModifyUHostInstanceTagParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        return (ModifyUHostInstanceTagResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUHostInstanceTag(ModifyUHostInstanceTagParam param, UcloudHandler<ModifyUHostInstanceTagResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public TerminateUHostInstanceResult terminateUHostInstance(TerminateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        return (TerminateUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void terminateUHostInstance(TerminateUHostInstanceParam param, UcloudHandler<TerminateUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUHostInstanceResult describeUHostInstance(DescribeUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        return (DescribeUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUHostInstance(DescribeUHostInstanceParam param, UcloudHandler<DescribeUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUHostInstancePriceResult getUHostInstancePrice(GetUHostInstancePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUHostInstancePriceResult.class);
        return (GetUHostInstancePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUHostInstancePrice(GetUHostInstancePriceParam param, UcloudHandler<GetUHostInstancePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUHostInstancePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUHostInstanceResult resizeUHostInstance(ResizeUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUHostInstanceResult.class);
        return (ResizeUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void resizeUHostInstance(ResizeUHostInstanceParam param, UcloudHandler<ResizeUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceNameResult modifyUHostInstanceName(ModifyUHostInstanceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceNameResult.class);
        return (ModifyUHostInstanceNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUHostInstanceName(ModifyUHostInstanceNameParam param,
                                        UcloudHandler<ModifyUHostInstanceNameResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResetUHostInstancePasswordResult resetUHostInstancePassword(ResetUHostInstancePasswordParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResetUHostInstancePasswordResult.class);
        return (ResetUHostInstancePasswordResult) http.doGet(param, config, null);
    }

    @Override
    public void resetUHostInstancePassword(ResetUHostInstancePasswordParam param,
                                           UcloudHandler<ResetUHostInstancePasswordResult> handler,
                                           Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResetUHostInstancePasswordResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PoweroffUHostInstanceResult poweroffUHostInstance(PoweroffUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PoweroffUHostInstanceResult.class);
        return (PoweroffUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void poweroffUHostInstance(PoweroffUHostInstanceParam param, UcloudHandler<PoweroffUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PoweroffUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ImportCustomImageResult importCustomImage(ImportCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ImportCustomImageResult.class);
        return (ImportCustomImageResult) http.doGet(param, config, null);
    }

    @Override
    public void importCustomImage(ImportCustomImageParam param, UcloudHandler<ImportCustomImageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ImportCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CopyCustomImageResult copyCustomImage(CopyCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CopyCustomImageResult.class);
        return (CopyCustomImageResult) http.doGet(param, config, null);
    }

    @Override
    public void copyCustomImage(CopyCustomImageParam param, UcloudHandler<CopyCustomImageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CopyCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeImageResult describeImage(DescribeImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeImageResult.class);
        return (DescribeImageResult) http.doGet(param, config, null);
    }

    @Override
    public void describeImage(DescribeImageParam param, UcloudHandler<DescribeImageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public TerminateCustomImageResult terminateCustomImage(TerminateCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(TerminateCustomImageResult.class);
        return (TerminateCustomImageResult) http.doGet(param, config, null);
    }

    @Override
    public void terminateCustomImage(TerminateCustomImageParam param, UcloudHandler<TerminateCustomImageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(TerminateCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReinstallUHostInstanceResult reinstallUHostInstance(ReinstallUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReinstallUHostInstanceResult.class);
        return (ReinstallUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void reinstallUHostInstance(ReinstallUHostInstanceParam param, UcloudHandler<ReinstallUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReinstallUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUHostUpgradePriceResult getUHostUpgradePrice(GetUHostUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUHostUpgradePriceResult.class);
        return (GetUHostUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUHostUpgradePrice(GetUHostUpgradePriceParam param, UcloudHandler<GetUHostUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUHostUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceRemarkResult modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceRemarkResult.class);
        return (ModifyUHostInstanceRemarkResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param, UcloudHandler<ModifyUHostInstanceRemarkResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceRemarkResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateCustomImageResult createCustomImage(CreateCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateCustomImageResult.class);
        return (CreateCustomImageResult) http.doGet(param, config, null);
    }

    @Override
    public void createCustomeImage(CreateCustomImageParam param, UcloudHandler<CreateCustomImageResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpgradeToArkUHostInstanceResult upgradeToArkUHostInstance(UpgradeToArkUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpgradeToArkUHostInstanceResult.class);
        return (UpgradeToArkUHostInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void upgradeToArkUHostInstance(UpgradeToArkUHostInstanceParam param, UcloudHandler<UpgradeToArkUHostInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpgradeToArkUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


}
