package cn.ucloud.umem.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.*;

/**
 * @Description : UMEM 客户端接口
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public interface UMEMClient extends UcloudClient {

    /**
     * 创建内存空间
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUMemSpaceResult createUMemSpace(
            CreateUMemSpaceParam param) throws Exception;

    /**
     * 创建内存空间 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUMemSpace(CreateUMemSpaceParam param,
                         UcloudHandler<CreateUMemSpaceResult> handler,
                         Boolean... asyncFlag);

    /**
     * 删除空间
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUMemSpaceResult deleteUMemSpace(
            DeleteUMemSpaceParam param) throws Exception;

    /**
     * 删除空间 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUMemSpace(DeleteUMemSpaceParam param,
                         UcloudHandler<DeleteUMemSpaceResult> handler,
                         Boolean... asyncFlag);

    /**
     * 获取空间状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUMemSpaceStateResult getUMemSpaceState(
            GetUMemSpaceStateParam param) throws Exception;

    /**
     * 获取空间状态 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUMemSpaceState(GetUMemSpaceStateParam param,
                           UcloudHandler<GetUMemSpaceStateResult> handler,
                           Boolean... asyncFlag);

    /**
     * 删除主备redis
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteURedisGroupResult deleteURedisGroup(
            DeleteURedisGroupParam param) throws Exception;

    /**
     * 删除主备redis (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteURedisGroup(DeleteURedisGroupParam param,
                           UcloudHandler<DeleteURedisGroupResult> handler,
                           Boolean... asyncFlag);

    /**
     * 查询主备redis备份
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisBackupResult describeURedisBackup(
            DescribeURedisBackupParam param) throws Exception;

    /**
     * 查询主备redis备份 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisBackup(DescribeURedisBackupParam param,
                              UcloudHandler<DescribeURedisBackupResult> handler,
                              Boolean... asyncFlag);

    /**
     * 修改名称
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyURedisGroupNameResult modifyURedisGroupName(
            ModifyURedisGroupNameParam param) throws Exception;

    /**
     * 修改名称 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyURedisGroupName(ModifyURedisGroupNameParam param,
                               UcloudHandler<ModifyURedisGroupNameResult> handler,
                               Boolean... asyncFlag);

    /**
     * 修改UMemcache名称
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUMemcacheGroupNameResult modifyUMemcacheGroupName(
            ModifyUMemcacheGroupNameParam param) throws Exception;

    /**
     * 修改UMemcache名称 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUMemcacheGroupName(ModifyUMemcacheGroupNameParam param,
                                  UcloudHandler<ModifyUMemcacheGroupNameResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 获取umemcache升级价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemcacheUpgradePriceResult describeUMemcacheUpgradePrice(
            DescribeUMemcacheUpgradePriceParam param) throws Exception;

    /**
     * 获取umemcache升级价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemcacheUpgradePrice(DescribeUMemcacheUpgradePriceParam param,
                                       UcloudHandler<DescribeUMemcacheUpgradePriceResult> handler,
                                       Boolean... asyncFlag);

    /**
     * 检查URedis资源是否足够
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckURedisAllowanceResult checkURedisAllowance(
            CheckURedisAllowanceParam param) throws Exception;

    /**
     * 检查URedis资源是否足够 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkURedisAllowance(CheckURedisAllowanceParam param,
                              UcloudHandler<CheckURedisAllowanceResult> handler,
                              Boolean... asyncFlag);

    /**
     * 删除UMem资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUMemResult deleteUMem(
            DeleteUMemParam param) throws Exception;

    /**
     * 删除UMem资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUMem(DeleteUMemParam param,
                    UcloudHandler<DeleteUMemResult> handler,
                    Boolean... asyncFlag);

    /**
     * 检查机房整体资源情况
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckRegionResourceResult checkRegionResource(
            CheckRegionResourceParam param) throws Exception;

    /**
     * 检查机房整体资源情况 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkRegionResource(CheckRegionResourceParam param,
                             UcloudHandler<CheckRegionResourceResult> handler,
                             Boolean... asyncFlag);

    /**
     * 重启单机Memcache
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RestartUMemcacheGroupResult restartUMemcacheGroup(
            RestartUMemcacheGroupParam param) throws Exception;

    /**
     * 重启单机Memcache (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void restartUMemcacheGroup(RestartUMemcacheGroupParam param,
                               UcloudHandler<RestartUMemcacheGroupResult> handler,
                               Boolean... asyncFlag);

    /**
     * 修改主备Redis配置文件参数
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyURedisConfigResult modifyURedisConfig(
            ModifyURedisConfigParam param) throws Exception;

    /**
     * 修改主备Redis配置文件参数 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyURedisConfig(ModifyURedisConfigParam param,
                            UcloudHandler<ModifyURedisConfigResult> handler,
                            Boolean... asyncFlag);

    /**
     * 创建URedis自定义配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateURedisConfigResult createURedisConfig(
            CreateURedisConfigParam param) throws Exception;

    /**
     * 创建URedis自定义配置文件 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createURedisConfig(CreateURedisConfigParam param,
                            UcloudHandler<CreateURedisConfigResult> handler,
                            Boolean... asyncFlag);

    /**
     * 删除主备Redis自定义配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteURedisConfigResult deleteURedisConfig(
            DeleteURedisConfigParam param) throws Exception;

    /**
     * 删除主备Redis自定义配置文件 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteURedisConfig(DeleteURedisConfigParam param,
                            UcloudHandler<DeleteURedisConfigResult> handler,
                            Boolean... asyncFlag);

    /**
     * 显示主备Redis配置文件参数信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisConfigParamResult describeURedisConfigParam(
            DescribeURedisConfigParamParam param) throws Exception;

    /**
     * 显示主备Redis配置文件参数信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisConfigParam(DescribeURedisConfigParamParam param,
                                   UcloudHandler<DescribeURedisConfigParamResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 查询主备Redis所有配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisConfigResult describeURedisConfig(
            DescribeURedisConfigParam param) throws Exception;

    /**
     * 查询主备Redis所有配置文件 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisConfig(DescribeURedisConfigParam param,
                              UcloudHandler<DescribeURedisConfigResult> handler,
                              Boolean... asyncFlag);

    /**
     * 重启主备实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RestartURedisGroupResult restartURedisGroup(
            RestartURedisGroupParam param) throws Exception;

    /**
     * 重启主备实例 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void restartURedisGroup(RestartURedisGroupParam param,
                            UcloudHandler<RestartURedisGroupResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取Memcache可用版本
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemcacheVersionResult describeUMemcacheVersion(
            DescribeUMemcacheVersionParam param) throws Exception;

    /**
     * 获取Memcache可用版本 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemcacheVersion(DescribeUMemcacheVersionParam param,
                                  UcloudHandler<DescribeUMemcacheVersionResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 删除URedis备份
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteURedisBackupResult deleteURedisBackup(
            DeleteURedisBackupParam param) throws Exception;

    /**
     * 删除URedis备份 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteURedisBackup(DeleteURedisBackupParam param,
                            UcloudHandler<DeleteURedisBackupResult> handler,
                            Boolean... asyncFlag);

    /**
     * 查询空间
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemSpaceResult describeUMemSpace(
            DescribeUMemSpaceParam param) throws Exception;

    /**
     * 查询空间 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemSpace(DescribeUMemSpaceParam param,
                           UcloudHandler<DescribeUMemSpaceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 查询主备Redis
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisGroupResult describeURedisGroup(
            DescribeURedisGroupParam param) throws Exception;

    /**
     * 查询主备Redis (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisGroup(DescribeURedisGroupParam param,
                             UcloudHandler<DescribeURedisGroupResult> handler,
                             Boolean... asyncFlag);

    /**
     * 获取主Redis可用版本
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisVersionResult describeURedisVersion(
            DescribeURedisVersionParam param) throws Exception;

    /**
     * 获取主Redis可用版本 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisVersion(DescribeURedisVersionParam param,
                               UcloudHandler<DescribeURedisVersionResult> handler,
                               Boolean... asyncFlag);

    /**
     * 删除单机Memcache
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUMemcacheGroupResult deleteUMemcacheGroup(
            DeleteUMemcacheGroupParam param) throws Exception;

    /**
     * 删除单机Memcache (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUMemcacheGroup(DeleteUMemcacheGroupParam param,
                              UcloudHandler<DeleteUMemcacheGroupResult> handler,
                              Boolean... asyncFlag);

    /**
     * 更改zhubeiredis的备份策略
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdateURedisBackupStrategyResult updateURedisBackupStrategy(
            UpdateURedisBackupStrategyParam param) throws Exception;

    /**
     * 更改zhubeiredis的备份策略 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updateURedisBackupStrategy(UpdateURedisBackupStrategyParam param,
                                    UcloudHandler<UpdateURedisBackupStrategyResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 检查高性能UMem剩余资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUDredisSpaceAllowanceResult checkUDredisSpaceAllowance(
            CheckUDredisSpaceAllowanceParam param) throws Exception;

    /**
     * 检查高性能UMem剩余资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkUDredisSpaceAllowance(CheckUDredisSpaceAllowanceParam param,
                                    UcloudHandler<CheckUDredisSpaceAllowanceResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 获取价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemPriceResult describeUMemPrice(
            DescribeUMemPriceParam param) throws Exception;

    /**
     * 获取价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemPrice(DescribeUMemPriceParam param,
                           UcloudHandler<DescribeUMemPriceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 调整容量
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ResizeUMemSpaceResult resizeUMemSpace(
            ResizeUMemSpaceParam param) throws Exception;

    /**
     * 调整容量 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void resizeUMemSpace(ResizeUMemSpaceParam param,
                         UcloudHandler<ResizeUMemSpaceResult> handler,
                         Boolean... asyncFlag);

    /**
     * 创建主备redis
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateURedisGroupResult createURedisGroup(
            CreateURedisGroupParam param) throws Exception;

    /**
     * 创建主备redis (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createURedisGroup(CreateURedisGroupParam param,
                           UcloudHandler<CreateURedisGroupResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取主备Redis备份下载链接
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisBackupURLResult describeURedisBackupURL(
            DescribeURedisBackupURLParam param) throws Exception;

    /**
     * 获取主备Redis备份下载链接 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisBackupURL(DescribeURedisBackupURLParam param,
                                 UcloudHandler<DescribeURedisBackupURLResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 获取umemcache组价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemcachePriceResult describeUMemcachePrice(
            DescribeUMemcachePriceParam param) throws Exception;

    /**
     * 获取umemcache组价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemcachePrice(DescribeUMemcachePriceParam param,
                                UcloudHandler<DescribeUMemcachePriceResult> handler,
                                Boolean... asyncFlag);

    /**
     * 显示Memcache
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemcacheGroupResult describeUMemcacheGroup(
            DescribeUMemcacheGroupParam param) throws Exception;

    /**
     * 显示Memcache (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMemcacheGroup(DescribeUMemcacheGroupParam param,
                                UcloudHandler<DescribeUMemcacheGroupResult> handler,
                                Boolean... asyncFlag);

    /**
     * 获取UMem列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUMemResult describeUMem(
            DescribeUMemParam param) throws Exception;

    /**
     * 获取UMem列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUMem(DescribeUMemParam param,
                      UcloudHandler<DescribeUMemResult> handler,
                      Boolean... asyncFlag);

    /**
     * 检查分布式UMem剩余资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUMemSpaceAllowanceResult checkUMemSpaceAllowance(
            CheckUMemSpaceAllowanceParam param) throws Exception;

    /**
     * 检查分布式UMem剩余资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkUMemSpaceAllowance(CheckUMemSpaceAllowanceParam param,
                                 UcloudHandler<CheckUMemSpaceAllowanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 取uredis价格信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisPriceResult describeURedisPrice(
            DescribeURedisPriceParam param) throws Exception;

    /**
     * 取uredis价格信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisPrice(DescribeURedisPriceParam param,
                             UcloudHandler<DescribeURedisPriceResult> handler,
                             Boolean... asyncFlag);

    /**
     * 查询URedis慢日志
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisSlowlogResult describeURedisSlowlog(
            DescribeURedisSlowlogParam param) throws Exception;

    /**
     * 查询URedis慢日志 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisSlowlog(DescribeURedisSlowlogParam param,
                               UcloudHandler<DescribeURedisSlowlogResult> handler,
                               Boolean... asyncFlag);

    /**
     * 修改主备密码
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyURedisGroupPasswordResult modifyURedisGroupPassword(
            ModifyURedisGroupPasswordParam param) throws Exception;

    /**
     * 修改主备密码 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyURedisGroupPassword(ModifyURedisGroupPasswordParam param,
                                   UcloudHandler<ModifyURedisGroupPasswordResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 调整容量
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ResizeUMemcacheGroupResult resizeUMemcacheGroup(
            ResizeUMemcacheGroupParam param) throws Exception;

    /**
     * 调整容量 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void resizeUMemcacheGroup(ResizeUMemcacheGroupParam param,
                              UcloudHandler<ResizeUMemcacheGroupResult> handler,
                              Boolean... asyncFlag);

    /**
     * 查询主备Redis关联Slave
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisSlaveGroupResult describeURedisSlaveGroup(
            DescribeURedisSlaveGroupParam param) throws Exception;

    /**
     * 查询主备Redis关联Slave (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisSlaveGroup(DescribeURedisSlaveGroupParam param,
                                  UcloudHandler<DescribeURedisSlaveGroupResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 获取uredis升级价格信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisUpgradePriceResult describeURedisUpgradePrice(
            DescribeURedisUpgradePriceParam param) throws Exception;

    /**
     * 获取uredis升级价格信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisUpgradePrice(DescribeURedisUpgradePriceParam param,
                                    UcloudHandler<DescribeURedisUpgradePriceResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 调整容量
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ResizeURedisGroupResult resizeURedisGroup(
            ResizeURedisGroupParam param) throws Exception;

    /**
     * 调整容量 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void resizeURedisGroup(ResizeURedisGroupParam param,
                           UcloudHandler<ResizeURedisGroupResult> handler,
                           Boolean... asyncFlag);

    /**
     * 检查UMemcache剩余资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUMemcacheAllowanceResult checkUMemcacheAllowance(
            CheckUMemcacheAllowanceParam param) throws Exception;

    /**
     * 检查UMemcache剩余资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkUMemcacheAllowance(CheckUMemcacheAllowanceParam param,
                                 UcloudHandler<CheckUMemcacheAllowanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 创建单机Memcache
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUMemcacheGroupResult createUMemcacheGroup(
            CreateUMemcacheGroupParam param) throws Exception;

    /**
     * 创建单机Memcache (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUMemcacheGroup(CreateUMemcacheGroupParam param,
                              UcloudHandler<CreateUMemcacheGroupResult> handler,
                              Boolean... asyncFlag);

    /**
     * 更换Redis配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ChangeURedisConfigResult changeURedisConfig(
            ChangeURedisConfigParam param) throws Exception;

    /**
     * 更换Redis配置文件 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void changeURedisConfig(ChangeURedisConfigParam param,
                            UcloudHandler<ChangeURedisConfigResult> handler,
                            Boolean... asyncFlag);

    /**
     * 修改名称
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUMemSpaceNameResult modifyUMemSpaceName(
            ModifyUMemSpaceNameParam param) throws Exception;

    /**
     * 修改名称 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUMemSpaceName(ModifyUMemSpaceNameParam param,
                             UcloudHandler<ModifyUMemSpaceNameResult> handler,
                             Boolean... asyncFlag);

    /**
     * 查询备份状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeURedisBackupStateResult describeURedisBackupState(
            DescribeURedisBackupStateParam param) throws Exception;

    /**
     * 查询备份状态 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeURedisBackupState(DescribeURedisBackupStateParam param,
                                   UcloudHandler<DescribeURedisBackupStateResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 创建主备Redis备份
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateURedisBackupResult createURedisBackup(
            CreateURedisBackupParam param) throws Exception;

    /**
     * 创建主备Redis备份 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createURedisBackup(CreateURedisBackupParam param,
                            UcloudHandler<CreateURedisBackupResult> handler,
                            Boolean... asyncFlag);
}