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
package cn.ucloud.ucompshare.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ucompshare.models.AttachCompshareDiskRequest;
import cn.ucloud.ucompshare.models.AttachCompshareDiskResponse;
import cn.ucloud.ucompshare.models.AttachUS3Request;
import cn.ucloud.ucompshare.models.AttachUS3Response;
import cn.ucloud.ucompshare.models.CheckCompShareNetOptimizerRequest;
import cn.ucloud.ucompshare.models.CheckCompShareNetOptimizerResponse;
import cn.ucloud.ucompshare.models.CopyCompShareCustomImageRequest;
import cn.ucloud.ucompshare.models.CopyCompShareCustomImageResponse;
import cn.ucloud.ucompshare.models.CreateCompShareCustomImageRequest;
import cn.ucloud.ucompshare.models.CreateCompShareCustomImageResponse;
import cn.ucloud.ucompshare.models.CreateCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.CreateCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.CreateCompShareTeamRelationRequest;
import cn.ucloud.ucompshare.models.CreateCompShareTeamRelationResponse;
import cn.ucloud.ucompshare.models.CreateCompShareTeamRequest;
import cn.ucloud.ucompshare.models.CreateCompShareTeamResponse;
import cn.ucloud.ucompshare.models.DeleteCompShareStopSchedulerRequest;
import cn.ucloud.ucompshare.models.DeleteCompShareStopSchedulerResponse;
import cn.ucloud.ucompshare.models.DeleteCompShareTeamRequest;
import cn.ucloud.ucompshare.models.DeleteCompShareTeamResponse;
import cn.ucloud.ucompshare.models.DeleteCompshareDiskRequest;
import cn.ucloud.ucompshare.models.DeleteCompshareDiskResponse;
import cn.ucloud.ucompshare.models.DescribeAvailableCompShareInstanceTypesRequest;
import cn.ucloud.ucompshare.models.DescribeAvailableCompShareInstanceTypesResponse;
import cn.ucloud.ucompshare.models.DescribeCommunityImagesRequest;
import cn.ucloud.ucompshare.models.DescribeCommunityImagesResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareCustomImagesRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareCustomImagesResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareGpuInventoryRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareGpuInventoryResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareImageShareAccountsRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareImageShareAccountsResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareImageTagsRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareImageTagsResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareImagesRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareImagesResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareMachineTypeFamiliesRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareMachineTypeFamiliesResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareSharingImagesRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareSharingImagesResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareSoftwarePortRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareSoftwarePortResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareSupportZoneRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareSupportZoneResponse;
import cn.ucloud.ucompshare.models.DescribeModelRepositoryModelsRequest;
import cn.ucloud.ucompshare.models.DescribeModelRepositoryModelsResponse;
import cn.ucloud.ucompshare.models.DescribeModelRepositoryTagsRequest;
import cn.ucloud.ucompshare.models.DescribeModelRepositoryTagsResponse;
import cn.ucloud.ucompshare.models.DescribeSelfCommunityImagesRequest;
import cn.ucloud.ucompshare.models.DescribeSelfCommunityImagesResponse;
import cn.ucloud.ucompshare.models.DescribeTeamMemberOrderCountRequest;
import cn.ucloud.ucompshare.models.DescribeTeamMemberOrderCountResponse;
import cn.ucloud.ucompshare.models.DescribeTeamMemberOrderRequest;
import cn.ucloud.ucompshare.models.DescribeTeamMemberOrderResponse;
import cn.ucloud.ucompshare.models.DescribeTeamMemberUnpaidOrderCountRequest;
import cn.ucloud.ucompshare.models.DescribeTeamMemberUnpaidOrderCountResponse;
import cn.ucloud.ucompshare.models.DescribeTeamMemberUnpaidOrderRequest;
import cn.ucloud.ucompshare.models.DescribeTeamMemberUnpaidOrderResponse;
import cn.ucloud.ucompshare.models.DescribeUserCommunityImagesRequest;
import cn.ucloud.ucompshare.models.DescribeUserCommunityImagesResponse;
import cn.ucloud.ucompshare.models.DetachCompshareDiskRequest;
import cn.ucloud.ucompshare.models.DetachCompshareDiskResponse;
import cn.ucloud.ucompshare.models.DownloadTeamOrderRequest;
import cn.ucloud.ucompshare.models.DownloadTeamOrderResponse;
import cn.ucloud.ucompshare.models.GetCompShareAttachedDiskUpgradePriceRequest;
import cn.ucloud.ucompshare.models.GetCompShareAttachedDiskUpgradePriceResponse;
import cn.ucloud.ucompshare.models.GetCompShareImageCreateProgressRequest;
import cn.ucloud.ucompshare.models.GetCompShareImageCreateProgressResponse;
import cn.ucloud.ucompshare.models.GetCompShareInstanceMonitorRequest;
import cn.ucloud.ucompshare.models.GetCompShareInstanceMonitorResponse;
import cn.ucloud.ucompshare.models.GetCompShareInstancePriceRequest;
import cn.ucloud.ucompshare.models.GetCompShareInstancePriceResponse;
import cn.ucloud.ucompshare.models.GetCompShareInstanceUpgradePriceRequest;
import cn.ucloud.ucompshare.models.GetCompShareInstanceUpgradePriceResponse;
import cn.ucloud.ucompshare.models.GetCompShareInstanceUserPriceRequest;
import cn.ucloud.ucompshare.models.GetCompShareInstanceUserPriceResponse;
import cn.ucloud.ucompshare.models.GetCompShareRefundPriceRequest;
import cn.ucloud.ucompshare.models.GetCompShareRefundPriceResponse;
import cn.ucloud.ucompshare.models.GetCompShareTeamInfoRequest;
import cn.ucloud.ucompshare.models.GetCompShareTeamInfoResponse;
import cn.ucloud.ucompshare.models.GetOpenClawModelListRequest;
import cn.ucloud.ucompshare.models.GetOpenClawModelListResponse;
import cn.ucloud.ucompshare.models.GetSoftwareURLRequest;
import cn.ucloud.ucompshare.models.GetSoftwareURLResponse;
import cn.ucloud.ucompshare.models.ListCompShareTeamInviteRequest;
import cn.ucloud.ucompshare.models.ListCompShareTeamInviteResponse;
import cn.ucloud.ucompshare.models.ListCompShareTeamJoinedRequest;
import cn.ucloud.ucompshare.models.ListCompShareTeamJoinedResponse;
import cn.ucloud.ucompshare.models.ListCompShareTeamOperateLogRequest;
import cn.ucloud.ucompshare.models.ListCompShareTeamOperateLogResponse;
import cn.ucloud.ucompshare.models.ListCompShareTeamRequest;
import cn.ucloud.ucompshare.models.ListCompShareTeamResponse;
import cn.ucloud.ucompshare.models.ListMemberProductTypeRequest;
import cn.ucloud.ucompshare.models.ListMemberProductTypeResponse;
import cn.ucloud.ucompshare.models.ModifyCompShareImageShareAccountRequest;
import cn.ucloud.ucompshare.models.ModifyCompShareImageShareAccountResponse;
import cn.ucloud.ucompshare.models.ModifyCompShareInstanceNameRequest;
import cn.ucloud.ucompshare.models.ModifyCompShareInstanceNameResponse;
import cn.ucloud.ucompshare.models.PublishCompShareImageRequest;
import cn.ucloud.ucompshare.models.PublishCompShareImageResponse;
import cn.ucloud.ucompshare.models.RebootCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.RebootCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.ReinstallCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.ReinstallCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.ResetCompShareInstancePasswordRequest;
import cn.ucloud.ucompshare.models.ResetCompShareInstancePasswordResponse;
import cn.ucloud.ucompshare.models.ResizeCompShareDiskRequest;
import cn.ucloud.ucompshare.models.ResizeCompShareDiskResponse;
import cn.ucloud.ucompshare.models.ResizeCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.ResizeCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.SetCompShareTeamRelationRequest;
import cn.ucloud.ucompshare.models.SetCompShareTeamRelationResponse;
import cn.ucloud.ucompshare.models.StartCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.StartCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.StopCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.StopCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.TerminateCompShareCustomImageRequest;
import cn.ucloud.ucompshare.models.TerminateCompShareCustomImageResponse;
import cn.ucloud.ucompshare.models.TerminateCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.TerminateCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.UpdateCompShareImageRequest;
import cn.ucloud.ucompshare.models.UpdateCompShareImageResponse;
import cn.ucloud.ucompshare.models.UpdateCompShareStopSchedulerRequest;
import cn.ucloud.ucompshare.models.UpdateCompShareStopSchedulerResponse;
import cn.ucloud.ucompshare.models.UpdateCompShareTeamRequest;
import cn.ucloud.ucompshare.models.UpdateCompShareTeamResponse;

