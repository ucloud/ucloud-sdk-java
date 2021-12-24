/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udb.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.udb.models.BackupUDBInstanceBinlogRequest;
import cn.ucloud.udb.models.BackupUDBInstanceBinlogResponse;
import cn.ucloud.udb.models.BackupUDBInstanceErrorLogRequest;
import cn.ucloud.udb.models.BackupUDBInstanceErrorLogResponse;
import cn.ucloud.udb.models.BackupUDBInstanceRequest;
import cn.ucloud.udb.models.BackupUDBInstanceResponse;
import cn.ucloud.udb.models.BackupUDBInstanceSlowLogRequest;
import cn.ucloud.udb.models.BackupUDBInstanceSlowLogResponse;
import cn.ucloud.udb.models.ChangeUDBParamGroupRequest;
import cn.ucloud.udb.models.ChangeUDBParamGroupResponse;
import cn.ucloud.udb.models.CheckRecoverUDBInstanceRequest;
import cn.ucloud.udb.models.CheckRecoverUDBInstanceResponse;
import cn.ucloud.udb.models.CheckUDBInstanceToHAAllowanceRequest;
import cn.ucloud.udb.models.CheckUDBInstanceToHAAllowanceResponse;
import cn.ucloud.udb.models.ClearUDBLogRequest;
import cn.ucloud.udb.models.ClearUDBLogResponse;
import cn.ucloud.udb.models.CreateMongoDBReplicaSetRequest;
import cn.ucloud.udb.models.CreateMongoDBReplicaSetResponse;
import cn.ucloud.udb.models.CreateUDBInstanceByRecoveryRequest;
import cn.ucloud.udb.models.CreateUDBInstanceByRecoveryResponse;
import cn.ucloud.udb.models.CreateUDBInstanceRequest;
import cn.ucloud.udb.models.CreateUDBInstanceResponse;
import cn.ucloud.udb.models.CreateUDBParamGroupRequest;
import cn.ucloud.udb.models.CreateUDBParamGroupResponse;
import cn.ucloud.udb.models.CreateUDBReplicationInstanceRequest;
import cn.ucloud.udb.models.CreateUDBReplicationInstanceResponse;
import cn.ucloud.udb.models.CreateUDBRouteInstanceRequest;
import cn.ucloud.udb.models.CreateUDBRouteInstanceResponse;
import cn.ucloud.udb.models.CreateUDBSlaveRequest;
import cn.ucloud.udb.models.CreateUDBSlaveResponse;
import cn.ucloud.udb.models.DeleteUDBInstanceRequest;
import cn.ucloud.udb.models.DeleteUDBInstanceResponse;
import cn.ucloud.udb.models.DeleteUDBLogPackageRequest;
import cn.ucloud.udb.models.DeleteUDBLogPackageResponse;
import cn.ucloud.udb.models.DeleteUDBParamGroupRequest;
import cn.ucloud.udb.models.DeleteUDBParamGroupResponse;
import cn.ucloud.udb.models.DescribeUDBBackupBlacklistRequest;
import cn.ucloud.udb.models.DescribeUDBBackupBlacklistResponse;
import cn.ucloud.udb.models.DescribeUDBBackupRequest;
import cn.ucloud.udb.models.DescribeUDBBackupResponse;
import cn.ucloud.udb.models.DescribeUDBBinlogBackupURLRequest;
import cn.ucloud.udb.models.DescribeUDBBinlogBackupURLResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceBackupStateRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceBackupStateResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceBackupURLRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceBackupURLResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceBinlogBackupStateRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceBinlogBackupStateResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceBinlogRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceBinlogResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceLogRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceLogResponse;
import cn.ucloud.udb.models.DescribeUDBInstancePriceRequest;
import cn.ucloud.udb.models.DescribeUDBInstancePriceResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceStateRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceStateResponse;
import cn.ucloud.udb.models.DescribeUDBInstanceUpgradePriceRequest;
import cn.ucloud.udb.models.DescribeUDBInstanceUpgradePriceResponse;
import cn.ucloud.udb.models.DescribeUDBLogBackupURLRequest;
import cn.ucloud.udb.models.DescribeUDBLogBackupURLResponse;
import cn.ucloud.udb.models.DescribeUDBLogPackageRequest;
import cn.ucloud.udb.models.DescribeUDBLogPackageResponse;
import cn.ucloud.udb.models.DescribeUDBParamGroupRequest;
import cn.ucloud.udb.models.DescribeUDBParamGroupResponse;
import cn.ucloud.udb.models.DescribeUDBSplittingInfoRequest;
import cn.ucloud.udb.models.DescribeUDBSplittingInfoResponse;
import cn.ucloud.udb.models.DescribeUDBTypeRequest;
import cn.ucloud.udb.models.DescribeUDBTypeResponse;
import cn.ucloud.udb.models.DisableUDBRWSplittingRequest;
import cn.ucloud.udb.models.DisableUDBRWSplittingResponse;
import cn.ucloud.udb.models.EditUDBBackupBlacklistRequest;
import cn.ucloud.udb.models.EditUDBBackupBlacklistResponse;
import cn.ucloud.udb.models.EnableUDBRWSplittingRequest;
import cn.ucloud.udb.models.EnableUDBRWSplittingResponse;
import cn.ucloud.udb.models.ExtractUDBParamGroupRequest;
import cn.ucloud.udb.models.ExtractUDBParamGroupResponse;
import cn.ucloud.udb.models.FetchUDBInstanceEarliestRecoverTimeRequest;
import cn.ucloud.udb.models.FetchUDBInstanceEarliestRecoverTimeResponse;
import cn.ucloud.udb.models.ModifyUDBInstanceNameRequest;
import cn.ucloud.udb.models.ModifyUDBInstanceNameResponse;
import cn.ucloud.udb.models.ModifyUDBInstancePasswordRequest;
import cn.ucloud.udb.models.ModifyUDBInstancePasswordResponse;
import cn.ucloud.udb.models.PromoteUDBInstanceToHARequest;
import cn.ucloud.udb.models.PromoteUDBInstanceToHAResponse;
import cn.ucloud.udb.models.PromoteUDBSlaveRequest;
import cn.ucloud.udb.models.PromoteUDBSlaveResponse;
import cn.ucloud.udb.models.ResizeUDBInstanceRequest;
import cn.ucloud.udb.models.ResizeUDBInstanceResponse;
import cn.ucloud.udb.models.RestartRWSplittingRequest;
import cn.ucloud.udb.models.RestartRWSplittingResponse;
import cn.ucloud.udb.models.RestartUDBInstanceRequest;
import cn.ucloud.udb.models.RestartUDBInstanceResponse;
import cn.ucloud.udb.models.SetUDBRWSplittingRequest;
import cn.ucloud.udb.models.SetUDBRWSplittingResponse;
import cn.ucloud.udb.models.StartUDBInstanceRequest;
import cn.ucloud.udb.models.StartUDBInstanceResponse;
import cn.ucloud.udb.models.StopUDBInstanceRequest;
import cn.ucloud.udb.models.StopUDBInstanceResponse;
import cn.ucloud.udb.models.SwitchUDBHAToSentinelRequest;
import cn.ucloud.udb.models.SwitchUDBHAToSentinelResponse;
import cn.ucloud.udb.models.SwitchUDBInstanceToHARequest;
import cn.ucloud.udb.models.SwitchUDBInstanceToHAResponse;
import cn.ucloud.udb.models.UpdateUDBInstanceBackupStrategyRequest;
import cn.ucloud.udb.models.UpdateUDBInstanceBackupStrategyResponse;
import cn.ucloud.udb.models.UpdateUDBInstanceSlaveBackupSwitchRequest;
import cn.ucloud.udb.models.UpdateUDBInstanceSlaveBackupSwitchResponse;
import cn.ucloud.udb.models.UpdateUDBParamGroupRequest;
import cn.ucloud.udb.models.UpdateUDBParamGroupResponse;
import cn.ucloud.udb.models.UpgradeUDBInstanceToHARequest;
import cn.ucloud.udb.models.UpgradeUDBInstanceToHAResponse;
import cn.ucloud.udb.models.UploadUDBParamGroupRequest;
import cn.ucloud.udb.models.UploadUDBParamGroupResponse;

