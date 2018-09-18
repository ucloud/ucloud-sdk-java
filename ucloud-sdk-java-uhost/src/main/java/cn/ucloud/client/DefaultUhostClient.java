package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 10:57
 **/

public class DefaultUhostClient implements UhostClient {

    /**
     * uhost配置
     */
    private UhostConfig config;


    public DefaultUhostClient(UhostConfig config) {
        this.config = config;
    }


    @Override
    public GetUhostInstanceVncInfoResult getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        GetUhostInstanceVncInfoResult result = (GetUhostInstanceVncInfoResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getUHostInstanceVncInfoCallback(GetUhostInstanceVncInfoParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        StartUHostInstanceResult result = (StartUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void startUHostInstanceCallback(StartUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RebootUHostInstanceResult rebootUHostInstance(RebootUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        RebootUHostInstanceResult result = (RebootUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void rebootUHostInstanceCallback(RebootUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public StopUHostInstanceResult stopUHostInstance(StopUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        StopUHostInstanceResult result = (StopUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void stopUHostInstanceCallback(StopUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUHostTagsResult describeUHostTags(DescribeUHostTagsParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        DescribeUHostTagsResult result = (DescribeUHostTagsResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUHostTagsCallback(StopUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {

        }
    }

    @Override
    public CreateUHostInstanceResult createUHostInstance(CreateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        CreateUHostInstanceResult result = (CreateUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUHostInstance(CreateUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        try {
            http.doGet(param, config, null);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceTagResult modifyUHostInstanceTag(ModifyUHostInstanceTagParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        ModifyUHostInstanceTagResult result = (ModifyUHostInstanceTagResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyUHostInstanceTag(ModifyUHostInstanceTagParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public TerminateUHostInstanceResult terminateUHostInstance(TerminateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        TerminateUHostInstanceResult result = (TerminateUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void terminateUHostInstance(TerminateUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUHostInstanceResult describeUHostInstance(DescribeUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        DescribeUHostInstanceResult result = (DescribeUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUHostInstance(DescribeUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUHostInstancePriceResult getUHostInstancePrice(GetUHostInstancePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUHostInstancePriceResult.class);
        GetUHostInstancePriceResult result = (GetUHostInstancePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getUHostInstancePrice(GetUHostInstancePriceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUHostInstancePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUHostInstanceResult resizeUHostInstance(ResizeUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUHostInstanceResult.class);
        ResizeUHostInstanceResult result = (ResizeUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void resizeUHostInstance(ResizeUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceNameResult modifyUHostInstanceName(ModifyUHostInstanceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceNameResult.class);
        ModifyUHostInstanceNameResult result = (ModifyUHostInstanceNameResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyUHostInstanceName(ModifyUHostInstanceNameParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResetUHostInstancePasswordResult resetUHostInstancePassword(ResetUHostInstancePasswordParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResetUHostInstancePasswordResult.class);
        ResetUHostInstancePasswordResult result = (ResetUHostInstancePasswordResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void resetUHostInstancePassword(ResetUHostInstancePasswordParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResetUHostInstancePasswordResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PoweroffUHostInstanceResult poweroffUHostInstance(PoweroffUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PoweroffUHostInstanceResult.class);
        PoweroffUHostInstanceResult result = (PoweroffUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void poweroffUHostInstance(PoweroffUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PoweroffUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ImportCustomImageResult importCustomImage(ImportCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ImportCustomImageResult.class);
        ImportCustomImageResult result = (ImportCustomImageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void importCustomImage(ImportCustomImageParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ImportCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CopyCustomImageResult copyCustomImage(CopyCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CopyCustomImageResult.class);
        CopyCustomImageResult result = (CopyCustomImageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void copyCustomImage(CopyCustomImageParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CopyCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeImageResult describeImage(DescribeImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeImageResult.class);
        DescribeImageResult result = (DescribeImageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeImage(DescribeImageParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public TerminateCustomImageResult terminateCustomImage(TerminateCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(TerminateCustomImageResult.class);
        TerminateCustomImageResult result = (TerminateCustomImageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void terminateCustomImage(TerminateCustomImageParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(TerminateCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReinstallUHostInstanceResult reinstallUHostInstance(ReinstallUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReinstallUHostInstanceResult.class);
        ReinstallUHostInstanceResult result = (ReinstallUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void reinstallUHostInstance(ReinstallUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReinstallUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUHostUpgradePriceResult getUHostUpgradePrice(GetUHostUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUHostUpgradePriceResult.class);
        GetUHostUpgradePriceResult result = (GetUHostUpgradePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getUHostUpgradePrice(GetUHostUpgradePriceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUHostUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUHostInstanceRemarkResult modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceRemarkResult.class);
        ModifyUHostInstanceRemarkResult result = (ModifyUHostInstanceRemarkResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceRemarkResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateCustomImageResult createCustomImage(CreateCustomImageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateCustomImageResult.class);
        CreateCustomImageResult result = (CreateCustomImageResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createCustomeImage(CreateCustomImageParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateCustomImageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public BaseResponseResult upgradeToArkUHostInstance(BaseRequestParam param) {
        return null;
    }


}
