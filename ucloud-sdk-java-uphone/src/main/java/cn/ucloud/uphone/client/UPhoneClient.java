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
package cn.ucloud.uphone.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uphone.models.CreateUPhoneAppRequest;
import cn.ucloud.uphone.models.CreateUPhoneAppResponse;
import cn.ucloud.uphone.models.CreateUPhoneAppVersionRequest;
import cn.ucloud.uphone.models.CreateUPhoneAppVersionResponse;
import cn.ucloud.uphone.models.CreateUPhoneImageRequest;
import cn.ucloud.uphone.models.CreateUPhoneImageResponse;
import cn.ucloud.uphone.models.CreateUPhoneRequest;
import cn.ucloud.uphone.models.CreateUPhoneResponse;
import cn.ucloud.uphone.models.CreateUPhoneServerRequest;
import cn.ucloud.uphone.models.CreateUPhoneServerResponse;
import cn.ucloud.uphone.models.DeleteUPhoneImageRequest;
import cn.ucloud.uphone.models.DeleteUPhoneImageResponse;
import cn.ucloud.uphone.models.DeleteUPhoneRequest;
import cn.ucloud.uphone.models.DeleteUPhoneResponse;
import cn.ucloud.uphone.models.DeleteUPhoneServerRequest;
import cn.ucloud.uphone.models.DeleteUPhoneServerResponse;
import cn.ucloud.uphone.models.DeleteUPhoneShareBandwidthRequest;
import cn.ucloud.uphone.models.DeleteUPhoneShareBandwidthResponse;
import cn.ucloud.uphone.models.DescribeUPhoneAppRequest;
import cn.ucloud.uphone.models.DescribeUPhoneAppResponse;
import cn.ucloud.uphone.models.DescribeUPhoneAppVersionRequest;
import cn.ucloud.uphone.models.DescribeUPhoneAppVersionResponse;
import cn.ucloud.uphone.models.DescribeUPhoneCitiesRequest;
import cn.ucloud.uphone.models.DescribeUPhoneCitiesResponse;
import cn.ucloud.uphone.models.DescribeUPhoneDetailByAppRequest;
import cn.ucloud.uphone.models.DescribeUPhoneDetailByAppResponse;
import cn.ucloud.uphone.models.DescribeUPhoneImageRequest;
import cn.ucloud.uphone.models.DescribeUPhoneImageResponse;
import cn.ucloud.uphone.models.DescribeUPhoneIpRegionsRequest;
import cn.ucloud.uphone.models.DescribeUPhoneIpRegionsResponse;
import cn.ucloud.uphone.models.DescribeUPhoneJobRequest;
import cn.ucloud.uphone.models.DescribeUPhoneJobResponse;
import cn.ucloud.uphone.models.DescribeUPhoneModelRequest;
import cn.ucloud.uphone.models.DescribeUPhoneModelResponse;
import cn.ucloud.uphone.models.DescribeUPhoneRequest;
import cn.ucloud.uphone.models.DescribeUPhoneResponse;
import cn.ucloud.uphone.models.DescribeUPhoneServerModelRequest;
import cn.ucloud.uphone.models.DescribeUPhoneServerModelResponse;
import cn.ucloud.uphone.models.DescribeUPhoneServerRequest;
import cn.ucloud.uphone.models.DescribeUPhoneServerResponse;
import cn.ucloud.uphone.models.DescribeUPhoneShareBandwidthRequest;
import cn.ucloud.uphone.models.DescribeUPhoneShareBandwidthResponse;
import cn.ucloud.uphone.models.GetUPhoneAllowanceRequest;
import cn.ucloud.uphone.models.GetUPhoneAllowanceResponse;
import cn.ucloud.uphone.models.GetUPhonePriceRequest;
import cn.ucloud.uphone.models.GetUPhonePriceResponse;
import cn.ucloud.uphone.models.GetUPhoneRenewPriceRequest;
import cn.ucloud.uphone.models.GetUPhoneRenewPriceResponse;
import cn.ucloud.uphone.models.GetUPhoneScreenCaptureRequest;
import cn.ucloud.uphone.models.GetUPhoneScreenCaptureResponse;
import cn.ucloud.uphone.models.GetUPhoneServerPriceRequest;
import cn.ucloud.uphone.models.GetUPhoneServerPriceResponse;
import cn.ucloud.uphone.models.GetUPhoneServerRenewPriceRequest;
import cn.ucloud.uphone.models.GetUPhoneServerRenewPriceResponse;
import cn.ucloud.uphone.models.GetUPhoneShareBandwidthUpgradePriceRequest;
import cn.ucloud.uphone.models.GetUPhoneShareBandwidthUpgradePriceResponse;
import cn.ucloud.uphone.models.ImportFileRequest;
import cn.ucloud.uphone.models.ImportFileResponse;
import cn.ucloud.uphone.models.InstallUPhoneAppVersionRequest;
import cn.ucloud.uphone.models.InstallUPhoneAppVersionResponse;
import cn.ucloud.uphone.models.ModifyUPhoneNameRequest;
import cn.ucloud.uphone.models.ModifyUPhoneNameResponse;
import cn.ucloud.uphone.models.ModifyUPhoneRemarkRequest;
import cn.ucloud.uphone.models.ModifyUPhoneRemarkResponse;
import cn.ucloud.uphone.models.ModifyUPhoneServerNameRequest;
import cn.ucloud.uphone.models.ModifyUPhoneServerNameResponse;
import cn.ucloud.uphone.models.ModifyUPhoneServerRemarkRequest;
import cn.ucloud.uphone.models.ModifyUPhoneServerRemarkResponse;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthNameRequest;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthNameResponse;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthRemarkRequest;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthRemarkResponse;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthRequest;
import cn.ucloud.uphone.models.ModifyUPhoneShareBandwidthResponse;
import cn.ucloud.uphone.models.PoweroffUPhoneRequest;
import cn.ucloud.uphone.models.PoweroffUPhoneResponse;
import cn.ucloud.uphone.models.PoweronUPhoneRequest;
import cn.ucloud.uphone.models.PoweronUPhoneResponse;
import cn.ucloud.uphone.models.RebootUPhoneRequest;
import cn.ucloud.uphone.models.RebootUPhoneResponse;
import cn.ucloud.uphone.models.RenewUPhoneRequest;
import cn.ucloud.uphone.models.RenewUPhoneResponse;
import cn.ucloud.uphone.models.ResetUPhoneRequest;
import cn.ucloud.uphone.models.ResetUPhoneResponse;
import cn.ucloud.uphone.models.RunAsyncCommandRequest;
import cn.ucloud.uphone.models.RunAsyncCommandResponse;
import cn.ucloud.uphone.models.RunSyncCommandRequest;
import cn.ucloud.uphone.models.RunSyncCommandResponse;
import cn.ucloud.uphone.models.SetUPhoneCallbackRequest;
import cn.ucloud.uphone.models.SetUPhoneCallbackResponse;
import cn.ucloud.uphone.models.SetUPhoneConfigRequest;
import cn.ucloud.uphone.models.SetUPhoneConfigResponse;
import cn.ucloud.uphone.models.SetUPhoneGPSRequest;
import cn.ucloud.uphone.models.SetUPhoneGPSResponse;
import cn.ucloud.uphone.models.SetUPhoneManagerModeRequest;
import cn.ucloud.uphone.models.SetUPhoneManagerModeResponse;
import cn.ucloud.uphone.models.SetUPhoneRootModeRequest;
import cn.ucloud.uphone.models.SetUPhoneRootModeResponse;
import cn.ucloud.uphone.models.SetUPhoneTokenRequest;
import cn.ucloud.uphone.models.SetUPhoneTokenResponse;
import cn.ucloud.uphone.models.SwitchUPhoneIndependentIpRequest;
import cn.ucloud.uphone.models.SwitchUPhoneIndependentIpResponse;
import cn.ucloud.uphone.models.SwitchUPhoneInstanceRequest;
import cn.ucloud.uphone.models.SwitchUPhoneInstanceResponse;
import cn.ucloud.uphone.models.UnInstallUPhoneAppVersionRequest;
import cn.ucloud.uphone.models.UnInstallUPhoneAppVersionResponse;
import cn.ucloud.uphone.models.UpdateUPhoneImageRequest;
import cn.ucloud.uphone.models.UpdateUPhoneImageResponse;

