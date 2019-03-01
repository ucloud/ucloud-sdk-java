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
}
