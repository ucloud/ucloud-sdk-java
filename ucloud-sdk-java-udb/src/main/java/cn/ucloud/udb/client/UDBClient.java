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

}
