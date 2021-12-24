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
package cn.ucloud.uhost.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhost.models.CopyCustomImageRequest;
import cn.ucloud.uhost.models.CopyCustomImageResponse;
import cn.ucloud.uhost.models.CreateCustomImageRequest;
import cn.ucloud.uhost.models.CreateCustomImageResponse;
import cn.ucloud.uhost.models.CreateIsolationGroupRequest;
import cn.ucloud.uhost.models.CreateIsolationGroupResponse;
import cn.ucloud.uhost.models.CreateUHostInstanceRequest;
import cn.ucloud.uhost.models.CreateUHostInstanceResponse;
import cn.ucloud.uhost.models.CreateUHostKeyPairRequest;
import cn.ucloud.uhost.models.CreateUHostKeyPairResponse;
import cn.ucloud.uhost.models.DeleteIsolationGroupRequest;
import cn.ucloud.uhost.models.DeleteIsolationGroupResponse;
import cn.ucloud.uhost.models.DeleteUHostKeyPairsRequest;
import cn.ucloud.uhost.models.DeleteUHostKeyPairsResponse;
import cn.ucloud.uhost.models.DescribeImageRequest;
import cn.ucloud.uhost.models.DescribeImageResponse;
import cn.ucloud.uhost.models.DescribeIsolationGroupRequest;
import cn.ucloud.uhost.models.DescribeIsolationGroupResponse;
import cn.ucloud.uhost.models.DescribeUHostInstanceRequest;
import cn.ucloud.uhost.models.DescribeUHostInstanceResponse;
import cn.ucloud.uhost.models.DescribeUHostKeyPairsRequest;
import cn.ucloud.uhost.models.DescribeUHostKeyPairsResponse;
import cn.ucloud.uhost.models.DescribeUHostTagsRequest;
import cn.ucloud.uhost.models.DescribeUHostTagsResponse;
import cn.ucloud.uhost.models.GetAttachedDiskUpgradePriceRequest;
import cn.ucloud.uhost.models.GetAttachedDiskUpgradePriceResponse;
import cn.ucloud.uhost.models.GetUHostInstancePriceRequest;
import cn.ucloud.uhost.models.GetUHostInstancePriceResponse;
import cn.ucloud.uhost.models.GetUHostInstanceVncInfoRequest;
import cn.ucloud.uhost.models.GetUHostInstanceVncInfoResponse;
import cn.ucloud.uhost.models.GetUHostUpgradePriceRequest;
import cn.ucloud.uhost.models.GetUHostUpgradePriceResponse;
import cn.ucloud.uhost.models.ImportCustomImageRequest;
import cn.ucloud.uhost.models.ImportCustomImageResponse;
import cn.ucloud.uhost.models.ImportUHostKeyPairsRequest;
import cn.ucloud.uhost.models.ImportUHostKeyPairsResponse;
import cn.ucloud.uhost.models.LeaveIsolationGroupRequest;
import cn.ucloud.uhost.models.LeaveIsolationGroupResponse;
import cn.ucloud.uhost.models.ModifyUHostIPRequest;
import cn.ucloud.uhost.models.ModifyUHostIPResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceNameRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceNameResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceRemarkRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceRemarkResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceTagRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceTagResponse;
import cn.ucloud.uhost.models.PoweroffUHostInstanceRequest;
import cn.ucloud.uhost.models.PoweroffUHostInstanceResponse;
import cn.ucloud.uhost.models.RebootUHostInstanceRequest;
import cn.ucloud.uhost.models.RebootUHostInstanceResponse;
import cn.ucloud.uhost.models.ReinstallUHostInstanceRequest;
import cn.ucloud.uhost.models.ReinstallUHostInstanceResponse;
import cn.ucloud.uhost.models.ResetUHostInstancePasswordRequest;
import cn.ucloud.uhost.models.ResetUHostInstancePasswordResponse;
import cn.ucloud.uhost.models.ResizeAttachedDiskRequest;
import cn.ucloud.uhost.models.ResizeAttachedDiskResponse;
import cn.ucloud.uhost.models.ResizeUHostInstanceRequest;
import cn.ucloud.uhost.models.ResizeUHostInstanceResponse;
import cn.ucloud.uhost.models.StartUHostInstanceRequest;
import cn.ucloud.uhost.models.StartUHostInstanceResponse;
import cn.ucloud.uhost.models.StopUHostInstanceRequest;
import cn.ucloud.uhost.models.StopUHostInstanceResponse;
import cn.ucloud.uhost.models.TerminateCustomImageRequest;
import cn.ucloud.uhost.models.TerminateCustomImageResponse;
import cn.ucloud.uhost.models.TerminateUHostInstanceRequest;
import cn.ucloud.uhost.models.TerminateUHostInstanceResponse;
import cn.ucloud.uhost.models.UpgradeToArkUHostInstanceRequest;
import cn.ucloud.uhost.models.UpgradeToArkUHostInstanceResponse;