/** This client is used to call actions of **UDB** service */
public class UDBClient extends DefaultClient implements UDBClientInterface {
    public UDBClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BackupUDBInstance - 备份UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/BackupUDBInstance
     */
    public BackupUDBInstanceResponse backupUDBInstance(BackupUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("BackupUDBInstance");
        return (BackupUDBInstanceResponse) this.invoke(request, BackupUDBInstanceResponse.class);
    }

    /**
     * BackupUDBInstanceBinlog - 备份UDB指定时间段的binlog列表
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/BackupUDBInstanceBinlog
     */
    public BackupUDBInstanceBinlogResponse backupUDBInstanceBinlog(
            BackupUDBInstanceBinlogRequest request) throws UCloudException {
        request.setAction("BackupUDBInstanceBinlog");
        return (BackupUDBInstanceBinlogResponse)
                this.invoke(request, BackupUDBInstanceBinlogResponse.class);
    }

    /**
     * BackupUDBInstanceErrorLog - 备份UDB指定时间段的errorlog
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/BackupUDBInstanceErrorLog
     */
    public BackupUDBInstanceErrorLogResponse backupUDBInstanceErrorLog(
            BackupUDBInstanceErrorLogRequest request) throws UCloudException {
        request.setAction("BackupUDBInstanceErrorLog");
        return (BackupUDBInstanceErrorLogResponse)
                this.invoke(request, BackupUDBInstanceErrorLogResponse.class);
    }

