package cn.ucloud.udb.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.udb.model.*;

public interface UDBClient extends UcloudClient {

    /**
     * 备份云数据库
     *
     * @param param 数据库备份参数对象
     * @return 数据库备份结果对象
     * @throws Exception
     */
    BackupUDBInstanceResult backupUDBInstance(BackupUDBInstanceParam param) throws Exception;

    /**
     * 备份云数据库 (回调)
     *
     * @param param     数据库备份参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstance(BackupUDBInstanceParam param, UcloudHandler<BackupUDBInstanceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 备份UDB指定时间段的binlog列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BackupUDBInstanceBinlogResult backupUDBInstanceBinlog(BackupUDBInstanceBinlogParam param) throws Exception;

    /**
     * 备份UDB指定时间段的binlog列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstanceBinlog(BackupUDBInstanceBinlogParam param, UcloudHandler<BackupUDBInstanceBinlogResult> handler,
                           Boolean... asyncFlag);

    /**
     * 备份UDB指定时间段的errorlog
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BackupUDBInstanceErrorLogResult backupUDBInstanceErrorLog(BackupUDBInstanceErrorLogParam param) throws Exception;

    /**
     * 备份UDB指定时间段的errorlog
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstanceErrorLog(BackupUDBInstanceErrorLogParam param,
                                   UcloudHandler<BackupUDBInstanceErrorLogResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 备份UDB指定时间段的slowlog分析结果
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BackupUDBInstanceSlowLogResult backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param) throws Exception;

    /**
     * 备份UDB指定时间段的slowlog分析结果
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param,
                                  UcloudHandler<BackupUDBInstanceSlowLogResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 修改配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ChangeUDBParamGroupResult changeUDBParamGroup(ChangeUDBParamGroupParam param) throws Exception;

    /**
     * 修改配置文件
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void changeUDBParamGroup(ChangeUDBParamGroupParam param, UcloudHandler<ChangeUDBParamGroupResult> handler,
                             Boolean... asyncFlag);


    /**
     * 核查db是否可以使用回档功能
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckRecoverUDBInstanceResult checkRecoverUDBInstance(CheckRecoverUDBInstanceParam param) throws Exception;

    /**
     * 核查db是否可以使用回档功能
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkRecoverUDBInstance(CheckRecoverUDBInstanceParam param,
                                 UcloudHandler<CheckRecoverUDBInstanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 检查数据库是否存在某种引擎的表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUDBEngineResult checkUDBEngine(CheckUDBEngineParam param) throws Exception;

    /**
     * 检查数据库是否存在某种引擎的表
     *
     * @param param     参数对象
     * @param handler   回调对象
     * @param asyncFlag 是否异步
     */
    void checkUDBEngine(CheckUDBEngineParam param, UcloudHandler<CheckUDBEngineResult> handler,
                        Boolean... asyncFlag);

