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
    void backupUDBInstance(BaseRequestParam param, UcloudHandler<BackupUDBInstanceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 备份UDB指定时间段的binlog列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BackupUDBInstanceBinlogParam backupUDBInstanceBinlog(BackupUDBInstanceBinlogParam param) throws Exception;

    /**
     * 备份UDB指定时间段的binlog列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstance(BackupUDBInstanceBinlogParam param, UcloudHandler<BackupUDBInstanceBinlogResult> handler,
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
    void backupUDBInstanceErrorLog(BackupUDBInstanceErrorLogParam param, UcloudHandler<BackupUDBInstanceErrorLogResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 备份UDB指定时间段的slowlog分析结果
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BackupUDBInstanceSlowLogParam backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param) throws Exception;

    /**
     * 备份UDB指定时间段的slowlog分析结果
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param, UcloudHandler<BackupUDBInstanceBinlogResult> handler,
                                  Boolean... asyncFlag);

    /**
     * 取消数据传输任务
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CancelDBTransferTaskResult cancelDBTransferTask(CancelDBTransferTaskParam param) throws Exception;

    /**
     * 取消数据传输任务
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void cancelDBTransferTask(CancelDBTransferTaskParam param, UcloudHandler<CancelDBTransferTaskResult> handler,
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
    void checkRecoverUDBInstance(CheckRecoverUDBInstanceParam param, UcloudHandler<CheckRecoverUDBInstanceResult> handler,
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
                                   UcloudHandler<CheckRecoverUDBInstanceResult> handler,
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
    CheckUDBInstanceToHAAllowanceResult checkUDBInstanceToAllowance(CheckUDBInstanceToHAAllowanceParam param)
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
     * 结束数据迁移任务
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CompleteDBTransferTaskResult completeDBTransferTask(CompleteDBTransferTaskParam param) throws Exception;

    /**
     * 结束数据迁移任务
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void completeDBTransferTask(CompleteDBTransferTaskParam param, UcloudHandler<CompleteDBTransferTaskResult> handler,
                                Boolean... asyncFlag);

    /**
     * 创建数据迁移任务
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateDBTransferTaskResult createDBTransferTask(CreateDBTransferTaskParam param) throws Exception;

    /**
     * 创建数据迁移任务
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createDBTransferTask(CreateDBTransferTaskParam param, UcloudHandler<CreateDBTransferTaskResult> handler,
                              Boolean... asyncFlag);

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
    void createMongoDBReplicaSet(CreateMongoDBReplicaSetParam param, UcloudHandler<CreateMongoDBReplicaSetResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 创建sqlserver帐号
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateSqlserverAccountResult createSqlserverAccount(CreateSqlserverAccountParam param) throws Exception;

    /**
     * 创建sqlserver帐号
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createSqlserverAccount(CreateSqlserverAccountParam param, UcloudHandler<CreateSqlserverAccountResult> handler,
                                Boolean... asyncFlag);

    /**
     * 创建sqlserver高可用镜像数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateSqlserverDatabaseParam createSqlserverDatabase(CreateSqlserverDatabaseParam param) throws Exception;

    /**
     * 创建sqlserver高可用镜像数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createSqlserverDatabase(CreateSqlserverDatabaseParam param, UcloudHandler<CreateSqlserverDatabaseResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 创建数据库专区
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBCInstanceResult createUDBCInstance(CreateUDBCInstanceParam param) throws Exception;


    /**
     * 创建数据库专区
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUDBCInstance(CreateUDBCInstanceParam param, UcloudHandler<CreateUDBCInstanceResult> handler,
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
     * @param paramGroupParam 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUDBParamGroupResult createUDBParamGroup(CreateUDBParamGroupParam paramGroupParam) throws Exception;


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
    CreateUDBSlaveParam createUDBSlave(CreateUDBSlaveParam param) throws Exception;


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
     * 删除数据迁移任务
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteDBTransferTaskResult deleteDBTransferTask(DeleteDBTransferTaskParam param) throws Exception;


    /**
     * 删除数据迁移任务
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteDBTransferTask(DeleteDBTransferTaskParam param,
                              UcloudHandler<DeleteDBTransferTaskResult> handler,
                              Boolean... asyncFlag);

    /**
     * 删除sqlserver帐号
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteSqlserverAccountResult deleteSqlserverAccount(DeleteSqlserverAccountParam param) throws Exception;

    /**
     * 删除sqlserver帐号
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteSqlserverAccount(DeleteSqlserverAccountParam param,
                                UcloudHandler<DeleteSqlserverAccountResult> handler,
                                Boolean... asyncFlag);


    /**
     * 删除sqlserver高可用镜像数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteSqlserverDatabaseResult deleteSqlserverDatabase(DeleteSqlserverDatabaseParam param)
            throws Exception;

    /**
     * 删除sqlserver高可用镜像数据库
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteSqlserverDatabase(DeleteSqlserverDatabaseParam param,
                                 UcloudHandler<DeleteSqlserverDatabaseResult> handler,
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
     * 删除数据库专区
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUDBCInstanceResult deleteUDBCInstance(DeleteUDBCInstanceParam param) throws Exception;


    /**
     * 删除数据库专区
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBCInstance(DeleteUDBCInstanceParam param, UcloudHandler<DeleteUDBCInstanceResult> handler,
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
    DeleteUDBParamGroupReuslt deleteUDBParamGroup(DeleteUDBParamGroupParam param) throws Exception;

    /**
     * 删除配置
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUDBParamGroup(DeleteUDBParamGroupParam param,
                             UcloudHandler<DeleteUDBParamGroupReuslt> handler,
                             Boolean... asyncFlag);

    /**
     * 获取迁移任务信息
     *
     * @param param 参数对象
     * @return 回调接口
     * @throws Exception
     */
    DescribeDBTransferTaskResult describeDBTransferTask(DescribeDBTransferTaskParam param) throws Exception;

    /**
     * 获取迁移任务信息
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeDBTransferTask(DescribeDBTransferTaskParam param,
                                UcloudHandler<DescribeDBTransferTaskResult> handler,
                                Boolean... asyncFlag);

    /**
     * 获取单点升级高可用实例的差价
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribePromoteToHAPriceResult describePromoteToHAPrcie(DescribePromoteToHAPriceParam param) throws Exception;

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
     * 拉取sqlserver帐号
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeSqlserverAccountsResult describeSqlserverAccounts(DescribeSqlserverAccountsParam param) throws Exception;

    /**
     * 拉取sqlserver帐号
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeSqlserverAccounts(DescribeSqlserverAccountsParam param,
                                   UcloudHandler<DescribeSqlserverAccountsResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 拉取sqlserver实例下数据库列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeSqlserverDatabasesResult describeSqlserverDatabase(DescribeSqlserverDatabasesParam param) throws Exception;

    /**
     * 拉取sqlserver实例下数据库列表
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeSqlserverDatabase(DescribeSqlserverDatabasesParam param,
                                   UcloudHandler<DescribeSqlserverDatabasesResult> handler,
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
}
