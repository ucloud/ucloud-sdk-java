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
package cn.ucloud.uec.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uec.models.BindUEcFirewallRequest;
import cn.ucloud.uec.models.BindUEcFirewallResponse;
import cn.ucloud.uec.models.CreateUEcCustomImageRequest;
import cn.ucloud.uec.models.CreateUEcCustomImageResponse;
import cn.ucloud.uec.models.CreateUEcFirewallRequest;
import cn.ucloud.uec.models.CreateUEcFirewallResponse;
import cn.ucloud.uec.models.CreateUEcHolderRequest;
import cn.ucloud.uec.models.CreateUEcHolderResponse;
import cn.ucloud.uec.models.CreateUEcSubnetRequest;
import cn.ucloud.uec.models.CreateUEcSubnetResponse;
import cn.ucloud.uec.models.CreateUEcVHostRequest;
import cn.ucloud.uec.models.CreateUEcVHostResponse;
import cn.ucloud.uec.models.DeleteUEcCustomImageRequest;
import cn.ucloud.uec.models.DeleteUEcCustomImageResponse;
import cn.ucloud.uec.models.DeleteUEcHolderRequest;
import cn.ucloud.uec.models.DeleteUEcHolderResponse;
import cn.ucloud.uec.models.DeleteUEcSubnetRequest;
import cn.ucloud.uec.models.DeleteUEcSubnetResponse;
import cn.ucloud.uec.models.DeleteUEcVHostRequest;
import cn.ucloud.uec.models.DeleteUEcVHostResponse;
import cn.ucloud.uec.models.DescribeUEcFirewallRequest;
import cn.ucloud.uec.models.DescribeUEcFirewallResourceRequest;
import cn.ucloud.uec.models.DescribeUEcFirewallResourceResponse;
import cn.ucloud.uec.models.DescribeUEcFirewallResponse;
import cn.ucloud.uec.models.DescribeUEcHolderIDCRequest;
import cn.ucloud.uec.models.DescribeUEcHolderIDCResponse;
import cn.ucloud.uec.models.DescribeUEcHolderRequest;
import cn.ucloud.uec.models.DescribeUEcHolderResponse;
import cn.ucloud.uec.models.DescribeUEcIDCRequest;
import cn.ucloud.uec.models.DescribeUEcIDCResponse;
import cn.ucloud.uec.models.DescribeUEcSubnetRequest;
import cn.ucloud.uec.models.DescribeUEcSubnetResponse;
import cn.ucloud.uec.models.DescribeUEcVHostISPRequest;
import cn.ucloud.uec.models.DescribeUEcVHostISPResponse;
import cn.ucloud.uec.models.DescribeUEcVHostRequest;
import cn.ucloud.uec.models.DescribeUEcVHostResponse;
import cn.ucloud.uec.models.GetUEcHolderLogRequest;
import cn.ucloud.uec.models.GetUEcHolderLogResponse;
import cn.ucloud.uec.models.GetUEcHolderMetricsRequest;
import cn.ucloud.uec.models.GetUEcHolderMetricsResponse;
import cn.ucloud.uec.models.GetUEcIDCCutInfoRequest;
import cn.ucloud.uec.models.GetUEcIDCCutInfoResponse;
import cn.ucloud.uec.models.GetUEcIDCVHostDataRequest;
import cn.ucloud.uec.models.GetUEcIDCVHostDataResponse;
import cn.ucloud.uec.models.GetUEcImageRequest;
import cn.ucloud.uec.models.GetUEcImageResponse;
import cn.ucloud.uec.models.GetUEcPodPriceRequest;
import cn.ucloud.uec.models.GetUEcPodPriceResponse;
import cn.ucloud.uec.models.GetUEcUpgradePriceRequest;
import cn.ucloud.uec.models.GetUEcUpgradePriceResponse;
import cn.ucloud.uec.models.GetUEcVHostDataRequest;
import cn.ucloud.uec.models.GetUEcVHostDataResponse;
import cn.ucloud.uec.models.GetUEcVHostPriceRequest;
import cn.ucloud.uec.models.GetUEcVHostPriceResponse;
import cn.ucloud.uec.models.ImportUEcCustomImageRequest;
import cn.ucloud.uec.models.ImportUEcCustomImageResponse;
import cn.ucloud.uec.models.LoginUEcDockerRequest;
import cn.ucloud.uec.models.LoginUEcDockerResponse;
import cn.ucloud.uec.models.ModifyUEcBandwidthRequest;
import cn.ucloud.uec.models.ModifyUEcBandwidthResponse;
import cn.ucloud.uec.models.ModifyUEcHolderNameRequest;
import cn.ucloud.uec.models.ModifyUEcHolderNameResponse;
import cn.ucloud.uec.models.ModifyUEcImageNameRequest;
import cn.ucloud.uec.models.ModifyUEcImageNameResponse;
import cn.ucloud.uec.models.PoweroffUEcVHostRequest;
import cn.ucloud.uec.models.PoweroffUEcVHostResponse;
import cn.ucloud.uec.models.ReinstallUEcVHostRequest;
import cn.ucloud.uec.models.ReinstallUEcVHostResponse;
import cn.ucloud.uec.models.RestartUEcHolderRequest;
import cn.ucloud.uec.models.RestartUEcHolderResponse;
import cn.ucloud.uec.models.RestartUEcVHostRequest;
import cn.ucloud.uec.models.RestartUEcVHostResponse;
import cn.ucloud.uec.models.StartUEcVHostRequest;
import cn.ucloud.uec.models.StartUEcVHostResponse;
import cn.ucloud.uec.models.StopUEcVHostRequest;
import cn.ucloud.uec.models.StopUEcVHostResponse;
import cn.ucloud.uec.models.UnBindUEcFirewallRequest;
import cn.ucloud.uec.models.UnBindUEcFirewallResponse;
import cn.ucloud.uec.models.UpdateUEcFirewallAttributeRequest;
import cn.ucloud.uec.models.UpdateUEcFirewallAttributeResponse;
import cn.ucloud.uec.models.UpdateUEcFirewallRequest;
import cn.ucloud.uec.models.UpdateUEcFirewallResponse;
import cn.ucloud.uec.models.UpdateUEcSubnetRequest;
import cn.ucloud.uec.models.UpdateUEcSubnetResponse;

