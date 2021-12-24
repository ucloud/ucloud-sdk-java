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
package cn.ucloud.uphost.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uphost.models.CreatePHostImageRequest;
import cn.ucloud.uphost.models.CreatePHostImageResponse;
import cn.ucloud.uphost.models.CreatePHostRequest;
import cn.ucloud.uphost.models.CreatePHostResponse;
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeRequest;
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeResponse;
import cn.ucloud.uphost.models.DescribePHostImageRequest;
import cn.ucloud.uphost.models.DescribePHostImageResponse;
import cn.ucloud.uphost.models.DescribePHostMachineTypeRequest;
import cn.ucloud.uphost.models.DescribePHostMachineTypeResponse;
import cn.ucloud.uphost.models.DescribePHostRequest;
import cn.ucloud.uphost.models.DescribePHostResponse;
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
import cn.ucloud.uphost.models.TerminatePHostImageRequest;
import cn.ucloud.uphost.models.TerminatePHostImageResponse;
import cn.ucloud.uphost.models.TerminatePHostRequest;
import cn.ucloud.uphost.models.TerminatePHostResponse;

/** This client is used to call actions of **UPHost** service */
public class UPHostClient extends DefaultClient implements UPHostClientInterface {
    public UPHostClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreatePHost - 指定数据中心，根据资源使用量创建指定数量的UPHost物理云主机实例。
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/CreatePHost
     */
    public CreatePHostResponse createPHost(CreatePHostRequest request) throws UCloudException {
        request.setAction("CreatePHost");
        return (CreatePHostResponse) this.invoke(request, CreatePHostResponse.class);
    }

    /**
     * CreatePHostImage - 创建裸金属2.0用户自定义镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/CreatePHostImage
     */
    public CreatePHostImageResponse createPHostImage(CreatePHostImageRequest request)
            throws UCloudException {
        request.setAction("CreatePHostImage");
        return (CreatePHostImageResponse) this.invoke(request, CreatePHostImageResponse.class);
    }

    /**
     * DescribeBaremetalMachineType - 获取裸金属机型的详细描述信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/DescribeBaremetalMachineType
     */
    public DescribeBaremetalMachineTypeResponse describeBaremetalMachineType(
            DescribeBaremetalMachineTypeRequest request) throws UCloudException {
        request.setAction("DescribeBaremetalMachineType");
        return (DescribeBaremetalMachineTypeResponse)
                this.invoke(request, DescribeBaremetalMachineTypeResponse.class);
    }

    /**
     * DescribePHost - 获取物理机详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/DescribePHost
     */
    public DescribePHostResponse describePHost(DescribePHostRequest request)
            throws UCloudException {
        request.setAction("DescribePHost");
        return (DescribePHostResponse) this.invoke(request, DescribePHostResponse.class);
    }

    /**
     * DescribePHostImage - 获取物理云主机镜像列表
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/DescribePHostImage
     */
    public DescribePHostImageResponse describePHostImage(DescribePHostImageRequest request)
            throws UCloudException {
        request.setAction("DescribePHostImage");
        return (DescribePHostImageResponse) this.invoke(request, DescribePHostImageResponse.class);
    }

    /**
     * DescribePHostMachineType - 获取物理云机型的详细描述信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/DescribePHostMachineType
     */
    public DescribePHostMachineTypeResponse describePHostMachineType(
            DescribePHostMachineTypeRequest request) throws UCloudException {
        request.setAction("DescribePHostMachineType");
        return (DescribePHostMachineTypeResponse)
                this.invoke(request, DescribePHostMachineTypeResponse.class);
    }

    /**
     * DescribePHostTags - 获取物理机tag列表（业务组）
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/DescribePHostTags
     */
    public DescribePHostTagsResponse describePHostTags(DescribePHostTagsRequest request)
            throws UCloudException {
        request.setAction("DescribePHostTags");
        return (DescribePHostTagsResponse) this.invoke(request, DescribePHostTagsResponse.class);
    }

    /**
     * GetPHostDiskUpgradePrice - 获取物理云裸金属挂载磁盘的升级价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/GetPHostDiskUpgradePrice
     */
    public GetPHostDiskUpgradePriceResponse getPHostDiskUpgradePrice(
            GetPHostDiskUpgradePriceRequest request) throws UCloudException {
        request.setAction("GetPHostDiskUpgradePrice");
        return (GetPHostDiskUpgradePriceResponse)
                this.invoke(request, GetPHostDiskUpgradePriceResponse.class);
    }