/** This client is used to call actions of **UPhone** service */
public class UPhoneClient extends DefaultClient implements UPhoneClientInterface {
    public UPhoneClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUPhone - 创建云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPhoneResponse createUPhone(CreateUPhoneRequest request) throws UCloudException {
        request.setAction("CreateUPhone");
        return (CreateUPhoneResponse) this.invoke(request, CreateUPhoneResponse.class);
    }

    /**
     * CreateUPhoneApp - 创建云手机应用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPhoneAppResponse createUPhoneApp(CreateUPhoneAppRequest request)
            throws UCloudException {
        request.setAction("CreateUPhoneApp");
        return (CreateUPhoneAppResponse) this.invoke(request, CreateUPhoneAppResponse.class);
    }

    /**
     * CreateUPhoneAppVersion - 创建云手机应用版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPhoneAppVersionResponse createUPhoneAppVersion(
            CreateUPhoneAppVersionRequest request) throws UCloudException {
        request.setAction("CreateUPhoneAppVersion");
        return (CreateUPhoneAppVersionResponse)
                this.invoke(request, CreateUPhoneAppVersionResponse.class);
    }

    /**
     * CreateUPhoneImage - 创建云手机镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPhoneImageResponse createUPhoneImage(CreateUPhoneImageRequest request)
            throws UCloudException {
        request.setAction("CreateUPhoneImage");
        return (CreateUPhoneImageResponse) this.invoke(request, CreateUPhoneImageResponse.class);
    }

    /**
     * CreateUPhoneServer - 创建云手机服务器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPhoneServerResponse createUPhoneServer(CreateUPhoneServerRequest request)
            throws UCloudException {
        request.setAction("CreateUPhoneServer");
        return (CreateUPhoneServerResponse) this.invoke(request, CreateUPhoneServerResponse.class);
    }

    /**
     * DeleteUPhone - 删除云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPhoneResponse deleteUPhone(DeleteUPhoneRequest request) throws UCloudException {
        request.setAction("DeleteUPhone");
        return (DeleteUPhoneResponse) this.invoke(request, DeleteUPhoneResponse.class);
    }

    /**
     * DeleteUPhoneImage - 删除自制云手机镜像。
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPhoneImageResponse deleteUPhoneImage(DeleteUPhoneImageRequest request)
            throws UCloudException {
        request.setAction("DeleteUPhoneImage");
        return (DeleteUPhoneImageResponse) this.invoke(request, DeleteUPhoneImageResponse.class);
    }

    /**
     * DeleteUPhoneServer - 删除云手机服务器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPhoneServerResponse deleteUPhoneServer(DeleteUPhoneServerRequest request)
            throws UCloudException {
        request.setAction("DeleteUPhoneServer");
        return (DeleteUPhoneServerResponse) this.invoke(request, DeleteUPhoneServerResponse.class);
    }

    /**
     * DeleteUPhoneShareBandwidth - 删除云手机共享带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPhoneShareBandwidthResponse deleteUPhoneShareBandwidth(
            DeleteUPhoneShareBandwidthRequest request) throws UCloudException {
        request.setAction("DeleteUPhoneShareBandwidth");
        return (DeleteUPhoneShareBandwidthResponse)
                this.invoke(request, DeleteUPhoneShareBandwidthResponse.class);
    }

    /**
     * DescribeUPhone - 获取云手机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneResponse describeUPhone(DescribeUPhoneRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhone");
        return (DescribeUPhoneResponse) this.invoke(request, DescribeUPhoneResponse.class);
    }

    /**
     * DescribeUPhoneApp - 获取应用列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneAppResponse describeUPhoneApp(DescribeUPhoneAppRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneApp");
        return (DescribeUPhoneAppResponse) this.invoke(request, DescribeUPhoneAppResponse.class);
    }

    /**
     * DescribeUPhoneAppVersion - 获取应用版本列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneAppVersionResponse describeUPhoneAppVersion(
            DescribeUPhoneAppVersionRequest request) throws UCloudException {
        request.setAction("DescribeUPhoneAppVersion");
        return (DescribeUPhoneAppVersionResponse)
                this.invoke(request, DescribeUPhoneAppVersionResponse.class);
    }

    /**
     * DescribeUPhoneCities - 获取云手机城市列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneCitiesResponse describeUPhoneCities(DescribeUPhoneCitiesRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneCities");
        return (DescribeUPhoneCitiesResponse)
                this.invoke(request, DescribeUPhoneCitiesResponse.class);
    }

    /**
     * DescribeUPhoneDetailByApp - 查询应用所安装的云手机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneDetailByAppResponse describeUPhoneDetailByApp(
            DescribeUPhoneDetailByAppRequest request) throws UCloudException {
        request.setAction("DescribeUPhoneDetailByApp");
        return (DescribeUPhoneDetailByAppResponse)
                this.invoke(request, DescribeUPhoneDetailByAppResponse.class);
    }

    /**
     * DescribeUPhoneImage - 获取云手机镜像信息列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneImageResponse describeUPhoneImage(DescribeUPhoneImageRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneImage");
        return (DescribeUPhoneImageResponse)
                this.invoke(request, DescribeUPhoneImageResponse.class);
    }

    /**
     * DescribeUPhoneIpRegions - 获取云手机所在城市支持绑定独立IP的地域列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneIpRegionsResponse describeUPhoneIpRegions(
            DescribeUPhoneIpRegionsRequest request) throws UCloudException {
        request.setAction("DescribeUPhoneIpRegions");
        return (DescribeUPhoneIpRegionsResponse)
                this.invoke(request, DescribeUPhoneIpRegionsResponse.class);
    }

    /**
     * DescribeUPhoneJob - 查询Job的执行状态。
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneJobResponse describeUPhoneJob(DescribeUPhoneJobRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneJob");
        return (DescribeUPhoneJobResponse) this.invoke(request, DescribeUPhoneJobResponse.class);
    }

    /**
     * DescribeUPhoneModel - 获取云手机规格列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneModelResponse describeUPhoneModel(DescribeUPhoneModelRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneModel");
        return (DescribeUPhoneModelResponse)
                this.invoke(request, DescribeUPhoneModelResponse.class);
    }

    /**
     * DescribeUPhoneServer - 获取云手机服务器列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneServerResponse describeUPhoneServer(DescribeUPhoneServerRequest request)
            throws UCloudException {
        request.setAction("DescribeUPhoneServer");
        return (DescribeUPhoneServerResponse)
                this.invoke(request, DescribeUPhoneServerResponse.class);
    }

    /**
     * DescribeUPhoneServerModel - 获取ServerModel列表。
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneServerModelResponse describeUPhoneServerModel(
            DescribeUPhoneServerModelRequest request) throws UCloudException {
        request.setAction("DescribeUPhoneServerModel");
        return (DescribeUPhoneServerModelResponse)
                this.invoke(request, DescribeUPhoneServerModelResponse.class);
    }

    /**
     * DescribeUPhoneShareBandwidth - 获取共享带宽列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPhoneShareBandwidthResponse describeUPhoneShareBandwidth(
            DescribeUPhoneShareBandwidthRequest request) throws UCloudException {
        request.setAction("DescribeUPhoneShareBandwidth");
        return (DescribeUPhoneShareBandwidthResponse)
                this.invoke(request, DescribeUPhoneShareBandwidthResponse.class);
    }

    /**
     * GetUPhoneAllowance - 获取云手机创建余量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneAllowanceResponse getUPhoneAllowance(GetUPhoneAllowanceRequest request)
            throws UCloudException {
        request.setAction("GetUPhoneAllowance");
        return (GetUPhoneAllowanceResponse) this.invoke(request, GetUPhoneAllowanceResponse.class);
    }

    /**
     * GetUPhonePrice - 获取云手机价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhonePriceResponse getUPhonePrice(GetUPhonePriceRequest request)
            throws UCloudException {
        request.setAction("GetUPhonePrice");
        return (GetUPhonePriceResponse) this.invoke(request, GetUPhonePriceResponse.class);
    }

    /**
     * GetUPhoneRenewPrice - 获取云手机续费价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneRenewPriceResponse getUPhoneRenewPrice(GetUPhoneRenewPriceRequest request)
            throws UCloudException {
        request.setAction("GetUPhoneRenewPrice");
        return (GetUPhoneRenewPriceResponse)
                this.invoke(request, GetUPhoneRenewPriceResponse.class);
    }

    /**
     * GetUPhoneScreenCapture - 云手机截屏
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneScreenCaptureResponse getUPhoneScreenCapture(
            GetUPhoneScreenCaptureRequest request) throws UCloudException {
        request.setAction("GetUPhoneScreenCapture");
        return (GetUPhoneScreenCaptureResponse)
                this.invoke(request, GetUPhoneScreenCaptureResponse.class);
    }

    /**
     * GetUPhoneServerPrice - 获取云手机服务器价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneServerPriceResponse getUPhoneServerPrice(GetUPhoneServerPriceRequest request)
            throws UCloudException {
        request.setAction("GetUPhoneServerPrice");
        return (GetUPhoneServerPriceResponse)
                this.invoke(request, GetUPhoneServerPriceResponse.class);
    }

    /**
     * GetUPhoneServerRenewPrice - 获取云手机服务器续费价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneServerRenewPriceResponse getUPhoneServerRenewPrice(
            GetUPhoneServerRenewPriceRequest request) throws UCloudException {
        request.setAction("GetUPhoneServerRenewPrice");
        return (GetUPhoneServerRenewPriceResponse)
                this.invoke(request, GetUPhoneServerRenewPriceResponse.class);
    }

    /**
     * GetUPhoneShareBandwidthUpgradePrice - 获取云手机共享带宽升降级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPhoneShareBandwidthUpgradePriceResponse getUPhoneShareBandwidthUpgradePrice(
            GetUPhoneShareBandwidthUpgradePriceRequest request) throws UCloudException {
        request.setAction("GetUPhoneShareBandwidthUpgradePrice");
        return (GetUPhoneShareBandwidthUpgradePriceResponse)
                this.invoke(request, GetUPhoneShareBandwidthUpgradePriceResponse.class);
    }

    /**
     * ImportFile - 上传文件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ImportFileResponse importFile(ImportFileRequest request) throws UCloudException {
        request.setAction("ImportFile");
        return (ImportFileResponse) this.invoke(request, ImportFileResponse.class);
    }

    /**
     * InstallUPhoneAppVersion - 安装云手机应用版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public InstallUPhoneAppVersionResponse installUPhoneAppVersion(
            InstallUPhoneAppVersionRequest request) throws UCloudException {
        request.setAction("InstallUPhoneAppVersion");
        return (InstallUPhoneAppVersionResponse)
                this.invoke(request, InstallUPhoneAppVersionResponse.class);
    }

    /**
     * ModifyUPhoneName - 修改云手机名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneNameResponse modifyUPhoneName(ModifyUPhoneNameRequest request)
            throws UCloudException {
        request.setAction("ModifyUPhoneName");
        return (ModifyUPhoneNameResponse) this.invoke(request, ModifyUPhoneNameResponse.class);
    }

    /**
     * ModifyUPhoneRemark - 修改云手机备注信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneRemarkResponse modifyUPhoneRemark(ModifyUPhoneRemarkRequest request)
            throws UCloudException {
        request.setAction("ModifyUPhoneRemark");
        return (ModifyUPhoneRemarkResponse) this.invoke(request, ModifyUPhoneRemarkResponse.class);
    }

    /**
     * ModifyUPhoneServerName - 修改云手机服务器名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneServerNameResponse modifyUPhoneServerName(
            ModifyUPhoneServerNameRequest request) throws UCloudException {
        request.setAction("ModifyUPhoneServerName");
        return (ModifyUPhoneServerNameResponse)
                this.invoke(request, ModifyUPhoneServerNameResponse.class);
    }

    /**
     * ModifyUPhoneServerRemark - 修改云手机服务器备注信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneServerRemarkResponse modifyUPhoneServerRemark(
            ModifyUPhoneServerRemarkRequest request) throws UCloudException {
        request.setAction("ModifyUPhoneServerRemark");
        return (ModifyUPhoneServerRemarkResponse)
                this.invoke(request, ModifyUPhoneServerRemarkResponse.class);
    }

    /**
     * ModifyUPhoneShareBandwidth - 修改云手机共享带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneShareBandwidthResponse modifyUPhoneShareBandwidth(
            ModifyUPhoneShareBandwidthRequest request) throws UCloudException {
        request.setAction("ModifyUPhoneShareBandwidth");
        return (ModifyUPhoneShareBandwidthResponse)
                this.invoke(request, ModifyUPhoneShareBandwidthResponse.class);
    }

    /**
     * ModifyUPhoneShareBandwidthName - 修改云手机共享带宽名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneShareBandwidthNameResponse modifyUPhoneShareBandwidthName(
            ModifyUPhoneShareBandwidthNameRequest request) throws UCloudException {
        request.setAction("ModifyUPhoneShareBandwidthName");
        return (ModifyUPhoneShareBandwidthNameResponse)
                this.invoke(request, ModifyUPhoneShareBandwidthNameResponse.class);
    }

    /**
     * ModifyUPhoneShareBandwidthRemark - 修改云手机共享带宽备注
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPhoneShareBandwidthRemarkResponse modifyUPhoneShareBandwidthRemark(
            ModifyUPhoneShareBandwidthRemarkRequest request) throws UCloudException {
        request.setAction("ModifyUPhoneShareBandwidthRemark");
        return (ModifyUPhoneShareBandwidthRemarkResponse)
                this.invoke(request, ModifyUPhoneShareBandwidthRemarkResponse.class);
    }

    /**
     * PoweroffUPhone - 关闭云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffUPhoneResponse poweroffUPhone(PoweroffUPhoneRequest request)
            throws UCloudException {
        request.setAction("PoweroffUPhone");
        return (PoweroffUPhoneResponse) this.invoke(request, PoweroffUPhoneResponse.class);
    }

    /**
     * PoweronUPhone - 开启云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweronUPhoneResponse poweronUPhone(PoweronUPhoneRequest request)
            throws UCloudException {
        request.setAction("PoweronUPhone");
        return (PoweronUPhoneResponse) this.invoke(request, PoweronUPhoneResponse.class);
    }

    /**
     * RebootUPhone - 重启云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootUPhoneResponse rebootUPhone(RebootUPhoneRequest request) throws UCloudException {
        request.setAction("RebootUPhone");
        return (RebootUPhoneResponse) this.invoke(request, RebootUPhoneResponse.class);
    }

    /**
     * RenewUPhone - 一键新机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RenewUPhoneResponse renewUPhone(RenewUPhoneRequest request) throws UCloudException {
        request.setAction("RenewUPhone");
        return (RenewUPhoneResponse) this.invoke(request, RenewUPhoneResponse.class);
    }

    /**
     * ResetUPhone - 重置云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetUPhoneResponse resetUPhone(ResetUPhoneRequest request) throws UCloudException {
        request.setAction("ResetUPhone");
        return (ResetUPhoneResponse) this.invoke(request, ResetUPhoneResponse.class);
    }

    /**
     * RunAsyncCommand - 执行异步shell命令
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RunAsyncCommandResponse runAsyncCommand(RunAsyncCommandRequest request)
            throws UCloudException {
        request.setAction("RunAsyncCommand");
        return (RunAsyncCommandResponse) this.invoke(request, RunAsyncCommandResponse.class);
    }

    /**
     * RunSyncCommand - 执行同步shell命令
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RunSyncCommandResponse runSyncCommand(RunSyncCommandRequest request)
            throws UCloudException {
        request.setAction("RunSyncCommand");
        return (RunSyncCommandResponse) this.invoke(request, RunSyncCommandResponse.class);
    }

    /**
     * SetUPhoneCallback - 设置云手机异步操作回调
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneCallbackResponse setUPhoneCallback(SetUPhoneCallbackRequest request)
            throws UCloudException {
        request.setAction("SetUPhoneCallback");
        return (SetUPhoneCallbackResponse) this.invoke(request, SetUPhoneCallbackResponse.class);
    }

    /**
     * SetUPhoneConfig - 设置云手机参数
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneConfigResponse setUPhoneConfig(SetUPhoneConfigRequest request)
            throws UCloudException {
        request.setAction("SetUPhoneConfig");
        return (SetUPhoneConfigResponse) this.invoke(request, SetUPhoneConfigResponse.class);
    }

    /**
     * SetUPhoneGPS - 设置云手机GPS信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneGPSResponse setUPhoneGPS(SetUPhoneGPSRequest request) throws UCloudException {
        request.setAction("SetUPhoneGPS");
        return (SetUPhoneGPSResponse) this.invoke(request, SetUPhoneGPSResponse.class);
    }

    /**
     * SetUPhoneManagerMode - 设置云手机管理模式
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneManagerModeResponse setUPhoneManagerMode(SetUPhoneManagerModeRequest request)
            throws UCloudException {
        request.setAction("SetUPhoneManagerMode");
        return (SetUPhoneManagerModeResponse)
                this.invoke(request, SetUPhoneManagerModeResponse.class);
    }

    /**
     * SetUPhoneRootMode - 设置云手机Root模式
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneRootModeResponse setUPhoneRootMode(SetUPhoneRootModeRequest request)
            throws UCloudException {
        request.setAction("SetUPhoneRootMode");
        return (SetUPhoneRootModeResponse) this.invoke(request, SetUPhoneRootModeResponse.class);
    }

    /**
     * SetUPhoneToken - 设置云手机RTC连接Token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUPhoneTokenResponse setUPhoneToken(SetUPhoneTokenRequest request)
            throws UCloudException {
        request.setAction("SetUPhoneToken");
        return (SetUPhoneTokenResponse) this.invoke(request, SetUPhoneTokenResponse.class);
    }

    /**
     * SwitchUPhoneIndependentIp - 更换云手机独立IP
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SwitchUPhoneIndependentIpResponse switchUPhoneIndependentIp(
            SwitchUPhoneIndependentIpRequest request) throws UCloudException {
        request.setAction("SwitchUPhoneIndependentIp");
        return (SwitchUPhoneIndependentIpResponse)
                this.invoke(request, SwitchUPhoneIndependentIpResponse.class);
    }

    /**
     * SwitchUPhoneInstance - 故障更换云手机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SwitchUPhoneInstanceResponse switchUPhoneInstance(SwitchUPhoneInstanceRequest request)
            throws UCloudException {
        request.setAction("SwitchUPhoneInstance");
        return (SwitchUPhoneInstanceResponse)
                this.invoke(request, SwitchUPhoneInstanceResponse.class);
    }

    /**
     * UnInstallUPhoneAppVersion - 卸载云手机应用版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnInstallUPhoneAppVersionResponse unInstallUPhoneAppVersion(
            UnInstallUPhoneAppVersionRequest request) throws UCloudException {
        request.setAction("UnInstallUPhoneAppVersion");
        return (UnInstallUPhoneAppVersionResponse)
                this.invoke(request, UnInstallUPhoneAppVersionResponse.class);
    }

    /**
     * UpdateUPhoneImage - 更新云手机镜像信息。
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUPhoneImageResponse updateUPhoneImage(UpdateUPhoneImageRequest request)
            throws UCloudException {
        request.setAction("UpdateUPhoneImage");
        return (UpdateUPhoneImageResponse) this.invoke(request, UpdateUPhoneImageResponse.class);
    }
}