/** This client is used to call actions of **UHost** service */
public class UHostClient extends DefaultClient implements UHostClientInterface {
    public UHostClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CopyCustomImage - 复制自制镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CopyCustomImage
     */
    public CopyCustomImageResponse copyCustomImage(CopyCustomImageRequest request)
            throws UCloudException {
        request.setAction("CopyCustomImage");
        return (CopyCustomImageResponse) this.invoke(request, CopyCustomImageResponse.class);
    }

    /**
     * CreateCustomImage - 从指定UHost实例，生成自定义镜像。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateCustomImage
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request)
            throws UCloudException {
        request.setAction("CreateCustomImage");
        return (CreateCustomImageResponse) this.invoke(request, CreateCustomImageResponse.class);
    }

    /**
     * CreateIsolationGroup - 创建硬件隔离组，组内机器严格隔离在不同宿主机上。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateIsolationGroup
     */
    public CreateIsolationGroupResponse createIsolationGroup(CreateIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("CreateIsolationGroup");
        return (CreateIsolationGroupResponse)
                this.invoke(request, CreateIsolationGroupResponse.class);
    }

    /**
     * CreateUHostInstance - 创建UHost实例。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateUHostInstance
     */
    public CreateUHostInstanceResponse createUHostInstance(CreateUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUHostInstance");
        return (CreateUHostInstanceResponse)
                this.invoke(request, CreateUHostInstanceResponse.class);
    }

    /**
     * CreateUHostKeyPair - 创建主机密钥对信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateUHostKeyPair
     */
    public CreateUHostKeyPairResponse createUHostKeyPair(CreateUHostKeyPairRequest request)
            throws UCloudException {
        request.setAction("CreateUHostKeyPair");
        return (CreateUHostKeyPairResponse) this.invoke(request, CreateUHostKeyPairResponse.class);
    }

    /**
     * DeleteIsolationGroup - 删除硬件隔离组。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DeleteIsolationGroup
     */
    public DeleteIsolationGroupResponse deleteIsolationGroup(DeleteIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("DeleteIsolationGroup");
        return (DeleteIsolationGroupResponse)
                this.invoke(request, DeleteIsolationGroupResponse.class);
    }

    /**
     * DeleteUHostKeyPairs - 删除一对或者多对密钥对。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DeleteUHostKeyPairs
     */
    public DeleteUHostKeyPairsResponse deleteUHostKeyPairs(DeleteUHostKeyPairsRequest request)
            throws UCloudException {
        request.setAction("DeleteUHostKeyPairs");
        return (DeleteUHostKeyPairsResponse)
                this.invoke(request, DeleteUHostKeyPairsResponse.class);
    }

    /**
     * DescribeImage - 获取指定数据中心镜像列表，用户可通过指定操作系统类型，镜像Id进行过滤。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeImage
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request)
            throws UCloudException {
        request.setAction("DescribeImage");
        return (DescribeImageResponse) this.invoke(request, DescribeImageResponse.class);
    }

    /**
     * DescribeIsolationGroup - 查询硬件隔离组列表。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeIsolationGroup
     */
    public DescribeIsolationGroupResponse describeIsolationGroup(
            DescribeIsolationGroupRequest request) throws UCloudException {
        request.setAction("DescribeIsolationGroup");
        return (DescribeIsolationGroupResponse)
                this.invoke(request, DescribeIsolationGroupResponse.class);
    }

    /**
     * DescribeUHostInstance - 获取主机或主机列表信息，并可根据数据中心，主机ID等参数进行过滤。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostInstance
     */
    public DescribeUHostInstanceResponse describeUHostInstance(DescribeUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostInstance");
        return (DescribeUHostInstanceResponse)
                this.invoke(request, DescribeUHostInstanceResponse.class);
    }

    /**
     * DescribeUHostKeyPairs - 查询一个或多个密钥对。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostKeyPairs
     */
    public DescribeUHostKeyPairsResponse describeUHostKeyPairs(DescribeUHostKeyPairsRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostKeyPairs");
        return (DescribeUHostKeyPairsResponse)
                this.invoke(request, DescribeUHostKeyPairsResponse.class);
    }

    /**
     * DescribeUHostTags - 获取指定数据中心的业务组列表。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostTags
     */
    public DescribeUHostTagsResponse describeUHostTags(DescribeUHostTagsRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostTags");
        return (DescribeUHostTagsResponse) this.invoke(request, DescribeUHostTagsResponse.class);
    }