/** This client is used to call actions of **UEC** service */
public class UECClient extends DefaultClient implements UECClientInterface {
    public UECClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BindUEcFirewall - 绑定防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindUEcFirewallResponse bindUEcFirewall(BindUEcFirewallRequest request)
            throws UCloudException {
        request.setAction("BindUEcFirewall");
        return (BindUEcFirewallResponse) this.invoke(request, BindUEcFirewallResponse.class);
    }

    /**
     * CreateUEcCustomImage - 创建自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcCustomImageResponse createUEcCustomImage(CreateUEcCustomImageRequest request)
            throws UCloudException {
        request.setAction("CreateUEcCustomImage");
        return (CreateUEcCustomImageResponse)
                this.invoke(request, CreateUEcCustomImageResponse.class);
    }

    /**
     * CreateUEcFirewall - 创建外网防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcFirewallResponse createUEcFirewall(CreateUEcFirewallRequest request)
            throws UCloudException {
        request.setAction("CreateUEcFirewall");
        return (CreateUEcFirewallResponse) this.invoke(request, CreateUEcFirewallResponse.class);
    }

    /**
     * CreateUEcHolder - 创建容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcHolderResponse createUEcHolder(CreateUEcHolderRequest request)
            throws UCloudException {
        request.setAction("CreateUEcHolder");
        return (CreateUEcHolderResponse) this.invoke(request, CreateUEcHolderResponse.class);
    }

    /**
     * CreateUEcSubnet - 创建子网
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcSubnetResponse createUEcSubnet(CreateUEcSubnetRequest request)
            throws UCloudException {
        request.setAction("CreateUEcSubnet");
        return (CreateUEcSubnetResponse) this.invoke(request, CreateUEcSubnetResponse.class);
    }

    /**
     * CreateUEcVHost - 创建虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcVHostResponse createUEcVHost(CreateUEcVHostRequest request)
            throws UCloudException {
        request.setAction("CreateUEcVHost");
        return (CreateUEcVHostResponse) this.invoke(request, CreateUEcVHostResponse.class);
    }

    /**
     * DeleteUEcCustomImage - 删除UEC客户自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcCustomImageResponse deleteUEcCustomImage(DeleteUEcCustomImageRequest request)
            throws UCloudException {
        request.setAction("DeleteUEcCustomImage");
        return (DeleteUEcCustomImageResponse)
                this.invoke(request, DeleteUEcCustomImageResponse.class);
    }

    /**
     * DeleteUEcHolder - 删除容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcHolderResponse deleteUEcHolder(DeleteUEcHolderRequest request)
            throws UCloudException {
        request.setAction("DeleteUEcHolder");
        return (DeleteUEcHolderResponse) this.invoke(request, DeleteUEcHolderResponse.class);
    }

    /**
     * DeleteUEcSubnet - 删除子网
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcSubnetResponse deleteUEcSubnet(DeleteUEcSubnetRequest request)
            throws UCloudException {
        request.setAction("DeleteUEcSubnet");
        return (DeleteUEcSubnetResponse) this.invoke(request, DeleteUEcSubnetResponse.class);
    }

    /**
     * DeleteUEcVHost - 删除vhost虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcVHostResponse deleteUEcVHost(DeleteUEcVHostRequest request)
            throws UCloudException {
        request.setAction("DeleteUEcVHost");
        return (DeleteUEcVHostResponse) this.invoke(request, DeleteUEcVHostResponse.class);
    }

    /**
     * DescribeUEcFirewall - 获取防火墙信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcFirewallResponse describeUEcFirewall(DescribeUEcFirewallRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcFirewall");
        return (DescribeUEcFirewallResponse)
                this.invoke(request, DescribeUEcFirewallResponse.class);
    }

    /**
     * DescribeUEcFirewallResource - 防火墙绑定的资源列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcFirewallResourceResponse describeUEcFirewallResource(
            DescribeUEcFirewallResourceRequest request) throws UCloudException {
        request.setAction("DescribeUEcFirewallResource");
        return (DescribeUEcFirewallResourceResponse)
                this.invoke(request, DescribeUEcFirewallResourceResponse.class);
    }

    /**
     * DescribeUEcHolder - 获得容器组信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcHolderResponse describeUEcHolder(DescribeUEcHolderRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcHolder");
        return (DescribeUEcHolderResponse) this.invoke(request, DescribeUEcHolderResponse.class);
    }

    /**
     * DescribeUEcHolderIDC - 获取容器组机房信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcHolderIDCResponse describeUEcHolderIDC(DescribeUEcHolderIDCRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcHolderIDC");
        return (DescribeUEcHolderIDCResponse)
                this.invoke(request, DescribeUEcHolderIDCResponse.class);
    }

    /**
     * DescribeUEcIDC - 获取IDC机房列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcIDCResponse describeUEcIDC(DescribeUEcIDCRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcIDC");
        return (DescribeUEcIDCResponse) this.invoke(request, DescribeUEcIDCResponse.class);
    }

    /**
     * DescribeUEcSubnet - 获取子网列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcSubnetResponse describeUEcSubnet(DescribeUEcSubnetRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcSubnet");
        return (DescribeUEcSubnetResponse) this.invoke(request, DescribeUEcSubnetResponse.class);
    }

    /**
     * DescribeUEcVHost - 获取虚拟机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcVHostResponse describeUEcVHost(DescribeUEcVHostRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcVHost");
        return (DescribeUEcVHostResponse) this.invoke(request, DescribeUEcVHostResponse.class);
    }

    /**
     * DescribeUEcVHostISP - 获取虚拟机运营商信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcVHostISPResponse describeUEcVHostISP(DescribeUEcVHostISPRequest request)
            throws UCloudException {
        request.setAction("DescribeUEcVHostISP");
        return (DescribeUEcVHostISPResponse)
                this.invoke(request, DescribeUEcVHostISPResponse.class);
    }

    /**
     * GetUEcHolderLog - 获取容器日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcHolderLogResponse getUEcHolderLog(GetUEcHolderLogRequest request)
            throws UCloudException {
        request.setAction("GetUEcHolderLog");
        return (GetUEcHolderLogResponse) this.invoke(request, GetUEcHolderLogResponse.class);
    }

    /**
     * GetUEcHolderMetrics - 获取容器监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcHolderMetricsResponse getUEcHolderMetrics(GetUEcHolderMetricsRequest request)
            throws UCloudException {
        request.setAction("GetUEcHolderMetrics");
        return (GetUEcHolderMetricsResponse)
                this.invoke(request, GetUEcHolderMetricsResponse.class);
    }

    /**
     * GetUEcIDCCutInfo - 获得机房割接信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcIDCCutInfoResponse getUEcIDCCutInfo(GetUEcIDCCutInfoRequest request)
            throws UCloudException {
        request.setAction("GetUEcIDCCutInfo");
        return (GetUEcIDCCutInfoResponse) this.invoke(request, GetUEcIDCCutInfoResponse.class);
    }

    /**
     * GetUEcIDCVHostData - 获取机房虚拟机监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcIDCVHostDataResponse getUEcIDCVHostData(GetUEcIDCVHostDataRequest request)
            throws UCloudException {
        request.setAction("GetUEcIDCVHostData");
        return (GetUEcIDCVHostDataResponse) this.invoke(request, GetUEcIDCVHostDataResponse.class);
    }

    /**
     * GetUEcImage - 获取镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcImageResponse getUEcImage(GetUEcImageRequest request) throws UCloudException {
        request.setAction("GetUEcImage");
        return (GetUEcImageResponse) this.invoke(request, GetUEcImageResponse.class);
    }

    /**
     * GetUEcPodPrice - 获得容器组价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcPodPriceResponse getUEcPodPrice(GetUEcPodPriceRequest request)
            throws UCloudException {
        request.setAction("GetUEcPodPrice");
        return (GetUEcPodPriceResponse) this.invoke(request, GetUEcPodPriceResponse.class);
    }

    /**
     * GetUEcUpgradePrice - 获取虚拟机调整差价
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcUpgradePriceResponse getUEcUpgradePrice(GetUEcUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetUEcUpgradePrice");
        return (GetUEcUpgradePriceResponse) this.invoke(request, GetUEcUpgradePriceResponse.class);
    }

    /**
     * GetUEcVHostData - 获取虚拟机监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcVHostDataResponse getUEcVHostData(GetUEcVHostDataRequest request)
            throws UCloudException {
        request.setAction("GetUEcVHostData");
        return (GetUEcVHostDataResponse) this.invoke(request, GetUEcVHostDataResponse.class);
    }

    /**
     * GetUEcVHostPrice - 获取虚拟机价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcVHostPriceResponse getUEcVHostPrice(GetUEcVHostPriceRequest request)
            throws UCloudException {
        request.setAction("GetUEcVHostPrice");
        return (GetUEcVHostPriceResponse) this.invoke(request, GetUEcVHostPriceResponse.class);
    }

    /**
     * ImportUEcCustomImage - 导入自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ImportUEcCustomImageResponse importUEcCustomImage(ImportUEcCustomImageRequest request)
            throws UCloudException {
        request.setAction("ImportUEcCustomImage");
        return (ImportUEcCustomImageResponse)
                this.invoke(request, ImportUEcCustomImageResponse.class);
    }

    /**
     * LoginUEcDocker - 登录容器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public LoginUEcDockerResponse loginUEcDocker(LoginUEcDockerRequest request)
            throws UCloudException {
        request.setAction("LoginUEcDocker");
        return (LoginUEcDockerResponse) this.invoke(request, LoginUEcDockerResponse.class);
    }

    /**
     * ModifyUEcBandwidth - 修改节点带宽限制
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcBandwidthResponse modifyUEcBandwidth(ModifyUEcBandwidthRequest request)
            throws UCloudException {
        request.setAction("ModifyUEcBandwidth");
        return (ModifyUEcBandwidthResponse) this.invoke(request, ModifyUEcBandwidthResponse.class);
    }

    /**
     * ModifyUEcHolderName - 修改容器组名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcHolderNameResponse modifyUEcHolderName(ModifyUEcHolderNameRequest request)
            throws UCloudException {
        request.setAction("ModifyUEcHolderName");
        return (ModifyUEcHolderNameResponse)
                this.invoke(request, ModifyUEcHolderNameResponse.class);
    }

    /**
     * ModifyUEcImageName - 修改镜像名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcImageNameResponse modifyUEcImageName(ModifyUEcImageNameRequest request)
            throws UCloudException {
        request.setAction("ModifyUEcImageName");
        return (ModifyUEcImageNameResponse) this.invoke(request, ModifyUEcImageNameResponse.class);
    }

    /**
     * PoweroffUEcVHost - 虚拟机断电
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffUEcVHostResponse poweroffUEcVHost(PoweroffUEcVHostRequest request)
            throws UCloudException {
        request.setAction("PoweroffUEcVHost");
        return (PoweroffUEcVHostResponse) this.invoke(request, PoweroffUEcVHostResponse.class);
    }

    /**
     * ReinstallUEcVHost - 虚拟机重装系统
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallUEcVHostResponse reinstallUEcVHost(ReinstallUEcVHostRequest request)
            throws UCloudException {
        request.setAction("ReinstallUEcVHost");
        return (ReinstallUEcVHostResponse) this.invoke(request, ReinstallUEcVHostResponse.class);
    }

    /**
     * RestartUEcHolder - 重启容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUEcHolderResponse restartUEcHolder(RestartUEcHolderRequest request)
            throws UCloudException {
        request.setAction("RestartUEcHolder");
        return (RestartUEcHolderResponse) this.invoke(request, RestartUEcHolderResponse.class);
    }

    /**
     * RestartUEcVHost - 重启虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUEcVHostResponse restartUEcVHost(RestartUEcVHostRequest request)
            throws UCloudException {
        request.setAction("RestartUEcVHost");
        return (RestartUEcVHostResponse) this.invoke(request, RestartUEcVHostResponse.class);
    }

    /**
     * StartUEcVHost - 启动UEC虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartUEcVHostResponse startUEcVHost(StartUEcVHostRequest request)
            throws UCloudException {
        request.setAction("StartUEcVHost");
        return (StartUEcVHostResponse) this.invoke(request, StartUEcVHostResponse.class);
    }

    /**
     * StopUEcVHost - 停止UEC虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUEcVHostResponse stopUEcVHost(StopUEcVHostRequest request) throws UCloudException {
        request.setAction("StopUEcVHost");
        return (StopUEcVHostResponse) this.invoke(request, StopUEcVHostResponse.class);
    }

    /**
     * UnBindUEcFirewall - 解绑防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindUEcFirewallResponse unBindUEcFirewall(UnBindUEcFirewallRequest request)
            throws UCloudException {
        request.setAction("UnBindUEcFirewall");
        return (UnBindUEcFirewallResponse) this.invoke(request, UnBindUEcFirewallResponse.class);
    }

    /**
     * UpdateUEcFirewall - 更新防火墙信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcFirewallResponse updateUEcFirewall(UpdateUEcFirewallRequest request)
            throws UCloudException {
        request.setAction("UpdateUEcFirewall");
        return (UpdateUEcFirewallResponse) this.invoke(request, UpdateUEcFirewallResponse.class);
    }

    /**
     * UpdateUEcFirewallAttribute - 更新防火墙属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcFirewallAttributeResponse updateUEcFirewallAttribute(
            UpdateUEcFirewallAttributeRequest request) throws UCloudException {
        request.setAction("UpdateUEcFirewallAttribute");
        return (UpdateUEcFirewallAttributeResponse)
                this.invoke(request, UpdateUEcFirewallAttributeResponse.class);
    }

    /**
     * UpdateUEcSubnet - 更新子网信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcSubnetResponse updateUEcSubnet(UpdateUEcSubnetRequest request)
            throws UCloudException {
        request.setAction("UpdateUEcSubnet");
        return (UpdateUEcSubnetResponse) this.invoke(request, UpdateUEcSubnetResponse.class);
    }
}