    /**
     * BackupUDBInstanceSlowLog - 备份UDB指定时间段的slowlog分析结果
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/BackupUDBInstanceSlowLog
     */
    public BackupUDBInstanceSlowLogResponse backupUDBInstanceSlowLog(
            BackupUDBInstanceSlowLogRequest request) throws UCloudException {
        request.setAction("BackupUDBInstanceSlowLog");
        return (BackupUDBInstanceSlowLogResponse)
                this.invoke(request, BackupUDBInstanceSlowLogResponse.class);
    }

    /**
     * ChangeUDBParamGroup - 修改配置文件
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ChangeUDBParamGroup
     */
    public ChangeUDBParamGroupResponse changeUDBParamGroup(ChangeUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("ChangeUDBParamGroup");
        return (ChangeUDBParamGroupResponse)
                this.invoke(request, ChangeUDBParamGroupResponse.class);
    }

    /**
     * CheckRecoverUDBInstance - 核查db是否可以使用回档功能
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CheckRecoverUDBInstance
     */
    public CheckRecoverUDBInstanceResponse checkRecoverUDBInstance(
            CheckRecoverUDBInstanceRequest request) throws UCloudException {
        request.setAction("CheckRecoverUDBInstance");
        return (CheckRecoverUDBInstanceResponse)
                this.invoke(request, CheckRecoverUDBInstanceResponse.class);
    }

    /**
     * CheckUDBInstanceToHAAllowance - 核查db是否可以升级为高可用
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CheckUDBInstanceToHAAllowance
     */
    public CheckUDBInstanceToHAAllowanceResponse checkUDBInstanceToHAAllowance(
            CheckUDBInstanceToHAAllowanceRequest request) throws UCloudException {
        request.setAction("CheckUDBInstanceToHAAllowance");
        return (CheckUDBInstanceToHAAllowanceResponse)
                this.invoke(request, CheckUDBInstanceToHAAllowanceResponse.class);
    }

    /**
     * ClearUDBLog - 清除UDB实例的log
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ClearUDBLog
     */
    public ClearUDBLogResponse clearUDBLog(ClearUDBLogRequest request) throws UCloudException {
        request.setAction("ClearUDBLog");
        return (ClearUDBLogResponse) this.invoke(request, ClearUDBLogResponse.class);
    }

    /**
     * CreateMongoDBReplicaSet - 一键创建DB副本集
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateMongoDBReplicaSet
     */
    public CreateMongoDBReplicaSetResponse createMongoDBReplicaSet(
            CreateMongoDBReplicaSetRequest request) throws UCloudException {
        request.setAction("CreateMongoDBReplicaSet");
        return (CreateMongoDBReplicaSetResponse)
                this.invoke(request, CreateMongoDBReplicaSetResponse.class);
    }

    /**
     * CreateUDBInstance - 创建UDB实例（包括创建mysql master节点、mongodb primary/configsvr节点和从备份恢复实例）
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBInstance
     */
    public CreateUDBInstanceResponse createUDBInstance(CreateUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUDBInstance");
        return (CreateUDBInstanceResponse) this.invoke(request, CreateUDBInstanceResponse.class);
    }

