package cn.ucloud.udb.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.udb.model.*;
import cn.ucloud.udb.pojo.UDBConfig;

/**
 * @Description : 默认UDBClient实现
 * @Author : codezhang
 * @Date : 2019-03-01 10:50
 **/
public class DefaultUDBClient extends DefaultUcloudClient implements UDBClient {

    public DefaultUDBClient(UDBConfig config) {
        super(config);
    }

    @Override
    public BackupUDBInstanceResult backupUDBInstance(BackupUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceResult.class);
        return (BackupUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void backupUDBInstance(BackupUDBInstanceParam param,
                                  UcloudHandler<BackupUDBInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BackupUDBInstanceBinlogResult backupUDBInstanceBinlog(BackupUDBInstanceBinlogParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceBinlogResult.class);
        return (BackupUDBInstanceBinlogResult) http.doGet(param, config, null);
    }

    @Override
    public void backupUDBInstanceBinlog(BackupUDBInstanceBinlogParam param,
                                  UcloudHandler<BackupUDBInstanceBinlogResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceBinlogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BackupUDBInstanceErrorLogResult backupUDBInstanceErrorLog(BackupUDBInstanceErrorLogParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceErrorLogResult.class);
        return (BackupUDBInstanceErrorLogResult) http.doGet(param, config, null);
    }

    @Override
    public void backupUDBInstanceErrorLog(BackupUDBInstanceErrorLogParam param,
                                          UcloudHandler<BackupUDBInstanceErrorLogResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceErrorLogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BackupUDBInstanceSlowLogResult backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceSlowLogResult.class);
        return (BackupUDBInstanceSlowLogResult) http.doGet(param, config, null);
    }

