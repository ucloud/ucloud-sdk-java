package cn.ucloud.umem.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.umem.model.*;
import cn.ucloud.umem.pojo.UMEMConfig;

/**
 * @Description : UMEM 默认客户端接口实现
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DefaultUMEMClient extends DefaultUcloudClient implements UMEMClient {
    public DefaultUMEMClient(UMEMConfig config) {
        super(config);
    }

    @Override
    public CreateUMemSpaceResult createUMemSpace(CreateUMemSpaceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUMemSpaceResult.class);
        return (CreateUMemSpaceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUMemSpace(CreateUMemSpaceParam param,
                                UcloudHandler<CreateUMemSpaceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUMemSpaceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUMemSpaceResult deleteUMemSpace(DeleteUMemSpaceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemSpaceResult.class);
        return (DeleteUMemSpaceResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUMemSpace(DeleteUMemSpaceParam param,
                                UcloudHandler<DeleteUMemSpaceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemSpaceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUMemSpaceStateResult getUMemSpaceState(GetUMemSpaceStateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUMemSpaceStateResult.class);
        return (GetUMemSpaceStateResult) http.doGet(param, config, null);
    }

    @Override
    public void getUMemSpaceState(GetUMemSpaceStateParam param,
                                  UcloudHandler<GetUMemSpaceStateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUMemSpaceStateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteURedisGroupResult deleteURedisGroup(DeleteURedisGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisGroupResult.class);
        return (DeleteURedisGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteURedisGroup(DeleteURedisGroupParam param,
                                  UcloudHandler<DeleteURedisGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisBackupResult describeURedisBackup(DescribeURedisBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupResult.class);
        return (DescribeURedisBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisBackup(DescribeURedisBackupParam param,
                                     UcloudHandler<DescribeURedisBackupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyURedisGroupNameResult modifyURedisGroupName(ModifyURedisGroupNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisGroupNameResult.class);
        return (ModifyURedisGroupNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyURedisGroupName(ModifyURedisGroupNameParam param,
                                      UcloudHandler<ModifyURedisGroupNameResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisGroupNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUMemcacheGroupNameResult modifyUMemcacheGroupName(ModifyUMemcacheGroupNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUMemcacheGroupNameResult.class);
        return (ModifyUMemcacheGroupNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUMemcacheGroupName(ModifyUMemcacheGroupNameParam param,
                                         UcloudHandler<ModifyUMemcacheGroupNameResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUMemcacheGroupNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemcacheUpgradePriceResult describeUMemcacheUpgradePrice(DescribeUMemcacheUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheUpgradePriceResult.class);
        return (DescribeUMemcacheUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemcacheUpgradePrice(DescribeUMemcacheUpgradePriceParam param,
                                              UcloudHandler<DescribeUMemcacheUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckURedisAllowanceResult checkURedisAllowance(CheckURedisAllowanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckURedisAllowanceResult.class);
        return (CheckURedisAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkURedisAllowance(CheckURedisAllowanceParam param,
                                     UcloudHandler<CheckURedisAllowanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckURedisAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUMemResult deleteUMem(DeleteUMemParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemResult.class);
        return (DeleteUMemResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUMem(DeleteUMemParam param,
                           UcloudHandler<DeleteUMemResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckRegionResourceResult checkRegionResource(CheckRegionResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckRegionResourceResult.class);
        return (CheckRegionResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkRegionResource(CheckRegionResourceParam param,
                                    UcloudHandler<CheckRegionResourceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckRegionResourceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestartUMemcacheGroupResult restartUMemcacheGroup(RestartUMemcacheGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestartUMemcacheGroupResult.class);
        return (RestartUMemcacheGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void restartUMemcacheGroup(RestartUMemcacheGroupParam param,
                                      UcloudHandler<RestartUMemcacheGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestartUMemcacheGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyURedisConfigResult modifyURedisConfig(ModifyURedisConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisConfigResult.class);
        return (ModifyURedisConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyURedisConfig(ModifyURedisConfigParam param,
                                   UcloudHandler<ModifyURedisConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateURedisConfigResult createURedisConfig(CreateURedisConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisConfigResult.class);
        return (CreateURedisConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void createURedisConfig(CreateURedisConfigParam param,
                                   UcloudHandler<CreateURedisConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteURedisConfigResult deleteURedisConfig(DeleteURedisConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisConfigResult.class);
        return (DeleteURedisConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteURedisConfig(DeleteURedisConfigParam param,
                                   UcloudHandler<DeleteURedisConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisConfigParamResult describeURedisConfigParam(DescribeURedisConfigParamParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisConfigParamResult.class);
        return (DescribeURedisConfigParamResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisConfigParam(DescribeURedisConfigParamParam param,
                                          UcloudHandler<DescribeURedisConfigParamResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisConfigParamResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisConfigResult describeURedisConfig(DescribeURedisConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisConfigResult.class);
        return (DescribeURedisConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisConfig(DescribeURedisConfigParam param,
                                     UcloudHandler<DescribeURedisConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestartURedisGroupResult restartURedisGroup(RestartURedisGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestartURedisGroupResult.class);
        return (RestartURedisGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void restartURedisGroup(RestartURedisGroupParam param,
                                   UcloudHandler<RestartURedisGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestartURedisGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemcacheVersionResult describeUMemcacheVersion(DescribeUMemcacheVersionParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheVersionResult.class);
        return (DescribeUMemcacheVersionResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemcacheVersion(DescribeUMemcacheVersionParam param,
                                         UcloudHandler<DescribeUMemcacheVersionResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheVersionResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteURedisBackupResult deleteURedisBackup(DeleteURedisBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisBackupResult.class);
        return (DeleteURedisBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteURedisBackup(DeleteURedisBackupParam param,
                                   UcloudHandler<DeleteURedisBackupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteURedisBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemSpaceResult describeUMemSpace(DescribeUMemSpaceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemSpaceResult.class);
        return (DescribeUMemSpaceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemSpace(DescribeUMemSpaceParam param,
                                  UcloudHandler<DescribeUMemSpaceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemSpaceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisGroupResult describeURedisGroup(DescribeURedisGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisGroupResult.class);
        return (DescribeURedisGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisGroup(DescribeURedisGroupParam param,
                                    UcloudHandler<DescribeURedisGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisVersionResult describeURedisVersion(DescribeURedisVersionParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisVersionResult.class);
        return (DescribeURedisVersionResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisVersion(DescribeURedisVersionParam param,
                                      UcloudHandler<DescribeURedisVersionResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisVersionResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUMemcacheGroupResult deleteUMemcacheGroup(DeleteUMemcacheGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemcacheGroupResult.class);
        return (DeleteUMemcacheGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUMemcacheGroup(DeleteUMemcacheGroupParam param,
                                     UcloudHandler<DeleteUMemcacheGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUMemcacheGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateURedisBackupStrategyResult updateURedisBackupStrategy(UpdateURedisBackupStrategyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateURedisBackupStrategyResult.class);
        return (UpdateURedisBackupStrategyResult) http.doGet(param, config, null);
    }

    @Override
    public void updateURedisBackupStrategy(UpdateURedisBackupStrategyParam param,
                                           UcloudHandler<UpdateURedisBackupStrategyResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateURedisBackupStrategyResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUDredisSpaceAllowanceResult checkUDredisSpaceAllowance(CheckUDredisSpaceAllowanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUDredisSpaceAllowanceResult.class);
        return (CheckUDredisSpaceAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUDredisSpaceAllowance(CheckUDredisSpaceAllowanceParam param,
                                           UcloudHandler<CheckUDredisSpaceAllowanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUDredisSpaceAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public DescribeUMemPriceResult describeUMemPrice(DescribeUMemPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemPriceResult.class);
        return (DescribeUMemPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemPrice(DescribeUMemPriceParam param,
                                  UcloudHandler<DescribeUMemPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUMemSpaceResult resizeUMemSpace(ResizeUMemSpaceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUMemSpaceResult.class);
        return (ResizeUMemSpaceResult) http.doGet(param, config, null);
    }

    @Override
    public void resizeUMemSpace(ResizeUMemSpaceParam param,
                                UcloudHandler<ResizeUMemSpaceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUMemSpaceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateURedisGroupResult createURedisGroup(CreateURedisGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisGroupResult.class);
        return (CreateURedisGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void createURedisGroup(CreateURedisGroupParam param,
                                  UcloudHandler<CreateURedisGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisBackupURLResult describeURedisBackupURL(DescribeURedisBackupURLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupURLResult.class);
        return (DescribeURedisBackupURLResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisBackupURL(DescribeURedisBackupURLParam param,
                                        UcloudHandler<DescribeURedisBackupURLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemcachePriceResult describeUMemcachePrice(DescribeUMemcachePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcachePriceResult.class);
        return (DescribeUMemcachePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemcachePrice(DescribeUMemcachePriceParam param,
                                       UcloudHandler<DescribeUMemcachePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcachePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemcacheGroupResult describeUMemcacheGroup(DescribeUMemcacheGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheGroupResult.class);
        return (DescribeUMemcacheGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMemcacheGroup(DescribeUMemcacheGroupParam param,
                                       UcloudHandler<DescribeUMemcacheGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemcacheGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUMemResult describeUMem(DescribeUMemParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemResult.class);
        return (DescribeUMemResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUMem(DescribeUMemParam param,
                             UcloudHandler<DescribeUMemResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUMemResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUMemSpaceAllowanceResult checkUMemSpaceAllowance(CheckUMemSpaceAllowanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUMemSpaceAllowanceResult.class);
        return (CheckUMemSpaceAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUMemSpaceAllowance(CheckUMemSpaceAllowanceParam param,
                                        UcloudHandler<CheckUMemSpaceAllowanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUMemSpaceAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisPriceResult describeURedisPrice(DescribeURedisPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisPriceResult.class);
        return (DescribeURedisPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisPrice(DescribeURedisPriceParam param,
                                    UcloudHandler<DescribeURedisPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisSlowlogResult describeURedisSlowlog(DescribeURedisSlowlogParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisSlowlogResult.class);
        return (DescribeURedisSlowlogResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisSlowlog(DescribeURedisSlowlogParam param,
                                      UcloudHandler<DescribeURedisSlowlogResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisSlowlogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyURedisGroupPasswordResult modifyURedisGroupPassword(ModifyURedisGroupPasswordParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisGroupPasswordResult.class);
        return (ModifyURedisGroupPasswordResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyURedisGroupPassword(ModifyURedisGroupPasswordParam param,
                                          UcloudHandler<ModifyURedisGroupPasswordResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyURedisGroupPasswordResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUMemcacheGroupResult resizeUMemcacheGroup(ResizeUMemcacheGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUMemcacheGroupResult.class);
        return (ResizeUMemcacheGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void resizeUMemcacheGroup(ResizeUMemcacheGroupParam param,
                                     UcloudHandler<ResizeUMemcacheGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUMemcacheGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisSlaveGroupResult describeURedisSlaveGroup(DescribeURedisSlaveGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisSlaveGroupResult.class);
        return (DescribeURedisSlaveGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisSlaveGroup(DescribeURedisSlaveGroupParam param,
                                         UcloudHandler<DescribeURedisSlaveGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisSlaveGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisUpgradePriceResult describeURedisUpgradePrice(DescribeURedisUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisUpgradePriceResult.class);
        return (DescribeURedisUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisUpgradePrice(DescribeURedisUpgradePriceParam param,
                                           UcloudHandler<DescribeURedisUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeURedisGroupResult resizeURedisGroup(ResizeURedisGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeURedisGroupResult.class);
        return (ResizeURedisGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void resizeURedisGroup(ResizeURedisGroupParam param,
                                  UcloudHandler<ResizeURedisGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeURedisGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUMemcacheAllowanceResult checkUMemcacheAllowance(CheckUMemcacheAllowanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUMemcacheAllowanceResult.class);
        return (CheckUMemcacheAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUMemcacheAllowance(CheckUMemcacheAllowanceParam param,
                                        UcloudHandler<CheckUMemcacheAllowanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUMemcacheAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUMemcacheGroupResult createUMemcacheGroup(CreateUMemcacheGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUMemcacheGroupResult.class);
        return (CreateUMemcacheGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void createUMemcacheGroup(CreateUMemcacheGroupParam param,
                                     UcloudHandler<CreateUMemcacheGroupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUMemcacheGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ChangeURedisConfigResult changeURedisConfig(ChangeURedisConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ChangeURedisConfigResult.class);
        return (ChangeURedisConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void changeURedisConfig(ChangeURedisConfigParam param,
                                   UcloudHandler<ChangeURedisConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ChangeURedisConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUMemSpaceNameResult modifyUMemSpaceName(ModifyUMemSpaceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUMemSpaceNameResult.class);
        return (ModifyUMemSpaceNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUMemSpaceName(ModifyUMemSpaceNameParam param,
                                    UcloudHandler<ModifyUMemSpaceNameResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUMemSpaceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeURedisBackupStateResult describeURedisBackupState(DescribeURedisBackupStateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupStateResult.class);
        return (DescribeURedisBackupStateResult) http.doGet(param, config, null);
    }

    @Override
    public void describeURedisBackupState(DescribeURedisBackupStateParam param,
                                          UcloudHandler<DescribeURedisBackupStateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeURedisBackupStateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateURedisBackupResult createURedisBackup(CreateURedisBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisBackupResult.class);
        return (CreateURedisBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void createURedisBackup(CreateURedisBackupParam param,
                                   UcloudHandler<CreateURedisBackupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateURedisBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}