    /**
     * CreateUDBInstanceByRecovery - 创建db，将新创建的db恢复到指定db某个指定时间点
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBInstanceByRecovery
     */
    public CreateUDBInstanceByRecoveryResponse createUDBInstanceByRecovery(
            CreateUDBInstanceByRecoveryRequest request) throws UCloudException {
        request.setAction("CreateUDBInstanceByRecovery");
        return (CreateUDBInstanceByRecoveryResponse)
                this.invoke(request, CreateUDBInstanceByRecoveryResponse.class);
    }

    /**
     * CreateUDBParamGroup - 从已有配置文件创建新配置文件
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBParamGroup
     */
    public CreateUDBParamGroupResponse createUDBParamGroup(CreateUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("CreateUDBParamGroup");
        return (CreateUDBParamGroupResponse)
                this.invoke(request, CreateUDBParamGroupResponse.class);
    }

    /**
     * CreateUDBReplicationInstance - 创建MongoDB的副本节点（包括仲裁）
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBReplicationInstance
     */
    public CreateUDBReplicationInstanceResponse createUDBReplicationInstance(
            CreateUDBReplicationInstanceRequest request) throws UCloudException {
        request.setAction("CreateUDBReplicationInstance");
        return (CreateUDBReplicationInstanceResponse)
                this.invoke(request, CreateUDBReplicationInstanceResponse.class);
    }

    /**
     * CreateUDBRouteInstance - 创建mongos实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBRouteInstance
     */
    public CreateUDBRouteInstanceResponse createUDBRouteInstance(
            CreateUDBRouteInstanceRequest request) throws UCloudException {
        request.setAction("CreateUDBRouteInstance");
        return (CreateUDBRouteInstanceResponse)
                this.invoke(request, CreateUDBRouteInstanceResponse.class);
    }

    /**
     * CreateUDBSlave - 创建UDB实例的slave
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/CreateUDBSlave
     */
    public CreateUDBSlaveResponse createUDBSlave(CreateUDBSlaveRequest request)
            throws UCloudException {
        request.setAction("CreateUDBSlave");
        return (CreateUDBSlaveResponse) this.invoke(request, CreateUDBSlaveResponse.class);
    }

    /**
     * DeleteUDBInstance - 删除UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DeleteUDBInstance
     */
    public DeleteUDBInstanceResponse deleteUDBInstance(DeleteUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUDBInstance");
        return (DeleteUDBInstanceResponse) this.invoke(request, DeleteUDBInstanceResponse.class);
    }

    /**
     * DeleteUDBLogPackage - 删除UDB日志包
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DeleteUDBLogPackage
     */
    public DeleteUDBLogPackageResponse deleteUDBLogPackage(DeleteUDBLogPackageRequest request)
            throws UCloudException {
        request.setAction("DeleteUDBLogPackage");
        return (DeleteUDBLogPackageResponse)
                this.invoke(request, DeleteUDBLogPackageResponse.class);
    }

    /**
     * DeleteUDBParamGroup - 删除配置参数组
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DeleteUDBParamGroup
     */
    public DeleteUDBParamGroupResponse deleteUDBParamGroup(DeleteUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("DeleteUDBParamGroup");
        return (DeleteUDBParamGroupResponse)
                this.invoke(request, DeleteUDBParamGroupResponse.class);
    }

    /**
     * DescribeUDBBackup - 列表UDB实例备份信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBBackup
     */
    public DescribeUDBBackupResponse describeUDBBackup(DescribeUDBBackupRequest request)
            throws UCloudException {
        request.setAction("DescribeUDBBackup");
        return (DescribeUDBBackupResponse) this.invoke(request, DescribeUDBBackupResponse.class);
    }

    /**
     * DescribeUDBBackupBlacklist - 获取UDB实例的备份黑名单
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBBackupBlacklist
     */
    public DescribeUDBBackupBlacklistResponse describeUDBBackupBlacklist(
            DescribeUDBBackupBlacklistRequest request) throws UCloudException {
        request.setAction("DescribeUDBBackupBlacklist");
        return (DescribeUDBBackupBlacklistResponse)
                this.invoke(request, DescribeUDBBackupBlacklistResponse.class);
    }

