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
package cn.ucloud.uphost.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.uphost.models.CreatePHostRequest;
import cn.ucloud.uphost.models.CreatePHostResponse;
        
        
        
import cn.ucloud.uphost.models.CreatePHostImageRequest;
import cn.ucloud.uphost.models.CreatePHostImageResponse;
        
        
        
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeRequest;
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeResponse;
        
        
        
import cn.ucloud.uphost.models.DescribePHostRequest;
import cn.ucloud.uphost.models.DescribePHostResponse;
        
        
        
import cn.ucloud.uphost.models.DescribePHostImageRequest;
import cn.ucloud.uphost.models.DescribePHostImageResponse;
        
        
        
import cn.ucloud.uphost.models.DescribePHostMachineTypeRequest;
import cn.ucloud.uphost.models.DescribePHostMachineTypeResponse;
        
        
        
import cn.ucloud.uphost.models.DescribePHostTagsRequest;
import cn.ucloud.uphost.models.DescribePHostTagsResponse;
        
        
        
import cn.ucloud.uphost.models.GetPHostDiskUpgradePriceRequest;
import cn.ucloud.uphost.models.GetPHostDiskUpgradePriceResponse;
        
        
        
import cn.ucloud.uphost.models.GetPHostPriceRequest;
import cn.ucloud.uphost.models.GetPHostPriceResponse;
        
        
        
import cn.ucloud.uphost.models.ModifyPHostImageInfoRequest;
import cn.ucloud.uphost.models.ModifyPHostImageInfoResponse;
        
        
        
import cn.ucloud.uphost.models.ModifyPHostInfoRequest;
import cn.ucloud.uphost.models.ModifyPHostInfoResponse;
        
        
        
import cn.ucloud.uphost.models.PoweroffPHostRequest;
import cn.ucloud.uphost.models.PoweroffPHostResponse;
        
        
        
import cn.ucloud.uphost.models.RebootPHostRequest;
import cn.ucloud.uphost.models.RebootPHostResponse;
        
        
        
import cn.ucloud.uphost.models.ReinstallPHostRequest;
import cn.ucloud.uphost.models.ReinstallPHostResponse;
        
        
        
import cn.ucloud.uphost.models.ResetPHostPasswordRequest;
import cn.ucloud.uphost.models.ResetPHostPasswordResponse;
        
        
        
import cn.ucloud.uphost.models.ResizePHostAttachedDiskRequest;
import cn.ucloud.uphost.models.ResizePHostAttachedDiskResponse;
        
        
        
import cn.ucloud.uphost.models.StartPHostRequest;
import cn.ucloud.uphost.models.StartPHostResponse;
        
        
        
import cn.ucloud.uphost.models.StopPHostRequest;
import cn.ucloud.uphost.models.StopPHostResponse;
        
        
        
import cn.ucloud.uphost.models.TerminatePHostRequest;
import cn.ucloud.uphost.models.TerminatePHostResponse;
        
        
        
import cn.ucloud.uphost.models.TerminatePHostImageRequest;
import cn.ucloud.uphost.models.TerminatePHostImageResponse;

/**
 * This client is used to call actions of **UPHost** service
 */