    /**
     * GetPHostPrice - 获取物理机价格列表
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/GetPHostPrice
     */
    public GetPHostPriceResponse getPHostPrice(GetPHostPriceRequest request)
            throws UCloudException {
        request.setAction("GetPHostPrice");
        return (GetPHostPriceResponse) this.invoke(request, GetPHostPriceResponse.class);
    }

    /**
     * ModifyPHostImageInfo - 修改自定义镜像名称和备注
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/ModifyPHostImageInfo
     */
    public ModifyPHostImageInfoResponse modifyPHostImageInfo(ModifyPHostImageInfoRequest request)
            throws UCloudException {
        request.setAction("ModifyPHostImageInfo");
        return (ModifyPHostImageInfoResponse)
                this.invoke(request, ModifyPHostImageInfoResponse.class);
    }

    /**
     * ModifyPHostInfo - 更改物理机信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/ModifyPHostInfo
     */
    public ModifyPHostInfoResponse modifyPHostInfo(ModifyPHostInfoRequest request)
            throws UCloudException {
        request.setAction("ModifyPHostInfo");
        return (ModifyPHostInfoResponse) this.invoke(request, ModifyPHostInfoResponse.class);
    }

    /**
     * PoweroffPHost - 断电物理云主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/PoweroffPHost
     */
    public PoweroffPHostResponse poweroffPHost(PoweroffPHostRequest request)
            throws UCloudException {
        request.setAction("PoweroffPHost");
        return (PoweroffPHostResponse) this.invoke(request, PoweroffPHostResponse.class);
    }

    /**
     * RebootPHost - 重启物理机
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/RebootPHost
     */
    public RebootPHostResponse rebootPHost(RebootPHostRequest request) throws UCloudException {
        request.setAction("RebootPHost");
        return (RebootPHostResponse) this.invoke(request, RebootPHostResponse.class);
    }

    /**
     * ReinstallPHost - 重装物理机操作系统
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/ReinstallPHost
     */
    public ReinstallPHostResponse reinstallPHost(ReinstallPHostRequest request)
            throws UCloudException {
        request.setAction("ReinstallPHost");
        return (ReinstallPHostResponse) this.invoke(request, ReinstallPHostResponse.class);
    }

    /**
     * ResetPHostPassword - 重置裸金属实例的管理员密码
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/ResetPHostPassword
     */
    public ResetPHostPasswordResponse resetPHostPassword(ResetPHostPasswordRequest request)
            throws UCloudException {
        request.setAction("ResetPHostPassword");
        return (ResetPHostPasswordResponse) this.invoke(request, ResetPHostPasswordResponse.class);
    }

    /**
     * ResizePHostAttachedDisk - 修改裸金属物理云已经挂载的云盘容量大小
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/ResizePHostAttachedDisk
     */
    public ResizePHostAttachedDiskResponse resizePHostAttachedDisk(
            ResizePHostAttachedDiskRequest request) throws UCloudException {
        request.setAction("ResizePHostAttachedDisk");
        return (ResizePHostAttachedDiskResponse)
                this.invoke(request, ResizePHostAttachedDiskResponse.class);
    }

    /**
     * StartPHost - 启动物理机
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/StartPHost
     */
    public StartPHostResponse startPHost(StartPHostRequest request) throws UCloudException {
        request.setAction("StartPHost");
        return (StartPHostResponse) this.invoke(request, StartPHostResponse.class);
    }

    /**
     * StopPHost - 关闭物理机
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/StopPHost
     */
    public StopPHostResponse stopPHost(StopPHostRequest request) throws UCloudException {
        request.setAction("StopPHost");
        return (StopPHostResponse) this.invoke(request, StopPHostResponse.class);
    }

    /**
     * TerminatePHost - 删除物理云主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/TerminatePHost
     */
    public TerminatePHostResponse terminatePHost(TerminatePHostRequest request)
            throws UCloudException {
        request.setAction("TerminatePHost");
        return (TerminatePHostResponse) this.invoke(request, TerminatePHostResponse.class);
    }

    /**
     * TerminatePHostImage - 删除裸金属2.0用户自定义镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uphost-api/TerminatePHostImage
     */
    public TerminatePHostImageResponse terminatePHostImage(TerminatePHostImageRequest request)
            throws UCloudException {
        request.setAction("TerminatePHostImage");
        return (TerminatePHostImageResponse)
                this.invoke(request, TerminatePHostImageResponse.class);
    }
}