    /**
     * DescribeUDBBinlogBackupURL - 获取UDB的Binlog备份地址
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBBinlogBackupURL
     */
    public DescribeUDBBinlogBackupURLResponse describeUDBBinlogBackupURL(
            DescribeUDBBinlogBackupURLRequest request) throws UCloudException {
        request.setAction("DescribeUDBBinlogBackupURL");
        return (DescribeUDBBinlogBackupURLResponse)
                this.invoke(request, DescribeUDBBinlogBackupURLResponse.class);
    }

    /**
     * DescribeUDBInstance -
     * 获取UDB实例信息，支持两类操作：（1）指定DBId用于获取该db的信息；（2）指定ClassType、Offset、Limit用于列表操作，查询某一个类型db。
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstance
     */
    public DescribeUDBInstanceResponse describeUDBInstance(DescribeUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("DescribeUDBInstance");
        return (DescribeUDBInstanceResponse)
                this.invoke(request, DescribeUDBInstanceResponse.class);
    }

    /**
     * DescribeUDBInstanceBackupState - 获取UDB实例备份状态
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceBackupState
     */
    public DescribeUDBInstanceBackupStateResponse describeUDBInstanceBackupState(
            DescribeUDBInstanceBackupStateRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceBackupState");
        return (DescribeUDBInstanceBackupStateResponse)
                this.invoke(request, DescribeUDBInstanceBackupStateResponse.class);
    }

    /**
     * DescribeUDBInstanceBackupURL - 获取UDB备份下载地址
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceBackupURL
     */
    public DescribeUDBInstanceBackupURLResponse describeUDBInstanceBackupURL(
            DescribeUDBInstanceBackupURLRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceBackupURL");
        return (DescribeUDBInstanceBackupURLResponse)
                this.invoke(request, DescribeUDBInstanceBackupURLResponse.class);
    }

    /**
     * DescribeUDBInstanceBinlog - 获取UDB指定时间段的binlog列表
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceBinlog
     */
    public DescribeUDBInstanceBinlogResponse describeUDBInstanceBinlog(
            DescribeUDBInstanceBinlogRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceBinlog");
        return (DescribeUDBInstanceBinlogResponse)
                this.invoke(request, DescribeUDBInstanceBinlogResponse.class);
    }

    /**
     * DescribeUDBInstanceBinlogBackupState - 获取udb实例备份状态
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceBinlogBackupState
     */
    public DescribeUDBInstanceBinlogBackupStateResponse describeUDBInstanceBinlogBackupState(
            DescribeUDBInstanceBinlogBackupStateRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceBinlogBackupState");
        return (DescribeUDBInstanceBinlogBackupStateResponse)
                this.invoke(request, DescribeUDBInstanceBinlogBackupStateResponse.class);
    }

    /**
     * DescribeUDBInstanceLog - 查询某一段时间内UDB的错误日志或慢查询日志
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceLog
     */
    public DescribeUDBInstanceLogResponse describeUDBInstanceLog(
            DescribeUDBInstanceLogRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceLog");
        return (DescribeUDBInstanceLogResponse)
                this.invoke(request, DescribeUDBInstanceLogResponse.class);
    }

    /**
     * DescribeUDBInstancePrice - 获取UDB实例价格信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstancePrice
     */
    public DescribeUDBInstancePriceResponse describeUDBInstancePrice(
            DescribeUDBInstancePriceRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstancePrice");
        return (DescribeUDBInstancePriceResponse)
                this.invoke(request, DescribeUDBInstancePriceResponse.class);
    }

    /**
     * DescribeUDBInstanceState - 获取UDB实例状态
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceState
     */
    public DescribeUDBInstanceStateResponse describeUDBInstanceState(
            DescribeUDBInstanceStateRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceState");
        return (DescribeUDBInstanceStateResponse)
                this.invoke(request, DescribeUDBInstanceStateResponse.class);
    }

    /**
     * DescribeUDBInstanceUpgradePrice - 获取UDB实例升降级价格信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBInstanceUpgradePrice
     */
    public DescribeUDBInstanceUpgradePriceResponse describeUDBInstanceUpgradePrice(
            DescribeUDBInstanceUpgradePriceRequest request) throws UCloudException {
        request.setAction("DescribeUDBInstanceUpgradePrice");
        return (DescribeUDBInstanceUpgradePriceResponse)
                this.invoke(request, DescribeUDBInstanceUpgradePriceResponse.class);
    }