    /**
     * GetAttachedDiskUpgradePrice - 获取挂载磁盘的升级价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetAttachedDiskUpgradePrice
     */
    public GetAttachedDiskUpgradePriceResponse getAttachedDiskUpgradePrice(
            GetAttachedDiskUpgradePriceRequest request) throws UCloudException {
        request.setAction("GetAttachedDiskUpgradePrice");
        return (GetAttachedDiskUpgradePriceResponse)
                this.invoke(request, GetAttachedDiskUpgradePriceResponse.class);
    }

    /**
     * GetUHostInstancePrice - 根据UHost实例配置，获取UHost实例的价格。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostInstancePrice
     */
    public GetUHostInstancePriceResponse getUHostInstancePrice(GetUHostInstancePriceRequest request)
            throws UCloudException {
        request.setAction("GetUHostInstancePrice");
        return (GetUHostInstancePriceResponse)
                this.invoke(request, GetUHostInstancePriceResponse.class);
    }

    /**
     * GetUHostInstanceVncInfo - 获取指定UHost实例的管理VNC配置详细信息。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostInstanceVncInfo
     */
    public GetUHostInstanceVncInfoResponse getUHostInstanceVncInfo(
            GetUHostInstanceVncInfoRequest request) throws UCloudException {
        request.setAction("GetUHostInstanceVncInfo");
        return (GetUHostInstanceVncInfoResponse)
                this.invoke(request, GetUHostInstanceVncInfoResponse.class);
    }

    /**
     * GetUHostUpgradePrice - 获取UHost实例升级配置的价格。可选配置范围请参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostUpgradePrice
     */
    public GetUHostUpgradePriceResponse getUHostUpgradePrice(GetUHostUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetUHostUpgradePrice");
        return (GetUHostUpgradePriceResponse)
                this.invoke(request, GetUHostUpgradePriceResponse.class);
    }

    /**
     * ImportCustomImage - 把UFile的镜像文件导入到UHost，生成自定义镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ImportCustomImage
     */
    public ImportCustomImageResponse importCustomImage(ImportCustomImageRequest request)
            throws UCloudException {
        request.setAction("ImportCustomImage");
        return (ImportCustomImageResponse) this.invoke(request, ImportCustomImageResponse.class);
    }

    /**
     * ImportUHostKeyPairs - 导入密钥对后，仅保管公钥部分，需自行妥善保存密钥对的私钥部分。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ImportUHostKeyPairs
     */
    public ImportUHostKeyPairsResponse importUHostKeyPairs(ImportUHostKeyPairsRequest request)
            throws UCloudException {
        request.setAction("ImportUHostKeyPairs");
        return (ImportUHostKeyPairsResponse)
                this.invoke(request, ImportUHostKeyPairsResponse.class);
    }

    /**
     * LeaveIsolationGroup - 移除硬件隔离组中的主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/LeaveIsolationGroup
     */
    public LeaveIsolationGroupResponse leaveIsolationGroup(LeaveIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("LeaveIsolationGroup");
        return (LeaveIsolationGroupResponse)
                this.invoke(request, LeaveIsolationGroupResponse.class);
    }

    /**
     * ModifyUHostIP - 修改云主机内网 IP 地址
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostIP
     */
    public ModifyUHostIPResponse modifyUHostIP(ModifyUHostIPRequest request)
            throws UCloudException {
        request.setAction("ModifyUHostIP");
        return (ModifyUHostIPResponse) this.invoke(request, ModifyUHostIPResponse.class);
    }

    /**
     * ModifyUHostInstanceName - 修改指定UHost实例名称，需要给出数据中心，UHostId，及新的实例名称。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceName
     */
    public ModifyUHostInstanceNameResponse modifyUHostInstanceName(
            ModifyUHostInstanceNameRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceName");
        return (ModifyUHostInstanceNameResponse)
                this.invoke(request, ModifyUHostInstanceNameResponse.class);
    }

    /**
     * ModifyUHostInstanceRemark - 修改指定UHost实例备注信息。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceRemark
     */
    public ModifyUHostInstanceRemarkResponse modifyUHostInstanceRemark(
            ModifyUHostInstanceRemarkRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceRemark");
        return (ModifyUHostInstanceRemarkResponse)
                this.invoke(request, ModifyUHostInstanceRemarkResponse.class);
    }

    /**
     * ModifyUHostInstanceTag - 修改指定UHost实例业务组标识。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceTag
     */
    public ModifyUHostInstanceTagResponse modifyUHostInstanceTag(
            ModifyUHostInstanceTagRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceTag");
        return (ModifyUHostInstanceTagResponse)
                this.invoke(request, ModifyUHostInstanceTagResponse.class);
    }