    @Override
    public void backupUDBInstanceSlowLog(BackupUDBInstanceSlowLogParam param,
                                         UcloudHandler<BackupUDBInstanceSlowLogResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BackupUDBInstanceSlowLogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CancelDBTransferTaskResult cancelDBTransferTask(CancelDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CancelDBTransferTaskResult.class);
        return (CancelDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void cancelDBTransferTask(CancelDBTransferTaskParam param,
                                     UcloudHandler<CancelDBTransferTaskResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CancelDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ChangeUDBParamGroupResult changeUDBParamGroup(ChangeUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ChangeUDBParamGroupResult.class);
        return (ChangeUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void changeUDBParamGroup(ChangeUDBParamGroupParam param,
                                    UcloudHandler<ChangeUDBParamGroupResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ChangeUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckRecoverUDBInstanceResult checkRecoverUDBInstance(CheckRecoverUDBInstanceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckRecoverUDBInstanceResult.class);
        return (CheckRecoverUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkRecoverUDBInstance(CheckRecoverUDBInstanceParam param,
                                        UcloudHandler<CheckRecoverUDBInstanceResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckRecoverUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUDBEngineResult checkUDBEngine(CheckUDBEngineParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBEngineResult.class);
        return (CheckUDBEngineResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUDBEngine(CheckUDBEngineParam param, UcloudHandler<CheckUDBEngineResult> handler,
                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBEngineResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUDBInstanceAllowanceResult checkUDBInstanceAllowance(CheckUDBInstanceAllowanceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceAllowanceResult.class);
        return (CheckUDBInstanceAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUDBInstanceAllowance(CheckUDBInstanceAllowanceParam param,
                                          UcloudHandler<CheckUDBInstanceAllowanceResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUDBInstanceConnectionResult checkUDBInstanceConnection(CheckUDBInstanceConnectionParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceConnectionResult.class);
        return (CheckUDBInstanceConnectionResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUDBInstanceConnection(CheckUDBInstanceConnectionParam param,
                                           UcloudHandler<CheckUDBInstanceConnectionResult> handler,
                                           Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceConnectionResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CheckUDBInstanceToHAAllowanceResult checkUDBInstanceToHAAllowance(CheckUDBInstanceToHAAllowanceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceToHAAllowanceResult.class);
        return (CheckUDBInstanceToHAAllowanceResult) http.doGet(param, config, null);
    }

    @Override
    public void checkUDBInstanceToHAAllowance(CheckUDBInstanceToHAAllowanceParam param,
                                              UcloudHandler<CheckUDBInstanceToHAAllowanceResult> handler,
                                              Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CheckUDBInstanceToHAAllowanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ClearUDBLogResult clearUDBLog(ClearUDBLogParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ClearUDBLogResult.class);
        return (ClearUDBLogResult) http.doGet(param, config, null);
    }

    @Override
    public void clearUDBLog(ClearUDBLogParam param, UcloudHandler<ClearUDBLogResult> handler,
                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ClearUDBLogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CompleteDBTransferTaskResult completeDBTransferTask(CompleteDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CompleteDBTransferTaskResult.class);
        return (CompleteDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void completeDBTransferTask(CompleteDBTransferTaskParam param,
                                       UcloudHandler<CompleteDBTransferTaskResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CompleteDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateDBTransferTaskResult createDBTransferTask(CreateDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateDBTransferTaskResult.class);
        return (CreateDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void createDBTransferTask(CreateDBTransferTaskParam param,
                                     UcloudHandler<CreateDBTransferTaskResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateMongoDBReplicaSetResult createMongoDBReplicaSet(CreateMongoDBReplicaSetParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateMongoDBReplicaSetResult.class);
        return (CreateMongoDBReplicaSetResult) http.doGet(param, config, null);
    }

    @Override
    public void createMongoDBReplicaSet(CreateMongoDBReplicaSetParam param,
                                        UcloudHandler<CreateMongoDBReplicaSetResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateMongoDBReplicaSetResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSqlserverAccountResult createSqlserverAccount(CreateSqlserverAccountParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSqlserverAccountResult.class);
        return (CreateSqlserverAccountResult) http.doGet(param, config, null);
    }

    @Override
    public void createSqlserverAccount(CreateSqlserverAccountParam param,
                                       UcloudHandler<CreateSqlserverAccountResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSqlserverAccountResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSqlserverDatabaseResult createSqlserverDatabase(CreateSqlserverDatabaseParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSqlserverDatabaseResult.class);
        return (CreateSqlserverDatabaseResult) http.doGet(param, config, null);
    }

    @Override
    public void createSqlserverDatabase(CreateSqlserverDatabaseParam param,
                                        UcloudHandler<CreateSqlserverDatabaseResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSqlserverDatabaseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public CreateUDBInstanceResult createUDBInstance(CreateUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBInstanceResult.class);
        return (CreateUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBInstance(CreateUDBInstanceParam param,
                                  UcloudHandler<CreateUDBInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDBInstanceByRecoveryResult createUDBInstanceByRecovery(
            CreateUDBInstanceByRecoveryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBInstanceByRecoveryResult.class);
        return (CreateUDBInstanceByRecoveryResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBInstanceByRecovery(CreateUDBInstanceByRecoveryParam param,
                                            UcloudHandler<CreateUDBInstanceByRecoveryResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBInstanceByRecoveryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDBParamGroupResult createUDBParamGroup(CreateUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBParamGroupResult.class);
        return (CreateUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBParamGroup(CreateUDBParamGroupParam param,
                                    UcloudHandler<CreateUDBParamGroupResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDBReplicationInstanceResult createUDBReplicationInstance(
            CreateUDBReplicationInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBReplicationInstanceResult.class);
        return (CreateUDBReplicationInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBReplicationInstance(CreateUDBReplicationInstanceParam param,
                                             UcloudHandler<CreateUDBReplicationInstanceResult> handler,
                                             Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBReplicationInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDBRouteInstanceResult createUDBRouteInstance(CreateUDBRouteInstanceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBRouteInstanceResult.class);
        return (CreateUDBRouteInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBRouteInstance(CreateUDBRouteInstanceParam param,
                                       UcloudHandler<CreateUDBRouteInstanceResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBRouteInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDBSlaveResult createUDBSlave(CreateUDBSlaveParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBSlaveResult.class);
        return (CreateUDBSlaveResult) http.doGet(param, config, null);
    }

    @Override
    public void createUDBSlave(CreateUDBSlaveParam param, UcloudHandler<CreateUDBSlaveResult> handler,
                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDBSlaveResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteDBTransferTaskResult deleteDBTransferTask(DeleteDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteDBTransferTaskResult.class);
        return (DeleteDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteDBTransferTask(DeleteDBTransferTaskParam param,
                                     UcloudHandler<DeleteDBTransferTaskResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteSqlserverAccountResult deleteSqlserverAccount(DeleteSqlserverAccountParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSqlserverAccountResult.class);
        return (DeleteSqlserverAccountResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteSqlserverAccount(DeleteSqlserverAccountParam param,
                                       UcloudHandler<DeleteSqlserverAccountResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSqlserverAccountResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteSqlserverDatabaseResult deleteSqlserverDatabase(DeleteSqlserverDatabaseParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSqlserverDatabaseResult.class);
        return (DeleteSqlserverDatabaseResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteSqlserverDatabase(DeleteSqlserverDatabaseParam param,
                                        UcloudHandler<DeleteSqlserverDatabaseResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSqlserverDatabaseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDBBackupResult deleteUDBBackup(DeleteUDBBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBBackupResult.class);
        return (DeleteUDBBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUDBBackup(DeleteUDBBackupParam param,
                                UcloudHandler<DeleteUDBBackupResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDBInstanceResult deleteUDBInstance(DeleteUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBInstanceResult.class);
        return (DeleteUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUDBInstance(DeleteUDBInstanceParam param,
                                  UcloudHandler<DeleteUDBInstanceResult> handler, Boolean asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDBLogPackageResult deleteUDBLogPackage(DeleteUDBLogPackageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBLogPackageResult.class);
        return (DeleteUDBLogPackageResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUDBLogPackage(DeleteUDBLogPackageParam param,
                                    UcloudHandler<DeleteUDBLogPackageResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBLogPackageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDBParamGroupResult deleteUDBParamGroup(DeleteUDBParamGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBParamGroupResult.class);
        return (DeleteUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUDBParamGroup(DeleteUDBParamGroupParam param,
                                    UcloudHandler<DeleteUDBParamGroupResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeDBTransferTaskResult describeDBTransferTask(DescribeDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeDBTransferTaskResult.class);
        return (DescribeDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void describeDBTransferTask(DescribeDBTransferTaskParam param,
                                       UcloudHandler<DescribeDBTransferTaskResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribePromoteToHAPriceResult describePromoteToHAPrice(DescribePromoteToHAPriceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribePromoteToHAPriceResult.class);
        return (DescribePromoteToHAPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describePromoteToHAPrice(DescribePromoteToHAPriceParam param,
                                         UcloudHandler<DescribePromoteToHAPriceResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribePromoteToHAPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSqlserverAccountsResult describeSqlserverAccounts(DescribeSqlserverAccountsParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSqlserverAccountsResult.class);
        return (DescribeSqlserverAccountsResult) http.doGet(param, config, null);
    }

    @Override
    public void describeSqlserverAccounts(DescribeSqlserverAccountsParam param,
                                          UcloudHandler<DescribeSqlserverAccountsResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSqlserverAccountsResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSqlserverDatabasesResult describeSqlserverDatabase(DescribeSqlserverDatabasesParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSqlserverDatabasesResult.class);
        return (DescribeSqlserverDatabasesResult) http.doGet(param, config, null);
    }

    @Override
    public void describeSqlserverDatabase(DescribeSqlserverDatabasesParam param,
                                          UcloudHandler<DescribeSqlserverDatabasesResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSqlserverDatabasesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBBackupResult describeUDBBackup(DescribeUDBBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBackupResult.class);
        return (DescribeUDBBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBBackup(DescribeUDBBackupParam param,
                                  UcloudHandler<DescribeUDBBackupResult> handler,
                                  Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBBackupBlacklistResult describeUDBBackupBlacklist(DescribeUDBBackupBlacklistParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBackupBlacklistResult.class);
        return (DescribeUDBBackupBlacklistResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBBackupBlacklist(DescribeUDBBackupBlacklistParam param,
                                           UcloudHandler<DescribeUDBBackupBlacklistResult> handler,
                                           Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBackupBlacklistResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBBinlogBackupURLResult describeUDBBinlogBackupURL(DescribeUDBBinlogBackupURLParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBinlogBackupURLResult.class);
        return (DescribeUDBBinlogBackupURLResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBBinlogBackupURL(DescribeUDBBinlogBackupURLParam param,
                                           UcloudHandler<DescribeUDBBinlogBackupURLResult> handler,
                                           Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBBinlogBackupURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceResult describeUDBInstance(DescribeUDBInstanceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceResult.class);
        return (DescribeUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstance(DescribeUDBInstanceParam param,
                                    UcloudHandler<DescribeUDBInstanceResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceBackupStateResult describeUDBInstanceBackupState(
            DescribeUDBInstanceBackupStateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBackupStateResult.class);
        return (DescribeUDBInstanceBackupStateResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceBackupState(DescribeUDBInstanceBackupStateParam param,
                                               UcloudHandler<DescribeUDBInstanceBackupStateResult> handler,
                                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBackupStateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceBackupURLResult describeUDBInstanceBackupURL(
            DescribeUDBInstanceBackupURLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBackupURLResult.class);
        return (DescribeUDBInstanceBackupURLResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceBackupURL(DescribeUDBInstanceBackupURLParam param,
                                             UcloudHandler<DescribeUDBInstanceBackupURLResult> handler,
                                             Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBackupURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceBinlogResult describeUDBInstanceBinlog(DescribeUDBInstanceBinlogParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBinlogResult.class);
        return (DescribeUDBInstanceBinlogResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceBinlog(DescribeUDBInstanceBinlogParam param,
                                          UcloudHandler<DescribeUDBInstanceBinlogResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBinlogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceBinlogBackupStateResult describeUDBInstanceBinlogBackupState(
            DescribeUDBInstanceBinlogBackupStateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBinlogBackupStateResult.class);
        return (DescribeUDBInstanceBinlogBackupStateResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceBinlogBackupState(DescribeUDBInstanceBinlogBackupStateParam param,
                                                     UcloudHandler<DescribeUDBInstanceBinlogBackupStateResult> handler,
                                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceBinlogBackupStateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceByBackupResult describeUDBInstanceByBackup(
            DescribeUDBInstanceByBackupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByBackupResult.class);
        return (DescribeUDBInstanceByBackupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceByBackup(DescribeUDBInstanceByBackupParam param,
                                                     UcloudHandler<DescribeUDBInstanceByBackupResult> handler,
                                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByBackupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceByHostIpResult describeUDBInstanceByHostIp(
            DescribeUDBInstanceByHostIpParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByHostIpResult.class);
        return (DescribeUDBInstanceByHostIpResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceByHostIp(DescribeUDBInstanceByHostIpParam param,
                                            UcloudHandler<DescribeUDBInstanceByHostIpResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByHostIpResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceByParamGroupResult describeUDBInstanceByParamGroup(
            DescribeUDBInstanceByParamGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByParamGroupResult.class);
        return (DescribeUDBInstanceByParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceByParamGroup(DescribeUDBInstanceByParamGroupParam param,
                                                UcloudHandler<DescribeUDBInstanceByParamGroupResult> handler,
                                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceByParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceLogResult describeUDBInstanceLog(DescribeUDBInstanceLogParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceLogResult.class);
        return (DescribeUDBInstanceLogResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceLog(DescribeUDBInstanceLogParam param,
                                            UcloudHandler<DescribeUDBInstanceLogResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceLogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstancePhpMyAdminURLResult describeUDBInstancePhpMyAdminURL(
            DescribeUDBInstancePhpMyAdminURLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstancePhpMyAdminURLResult.class);
        return (DescribeUDBInstancePhpMyAdminURLResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstancePhpMyAdminURL(DescribeUDBInstancePhpMyAdminURLParam param,
                                                 UcloudHandler<DescribeUDBInstancePhpMyAdminURLResult> handler,
                                                 Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstancePhpMyAdminURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstancePriceResult describeUDBInstancePrice(DescribeUDBInstancePriceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstancePriceResult.class);
        return (DescribeUDBInstancePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstancePrice(DescribeUDBInstancePriceParam param,
                                         UcloudHandler<DescribeUDBInstancePriceResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstancePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceStateResult describeUDBInstanceState(DescribeUDBInstanceStateParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceStateResult.class);
        return (DescribeUDBInstanceStateResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceState(DescribeUDBInstanceStateParam param,
                                         UcloudHandler<DescribeUDBInstanceStateResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceStateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBInstanceUpgradePriceResult describeUDBInstanceUpgradePrice(
            DescribeUDBInstanceUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceUpgradePriceResult.class);
        return (DescribeUDBInstanceUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBInstanceUpgradePrice(DescribeUDBInstanceUpgradePriceParam param,
                                                UcloudHandler<DescribeUDBInstanceUpgradePriceResult> handler,
                                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBInstanceUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBLogBackupURLResult describeUDBLogBackupURL(DescribeUDBLogBackupURLParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBLogBackupURLResult.class);
        return (DescribeUDBLogBackupURLResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBLogBackupURL(DescribeUDBLogBackupURLParam param,
                                        UcloudHandler<DescribeUDBLogBackupURLResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBLogBackupURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBLogPackageResult describeUDBLogPackage(DescribeUDBLogPackageParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBLogPackageResult.class);
        return (DescribeUDBLogPackageResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBLogPackage(DescribeUDBLogPackageParam param,
                                      UcloudHandler<DescribeUDBLogPackageResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBLogPackageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBParamGroupResult describeUDBParamGroup(DescribeUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBParamGroupResult.class);
        return (DescribeUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBParamGroup(DescribeUDBParamGroupParam param,
                                      UcloudHandler<DescribeUDBParamGroupResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBSlaveOrSecondaryInstanceResult describeUDBSlaveOrSecondaryInstance(
            DescribeUDBSlaveOrSecondaryInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBSlaveOrSecondaryInstanceResult.class);
        return (DescribeUDBSlaveOrSecondaryInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBSlaveOrSecondaryInstance(DescribeUDBSlaveOrSecondaryInstanceParam param,
                                                    UcloudHandler<DescribeUDBSlaveOrSecondaryInstanceResult> handler,
                                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBSlaveOrSecondaryInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBSplittingInfoResult describeUDBSplittingInfo(DescribeUDBSplittingInfoParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBSplittingInfoResult.class);
        return (DescribeUDBSplittingInfoResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBSplittingInfo(DescribeUDBSplittingInfoParam param,
                                         UcloudHandler<DescribeUDBSplittingInfoResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBSplittingInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDBTypeResult describeUDBType(DescribeUDBTypeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBTypeResult.class);
        return (DescribeUDBTypeResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDBType(DescribeUDBTypeParam param,
                                UcloudHandler<DescribeUDBTypeResult> handler,
                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDBTypeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DisableUDBRWSplittingResult disableUDBRWSplitting(DisableUDBRWSplittingParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DisableUDBRWSplittingResult.class);
        return (DisableUDBRWSplittingResult) http.doGet(param, config, null);
    }

    @Override
    public void disableUDBRWSplitting(DisableUDBRWSplittingParam param,
                                      UcloudHandler<DisableUDBRWSplittingResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DisableUDBRWSplittingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public EditUDBBackupBlacklistResult editUDBBackupBlacklist(EditUDBBackupBlacklistParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(EditUDBBackupBlacklistResult.class);
        return (EditUDBBackupBlacklistResult) http.doGet(param, config, null);
    }

    @Override
    public void editUDBBackupBlacklist(EditUDBBackupBlacklistParam param,
                                       UcloudHandler<EditUDBBackupBlacklistResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(EditUDBBackupBlacklistResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public EnableUDBRWSplittingResult enableUDBRWSplitting(EnableUDBRWSplittingParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(EnableUDBRWSplittingResult.class);
        return (EnableUDBRWSplittingResult) http.doGet(param, config, null);
    }

    @Override
    public void enableUDBRWSplitting(EnableUDBRWSplittingParam param,
                                     UcloudHandler<EnableUDBRWSplittingResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(EnableUDBRWSplittingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ExtractUDBParamGroupResult extractUDBParamGroup(ExtractUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ExtractUDBParamGroupResult.class);
        return (ExtractUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void extractUDBParamGroup(ExtractUDBParamGroupParam param,
                                     UcloudHandler<ExtractUDBParamGroupResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ExtractUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public FetchDBPrecheckResultResult fetchDBPrecheckResult(FetchDBPrecheckResultParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(FetchDBPrecheckResultResult.class);
        return (FetchDBPrecheckResultResult) http.doGet(param, config, null);
    }

    @Override
    public void fetchDBPrecheckResult(FetchDBPrecheckResultParam param,
                                      UcloudHandler<FetchDBPrecheckResultResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(FetchDBPrecheckResultResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public FetchUDBInstanceEarliestRecoverTimeResult fetchUDBInstanceEarliestRecoverTime(
            FetchUDBInstanceEarliestRecoverTimeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(FetchUDBInstanceEarliestRecoverTimeResult.class);
        return (FetchUDBInstanceEarliestRecoverTimeResult) http.doGet(param, config, null);
    }

    @Override
    public void fetchUDBInstanceEarliestRecoverTime(FetchUDBInstanceEarliestRecoverTimeParam param,
                                                    UcloudHandler<FetchUDBInstanceEarliestRecoverTimeResult> handler,
                                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(FetchUDBInstanceEarliestRecoverTimeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDBSuspendPriceResult getUDBSuspendPrice(GetUDBSuspendPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDBSuspendPriceResult.class);
        return (GetUDBSuspendPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUDBSuspendPrice(GetUDBSuspendPriceParam param,
                                   UcloudHandler<GetUDBSuspendPriceResult> handler,
                                   Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDBSuspendPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GrantAccountPrivilegesResult grantAccountPrivileges(GrantAccountPrivilegesParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GrantAccountPrivilegesResult.class);
        return (GrantAccountPrivilegesResult) http.doGet(param, config, null);
    }

    @Override
    public void grantAccountPrivileges(GrantAccountPrivilegesParam param,
                                       UcloudHandler<GrantAccountPrivilegesResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GrantAccountPrivilegesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListMonitorItemsResult listMonitorItems(ListMonitorItemsParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListMonitorItemsResult.class);
        return (ListMonitorItemsResult) http.doGet(param, config, null);
    }

    @Override
    public void listMonitorItems(ListMonitorItemsParam param,
                                 UcloudHandler<ListMonitorItemsResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListMonitorItemsResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListUDBConfigSvrResult listUDBConfigSvr(ListUDBConfigSvrParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListUDBConfigSvrResult.class);
        return (ListUDBConfigSvrResult) http.doGet(param, config, null);
    }

    @Override
    public void listUDBConfigSvr(ListUDBConfigSvrParam param,
                                 UcloudHandler<ListUDBConfigSvrResult> handler,
                                 Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListUDBConfigSvrResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyDBTransferTaskResult modifyDBTransferTask(ModifyDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyDBTransferTaskResult.class);
        return (ModifyDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyDBTransferTask(ModifyDBTransferTaskParam param,
                                     UcloudHandler<ModifyDBTransferTaskResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifySqlserverPasswordResult modifySqlserverPassword(ModifySqlserverPasswordParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifySqlserverPasswordResult.class);
        return (ModifySqlserverPasswordResult) http.doGet(param, config, null);
    }

    @Override
    public void modifySqlserverPassword(ModifySqlserverPasswordParam param,
                                        UcloudHandler<ModifySqlserverPasswordResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifySqlserverPasswordResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUDBInstanceNameResult modifyUDBInstanceName(ModifyUDBInstanceNameParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDBInstanceNameResult.class);
        return (ModifyUDBInstanceNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUDBInstanceName(ModifyUDBInstanceNameParam param,
                                      UcloudHandler<ModifyUDBInstanceNameResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDBInstanceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUDBInstancePasswordResult modifyUDBInstancePassword(ModifyUDBInstancePasswordParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDBInstancePasswordResult.class);
        return (ModifyUDBInstancePasswordResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUDBInstancePassword(ModifyUDBInstancePasswordParam param,
                                          UcloudHandler<ModifyUDBInstancePasswordResult> handler,
                                          Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDBInstancePasswordResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PrecheckDBTransferTaskResult precheckDBTransferTask(PrecheckDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PrecheckDBTransferTaskResult.class);
        return (PrecheckDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void precheckDBTransferTask(PrecheckDBTransferTaskParam param,
                                       UcloudHandler<PrecheckDBTransferTaskResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PrecheckDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PromoteUDBInstanceToHAResult promoteUDBInstanceToHA(PromoteUDBInstanceToHAParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PromoteUDBInstanceToHAResult.class);
        return (PromoteUDBInstanceToHAResult) http.doGet(param, config, null);
    }

    @Override
    public void promoteUDBInstanceToHA(PromoteUDBInstanceToHAParam param,
                                       UcloudHandler<PromoteUDBInstanceToHAResult> handler,
                                       Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PromoteUDBInstanceToHAResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PromoteUDBSlaveResult promoteUDBSlave(PromoteUDBSlaveParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PromoteUDBSlaveResult.class);
        return (PromoteUDBSlaveResult) http.doGet(param, config, null);
    }

    @Override
    public void promoteUDBSlave(PromoteUDBSlaveParam param,
                                UcloudHandler<PromoteUDBSlaveResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PromoteUDBSlaveResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RecoverUDBInstanceResult recoverUDBInstance(RecoverUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDBInstanceResult.class);
        return (RecoverUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void recoverUDBInstance(RecoverUDBInstanceParam param,
                                   UcloudHandler<RecoverUDBInstanceResult> handler,
                                   Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUDBInstanceResult resizeUDBInstance(ResizeUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDBInstanceResult.class);
        return (ResizeUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void resizeUDBInstance(ResizeUDBInstanceParam param,
                                  UcloudHandler<ResizeUDBInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestartRWSplittingResult restartRWSplitting(RestartRWSplittingParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestartRWSplittingResult.class);
        return (RestartRWSplittingResult) http.doGet(param, config, null);
    }

    @Override
    public void restartRWSplitting(RestartRWSplittingParam param,
                                   UcloudHandler<RestartRWSplittingResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestartRWSplittingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestartUDBInstanceResult restartUDBInstance(RestartUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestartUDBInstanceResult.class);
        return (RestartUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void restartUDBInstance(RestartUDBInstanceParam param,
                                   UcloudHandler<RestartUDBInstanceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestartUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RevokeAccountPrivilegesResult revokeAccountPrivileges(RevokeAccountPrivilegesParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RevokeAccountPrivilegesResult.class);
        return (RevokeAccountPrivilegesResult) http.doGet(param, config, null);
    }

    @Override
    public void revokeAccountPrivileges(RevokeAccountPrivilegesParam param,
                                        UcloudHandler<RevokeAccountPrivilegesResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RevokeAccountPrivilegesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public SetUDBRWSplittingResult setUDBRWSplitting(SetUDBRWSplittingParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SetUDBRWSplittingResult.class);
        return (SetUDBRWSplittingResult) http.doGet(param, config, null);
    }

    @Override
    public void setUDBRWSplitting(SetUDBRWSplittingParam param,
                                  UcloudHandler<SetUDBRWSplittingResult> handler,
                                  Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SetUDBRWSplittingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartDBTransferTaskResult startDBTransferTask(StartDBTransferTaskParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StartDBTransferTaskResult.class);
        return (StartDBTransferTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void startDBTransferTask(StartDBTransferTaskParam param,
                                    UcloudHandler<StartDBTransferTaskResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StartDBTransferTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartUDBInstanceResult startUDBInstance(StartUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StartUDBInstanceResult.class);
        return (StartUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void startUDBInstance(StartUDBInstanceParam param,
                                 UcloudHandler<StartUDBInstanceResult> handler,
                                 Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StartUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StopUDBInstanceResult stopUDBInstance(StopUDBInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StopUDBInstanceResult.class);
        return (StopUDBInstanceResult) http.doGet(param, config, null);
    }

    @Override
    public void stopUDBInstance(StopUDBInstanceParam param, UcloudHandler<StopUDBInstanceResult> handler,
                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StopUDBInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public SwitchUDBInstanceToHAResult switchUDBInstanceToHA(SwitchUDBInstanceToHAParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SwitchUDBInstanceToHAResult.class);
        return (SwitchUDBInstanceToHAResult) http.doGet(param, config, null);
    }

    @Override
    public void switchUDBInstanceToHA(SwitchUDBInstanceToHAParam param,
                                      UcloudHandler<SwitchUDBInstanceToHAResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SwitchUDBInstanceToHAResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUDBInstanceBackupStrategyResult updateUDBInstanceBackupStrategy(
            UpdateUDBInstanceBackupStrategyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBInstanceBackupStrategyResult.class);
        return (UpdateUDBInstanceBackupStrategyResult) http.doGet(param, config, null);
    }

    @Override
    public void updateUDBInstanceBackupStrategy(UpdateUDBInstanceBackupStrategyParam param,
                                                UcloudHandler<UpdateUDBInstanceBackupStrategyResult> handler,
                                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBInstanceBackupStrategyResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUDBInstanceSlaveBackupSwitchResult updateUDBInstanceSlaveBackupSwitch(
            UpdateUDBInstanceSlaveBackupSwitchParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBInstanceSlaveBackupSwitchResult.class);
        return (UpdateUDBInstanceSlaveBackupSwitchResult) http.doGet(param, config, null);
    }

    @Override
    public void updateUDBInstanceSlaveBackupSwitch(UpdateUDBInstanceSlaveBackupSwitchParam param,
                                                   UcloudHandler<UpdateUDBInstanceSlaveBackupSwitchResult> handler,
                                                   Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBInstanceSlaveBackupSwitchResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUDBParamGroupResult updateUDBParamGroup(UpdateUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBParamGroupResult.class);
        return (UpdateUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void updateUDBParamGroup(UpdateUDBParamGroupParam param,
                                    UcloudHandler<UpdateUDBParamGroupResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UploadUDBParamGroupResult uploadUDBParamGroup(UploadUDBParamGroupParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UploadUDBParamGroupResult.class);
        return (UploadUDBParamGroupResult) http.doGet(param, config, null);
    }

    @Override
    public void uploadUDBParamGroup(UploadUDBParamGroupParam param,
                                    UcloudHandler<UploadUDBParamGroupResult> handler,
                                    Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UploadUDBParamGroupResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