    /**
     * DescribeUDBLogBackupURL - 获取UDB的slowlog备份地址
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBLogBackupURL
     */
    public DescribeUDBLogBackupURLResponse describeUDBLogBackupURL(
            DescribeUDBLogBackupURLRequest request) throws UCloudException {
        request.setAction("DescribeUDBLogBackupURL");
        return (DescribeUDBLogBackupURLResponse)
                this.invoke(request, DescribeUDBLogBackupURLResponse.class);
    }

    /**
     * DescribeUDBLogPackage - 列表UDB实例binlog或slowlog或errorlog备份信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBLogPackage
     */
    public DescribeUDBLogPackageResponse describeUDBLogPackage(DescribeUDBLogPackageRequest request)
            throws UCloudException {
        request.setAction("DescribeUDBLogPackage");
        return (DescribeUDBLogPackageResponse)
                this.invoke(request, DescribeUDBLogPackageResponse.class);
    }

    /**
     * DescribeUDBParamGroup - 获取参数组详细参数信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBParamGroup
     */
    public DescribeUDBParamGroupResponse describeUDBParamGroup(DescribeUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("DescribeUDBParamGroup");
        return (DescribeUDBParamGroupResponse)
                this.invoke(request, DescribeUDBParamGroupResponse.class);
    }

    /**
     * DescribeUDBSplittingInfo - 描述读写分离功能的详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBSplittingInfo
     */
    public DescribeUDBSplittingInfoResponse describeUDBSplittingInfo(
            DescribeUDBSplittingInfoRequest request) throws UCloudException {
        request.setAction("DescribeUDBSplittingInfo");
        return (DescribeUDBSplittingInfoResponse)
                this.invoke(request, DescribeUDBSplittingInfoResponse.class);
    }

    /**
     * DescribeUDBType - 获取UDB支持的类型信息
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DescribeUDBType
     */
    public DescribeUDBTypeResponse describeUDBType(DescribeUDBTypeRequest request)
            throws UCloudException {
        request.setAction("DescribeUDBType");
        return (DescribeUDBTypeResponse) this.invoke(request, DescribeUDBTypeResponse.class);
    }

    /**
     * DisableUDBRWSplitting - 关闭DB的读写分离功能
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/DisableUDBRWSplitting
     */
    public DisableUDBRWSplittingResponse disableUDBRWSplitting(DisableUDBRWSplittingRequest request)
            throws UCloudException {
        request.setAction("DisableUDBRWSplitting");
        return (DisableUDBRWSplittingResponse)
                this.invoke(request, DisableUDBRWSplittingResponse.class);
    }

    /**
     * EditUDBBackupBlacklist - 编辑UDB实例的备份黑名单
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/EditUDBBackupBlacklist
     */
    public EditUDBBackupBlacklistResponse editUDBBackupBlacklist(
            EditUDBBackupBlacklistRequest request) throws UCloudException {
        request.setAction("EditUDBBackupBlacklist");
        return (EditUDBBackupBlacklistResponse)
                this.invoke(request, EditUDBBackupBlacklistResponse.class);
    }

    /**
     * EnableUDBRWSplitting - 开启DB的读写分离功能
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/EnableUDBRWSplitting
     */
    public EnableUDBRWSplittingResponse enableUDBRWSplitting(EnableUDBRWSplittingRequest request)
            throws UCloudException {
        request.setAction("EnableUDBRWSplitting");
        return (EnableUDBRWSplittingResponse)
                this.invoke(request, EnableUDBRWSplittingResponse.class);
    }

    /**
     * ExtractUDBParamGroup - 获取配置文件内容
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ExtractUDBParamGroup
     */
    public ExtractUDBParamGroupResponse extractUDBParamGroup(ExtractUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("ExtractUDBParamGroup");
        return (ExtractUDBParamGroupResponse)
                this.invoke(request, ExtractUDBParamGroupResponse.class);
    }

    /**
     * FetchUDBInstanceEarliestRecoverTime - 获取UDB最早可回档的时间点
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/FetchUDBInstanceEarliestRecoverTime
     */
    public FetchUDBInstanceEarliestRecoverTimeResponse fetchUDBInstanceEarliestRecoverTime(
            FetchUDBInstanceEarliestRecoverTimeRequest request) throws UCloudException {
        request.setAction("FetchUDBInstanceEarliestRecoverTime");
        return (FetchUDBInstanceEarliestRecoverTimeResponse)
                this.invoke(request, FetchUDBInstanceEarliestRecoverTimeResponse.class);
    }

