/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udisk.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
        
        
        
import cn.ucloud.udisk.models.DescribeUDiskRequest;
import cn.ucloud.udisk.models.DescribeUDiskResponse;
        
        
        
import cn.ucloud.udisk.models.DescribeUDiskPriceRequest;
import cn.ucloud.udisk.models.DescribeUDiskPriceResponse;
        
        
        
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

/**
 * This client is used to call actions of **UDisk** service
 */
public class UDiskClient extends DefaultClient implements UDiskClientInterface {
    public UDiskClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * AttachUDisk - 挂载云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AttachUDiskResponse attachUDisk(AttachUDiskRequest request) throws UCloudException {
            request.setAction("AttachUDisk");
            return (AttachUDiskResponse) this.invoke(request, AttachUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * CloneUDisk - 克隆云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CloneUDiskResponse cloneUDisk(CloneUDiskRequest request) throws UCloudException {
            request.setAction("CloneUDisk");
            return (CloneUDiskResponse) this.invoke(request, CloneUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * CloneUDiskSnapshot - 克隆快照
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CloneUDiskSnapshotResponse cloneUDiskSnapshot(CloneUDiskSnapshotRequest request) throws UCloudException {
            request.setAction("CloneUDiskSnapshot");
            return (CloneUDiskSnapshotResponse) this.invoke(request, CloneUDiskSnapshotResponse.class);
        }
        
        
        
        
        
        
        /**
         * CloneUDiskUDataArk - 从数据方舟的备份创建UDisk
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CloneUDiskUDataArkResponse cloneUDiskUDataArk(CloneUDiskUDataArkRequest request) throws UCloudException {
            request.setAction("CloneUDiskUDataArk");
            return (CloneUDiskUDataArkResponse) this.invoke(request, CloneUDiskUDataArkResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateAttachUDisk - 创建并挂载云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateAttachUDiskResponse createAttachUDisk(CreateAttachUDiskRequest request) throws UCloudException {
            request.setAction("CreateAttachUDisk");
            return (CreateAttachUDiskResponse) this.invoke(request, CreateAttachUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUDisk - 创建云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUDiskResponse createUDisk(CreateUDiskRequest request) throws UCloudException {
            request.setAction("CreateUDisk");
            return (CreateUDiskResponse) this.invoke(request, CreateUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUDiskSnapshot - 创建快照
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUDiskSnapshotResponse createUDiskSnapshot(CreateUDiskSnapshotRequest request) throws UCloudException {
            request.setAction("CreateUDiskSnapshot");
            return (CreateUDiskSnapshotResponse) this.invoke(request, CreateUDiskSnapshotResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteUDisk - 删除云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteUDiskResponse deleteUDisk(DeleteUDiskRequest request) throws UCloudException {
            request.setAction("DeleteUDisk");
            return (DeleteUDiskResponse) this.invoke(request, DeleteUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteUDiskSnapshot - 删除快照
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteUDiskSnapshotResponse deleteUDiskSnapshot(DeleteUDiskSnapshotRequest request) throws UCloudException {
            request.setAction("DeleteUDiskSnapshot");
            return (DeleteUDiskSnapshotResponse) this.invoke(request, DeleteUDiskSnapshotResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeRecycleUDisk - 【已废弃】拉取回收站中云硬盘列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeRecycleUDiskResponse describeRecycleUDisk(DescribeRecycleUDiskRequest request) throws UCloudException {
            request.setAction("DescribeRecycleUDisk");
            return (DescribeRecycleUDiskResponse) this.invoke(request, DescribeRecycleUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUDisk - 获取云硬盘列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUDiskResponse describeUDisk(DescribeUDiskRequest request) throws UCloudException {
            request.setAction("DescribeUDisk");
            return (DescribeUDiskResponse) this.invoke(request, DescribeUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUDiskPrice - 获取云硬盘价格
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUDiskPriceResponse describeUDiskPrice(DescribeUDiskPriceRequest request) throws UCloudException {
            request.setAction("DescribeUDiskPrice");
            return (DescribeUDiskPriceResponse) this.invoke(request, DescribeUDiskPriceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUDiskSnapshot - 获取快照列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUDiskSnapshotResponse describeUDiskSnapshot(DescribeUDiskSnapshotRequest request) throws UCloudException {
            request.setAction("DescribeUDiskSnapshot");
            return (DescribeUDiskSnapshotResponse) this.invoke(request, DescribeUDiskSnapshotResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUDiskUpgradePrice - 获取云硬盘升级价格
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUDiskUpgradePriceResponse describeUDiskUpgradePrice(DescribeUDiskUpgradePriceRequest request) throws UCloudException {
            request.setAction("DescribeUDiskUpgradePrice");
            return (DescribeUDiskUpgradePriceResponse) this.invoke(request, DescribeUDiskUpgradePriceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DetachUDisk - 卸载云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DetachUDiskResponse detachUDisk(DetachUDiskRequest request) throws UCloudException {
            request.setAction("DetachUDisk");
            return (DetachUDiskResponse) this.invoke(request, DetachUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * RecoverUDisk - 【已废弃】恢复云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RecoverUDiskResponse recoverUDisk(RecoverUDiskRequest request) throws UCloudException {
            request.setAction("RecoverUDisk");
            return (RecoverUDiskResponse) this.invoke(request, RecoverUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * RenameUDisk - 重命名云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RenameUDiskResponse renameUDisk(RenameUDiskRequest request) throws UCloudException {
            request.setAction("RenameUDisk");
            return (RenameUDiskResponse) this.invoke(request, RenameUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * ResizeUDisk - 调整云硬盘
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ResizeUDiskResponse resizeUDisk(ResizeUDiskRequest request) throws UCloudException {
            request.setAction("ResizeUDisk");
            return (ResizeUDiskResponse) this.invoke(request, ResizeUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * RestoreUDisk - 从备份恢复数据至UDisk
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RestoreUDiskResponse restoreUDisk(RestoreUDiskRequest request) throws UCloudException {
            request.setAction("RestoreUDisk");
            return (RestoreUDiskResponse) this.invoke(request, RestoreUDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * SetUDiskUDataArkMode - 设置UDisk数据方舟的状态
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public SetUDiskUDataArkModeResponse setUDiskUDataArkMode(SetUDiskUDataArkModeRequest request) throws UCloudException {
            request.setAction("SetUDiskUDataArkMode");
            return (SetUDiskUDataArkModeResponse) this.invoke(request, SetUDiskUDataArkModeResponse.class);
        }
}
