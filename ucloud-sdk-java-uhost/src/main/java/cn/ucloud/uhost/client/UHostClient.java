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
import cn.ucloud.uhost.models.DescribeAvailableInstanceTypesRequest;
import cn.ucloud.uhost.models.DescribeAvailableInstanceTypesResponse;
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
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CopyCustomImageResponse copyCustomImage(CopyCustomImageRequest request)
            throws UCloudException {
        request.setAction("CopyCustomImage");
        return (CopyCustomImageResponse) this.invoke(request, CopyCustomImageResponse.class);
    }

    /**
     * CreateCustomImage - 创建自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request)
            throws UCloudException {
        request.setAction("CreateCustomImage");
        return (CreateCustomImageResponse) this.invoke(request, CreateCustomImageResponse.class);
    }

    /**
     * CreateIsolationGroup - 创建硬件隔离组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateIsolationGroupResponse createIsolationGroup(CreateIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("CreateIsolationGroup");
        return (CreateIsolationGroupResponse)
                this.invoke(request, CreateIsolationGroupResponse.class);
    }

    /**
     * CreateUHostInstance - 创建云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUHostInstanceResponse createUHostInstance(CreateUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUHostInstance");
        return (CreateUHostInstanceResponse)
                this.invoke(request, CreateUHostInstanceResponse.class);
    }

    /**
     * CreateUHostKeyPair - 创建主机密钥对
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUHostKeyPairResponse createUHostKeyPair(CreateUHostKeyPairRequest request)
            throws UCloudException {
        request.setAction("CreateUHostKeyPair");
        return (CreateUHostKeyPairResponse) this.invoke(request, CreateUHostKeyPairResponse.class);
    }

    /**
     * DeleteIsolationGroup - 删除硬件隔离组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteIsolationGroupResponse deleteIsolationGroup(DeleteIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("DeleteIsolationGroup");
        return (DeleteIsolationGroupResponse)
                this.invoke(request, DeleteIsolationGroupResponse.class);
    }

    /**
     * DeleteUHostKeyPairs - 删除主机密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUHostKeyPairsResponse deleteUHostKeyPairs(DeleteUHostKeyPairsRequest request)
            throws UCloudException {
        request.setAction("DeleteUHostKeyPairs");
        return (DeleteUHostKeyPairsResponse)
                this.invoke(request, DeleteUHostKeyPairsResponse.class);
    }

    /**
     * DescribeAvailableInstanceTypes - 获取某个地域下可售/售罄的所有机型信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypes(
            DescribeAvailableInstanceTypesRequest request) throws UCloudException {
        request.setAction("DescribeAvailableInstanceTypes");
        return (DescribeAvailableInstanceTypesResponse)
                this.invoke(request, DescribeAvailableInstanceTypesResponse.class);
    }

    /**
     * DescribeImage - 获取镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request)
            throws UCloudException {
        request.setAction("DescribeImage");
        return (DescribeImageResponse) this.invoke(request, DescribeImageResponse.class);
    }

    /**
     * DescribeIsolationGroup - 查询硬件隔离组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeIsolationGroupResponse describeIsolationGroup(
            DescribeIsolationGroupRequest request) throws UCloudException {
        request.setAction("DescribeIsolationGroup");
        return (DescribeIsolationGroupResponse)
                this.invoke(request, DescribeIsolationGroupResponse.class);
    }

    /**
     * DescribeUHostInstance - 获取主机信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUHostInstanceResponse describeUHostInstance(DescribeUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostInstance");
        return (DescribeUHostInstanceResponse)
                this.invoke(request, DescribeUHostInstanceResponse.class);
    }

    /**
     * DescribeUHostKeyPairs - 查询主机密钥信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUHostKeyPairsResponse describeUHostKeyPairs(DescribeUHostKeyPairsRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostKeyPairs");
        return (DescribeUHostKeyPairsResponse)
                this.invoke(request, DescribeUHostKeyPairsResponse.class);
    }

    /**
     * DescribeUHostTags - 获取主机业务组列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUHostTagsResponse describeUHostTags(DescribeUHostTagsRequest request)
            throws UCloudException {
        request.setAction("DescribeUHostTags");
        return (DescribeUHostTagsResponse) this.invoke(request, DescribeUHostTagsResponse.class);
    }

    /**
     * GetAttachedDiskUpgradePrice - 获取挂载磁盘的升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetAttachedDiskUpgradePriceResponse getAttachedDiskUpgradePrice(
            GetAttachedDiskUpgradePriceRequest request) throws UCloudException {
        request.setAction("GetAttachedDiskUpgradePrice");
        return (GetAttachedDiskUpgradePriceResponse)
                this.invoke(request, GetAttachedDiskUpgradePriceResponse.class);
    }

    /**
     * GetUHostInstancePrice - 获取主机价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostInstancePriceResponse getUHostInstancePrice(GetUHostInstancePriceRequest request)
            throws UCloudException {
        request.setAction("GetUHostInstancePrice");
        return (GetUHostInstancePriceResponse)
                this.invoke(request, GetUHostInstancePriceResponse.class);
    }

    /**
     * GetUHostInstanceVncInfo - 获取VNC登录信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostInstanceVncInfoResponse getUHostInstanceVncInfo(
            GetUHostInstanceVncInfoRequest request) throws UCloudException {
        request.setAction("GetUHostInstanceVncInfo");
        return (GetUHostInstanceVncInfoResponse)
                this.invoke(request, GetUHostInstanceVncInfoResponse.class);
    }

    /**
     * GetUHostUpgradePrice - 获取主机规格调整差价
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostUpgradePriceResponse getUHostUpgradePrice(GetUHostUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetUHostUpgradePrice");
        return (GetUHostUpgradePriceResponse)
                this.invoke(request, GetUHostUpgradePriceResponse.class);
    }

    /**
     * ImportCustomImage - 导入镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ImportCustomImageResponse importCustomImage(ImportCustomImageRequest request)
            throws UCloudException {
        request.setAction("ImportCustomImage");
        return (ImportCustomImageResponse) this.invoke(request, ImportCustomImageResponse.class);
    }

    /**
     * ImportUHostKeyPairs - 导入密钥对的公钥部分
     *
     * @param request Request object
     * @throws UCloudException Exception
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
     * @param request Request object
     * @throws UCloudException Exception
     */
    public LeaveIsolationGroupResponse leaveIsolationGroup(LeaveIsolationGroupRequest request)
            throws UCloudException {
        request.setAction("LeaveIsolationGroup");
        return (LeaveIsolationGroupResponse)
                this.invoke(request, LeaveIsolationGroupResponse.class);
    }

    /**
     * ModifyUHostIP - 修改云主机内部 IP 地址
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUHostIPResponse modifyUHostIP(ModifyUHostIPRequest request)
            throws UCloudException {
        request.setAction("ModifyUHostIP");
        return (ModifyUHostIPResponse) this.invoke(request, ModifyUHostIPResponse.class);
    }

    /**
     * ModifyUHostInstanceName - 修改主机名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUHostInstanceNameResponse modifyUHostInstanceName(
            ModifyUHostInstanceNameRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceName");
        return (ModifyUHostInstanceNameResponse)
                this.invoke(request, ModifyUHostInstanceNameResponse.class);
    }

    /**
     * ModifyUHostInstanceRemark - 修改主机备注
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUHostInstanceRemarkResponse modifyUHostInstanceRemark(
            ModifyUHostInstanceRemarkRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceRemark");
        return (ModifyUHostInstanceRemarkResponse)
                this.invoke(request, ModifyUHostInstanceRemarkResponse.class);
    }

    /**
     * ModifyUHostInstanceTag - 修改主机业务组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUHostInstanceTagResponse modifyUHostInstanceTag(
            ModifyUHostInstanceTagRequest request) throws UCloudException {
        request.setAction("ModifyUHostInstanceTag");
        return (ModifyUHostInstanceTagResponse)
                this.invoke(request, ModifyUHostInstanceTagResponse.class);
    }

    /**
     * PoweroffUHostInstance - 模拟主机掉电
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffUHostInstanceResponse poweroffUHostInstance(PoweroffUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("PoweroffUHostInstance");
        return (PoweroffUHostInstanceResponse)
                this.invoke(request, PoweroffUHostInstanceResponse.class);
    }

    /**
     * RebootUHostInstance - 重启主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootUHostInstanceResponse rebootUHostInstance(RebootUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("RebootUHostInstance");
        return (RebootUHostInstanceResponse)
                this.invoke(request, RebootUHostInstanceResponse.class);
    }

    /**
     * ReinstallUHostInstance - 重装系统
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallUHostInstanceResponse reinstallUHostInstance(
            ReinstallUHostInstanceRequest request) throws UCloudException {
        request.setAction("ReinstallUHostInstance");
        return (ReinstallUHostInstanceResponse)
                this.invoke(request, ReinstallUHostInstanceResponse.class);
    }

    /**
     * ResetUHostInstancePassword - 重置主机密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetUHostInstancePasswordResponse resetUHostInstancePassword(
            ResetUHostInstancePasswordRequest request) throws UCloudException {
        request.setAction("ResetUHostInstancePassword");
        return (ResetUHostInstancePasswordResponse)
                this.invoke(request, ResetUHostInstancePasswordResponse.class);
    }

    /**
     * ResizeAttachedDisk - 修改挂载的磁盘大小
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeAttachedDiskResponse resizeAttachedDisk(ResizeAttachedDiskRequest request)
            throws UCloudException {
        request.setAction("ResizeAttachedDisk");
        return (ResizeAttachedDiskResponse) this.invoke(request, ResizeAttachedDiskResponse.class);
    }

    /**
     * ResizeUHostInstance - 修改主机规格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUHostInstanceResponse resizeUHostInstance(ResizeUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("ResizeUHostInstance");
        return (ResizeUHostInstanceResponse)
                this.invoke(request, ResizeUHostInstanceResponse.class);
    }

    /**
     * StartUHostInstance - 启动主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartUHostInstanceResponse startUHostInstance(StartUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUHostInstance");
        return (StartUHostInstanceResponse) this.invoke(request, StartUHostInstanceResponse.class);
    }

    /**
     * StopUHostInstance - 关闭主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUHostInstanceResponse stopUHostInstance(StopUHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUHostInstance");
        return (StopUHostInstanceResponse) this.invoke(request, StopUHostInstanceResponse.class);
    }

    /**
     * TerminateCustomImage - 删除自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateCustomImageResponse terminateCustomImage(TerminateCustomImageRequest request)
            throws UCloudException {
        request.setAction("TerminateCustomImage");
        return (TerminateCustomImageResponse)
                this.invoke(request, TerminateCustomImageResponse.class);
    }

    /**
     * TerminateUHostInstance - 删除云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
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
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeToArkUHostInstanceResponse upgradeToArkUHostInstance(
            UpgradeToArkUHostInstanceRequest request) throws UCloudException {
        request.setAction("UpgradeToArkUHostInstance");
        return (UpgradeToArkUHostInstanceResponse)
                this.invoke(request, UpgradeToArkUHostInstanceResponse.class);
    }
}
