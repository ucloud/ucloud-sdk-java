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
package cn.ucloud.tidb.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.tidb.models.CreateTiDBClusterServiceRequest;
import cn.ucloud.tidb.models.CreateTiDBClusterServiceResponse;
import cn.ucloud.tidb.models.DeleteTiDBClusterServiceRequest;
import cn.ucloud.tidb.models.DeleteTiDBClusterServiceResponse;
import cn.ucloud.tidb.models.GetTiDBClusterServiceRequest;
import cn.ucloud.tidb.models.GetTiDBClusterServiceResponse;
import cn.ucloud.tidb.models.GetTiDBClusterUhostSpecsRequest;
import cn.ucloud.tidb.models.GetTiDBClusterUhostSpecsResponse;
import cn.ucloud.tidb.models.ListTiDBClusterBackupRequest;
import cn.ucloud.tidb.models.ListTiDBClusterBackupResponse;
import cn.ucloud.tidb.models.ListTiDBClusterRestoreRequest;
import cn.ucloud.tidb.models.ListTiDBClusterRestoreResponse;
import cn.ucloud.tidb.models.ListTiDBClusterServiceRequest;
import cn.ucloud.tidb.models.ListTiDBClusterServiceResponse;
import cn.ucloud.tidb.models.ModifyTiDBClusterBinlogRequest;
import cn.ucloud.tidb.models.ModifyTiDBClusterBinlogResponse;
import cn.ucloud.tidb.models.ModifyTiDBClusterNodeRequest;
import cn.ucloud.tidb.models.ModifyTiDBClusterNodeResponse;
import cn.ucloud.tidb.models.ModifyTiDBClusterTiFlashRequest;
import cn.ucloud.tidb.models.ModifyTiDBClusterTiFlashResponse;
import cn.ucloud.tidb.models.ModifyTiDBClusterUhostDiskRequest;
import cn.ucloud.tidb.models.ModifyTiDBClusterUhostDiskResponse;
import cn.ucloud.tidb.models.ModifyTiDBClusterUhostSpecsRequest;
import cn.ucloud.tidb.models.ModifyTiDBClusterUhostSpecsResponse;
import cn.ucloud.tidb.models.StartTiDBClusterBackupRequest;
import cn.ucloud.tidb.models.StartTiDBClusterBackupResponse;
import cn.ucloud.tidb.models.StartTiDBClusterRestoreRequest;
import cn.ucloud.tidb.models.StartTiDBClusterRestoreResponse;
import cn.ucloud.tidb.models.UpgradeTiDBClusterRequest;
import cn.ucloud.tidb.models.UpgradeTiDBClusterResponse;

/** This client is used to call actions of **TiDB** service */
public interface TiDBClientInterface extends Client {

    /**
     * CreateTiDBClusterService - 创建预付费实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateTiDBClusterServiceResponse createTiDBClusterService(
            CreateTiDBClusterServiceRequest request) throws UCloudException;

    /**
     * DeleteTiDBClusterService - 删除预付费实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteTiDBClusterServiceResponse deleteTiDBClusterService(
            DeleteTiDBClusterServiceRequest request) throws UCloudException;

    /**
     * GetTiDBClusterService - 获取预付费实例详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetTiDBClusterServiceResponse getTiDBClusterService(GetTiDBClusterServiceRequest request)
            throws UCloudException;

    /**
     * GetTiDBClusterUhostSpecs - 拉取预付费机器规格信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetTiDBClusterUhostSpecsResponse getTiDBClusterUhostSpecs(
            GetTiDBClusterUhostSpecsRequest request) throws UCloudException;

    /**
     * ListTiDBClusterBackup - 列出按实例备份tidb的备份列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListTiDBClusterBackupResponse listTiDBClusterBackup(ListTiDBClusterBackupRequest request)
            throws UCloudException;

    /**
     * ListTiDBClusterRestore - 列出实例恢复列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListTiDBClusterRestoreResponse listTiDBClusterRestore(
            ListTiDBClusterRestoreRequest request) throws UCloudException;

    /**
     * ListTiDBClusterService - 拉取预付费实例列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListTiDBClusterServiceResponse listTiDBClusterService(
            ListTiDBClusterServiceRequest request) throws UCloudException;

    /**
     * ModifyTiDBClusterBinlog - 开启/关闭 binlog
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyTiDBClusterBinlogResponse modifyTiDBClusterBinlog(
            ModifyTiDBClusterBinlogRequest request) throws UCloudException;

    /**
     * ModifyTiDBClusterNode - 集群扩缩容
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyTiDBClusterNodeResponse modifyTiDBClusterNode(ModifyTiDBClusterNodeRequest request)
            throws UCloudException;

    /**
     * ModifyTiDBClusterTiFlash - 开启/关闭 tiflash
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyTiDBClusterTiFlashResponse modifyTiDBClusterTiFlash(
            ModifyTiDBClusterTiFlashRequest request) throws UCloudException;

    /**
     * ModifyTiDBClusterUhostDisk - 变更集群节点磁盘容量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyTiDBClusterUhostDiskResponse modifyTiDBClusterUhostDisk(
            ModifyTiDBClusterUhostDiskRequest request) throws UCloudException;

    /**
     * ModifyTiDBClusterUhostSpecs - 修改集群主机规格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyTiDBClusterUhostSpecsResponse modifyTiDBClusterUhostSpecs(
            ModifyTiDBClusterUhostSpecsRequest request) throws UCloudException;

    /**
     * StartTiDBClusterBackup - 开始按实例计费的tidb的备份
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartTiDBClusterBackupResponse startTiDBClusterBackup(
            StartTiDBClusterBackupRequest request) throws UCloudException;

    /**
     * StartTiDBClusterRestore - 开始按实例计费tidb的恢复
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartTiDBClusterRestoreResponse startTiDBClusterRestore(
            StartTiDBClusterRestoreRequest request) throws UCloudException;

    /**
     * UpgradeTiDBCluster - 升级预付费tidb集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeTiDBClusterResponse upgradeTiDBCluster(UpgradeTiDBClusterRequest request)
            throws UCloudException;
}