    /**
     * ModifyUDBInstanceName - 重命名UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ModifyUDBInstanceName
     */
    public ModifyUDBInstanceNameResponse modifyUDBInstanceName(ModifyUDBInstanceNameRequest request)
            throws UCloudException {
        request.setAction("ModifyUDBInstanceName");
        return (ModifyUDBInstanceNameResponse)
                this.invoke(request, ModifyUDBInstanceNameResponse.class);
    }

    /**
     * ModifyUDBInstancePassword - 修改DB实例的管理员密码
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ModifyUDBInstancePassword
     */
    public ModifyUDBInstancePasswordResponse modifyUDBInstancePassword(
            ModifyUDBInstancePasswordRequest request) throws UCloudException {
        request.setAction("ModifyUDBInstancePassword");
        return (ModifyUDBInstancePasswordResponse)
                this.invoke(request, ModifyUDBInstancePasswordResponse.class);
    }

    /**
     * PromoteUDBInstanceToHA - 普通db升级为高可用(只针对mysql5.5及以上版本SSD机型的实例)
     * ，对于NVMe机型的单点升级高可用，虽然也能使用该操作再加上SwitchUDBInstanceToHA，但是更建议直接调用新的API接口（UpgradeUDBInstanceToHA）
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/PromoteUDBInstanceToHA
     */
    public PromoteUDBInstanceToHAResponse promoteUDBInstanceToHA(
            PromoteUDBInstanceToHARequest request) throws UCloudException {
        request.setAction("PromoteUDBInstanceToHA");
        return (PromoteUDBInstanceToHAResponse)
                this.invoke(request, PromoteUDBInstanceToHAResponse.class);
    }

    /**
     * PromoteUDBSlave - 从库提升为独立库
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/PromoteUDBSlave
     */
    public PromoteUDBSlaveResponse promoteUDBSlave(PromoteUDBSlaveRequest request)
            throws UCloudException {
        request.setAction("PromoteUDBSlave");
        return (PromoteUDBSlaveResponse) this.invoke(request, PromoteUDBSlaveResponse.class);
    }

    /**
     * ResizeUDBInstance -
     * 修改（升级和降级）UDB实例的配置，包括内存和磁盘的配置，对于内存升级无需关闭实例，其他场景需要事先关闭实例。两套参数可以配置升降机：1.配置UseSSD和SSDType
     * 2.配置InstanceType，不需要配置InstanceMode。这两套第二套参数的优先级更高
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/ResizeUDBInstance
     */
    public ResizeUDBInstanceResponse resizeUDBInstance(ResizeUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("ResizeUDBInstance");
        return (ResizeUDBInstanceResponse) this.invoke(request, ResizeUDBInstanceResponse.class);
    }

    /**
     * RestartRWSplitting - 读写分离中间件重启，对应docker重启，但是ip不变
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/RestartRWSplitting
     */
    public RestartRWSplittingResponse restartRWSplitting(RestartRWSplittingRequest request)
            throws UCloudException {
        request.setAction("RestartRWSplitting");
        return (RestartRWSplittingResponse) this.invoke(request, RestartRWSplittingResponse.class);
    }

    /**
     * RestartUDBInstance - 重启UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/RestartUDBInstance
     */
    public RestartUDBInstanceResponse restartUDBInstance(RestartUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("RestartUDBInstance");
        return (RestartUDBInstanceResponse) this.invoke(request, RestartUDBInstanceResponse.class);
    }

    /**
     * SetUDBRWSplitting - 设置读写分离的模式
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/SetUDBRWSplitting
     */
    public SetUDBRWSplittingResponse setUDBRWSplitting(SetUDBRWSplittingRequest request)
            throws UCloudException {
        request.setAction("SetUDBRWSplitting");
        return (SetUDBRWSplittingResponse) this.invoke(request, SetUDBRWSplittingResponse.class);
    }

    /**
     * StartUDBInstance - 启动UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/StartUDBInstance
     */
    public StartUDBInstanceResponse startUDBInstance(StartUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUDBInstance");
        return (StartUDBInstanceResponse) this.invoke(request, StartUDBInstanceResponse.class);
    }