    /**
     * PoweroffUHostInstance - 直接关闭UHost实例电源，无需等待实例正常关闭。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/PoweroffUHostInstance
     */
    public PoweroffUHostInstanceResponse poweroffUHostInstance(PoweroffUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("PoweroffUHostInstance");
        return (PoweroffUHostInstanceResponse)
                this.invoke(request, PoweroffUHostInstanceResponse.class);
    }

    /**
     * RebootUHostInstance - 重新启动UHost实例，需要指定数据中心及UHostID两个参数的值。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/RebootUHostInstance
     */
    public RebootUHostInstanceResponse rebootUHostInstance(RebootUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("RebootUHostInstance");
        return (RebootUHostInstanceResponse)
                this.invoke(request, RebootUHostInstanceResponse.class);
    }

    /**
     * ReinstallUHostInstance - 重新安装指定UHost实例的操作系统
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ReinstallUHostInstance
     */
    public ReinstallUHostInstanceResponse reinstallUHostInstance(
            ReinstallUHostInstanceRequest request) throws UCloudException {
        request.setAction("ReinstallUHostInstance");
        return (ReinstallUHostInstanceResponse)
                this.invoke(request, ReinstallUHostInstanceResponse.class);
    }

    /**
     * ResetUHostInstancePassword - 重置UHost实例的管理员密码。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResetUHostInstancePassword
     */
    public ResetUHostInstancePasswordResponse resetUHostInstancePassword(
            ResetUHostInstancePasswordRequest request) throws UCloudException {
        request.setAction("ResetUHostInstancePassword");
        return (ResetUHostInstancePasswordResponse)
                this.invoke(request, ResetUHostInstancePasswordResponse.class);
    }

    /**
     * ResizeAttachedDisk - 修改挂载的磁盘大小，包含系统盘和数据盘
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResizeAttachedDisk
     */
    public ResizeAttachedDiskResponse resizeAttachedDisk(ResizeAttachedDiskRequest request)
            throws UCloudException {
        request.setAction("ResizeAttachedDisk");
        return (ResizeAttachedDiskResponse) this.invoke(request, ResizeAttachedDiskResponse.class);
    }

    /**
     * ResizeUHostInstance -
     * 修改指定UHost实例的资源配置，如CPU核心数，内存容量大小，网络增强等。可选配置范围请参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResizeUHostInstance
     */
    public ResizeUHostInstanceResponse resizeUHostInstance(ResizeUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("ResizeUHostInstance");
        return (ResizeUHostInstanceResponse)
                this.invoke(request, ResizeUHostInstanceResponse.class);
    }

    /**
     * StartUHostInstance - 启动处于关闭状态的UHost实例，需要指定数据中心及UHostID两个参数的值。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/StartUHostInstance
     */
    public StartUHostInstanceResponse startUHostInstance(StartUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUHostInstance");
        return (StartUHostInstanceResponse) this.invoke(request, StartUHostInstanceResponse.class);
    }

    /**
     * StopUHostInstance - 指停止处于运行状态的UHost实例，需指定数据中心及UhostID。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/StopUHostInstance
     */
    public StopUHostInstanceResponse stopUHostInstance(StopUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUHostInstance");
        return (StopUHostInstanceResponse) this.invoke(request, StopUHostInstanceResponse.class);
    }

    /**
     * TerminateCustomImage - 删除用户自定义镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/TerminateCustomImage
     */
    public TerminateCustomImageResponse terminateCustomImage(TerminateCustomImageRequest request)
            throws UCloudException {
        request.setAction("TerminateCustomImage");
        return (TerminateCustomImageResponse)
                this.invoke(request, TerminateCustomImageResponse.class);
    }

    /**
     * TerminateUHostInstance - 删除指定数据中心的UHost实例。
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/TerminateUHostInstance
     */
    public TerminateUHostInstanceResponse terminateUHostInstance(
            TerminateUHostInstanceRequest request) throws UCloudException {
        request.setAction("TerminateUHostInstance");
        return (TerminateUHostInstanceResponse)
                this.invoke(request, TerminateUHostInstanceResponse.class);
    }

    /**
     * UpgradeToArkUHostInstance - 普通升级为方舟机型
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/UpgradeToArkUHostInstance
     */
    public UpgradeToArkUHostInstanceResponse upgradeToArkUHostInstance(
            UpgradeToArkUHostInstanceRequest request) throws UCloudException {
        request.setAction("UpgradeToArkUHostInstance");
        return (UpgradeToArkUHostInstanceResponse)
                this.invoke(request, UpgradeToArkUHostInstanceResponse.class);
    }
}