    /**
     * 核查UDB资源余量
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUDBInstanceAllowanceResult checkUDBInstanceAllowance(CheckUDBInstanceAllowanceParam param)
            throws Exception;

    /**
     * 核查UDB资源余量
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkUDBInstanceAllowance(CheckUDBInstanceAllowanceParam param,
                                   UcloudHandler<CheckUDBInstanceAllowanceResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 检测ucloudbackup账号连通性
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUDBInstanceConnectionResult checkUDBInstanceConnection(CheckUDBInstanceConnectionParam param)
            throws Exception;

    /**
     * 检测ucloudbackup账号连通性
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag
     */
    void checkUDBInstanceConnection(CheckUDBInstanceConnectionParam param,
                                    UcloudHandler<CheckUDBInstanceConnectionResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 核查db是否可以升级为高可用
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckUDBInstanceToHAAllowanceResult checkUDBInstanceToHAAllowance(CheckUDBInstanceToHAAllowanceParam param)
            throws Exception;

    /**
     * 核查db是否可以升级为高可用
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkUDBInstanceToHAAllowance(CheckUDBInstanceToHAAllowanceParam param,
                                       UcloudHandler<CheckUDBInstanceToHAAllowanceResult> handler,
                                       Boolean... asyncFlag);

    /**
     * 清除UDB实例的log
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ClearUDBLogResult clearUDBLog(ClearUDBLogParam param) throws Exception;

    /**
     * 清除UDB实例的log
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void clearUDBLog(ClearUDBLogParam param, UcloudHandler<ClearUDBLogResult> handler, Boolean... asyncFlag);


    /**
     * 创建DB副本集
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateMongoDBReplicaSetResult createMongoDBReplicaSet(CreateMongoDBReplicaSetParam param) throws Exception;

    /**
     * 创建DB副本集
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createMongoDBReplicaSet(CreateMongoDBReplicaSetParam param,
                                 UcloudHandler<CreateMongoDBReplicaSetResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 创建数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBInstanceResult createUDBInstance(CreateUDBInstanceParam param) throws Exception;

    /**
     * 创建数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBInstance(CreateUDBInstanceParam param, UcloudHandler<CreateUDBInstanceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 将新创建的db恢复到指定db某个指定时间点
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBInstanceByRecoveryResult createUDBInstanceByRecovery(CreateUDBInstanceByRecoveryParam param)
            throws Exception;

    /**
     * 将新创建的db恢复到指定db某个指定时间点
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBInstanceByRecovery(CreateUDBInstanceByRecoveryParam param,
                                     UcloudHandler<CreateUDBInstanceByRecoveryResult> handler,
                                     Boolean... asyncFlag);


    /**
     * 从已有配置文件创建新配置文件
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBParamGroupResult createUDBParamGroup(CreateUDBParamGroupParam param) throws Exception;


    /**
     * 从已有配置文件创建新配置文件
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBParamGroup(CreateUDBParamGroupParam param, UcloudHandler<CreateUDBParamGroupResult> handler,
                             Boolean... asyncFlag);

    /**
     * 创建MongoDB的副本节点
     *
     * @param param 对象参数
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBReplicationInstanceResult createUDBReplicationInstance(CreateUDBReplicationInstanceParam param)
            throws Exception;

    /**
     * 创建MongoDB的副本节点
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBReplicationInstance(CreateUDBReplicationInstanceParam param,
                                      UcloudHandler<CreateUDBReplicationInstanceResult> handler,
                                      Boolean... asyncFlag);

    /**
     * 创建mongos实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBRouteInstanceResult createUDBRouteInstance(CreateUDBRouteInstanceParam param) throws Exception;


    /**
     * 创建mongos实例
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBRouteInstance(CreateUDBRouteInstanceParam param,
                                UcloudHandler<CreateUDBRouteInstanceResult> handler,
                                Boolean... asyncFlag);

    /**
     * 创建UDB实例的slave
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBSlaveResult createUDBSlave(CreateUDBSlaveParam param) throws Exception;


    /**
     * 创建UDB实例的slave
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBSlave(CreateUDBSlaveParam param, UcloudHandler<CreateUDBSlaveResult> handler,
                        Boolean... asyncFlag);


    /**
     * 删除UDB实例备份
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUDBBackupResult deleteUDBBackup(DeleteUDBBackupParam param) throws Exception;

    /**
     * 删除UDB实例备份
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBBackup(DeleteUDBBackupParam param, UcloudHandler<DeleteUDBBackupResult> handler,
                         Boolean... asyncFlag);

    /**
     * 删除云数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUDBInstanceResult deleteUDBInstance(DeleteUDBInstanceParam param) throws Exception;

    /**
     * 删除云数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBInstance(DeleteUDBInstanceParam param, UcloudHandler<DeleteUDBInstanceResult> handler,
                           Boolean asyncFlag);


    /**
     * 删除UDB日志包
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUDBLogPackageResult deleteUDBLogPackage(DeleteUDBLogPackageParam param) throws Exception;


    /**
     * 删除UDB日志包
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBLogPackage(DeleteUDBLogPackageParam param,
                             UcloudHandler<DeleteUDBLogPackageResult> handler,
                             Boolean... asyncFlag);

    /**
     * 删除配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUDBParamGroupResult deleteUDBParamGroup(DeleteUDBParamGroupParam param) throws Exception;

    /**
     * 删除配置
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBParamGroup(DeleteUDBParamGroupParam param,
                             UcloudHandler<DeleteUDBParamGroupResult> handler,
                             Boolean... asyncFlag);


    /**
     * 获取单点升级高可用实例的差价
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribePromoteToHAPriceResult describePromoteToHAPrice(DescribePromoteToHAPriceParam param) throws Exception;

    /**
     * 获取单点升级高可用实例的差价
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describePromoteToHAPrice(DescribePromoteToHAPriceParam param,
                                  UcloudHandler<DescribePromoteToHAPriceResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 获取备份列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBBackupResult describeUDBBackup(DescribeUDBBackupParam param) throws Exception;

    /**
     * 获取备份列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBBackup(DescribeUDBBackupParam param, UcloudHandler<DescribeUDBBackupResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取UDB实例的备份黑名单
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBBackupBlacklistResult describeUDBBackupBlacklist(DescribeUDBBackupBlacklistParam param) throws Exception;

    /**
     * 获取UDB实例的备份黑名单
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBBackupBlacklist(DescribeUDBBackupBlacklistParam param,
                                    UcloudHandler<DescribeUDBBackupBlacklistResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 获取UDB的Binlog备份地址
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBBinlogBackupURLResult describeUDBBinlogBackupURL(DescribeUDBBinlogBackupURLParam param) throws Exception;

    /**
     * 获取UDB的Binlog备份地址
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBBinlogBackupURL(DescribeUDBBinlogBackupURLParam param,
                                    UcloudHandler<DescribeUDBBinlogBackupURLResult> handler,
                                    Boolean... asyncFlag);

    /**
     * 获取云数据库信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceResult describeUDBInstance(DescribeUDBInstanceParam param) throws Exception;

    /**
     * 获取云数据库信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstance(DescribeUDBInstanceParam param, UcloudHandler<DescribeUDBInstanceResult> handler,
                             Boolean... asyncFlag);

    /**
     * 获取UDB实例备份状态
     *
     * @param param
     * @return
     * @throws Exception
     */
    DescribeUDBInstanceBackupStateResult describeUDBInstanceBackupState(DescribeUDBInstanceBackupStateParam param)
            throws Exception;

    /**
     * 获取UDB实例备份状态
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceBackupState(DescribeUDBInstanceBackupStateParam param,
                                        UcloudHandler<DescribeUDBInstanceBackupStateResult> handler,
                                        Boolean... asyncFlag);

    /**
     * 获取UDB备份下载地址
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceBackupURLResult describeUDBInstanceBackupURL(DescribeUDBInstanceBackupURLParam param)
            throws Exception;

    /**
     * 获取UDB备份下载地址
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceBackupURL(DescribeUDBInstanceBackupURLParam param,
                                      UcloudHandler<DescribeUDBInstanceBackupURLResult> handler,
                                      Boolean... asyncFlag);

    /**
     * 获取UDBBinlog列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceBinlogResult describeUDBInstanceBinlog(DescribeUDBInstanceBinlogParam param) throws Exception;

    /**
     * 获取UDBBinlog列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceBinlog(DescribeUDBInstanceBinlogParam param,
                                   UcloudHandler<DescribeUDBInstanceBinlogResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 获取udb实例备份状态
     *
     * @param param 参数对象
     * @return
     * @throws Exception
     */
    DescribeUDBInstanceBinlogBackupStateResult describeUDBInstanceBinlogBackupState(
            DescribeUDBInstanceBinlogBackupStateParam param) throws Exception;

    /**
     * 获取udb实例备份状态
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceBinlogBackupState(DescribeUDBInstanceBinlogBackupStateParam param,
                                              UcloudHandler<DescribeUDBInstanceBinlogBackupStateResult> handler,
                                              Boolean... asyncFlag);

    /**
     * 根据备份获取UDB实例信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceByBackupResult describeUDBInstanceByBackup(DescribeUDBInstanceByBackupParam param)
            throws Exception;

    /**
     * 根据备份获取UDB实例信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceByBackup(DescribeUDBInstanceByBackupParam param,
                                              UcloudHandler<DescribeUDBInstanceByBackupResult> handler,
                                              Boolean... asyncFlag);

    /**
     * 根据配置文件获取UDB实例信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceByParamGroupResult describeUDBInstanceByParamGroup(DescribeUDBInstanceByParamGroupParam param)
            throws Exception;

    /**
     * 根据配置文件获取UDB实例信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceByParamGroup(DescribeUDBInstanceByParamGroupParam param,
                                         UcloudHandler<DescribeUDBInstanceByParamGroupResult> handler,
                                         Boolean... asyncFlag);

    /**
     * 获取UDB错误日志或慢查询日志
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceLogResult describeUDBInstanceLog(DescribeUDBInstanceLogParam param) throws Exception;

    /**
     * 获取UDB错误日志或慢查询日志
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceLog(DescribeUDBInstanceLogParam param,
                                     UcloudHandler<DescribeUDBInstanceLogResult> handler,
                                     Boolean... asyncFlag);

    /**
     * 获取UDB实例的PhpMyAdmin地址
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstancePhpMyAdminURLResult describeUDBInstancePhpMyAdminURL(DescribeUDBInstancePhpMyAdminURLParam param)
            throws Exception;

    /**
     * 获取UDB实例的PhpMyAdmin地址
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstancePhpMyAdminURL(DescribeUDBInstancePhpMyAdminURLParam param,
                                          UcloudHandler<DescribeUDBInstancePhpMyAdminURLResult> handler,
                                          Boolean... asyncFlag);


    /**
     * 获取云数据库价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstancePriceResult describeUDBInstancePrice(DescribeUDBInstancePriceParam param)
            throws Exception;

    /**
     * 获取云数据库价格
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstancePrice(DescribeUDBInstancePriceParam param,
                                  UcloudHandler<DescribeUDBInstancePriceResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 获取UDB实例状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceStateResult describeUDBInstanceState(DescribeUDBInstanceStateParam param)
            throws Exception;

    /**
     * 获取UDB实例状态
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceState(DescribeUDBInstanceStateParam param,
                                  UcloudHandler<DescribeUDBInstanceStateResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 获取UDB实例升降级价格信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBInstanceUpgradePriceResult describeUDBInstanceUpgradePrice(DescribeUDBInstanceUpgradePriceParam param)
            throws Exception;

    /**
     * 获取UDB实例升降级价格信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBInstanceUpgradePrice(DescribeUDBInstanceUpgradePriceParam param,
                                         UcloudHandler<DescribeUDBInstanceUpgradePriceResult> handler,
                                         Boolean... asyncFlag);

    /**
     * 获取UDB的slowlog备份地址
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBLogBackupURLResult describeUDBLogBackupURL(DescribeUDBLogBackupURLParam param)
            throws Exception;

    /**
     * 获取UDB的slowlog备份地址
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBLogBackupURL(DescribeUDBLogBackupURLParam param,
                                 UcloudHandler<DescribeUDBLogBackupURLResult> handler,
                                 Boolean... asyncFlag);

    /**
     * UDB实例日志备份信息列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBLogPackageResult describeUDBLogPackage(DescribeUDBLogPackageParam param)
            throws Exception;

    /**
     * UDB实例日志备份信息列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBLogPackage(DescribeUDBLogPackageParam param,
                               UcloudHandler<DescribeUDBLogPackageResult> handler,
                               Boolean... asyncFlag);

    /**
     * 获取参数信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBParamGroupResult describeUDBParamGroup(DescribeUDBParamGroupParam param)
            throws Exception;

    /**
     * 获取参数信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBParamGroup(DescribeUDBParamGroupParam param,
                               UcloudHandler<DescribeUDBParamGroupResult> handler,
                               Boolean... asyncFlag);


    /**
     * 获取指定ClassType的udb实例从库信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBSlaveOrSecondaryInstanceResult describeUDBSlaveOrSecondaryInstance(
            DescribeUDBSlaveOrSecondaryInstanceParam param) throws Exception;

    /**
     * 获取指定ClassType的udb实例从库信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBSlaveOrSecondaryInstance(DescribeUDBSlaveOrSecondaryInstanceParam param,
                                             UcloudHandler<DescribeUDBSlaveOrSecondaryInstanceResult> handler,
                                             Boolean... asyncFlag);


    /**
     * 描述读写分离功能
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBSplittingInfoResult describeUDBSplittingInfo(
            DescribeUDBSplittingInfoParam param) throws Exception;

    /**
     * 描述读写分离功能
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBSplittingInfo(DescribeUDBSplittingInfoParam param,
                                  UcloudHandler<DescribeUDBSplittingInfoResult> handler,
                                  Boolean... asyncFlag);


    /**
     * 获取UDB支持的类型信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUDBTypeResult describeUDBType(DescribeUDBTypeParam param) throws Exception;

    /**
     * 获取UDB支持的类型信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUDBType(DescribeUDBTypeParam param, UcloudHandler<DescribeUDBTypeResult> handler,
                         Boolean... asyncFlag);


    /**
     * DB实例ID（master)
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DisableUDBRWSplittingResult disableUDBRWSplitting(DisableUDBRWSplittingParam param) throws Exception;

    /**
     * DB实例ID（master)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void disableUDBRWSplitting(DisableUDBRWSplittingParam param, UcloudHandler<DisableUDBRWSplittingResult> handler,
                               Boolean... asyncFlag);


    /**
     * 编辑备份黑名单
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    EditUDBBackupBlacklistResult editUDBBackupBlacklist(EditUDBBackupBlacklistParam param) throws Exception;

    /**
     * 编辑备份黑名单
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void editUDBBackupBlacklist(EditUDBBackupBlacklistParam param, UcloudHandler<EditUDBBackupBlacklistResult> handler,
                                Boolean... asyncFlag);


    /**
     * 开启DB的读写分离功能
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    EnableUDBRWSplittingResult enableUDBRWSplitting(EnableUDBRWSplittingParam param) throws Exception;

    /**
     * 开启DB的读写分离功能
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void enableUDBRWSplitting(EnableUDBRWSplittingParam param, UcloudHandler<EnableUDBRWSplittingResult> handler,
                              Boolean... asyncFlag);


    /**
     * 获取配置文件内容
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ExtractUDBParamGroupResult extractUDBParamGroup(ExtractUDBParamGroupParam param) throws Exception;

    /**
     * 获取配置文件内容
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void extractUDBParamGroup(ExtractUDBParamGroupParam param, UcloudHandler<ExtractUDBParamGroupResult> handler,
                              Boolean... asyncFlag);

    /**
     * 获取UDB最早可回档的时间点
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    FetchUDBInstanceEarliestRecoverTimeResult fetchUDBInstanceEarliestRecoverTime(
            FetchUDBInstanceEarliestRecoverTimeParam param) throws Exception;

    /**
     * 获取UDB最早可回档的时间点
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void fetchUDBInstanceEarliestRecoverTime(FetchUDBInstanceEarliestRecoverTimeParam param,
                                             UcloudHandler<FetchUDBInstanceEarliestRecoverTimeResult> handler,
                                             Boolean... asyncFlag);


    /**
     * 删除资源时的回退差价
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUDBSuspendPriceResult getUDBSuspendPrice(GetUDBSuspendPriceParam param) throws Exception;

    /**
     * 删除资源时的回退差价
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUDBSuspendPrice(GetUDBSuspendPriceParam param,
                            UcloudHandler<GetUDBSuspendPriceResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取某DB类型的所有监控项
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListMonitorItemsResult listMonitorItems(ListMonitorItemsParam param) throws Exception;

    /**
     * 获取某DB类型的所有监控项
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listMonitorItems(ListMonitorItemsParam param, UcloudHandler<ListMonitorItemsResult> handler,
                          Boolean... asyncFlag);


    /**
     * 列出UDB配置节点信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListUDBConfigSvrResult listUDBConfigSvr(ListUDBConfigSvrParam param) throws Exception;

    /**
     * 列出UDB配置节点信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listUDBConfigSvr(ListUDBConfigSvrParam param, UcloudHandler<ListUDBConfigSvrResult> handler,
                          Boolean... asyncFlag);


    /**
     * 修改云数据库名称
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUDBInstanceNameResult modifyUDBInstanceName(ModifyUDBInstanceNameParam param) throws Exception;

    /**
     * 修改云数据库名称
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUDBInstanceName(ModifyUDBInstanceNameParam param, UcloudHandler<ModifyUDBInstanceNameResult> handler,
                               Boolean... asyncFlag);

    /**
     * 修改DB实例的管理员密码
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUDBInstancePasswordResult modifyUDBInstancePassword(ModifyUDBInstancePasswordParam param) throws Exception;

    /**
     * 修改DB实例的管理员密码
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUDBInstancePassword(ModifyUDBInstancePasswordParam param,
                                   UcloudHandler<ModifyUDBInstancePasswordResult> handler, Boolean... asyncFlag);

    /**
     * 普通db升级为高可用
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    PromoteUDBInstanceToHAResult promoteUDBInstanceToHA(PromoteUDBInstanceToHAParam param) throws Exception;

    /**
     * 普通db升级为高可用
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void promoteUDBInstanceToHA(PromoteUDBInstanceToHAParam param,
                                UcloudHandler<PromoteUDBInstanceToHAResult> handler, Boolean... asyncFlag);


    /**
     * 从库提升为独立库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    PromoteUDBSlaveResult promoteUDBSlave(PromoteUDBSlaveParam param) throws Exception;

    /**
     * 从库提升为独立库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void promoteUDBSlave(PromoteUDBSlaveParam param,
                         UcloudHandler<PromoteUDBSlaveResult> handler, Boolean... asyncFlag);

    /**
     * 将db恢复到某个指定时间点
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RecoverUDBInstanceResult recoverUDBInstance(RecoverUDBInstanceParam param) throws Exception;

    /**
     * 将db恢复到某个指定时间点
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void recoverUDBInstance(RecoverUDBInstanceParam param,
                            UcloudHandler<RecoverUDBInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 修改UDB实例的配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ResizeUDBInstanceResult resizeUDBInstance(ResizeUDBInstanceParam param) throws Exception;

    /**
     * 修改UDB实例的配置
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void resizeUDBInstance(ResizeUDBInstanceParam param,
                           UcloudHandler<ResizeUDBInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 读写分离中间件重启
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RestartRWSplittingResult restartRWSplitting(RestartRWSplittingParam param) throws Exception;

    /**
     * 读写分离中间件重启
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void restartRWSplitting(RestartRWSplittingParam param,
                            UcloudHandler<RestartRWSplittingResult> handler, Boolean... asyncFlag);

    /**
     * 重启云数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RestartUDBInstanceResult restartUDBInstance(RestartUDBInstanceParam param) throws Exception;

    /**
     * 重启云数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void restartUDBInstance(RestartUDBInstanceParam param,
                            UcloudHandler<RestartUDBInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 撤销帐号权限
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RevokeAccountPrivilegesResult revokeAccountPrivileges(RevokeAccountPrivilegesParam param) throws Exception;

    /**
     * 撤销帐号权限
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void revokeAccountPrivileges(RevokeAccountPrivilegesParam param,
                                 UcloudHandler<RevokeAccountPrivilegesResult> handler, Boolean... asyncFlag);

    /**
     * 设置读写分离
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    SetUDBRWSplittingResult setUDBRWSplitting(SetUDBRWSplittingParam param) throws Exception;

    /**
     * 设置读写分离
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void setUDBRWSplitting(SetUDBRWSplittingParam param,
                           UcloudHandler<SetUDBRWSplittingResult> handler, Boolean... asyncFlag);

    /**
     * 启动云数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    StartUDBInstanceResult startUDBInstance(StartUDBInstanceParam param) throws Exception;

    /**
     * 启动云数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void startUDBInstance(StartUDBInstanceParam param,
                          UcloudHandler<StartUDBInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 关闭云数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    StopUDBInstanceResult stopUDBInstance(StopUDBInstanceParam param) throws Exception;

    /**
     * 关闭云数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void stopUDBInstance(StopUDBInstanceParam param,
                         UcloudHandler<StopUDBInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 普通UDB切换为高可用
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    SwitchUDBInstanceToHAResult switchUDBInstanceToHA(SwitchUDBInstanceToHAParam param) throws Exception;

    /**
     * 普通UDB切换为高可用
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void switchUDBInstanceToHA(SwitchUDBInstanceToHAParam param,
                               UcloudHandler<SwitchUDBInstanceToHAResult> handler, Boolean... asyncFlag);

    /**
     * 修改UDB自动备份策略
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdateUDBInstanceBackupStrategyResult updateUDBInstanceBackupStrategy(
            UpdateUDBInstanceBackupStrategyParam param) throws Exception;

    /**
     * 修改UDB自动备份策略
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updateUDBInstanceBackupStrategy(UpdateUDBInstanceBackupStrategyParam param,
                                         UcloudHandler<UpdateUDBInstanceBackupStrategyResult> handler,
                                         Boolean... asyncFlag);

    /**
     * 开启或者关闭UDB从库备份
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdateUDBInstanceSlaveBackupSwitchResult updateUDBInstanceSlaveBackupSwitch(
            UpdateUDBInstanceSlaveBackupSwitchParam param) throws Exception;

    /**
     * 开启或者关闭UDB从库备份
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updateUDBInstanceSlaveBackupSwitch(UpdateUDBInstanceSlaveBackupSwitchParam param,
                                            UcloudHandler<UpdateUDBInstanceSlaveBackupSwitchResult> handler,
                                            Boolean... asyncFlag);

    /**
     * 更新配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdateUDBParamGroupResult updateUDBParamGroup(
            UpdateUDBParamGroupParam param) throws Exception;

    /**
     * 更新配置
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updateUDBParamGroup(UpdateUDBParamGroupParam param,
                             UcloudHandler<UpdateUDBParamGroupResult> handler,
                             Boolean... asyncFlag);

    /**
     * 导入配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UploadUDBParamGroupResult uploadUDBParamGroup(UploadUDBParamGroupParam param) throws Exception;

    /**
     * 导入配置
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void uploadUDBParamGroup(UploadUDBParamGroupParam param,
                             UcloudHandler<UploadUDBParamGroupResult> handler,
                             Boolean... asyncFlag);


}