    /**
     * StopUDBInstance - 关闭UDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/StopUDBInstance
     */
    public StopUDBInstanceResponse stopUDBInstance(StopUDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUDBInstance");
        return (StopUDBInstanceResponse) this.invoke(request, StopUDBInstanceResponse.class);
    }

    /**
     * SwitchUDBHAToSentinel - UDB高可用实例从HAProxy版本升级为Sentinel版本（不带HAProxy）升级耗时5-10秒
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/SwitchUDBHAToSentinel
     */
    public SwitchUDBHAToSentinelResponse switchUDBHAToSentinel(SwitchUDBHAToSentinelRequest request)
            throws UCloudException {
        request.setAction("SwitchUDBHAToSentinel");
        return (SwitchUDBHAToSentinelResponse)
                this.invoke(request, SwitchUDBHAToSentinelResponse.class);
    }

    /**
     * SwitchUDBInstanceToHA - 普通UDB切换为高可用(只针对mysql5.5及以上版本SSD机型的实例) ，原db状态为WaitForSwitch时，调用该api；
     * 对于NVMe机型的单点升级高可用，虽然也能使用PromoteUDBInstanceToHA再加上该操作，但是更建议直接调用新的API接口（UpgradeUDBInstanceToHA）
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/SwitchUDBInstanceToHA
     */
    public SwitchUDBInstanceToHAResponse switchUDBInstanceToHA(SwitchUDBInstanceToHARequest request)
            throws UCloudException {
        request.setAction("SwitchUDBInstanceToHA");
        return (SwitchUDBInstanceToHAResponse)
                this.invoke(request, SwitchUDBInstanceToHAResponse.class);
    }

    /**
     * UpdateUDBInstanceBackupStrategy - 修改UDB自动备份策略
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/UpdateUDBInstanceBackupStrategy
     */
    public UpdateUDBInstanceBackupStrategyResponse updateUDBInstanceBackupStrategy(
            UpdateUDBInstanceBackupStrategyRequest request) throws UCloudException {
        request.setAction("UpdateUDBInstanceBackupStrategy");
        return (UpdateUDBInstanceBackupStrategyResponse)
                this.invoke(request, UpdateUDBInstanceBackupStrategyResponse.class);
    }

    /**
     * UpdateUDBInstanceSlaveBackupSwitch - 开启或者关闭UDB从库备份
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/UpdateUDBInstanceSlaveBackupSwitch
     */
    public UpdateUDBInstanceSlaveBackupSwitchResponse updateUDBInstanceSlaveBackupSwitch(
            UpdateUDBInstanceSlaveBackupSwitchRequest request) throws UCloudException {
        request.setAction("UpdateUDBInstanceSlaveBackupSwitch");
        return (UpdateUDBInstanceSlaveBackupSwitchResponse)
                this.invoke(request, UpdateUDBInstanceSlaveBackupSwitchResponse.class);
    }

    /**
     * UpdateUDBParamGroup - 更新UDB配置参数项
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/UpdateUDBParamGroup
     */
    public UpdateUDBParamGroupResponse updateUDBParamGroup(UpdateUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("UpdateUDBParamGroup");
        return (UpdateUDBParamGroupResponse)
                this.invoke(request, UpdateUDBParamGroupResponse.class);
    }

    /**
     * UpgradeUDBInstanceToHA - 快杰普通db升级为高可用(只针对mysql5.5及以上版本Nvme机型的实例)
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/UpgradeUDBInstanceToHA
     */
    public UpgradeUDBInstanceToHAResponse upgradeUDBInstanceToHA(
            UpgradeUDBInstanceToHARequest request) throws UCloudException {
        request.setAction("UpgradeUDBInstanceToHA");
        return (UpgradeUDBInstanceToHAResponse)
                this.invoke(request, UpgradeUDBInstanceToHAResponse.class);
    }

    /**
     * UploadUDBParamGroup - 导入UDB配置
     *
     * <p>See also: https://docs.ucloud.cn/api/udb-api/UploadUDBParamGroup
     */
    public UploadUDBParamGroupResponse uploadUDBParamGroup(UploadUDBParamGroupRequest request)
            throws UCloudException {
        request.setAction("UploadUDBParamGroup");
        return (UploadUDBParamGroupResponse)
                this.invoke(request, UploadUDBParamGroupResponse.class);
    }
}