public class UPHostClient extends DefaultClient implements UPHostClientInterface {
    public UPHostClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * CreatePHost - 创建物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreatePHostResponse createPHost(CreatePHostRequest request) throws UCloudException {
            request.setAction("CreatePHost");
            return (CreatePHostResponse) this.invoke(request, CreatePHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreatePHostImage - 创建裸金属2.0用户自定义镜像
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreatePHostImageResponse createPHostImage(CreatePHostImageRequest request) throws UCloudException {
            request.setAction("CreatePHostImage");
            return (CreatePHostImageResponse) this.invoke(request, CreatePHostImageResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeBaremetalMachineType - 获取裸金属机型的详细信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeBaremetalMachineTypeResponse describeBaremetalMachineType(DescribeBaremetalMachineTypeRequest request) throws UCloudException {
            request.setAction("DescribeBaremetalMachineType");
            return (DescribeBaremetalMachineTypeResponse) this.invoke(request, DescribeBaremetalMachineTypeResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribePHost - 获取物理机信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribePHostResponse describePHost(DescribePHostRequest request) throws UCloudException {
            request.setAction("DescribePHost");
            return (DescribePHostResponse) this.invoke(request, DescribePHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribePHostImage - 获取物理机镜像
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribePHostImageResponse describePHostImage(DescribePHostImageRequest request) throws UCloudException {
            request.setAction("DescribePHostImage");
            return (DescribePHostImageResponse) this.invoke(request, DescribePHostImageResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribePHostMachineType - 获取物理云机型信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribePHostMachineTypeResponse describePHostMachineType(DescribePHostMachineTypeRequest request) throws UCloudException {
            request.setAction("DescribePHostMachineType");
            return (DescribePHostMachineTypeResponse) this.invoke(request, DescribePHostMachineTypeResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribePHostTags - 获取物理机业务组
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribePHostTagsResponse describePHostTags(DescribePHostTagsRequest request) throws UCloudException {
            request.setAction("DescribePHostTags");
            return (DescribePHostTagsResponse) this.invoke(request, DescribePHostTagsResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetPHostDiskUpgradePrice - 获取物理云裸金属挂载云盘的升级价格
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetPHostDiskUpgradePriceResponse getPHostDiskUpgradePrice(GetPHostDiskUpgradePriceRequest request) throws UCloudException {
            request.setAction("GetPHostDiskUpgradePrice");
            return (GetPHostDiskUpgradePriceResponse) this.invoke(request, GetPHostDiskUpgradePriceResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetPHostPrice - 获取物理机价格
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetPHostPriceResponse getPHostPrice(GetPHostPriceRequest request) throws UCloudException {
            request.setAction("GetPHostPrice");
            return (GetPHostPriceResponse) this.invoke(request, GetPHostPriceResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyPHostImageInfo - 修改物理云自定义镜像信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyPHostImageInfoResponse modifyPHostImageInfo(ModifyPHostImageInfoRequest request) throws UCloudException {
            request.setAction("ModifyPHostImageInfo");
            return (ModifyPHostImageInfoResponse) this.invoke(request, ModifyPHostImageInfoResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyPHostInfo - 更改物理机信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyPHostInfoResponse modifyPHostInfo(ModifyPHostInfoRequest request) throws UCloudException {
            request.setAction("ModifyPHostInfo");
            return (ModifyPHostInfoResponse) this.invoke(request, ModifyPHostInfoResponse.class);
        }
        
        
        
        
        
        
        /**
         * PoweroffPHost - 断电物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public PoweroffPHostResponse poweroffPHost(PoweroffPHostRequest request) throws UCloudException {
            request.setAction("PoweroffPHost");
            return (PoweroffPHostResponse) this.invoke(request, PoweroffPHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * RebootPHost - 重启物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RebootPHostResponse rebootPHost(RebootPHostRequest request) throws UCloudException {
            request.setAction("RebootPHost");
            return (RebootPHostResponse) this.invoke(request, RebootPHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * ReinstallPHost - 重装物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ReinstallPHostResponse reinstallPHost(ReinstallPHostRequest request) throws UCloudException {
            request.setAction("ReinstallPHost");
            return (ReinstallPHostResponse) this.invoke(request, ReinstallPHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * ResetPHostPassword - 重置实例密码
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ResetPHostPasswordResponse resetPHostPassword(ResetPHostPasswordRequest request) throws UCloudException {
            request.setAction("ResetPHostPassword");
            return (ResetPHostPasswordResponse) this.invoke(request, ResetPHostPasswordResponse.class);
        }
        
        
        
        
        
        
        /**
         * ResizePHostAttachedDisk - 修改挂载的磁盘大小
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ResizePHostAttachedDiskResponse resizePHostAttachedDisk(ResizePHostAttachedDiskRequest request) throws UCloudException {
            request.setAction("ResizePHostAttachedDisk");
            return (ResizePHostAttachedDiskResponse) this.invoke(request, ResizePHostAttachedDiskResponse.class);
        }
        
        
        
        
        
        
        /**
         * StartPHost - 启动物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public StartPHostResponse startPHost(StartPHostRequest request) throws UCloudException {
            request.setAction("StartPHost");
            return (StartPHostResponse) this.invoke(request, StartPHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * StopPHost - 关闭物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public StopPHostResponse stopPHost(StopPHostRequest request) throws UCloudException {
            request.setAction("StopPHost");
            return (StopPHostResponse) this.invoke(request, StopPHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * TerminatePHost - 删除物理机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public TerminatePHostResponse terminatePHost(TerminatePHostRequest request) throws UCloudException {
            request.setAction("TerminatePHost");
            return (TerminatePHostResponse) this.invoke(request, TerminatePHostResponse.class);
        }
        
        
        
        
        
        
        /**
         * TerminatePHostImage - 删除裸金属2.0用户自定义镜像
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public TerminatePHostImageResponse terminatePHostImage(TerminatePHostImageRequest request) throws UCloudException {
            request.setAction("TerminatePHostImage");
            return (TerminatePHostImageResponse) this.invoke(request, TerminatePHostImageResponse.class);
        }
}
