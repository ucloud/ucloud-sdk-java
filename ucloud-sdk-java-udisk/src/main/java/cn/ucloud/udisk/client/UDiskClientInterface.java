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
package cn.ucloud.udisk.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.udisk.models.AttachUDiskRequest;
import cn.ucloud.udisk.models.AttachUDiskResponse;
import cn.ucloud.udisk.models.CloneUDiskRequest;
import cn.ucloud.udisk.models.CloneUDiskResponse;
import cn.ucloud.udisk.models.CloneUDiskSnapshotRequest;
import cn.ucloud.udisk.models.CloneUDiskSnapshotResponse;
import cn.ucloud.udisk.models.CloneUDiskUDataArkRequest;
import cn.ucloud.udisk.models.CloneUDiskUDataArkResponse;
import cn.ucloud.udisk.models.CreateAttachUDiskRequest;
import cn.ucloud.udisk.models.CreateAttachUDiskResponse;
import cn.ucloud.udisk.models.CreateUDiskRequest;
import cn.ucloud.udisk.models.CreateUDiskResponse;
import cn.ucloud.udisk.models.CreateUDiskSnapshotRequest;
import cn.ucloud.udisk.models.CreateUDiskSnapshotResponse;
import cn.ucloud.udisk.models.DeleteUDiskRequest;
import cn.ucloud.udisk.models.DeleteUDiskResponse;
import cn.ucloud.udisk.models.DeleteUDiskSnapshotRequest;
import cn.ucloud.udisk.models.DeleteUDiskSnapshotResponse;
import cn.ucloud.udisk.models.DescribeRecycleUDiskRequest;
import cn.ucloud.udisk.models.DescribeRecycleUDiskResponse;
import cn.ucloud.udisk.models.DescribeUDiskPriceRequest;
import cn.ucloud.udisk.models.DescribeUDiskPriceResponse;
import cn.ucloud.udisk.models.DescribeUDiskRequest;
import cn.ucloud.udisk.models.DescribeUDiskResponse;
import cn.ucloud.udisk.models.DescribeUDiskSnapshotRequest;
import cn.ucloud.udisk.models.DescribeUDiskSnapshotResponse;
import cn.ucloud.udisk.models.DescribeUDiskUpgradePriceRequest;
import cn.ucloud.udisk.models.DescribeUDiskUpgradePriceResponse;
import cn.ucloud.udisk.models.DetachUDiskRequest;
import cn.ucloud.udisk.models.DetachUDiskResponse;
import cn.ucloud.udisk.models.RecoverUDiskRequest;
import cn.ucloud.udisk.models.RecoverUDiskResponse;
import cn.ucloud.udisk.models.RenameUDiskRequest;
import cn.ucloud.udisk.models.RenameUDiskResponse;
import cn.ucloud.udisk.models.ResizeUDiskRequest;
import cn.ucloud.udisk.models.ResizeUDiskResponse;
import cn.ucloud.udisk.models.RestoreUDiskRequest;
import cn.ucloud.udisk.models.RestoreUDiskResponse;
import cn.ucloud.udisk.models.SetUDiskUDataArkModeRequest;
import cn.ucloud.udisk.models.SetUDiskUDataArkModeResponse;

/** This client is used to call actions of **UDisk** service */
public interface UDiskClientInterface extends Client {

    /**
     * AttachUDisk - 挂载云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    AttachUDiskResponse attachUDisk(AttachUDiskRequest request) throws UCloudException;

    /**
     * CloneUDisk - 克隆云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CloneUDiskResponse cloneUDisk(CloneUDiskRequest request) throws UCloudException;

    /**
     * CloneUDiskSnapshot - 克隆快照
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CloneUDiskSnapshotResponse cloneUDiskSnapshot(CloneUDiskSnapshotRequest request)
            throws UCloudException;

    /**
     * CloneUDiskUDataArk - 从数据方舟的备份创建UDisk
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CloneUDiskUDataArkResponse cloneUDiskUDataArk(CloneUDiskUDataArkRequest request)
            throws UCloudException;

    /**
     * CreateAttachUDisk - 创建并挂载云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateAttachUDiskResponse createAttachUDisk(CreateAttachUDiskRequest request)
            throws UCloudException;

    /**
     * CreateUDisk - 创建云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateUDiskResponse createUDisk(CreateUDiskRequest request) throws UCloudException;

    /**
     * CreateUDiskSnapshot - 创建快照
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateUDiskSnapshotResponse createUDiskSnapshot(CreateUDiskSnapshotRequest request)
            throws UCloudException;

    /**
     * DeleteUDisk - 删除云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DeleteUDiskResponse deleteUDisk(DeleteUDiskRequest request) throws UCloudException;

    /**
     * DeleteUDiskSnapshot - 删除快照
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DeleteUDiskSnapshotResponse deleteUDiskSnapshot(DeleteUDiskSnapshotRequest request)
            throws UCloudException;

    /**
     * DescribeRecycleUDisk - 【已废弃】拉取回收站中云硬盘列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeRecycleUDiskResponse describeRecycleUDisk(DescribeRecycleUDiskRequest request)
            throws UCloudException;

    /**
     * DescribeUDisk - 获取云硬盘列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUDiskResponse describeUDisk(DescribeUDiskRequest request) throws UCloudException;

    /**
     * DescribeUDiskPrice - 获取云硬盘价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUDiskPriceResponse describeUDiskPrice(DescribeUDiskPriceRequest request)
            throws UCloudException;

    /**
     * DescribeUDiskSnapshot - 获取快照列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUDiskSnapshotResponse describeUDiskSnapshot(DescribeUDiskSnapshotRequest request)
            throws UCloudException;

    /**
     * DescribeUDiskUpgradePrice - 获取云硬盘升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUDiskUpgradePriceResponse describeUDiskUpgradePrice(
            DescribeUDiskUpgradePriceRequest request) throws UCloudException;

    /**
     * DetachUDisk - 卸载云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DetachUDiskResponse detachUDisk(DetachUDiskRequest request) throws UCloudException;

    /**
     * RecoverUDisk - 【已废弃】恢复云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    RecoverUDiskResponse recoverUDisk(RecoverUDiskRequest request) throws UCloudException;

    /**
     * RenameUDisk - 重命名云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    RenameUDiskResponse renameUDisk(RenameUDiskRequest request) throws UCloudException;

    /**
     * ResizeUDisk - 调整云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ResizeUDiskResponse resizeUDisk(ResizeUDiskRequest request) throws UCloudException;

    /**
     * RestoreUDisk - 从备份恢复数据至UDisk
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    RestoreUDiskResponse restoreUDisk(RestoreUDiskRequest request) throws UCloudException;

    /**
     * SetUDiskUDataArkMode - 设置UDisk数据方舟的状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    SetUDiskUDataArkModeResponse setUDiskUDataArkMode(SetUDiskUDataArkModeRequest request)
            throws UCloudException;
}
