package cn.ucloud.pathx.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.pathx.model.*;
import cn.ucloud.pathx.pojo.PATHXConfig;

/**
 * @Description : PATHX 默认客户端接口实现
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DefaultPATHXClient extends DefaultUcloudClient implements PATHXClient {
    public DefaultPATHXClient(PATHXConfig config) {
        super(config);
    }

    @Override
    public DeleteUPathResult deleteUPath(DeleteUPathParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUPathResult.class);
        return (DeleteUPathResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUPath(DeleteUPathParam param,
                            UcloudHandler<DeleteUPathResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUPathResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateGlobalSSHInstanceResult createGlobalSSHInstance(CreateGlobalSSHInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateGlobalSSHInstanceResult.class);
        return (CreateGlobalSSHInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void createGlobalSSHInstance(CreateGlobalSSHInstanceParam param,
                                        UcloudHandler<CreateGlobalSSHInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateGlobalSSHInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUGAUpdatePriceResult getUGAUpdatePrice(GetUGAUpdatePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUGAUpdatePriceResult.class);
        return (GetUGAUpdatePriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getUGAUpdatePrice(GetUGAUpdatePriceParam param,
                                  UcloudHandler<GetUGAUpdatePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUGAUpdatePriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUPathNameResult modifyUPathName(ModifyUPathNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathNameResult.class);
        return (ModifyUPathNameResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUPathName(ModifyUPathNameParam param,
                                UcloudHandler<ModifyUPathNameResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathNameResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUPathBandwidthResult modifyUPathBandwidth(ModifyUPathBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathBandwidthResult.class);
        return (ModifyUPathBandwidthResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUPathBandwidth(ModifyUPathBandwidthParam param,
                                     UcloudHandler<ModifyUPathBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathBandwidthResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUPathResult describeUPath(DescribeUPathParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUPathResult.class);
        return (DescribeUPathResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUPath(DescribeUPathParam param,
                              UcloudHandler<DescribeUPathResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUPathResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UGAUnBindUPathResult uGAUnBindUPath(UGAUnBindUPathParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UGAUnBindUPathResult.class);
        return (UGAUnBindUPathResult) http.doPost(param, config, null);
    }

    @Override
    public void uGAUnBindUPath(UGAUnBindUPathParam param,
                               UcloudHandler<UGAUnBindUPathResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UGAUnBindUPathResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UGABindUPathResult uGABindUPath(UGABindUPathParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UGABindUPathResult.class);
        return (UGABindUPathResult) http.doPost(param, config, null);
    }

    @Override
    public void uGABindUPath(UGABindUPathParam param,
                             UcloudHandler<UGABindUPathResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UGABindUPathResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUPathTemplateResult describeUPathTemplate(DescribeUPathTemplateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUPathTemplateResult.class);
        return (DescribeUPathTemplateResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUPathTemplate(DescribeUPathTemplateParam param,
                                      UcloudHandler<DescribeUPathTemplateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUPathTemplateResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUPathTemplateResult modifyUPathTemplate(ModifyUPathTemplateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathTemplateResult.class);
        return (ModifyUPathTemplateResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUPathTemplate(ModifyUPathTemplateParam param,
                                    UcloudHandler<ModifyUPathTemplateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUPathTemplateResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUPathUpdatePriceResult getUPathUpdatePrice(GetUPathUpdatePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUPathUpdatePriceResult.class);
        return (GetUPathUpdatePriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getUPathUpdatePrice(GetUPathUpdatePriceParam param,
                                    UcloudHandler<GetUPathUpdatePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUPathUpdatePriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetCommonUGAPriceResult getCommonUGAPrice(GetCommonUGAPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetCommonUGAPriceResult.class);
        return (GetCommonUGAPriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getCommonUGAPrice(GetCommonUGAPriceParam param,
                                  UcloudHandler<GetCommonUGAPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetCommonUGAPriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteCommonUGAInstanceResult deleteCommonUGAInstance(DeleteCommonUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteCommonUGAInstanceResult.class);
        return (DeleteCommonUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteCommonUGAInstance(DeleteCommonUGAInstanceParam param,
                                        UcloudHandler<DeleteCommonUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteCommonUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUGATaskResult deleteUGATask(DeleteUGATaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUGATaskResult.class);
        return (DeleteUGATaskResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUGATask(DeleteUGATaskParam param,
                              UcloudHandler<DeleteUGATaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUGATaskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AddUGATaskResult addUGATask(AddUGATaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddUGATaskResult.class);
        return (AddUGATaskResult) http.doPost(param, config, null);
    }

    @Override
    public void addUGATask(AddUGATaskParam param,
                           UcloudHandler<AddUGATaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddUGATaskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUGAInstanceResult createUGAInstance(CreateUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUGAInstanceResult.class);
        return (CreateUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void createUGAInstance(CreateUGAInstanceParam param,
                                  UcloudHandler<CreateUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUGAInstanceResult deleteUGAInstance(DeleteUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUGAInstanceResult.class);
        return (DeleteUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUGAInstance(DeleteUGAInstanceParam param,
                                  UcloudHandler<DeleteUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUGAInstanceResult describeUGAInstance(DescribeUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUGAInstanceResult.class);
        return (DescribeUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUGAInstance(DescribeUGAInstanceParam param,
                                    UcloudHandler<DescribeUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeCommonUGAInstanceResult describeCommonUGAInstance(DescribeCommonUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeCommonUGAInstanceResult.class);
        return (DescribeCommonUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeCommonUGAInstance(DescribeCommonUGAInstanceParam param,
                                          UcloudHandler<DescribeCommonUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeCommonUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetPathXMetricResult getPathXMetric(GetPathXMetricParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetPathXMetricResult.class);
        return (GetPathXMetricResult) http.doPost(param, config, null);
    }

    @Override
    public void getPathXMetric(GetPathXMetricParam param,
                               UcloudHandler<GetPathXMetricResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetPathXMetricResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribePathXLineConfigResult describePathXLineConfig(DescribePathXLineConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribePathXLineConfigResult.class);
        return (DescribePathXLineConfigResult) http.doPost(param, config, null);
    }

    @Override
    public void describePathXLineConfig(DescribePathXLineConfigParam param,
                                        UcloudHandler<DescribePathXLineConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribePathXLineConfigResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteGlobalSSHInstanceResult deleteGlobalSSHInstance(DeleteGlobalSSHInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteGlobalSSHInstanceResult.class);
        return (DeleteGlobalSSHInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteGlobalSSHInstance(DeleteGlobalSSHInstanceParam param,
                                        UcloudHandler<DeleteGlobalSSHInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteGlobalSSHInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public InsertPathXWhitelistResult insertPathXWhitelist(InsertPathXWhitelistParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(InsertPathXWhitelistResult.class);
        return (InsertPathXWhitelistResult) http.doPost(param, config, null);
    }

    @Override
    public void insertPathXWhitelist(InsertPathXWhitelistParam param,
                                     UcloudHandler<InsertPathXWhitelistResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(InsertPathXWhitelistResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUGAPriceResult getUGAPrice(GetUGAPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUGAPriceResult.class);
        return (GetUGAPriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getUGAPrice(GetUGAPriceParam param,
                            UcloudHandler<GetUGAPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUGAPriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public GetUPathPriceResult getUPathPrice(GetUPathPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUPathPriceResult.class);
        return (GetUPathPriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getUPathPrice(GetUPathPriceParam param,
                              UcloudHandler<GetUPathPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUPathPriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyGlobalSSHPortResult modifyGlobalSSHPort(ModifyGlobalSSHPortParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyGlobalSSHPortResult.class);
        return (ModifyGlobalSSHPortResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyGlobalSSHPort(ModifyGlobalSSHPortParam param,
                                    UcloudHandler<ModifyGlobalSSHPortResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyGlobalSSHPortResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdatePathXWhitelistResult updatePathXWhitelist(UpdatePathXWhitelistParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdatePathXWhitelistResult.class);
        return (UpdatePathXWhitelistResult) http.doPost(param, config, null);
    }

    @Override
    public void updatePathXWhitelist(UpdatePathXWhitelistParam param,
                                     UcloudHandler<UpdatePathXWhitelistResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdatePathXWhitelistResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribePathXWhitelistResult describePathXWhitelist(DescribePathXWhitelistParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribePathXWhitelistResult.class);
        return (DescribePathXWhitelistResult) http.doPost(param, config, null);
    }

    @Override
    public void describePathXWhitelist(DescribePathXWhitelistParam param,
                                       UcloudHandler<DescribePathXWhitelistResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribePathXWhitelistResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyGlobalSSHRemarkResult modifyGlobalSSHRemark(ModifyGlobalSSHRemarkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyGlobalSSHRemarkResult.class);
        return (ModifyGlobalSSHRemarkResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyGlobalSSHRemark(ModifyGlobalSSHRemarkParam param,
                                      UcloudHandler<ModifyGlobalSSHRemarkResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyGlobalSSHRemarkResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetGlobalSSHMetricResult getGlobalSSHMetric(GetGlobalSSHMetricParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHMetricResult.class);
        return (GetGlobalSSHMetricResult) http.doPost(param, config, null);
    }

    @Override
    public void getGlobalSSHMetric(GetGlobalSSHMetricParam param,
                                   UcloudHandler<GetGlobalSSHMetricResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHMetricResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeGlobalSSHAreaResult describeGlobalSSHArea(DescribeGlobalSSHAreaParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeGlobalSSHAreaResult.class);
        return (DescribeGlobalSSHAreaResult) http.doPost(param, config, null);
    }

    @Override
    public void describeGlobalSSHArea(DescribeGlobalSSHAreaParam param,
                                      UcloudHandler<DescribeGlobalSSHAreaResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeGlobalSSHAreaResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetGlobalSSHPriceResult getGlobalSSHPrice(GetGlobalSSHPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHPriceResult.class);
        return (GetGlobalSSHPriceResult) http.doPost(param, config, null);
    }

    @Override
    public void getGlobalSSHPrice(GetGlobalSSHPriceParam param,
                                  UcloudHandler<GetGlobalSSHPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHPriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetGlobalSSHTrafficResult getGlobalSSHTraffic(GetGlobalSSHTrafficParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHTrafficResult.class);
        return (GetGlobalSSHTrafficResult) http.doPost(param, config, null);
    }

    @Override
    public void getGlobalSSHTraffic(GetGlobalSSHTrafficParam param,
                                    UcloudHandler<GetGlobalSSHTrafficResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetGlobalSSHTrafficResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUPathResult createUPath(CreateUPathParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUPathResult.class);
        return (CreateUPathResult) http.doPost(param, config, null);
    }

    @Override
    public void createUPath(CreateUPathParam param,
                            UcloudHandler<CreateUPathResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUPathResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateCommonUGAInstanceResult createCommonUGAInstance(CreateCommonUGAInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateCommonUGAInstanceResult.class);
        return (CreateCommonUGAInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void createCommonUGAInstance(CreateCommonUGAInstanceParam param,
                                        UcloudHandler<CreateCommonUGAInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateCommonUGAInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeGlobalSSHInstanceResult describeGlobalSSHInstance(DescribeGlobalSSHInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeGlobalSSHInstanceResult.class);
        return (DescribeGlobalSSHInstanceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeGlobalSSHInstance(DescribeGlobalSSHInstanceParam param,
                                          UcloudHandler<DescribeGlobalSSHInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeGlobalSSHInstanceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


}