/** This client is used to call actions of **UCompShare** service */
public interface UCompShareClientInterface extends Client {

    /**
     * AttachCompshareDisk - 挂载云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AttachCompshareDiskResponse attachCompshareDisk(AttachCompshareDiskRequest request)
            throws UCloudException;

    /**
     * AttachUS3 - 挂载us3
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AttachUS3Response attachUS3(AttachUS3Request request) throws UCloudException;

    /**
     * CheckCompShareNetOptimizer - 检查算力平台账号是否开通访问加速
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckCompShareNetOptimizerResponse checkCompShareNetOptimizer(
            CheckCompShareNetOptimizerRequest request) throws UCloudException;

    /**
     * CopyCompShareCustomImage - 复制算力平台镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CopyCompShareCustomImageResponse copyCompShareCustomImage(
            CopyCompShareCustomImageRequest request) throws UCloudException;

    /**
     * CreateCompShareCustomImage - 制作算力平台实例自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCompShareCustomImageResponse createCompShareCustomImage(
            CreateCompShareCustomImageRequest request) throws UCloudException;

    /**
     * CreateCompShareInstance - 创建轻量级算力平台主机资源
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCompShareInstanceResponse createCompShareInstance(
            CreateCompShareInstanceRequest request) throws UCloudException;

    /**
     * CreateCompShareTeam - 创建团队
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCompShareTeamResponse createCompShareTeam(CreateCompShareTeamRequest request)
            throws UCloudException;

    /**
     * CreateCompShareTeamRelation - 发送团队邀请
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCompShareTeamRelationResponse createCompShareTeamRelation(
            CreateCompShareTeamRelationRequest request) throws UCloudException;

    /**
     * DeleteCompShareStopScheduler - 删除实例定时关机任务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCompShareStopSchedulerResponse deleteCompShareStopScheduler(
            DeleteCompShareStopSchedulerRequest request) throws UCloudException;

    /**
     * DeleteCompShareTeam - 删除团队
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCompShareTeamResponse deleteCompShareTeam(DeleteCompShareTeamRequest request)
            throws UCloudException;

    /**
     * DeleteCompshareDisk - 删除算力磁盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCompshareDiskResponse deleteCompshareDisk(DeleteCompshareDiskRequest request)
            throws UCloudException;

    /**
     * DescribeAvailableCompShareInstanceTypes - 获取某个地域下可售/售罄的所有机型信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeAvailableCompShareInstanceTypesResponse describeAvailableCompShareInstanceTypes(
            DescribeAvailableCompShareInstanceTypesRequest request) throws UCloudException;

    /**
     * DescribeCommunityImages - 获取社区镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCommunityImagesResponse describeCommunityImages(
            DescribeCommunityImagesRequest request) throws UCloudException;

    /**
     * DescribeCompShareCustomImages - 获取自制镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareCustomImagesResponse describeCompShareCustomImages(
            DescribeCompShareCustomImagesRequest request) throws UCloudException;

    /**
     * DescribeCompShareGpuInventory - 查询GPU卡余量库存
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareGpuInventoryResponse describeCompShareGpuInventory(
            DescribeCompShareGpuInventoryRequest request) throws UCloudException;

    /**
     * DescribeCompShareImageShareAccounts - 获取镜像共享的账号列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareImageShareAccountsResponse describeCompShareImageShareAccounts(
            DescribeCompShareImageShareAccountsRequest request) throws UCloudException;

    /**
     * DescribeCompShareImageTags - 获取镜像标签列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareImageTagsResponse describeCompShareImageTags(
            DescribeCompShareImageTagsRequest request) throws UCloudException;

    /**
     * DescribeCompShareImages - 获取算力平台镜像信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareImagesResponse describeCompShareImages(
            DescribeCompShareImagesRequest request) throws UCloudException;

    /**
     * DescribeCompShareInstance - 获取用户所有地域的主机资源列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareInstanceResponse describeCompShareInstance(
            DescribeCompShareInstanceRequest request) throws UCloudException;

    /**
     * DescribeCompShareMachineTypeFamilies - 获取实例规格族列表（所有机型的信息）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareMachineTypeFamiliesResponse describeCompShareMachineTypeFamilies(
            DescribeCompShareMachineTypeFamiliesRequest request) throws UCloudException;

    /**
     * DescribeCompShareSharingImages - 获取算力平台共享镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareSharingImagesResponse describeCompShareSharingImages(
            DescribeCompShareSharingImagesRequest request) throws UCloudException;

    /**
     * DescribeCompShareSoftwarePort - 获取算力平台应用及端口号列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareSoftwarePortResponse describeCompShareSoftwarePort(
            DescribeCompShareSoftwarePortRequest request) throws UCloudException;

    /**
     * DescribeCompShareSupportZone - 获取支持的可用区信息列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareSupportZoneResponse describeCompShareSupportZone(
            DescribeCompShareSupportZoneRequest request) throws UCloudException;

    /**
     * DescribeModelRepositoryModels - 模型仓库模型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeModelRepositoryModelsResponse describeModelRepositoryModels(
            DescribeModelRepositoryModelsRequest request) throws UCloudException;

    /**
     * DescribeModelRepositoryTags - 模型仓库标签列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeModelRepositoryTagsResponse describeModelRepositoryTags(
            DescribeModelRepositoryTagsRequest request) throws UCloudException;

    /**
     * DescribeSelfCommunityImages - 个人中心社区镜像查询
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSelfCommunityImagesResponse describeSelfCommunityImages(
            DescribeSelfCommunityImagesRequest request) throws UCloudException;

    /**
     * DescribeTeamMemberOrder - 获取团队订单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeTeamMemberOrderResponse describeTeamMemberOrder(
            DescribeTeamMemberOrderRequest request) throws UCloudException;

    /**
     * DescribeTeamMemberOrderCount - 获取团队成员订单总览
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeTeamMemberOrderCountResponse describeTeamMemberOrderCount(
            DescribeTeamMemberOrderCountRequest request) throws UCloudException;

    /**
     * DescribeTeamMemberUnpaidOrder - 获取团队队员未支付订单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeTeamMemberUnpaidOrderResponse describeTeamMemberUnpaidOrder(
            DescribeTeamMemberUnpaidOrderRequest request) throws UCloudException;

    /**
     * DescribeTeamMemberUnpaidOrderCount - 获取团队成员未支付订单总览
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeTeamMemberUnpaidOrderCountResponse describeTeamMemberUnpaidOrderCount(
            DescribeTeamMemberUnpaidOrderCountRequest request) throws UCloudException;

    /**
     * DescribeUserCommunityImages - 获取社区镜像列表(登录状态)
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUserCommunityImagesResponse describeUserCommunityImages(
            DescribeUserCommunityImagesRequest request) throws UCloudException;

    /**
     * DetachCompshareDisk - 卸载云硬盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DetachCompshareDiskResponse detachCompshareDisk(DetachCompshareDiskRequest request)
            throws UCloudException;

    /**
     * DownloadTeamOrder - 下载团队订单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadTeamOrderResponse downloadTeamOrder(DownloadTeamOrderRequest request)
            throws UCloudException;

    /**
     * GetCompShareAttachedDiskUpgradePrice - 获取算力平台实例磁盘升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareAttachedDiskUpgradePriceResponse getCompShareAttachedDiskUpgradePrice(
            GetCompShareAttachedDiskUpgradePriceRequest request) throws UCloudException;

    /**
     * GetCompShareImageCreateProgress - 获取算力平台镜像制作进度
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareImageCreateProgressResponse getCompShareImageCreateProgress(
            GetCompShareImageCreateProgressRequest request) throws UCloudException;

    /**
     * GetCompShareInstanceMonitor - 获取实例监控指标
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareInstanceMonitorResponse getCompShareInstanceMonitor(
            GetCompShareInstanceMonitorRequest request) throws UCloudException;

    /**
     * GetCompShareInstancePrice - 获取算力平台实例价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareInstancePriceResponse getCompShareInstancePrice(
            GetCompShareInstancePriceRequest request) throws UCloudException;

    /**
     * GetCompShareInstanceUpgradePrice - 获取算力平台实例升降级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareInstanceUpgradePriceResponse getCompShareInstanceUpgradePrice(
            GetCompShareInstanceUpgradePriceRequest request) throws UCloudException;

    /**
     * GetCompShareInstanceUserPrice - 获取算力平台实例用户价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareInstanceUserPriceResponse getCompShareInstanceUserPrice(
            GetCompShareInstanceUserPriceRequest request) throws UCloudException;

    /**
     * GetCompShareRefundPrice - 获取算力平台实例删除扣除费用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareRefundPriceResponse getCompShareRefundPrice(
            GetCompShareRefundPriceRequest request) throws UCloudException;

    /**
     * GetCompShareTeamInfo - 获取团队详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCompShareTeamInfoResponse getCompShareTeamInfo(GetCompShareTeamInfoRequest request)
            throws UCloudException;

    /**
     * GetOpenClawModelList - 获取OpenClaw模型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetOpenClawModelListResponse getOpenClawModelList(GetOpenClawModelListRequest request)
            throws UCloudException;

    /**
     * GetSoftwareURL - 获取算力平台实例应用URL
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetSoftwareURLResponse getSoftwareURL(GetSoftwareURLRequest request)
            throws UCloudException;

    /**
     * ListCompShareTeam - 获取团队列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCompShareTeamResponse listCompShareTeam(ListCompShareTeamRequest request)
            throws UCloudException;

    /**
     * ListCompShareTeamInvite - 获取邀请成员的列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCompShareTeamInviteResponse listCompShareTeamInvite(
            ListCompShareTeamInviteRequest request) throws UCloudException;

    /**
     * ListCompShareTeamJoined - 获取加入团队信息列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCompShareTeamJoinedResponse listCompShareTeamJoined(
            ListCompShareTeamJoinedRequest request) throws UCloudException;

    /**
     * ListCompShareTeamOperateLog - 获取团队操作日志列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCompShareTeamOperateLogResponse listCompShareTeamOperateLog(
            ListCompShareTeamOperateLogRequest request) throws UCloudException;

    /**
     * ListMemberProductType - 获取成员订单产品类型
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListMemberProductTypeResponse listMemberProductType(ListMemberProductTypeRequest request)
            throws UCloudException;

    /**
     * ModifyCompShareImageShareAccount - 管理镜像的共享账号列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCompShareImageShareAccountResponse modifyCompShareImageShareAccount(
            ModifyCompShareImageShareAccountRequest request) throws UCloudException;

    /**
     * ModifyCompShareInstanceName - 修改算力平台实例名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCompShareInstanceNameResponse modifyCompShareInstanceName(
            ModifyCompShareInstanceNameRequest request) throws UCloudException;

    /**
     * PublishCompShareImage - 将自制镜像发布到镜像社区
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PublishCompShareImageResponse publishCompShareImage(PublishCompShareImageRequest request)
            throws UCloudException;

    /**
     * RebootCompShareInstance - 重启轻量算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootCompShareInstanceResponse rebootCompShareInstance(
            RebootCompShareInstanceRequest request) throws UCloudException;

    /**
     * ReinstallCompShareInstance - 重装算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallCompShareInstanceResponse reinstallCompShareInstance(
            ReinstallCompShareInstanceRequest request) throws UCloudException;

    /**
     * ResetCompShareInstancePassword - 重置算力平台实例密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetCompShareInstancePasswordResponse resetCompShareInstancePassword(
            ResetCompShareInstancePasswordRequest request) throws UCloudException;

    /**
     * ResizeCompShareDisk - 扩容算力磁盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeCompShareDiskResponse resizeCompShareDisk(ResizeCompShareDiskRequest request)
            throws UCloudException;

    /**
     * ResizeCompShareInstance - 修改算力平台实例配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeCompShareInstanceResponse resizeCompShareInstance(
            ResizeCompShareInstanceRequest request) throws UCloudException;

    /**
     * SetCompShareTeamRelation - 设置邀请信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetCompShareTeamRelationResponse setCompShareTeamRelation(
            SetCompShareTeamRelationRequest request) throws UCloudException;

    /**
     * StartCompShareInstance - 启动算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartCompShareInstanceResponse startCompShareInstance(
            StartCompShareInstanceRequest request) throws UCloudException;

    /**
     * StopCompShareInstance - 关闭算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopCompShareInstanceResponse stopCompShareInstance(StopCompShareInstanceRequest request)
            throws UCloudException;

    /**
     * TerminateCompShareCustomImage - 删除算力平台自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateCompShareCustomImageResponse terminateCompShareCustomImage(
            TerminateCompShareCustomImageRequest request) throws UCloudException;

    /**
     * TerminateCompShareInstance - 删除轻量算力共享平台虚机实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateCompShareInstanceResponse terminateCompShareInstance(
            TerminateCompShareInstanceRequest request) throws UCloudException;

    /**
     * UpdateCompShareImage - 编辑算力平台自制镜像信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCompShareImageResponse updateCompShareImage(UpdateCompShareImageRequest request)
            throws UCloudException;

    /**
     * UpdateCompShareStopScheduler - 更新实例定时关机时间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCompShareStopSchedulerResponse updateCompShareStopScheduler(
            UpdateCompShareStopSchedulerRequest request) throws UCloudException;

    /**
     * UpdateCompShareTeam - 更改团队信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCompShareTeamResponse updateCompShareTeam(UpdateCompShareTeamRequest request)
            throws UCloudException;
}
