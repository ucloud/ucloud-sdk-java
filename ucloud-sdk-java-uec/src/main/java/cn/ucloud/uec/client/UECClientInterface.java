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
package cn.ucloud.uec.client;

import cn.ucloud.common.client.Client;
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
import cn.ucloud.uec.models.DescribeUEcFirewallResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcFirewallResourceRequest;
import cn.ucloud.uec.models.DescribeUEcFirewallResourceResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcHolderRequest;
import cn.ucloud.uec.models.DescribeUEcHolderResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcHolderIDCRequest;
import cn.ucloud.uec.models.DescribeUEcHolderIDCResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcIDCRequest;
import cn.ucloud.uec.models.DescribeUEcIDCResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcSubnetRequest;
import cn.ucloud.uec.models.DescribeUEcSubnetResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcVHostRequest;
import cn.ucloud.uec.models.DescribeUEcVHostResponse;
        
        
        
import cn.ucloud.uec.models.DescribeUEcVHostISPRequest;
import cn.ucloud.uec.models.DescribeUEcVHostISPResponse;
        
        
        
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
        
        
        
import cn.ucloud.uec.models.UpdateUEcFirewallRequest;
import cn.ucloud.uec.models.UpdateUEcFirewallResponse;
        
        
        
import cn.ucloud.uec.models.UpdateUEcFirewallAttributeRequest;
import cn.ucloud.uec.models.UpdateUEcFirewallAttributeResponse;
        
        
        
import cn.ucloud.uec.models.UpdateUEcSubnetRequest;
import cn.ucloud.uec.models.UpdateUEcSubnetResponse;

/**
 * This client is used to call actions of **UEC** service
 */
public interface UECClientInterface extends Client {
        
        
        
        
        
        
    /**
     * BindUEcFirewall - 绑定防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindUEcFirewallResponse bindUEcFirewall(BindUEcFirewallRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUEcCustomImage - 创建自制镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcCustomImageResponse createUEcCustomImage(CreateUEcCustomImageRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUEcFirewall - 创建外网防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcFirewallResponse createUEcFirewall(CreateUEcFirewallRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUEcHolder - 创建容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcHolderResponse createUEcHolder(CreateUEcHolderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUEcSubnet - 创建子网
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcSubnetResponse createUEcSubnet(CreateUEcSubnetRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUEcVHost - 创建虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUEcVHostResponse createUEcVHost(CreateUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUEcCustomImage - 删除UEC客户自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcCustomImageResponse deleteUEcCustomImage(DeleteUEcCustomImageRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUEcHolder - 删除容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcHolderResponse deleteUEcHolder(DeleteUEcHolderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUEcSubnet - 删除子网
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcSubnetResponse deleteUEcSubnet(DeleteUEcSubnetRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUEcVHost - 删除vhost虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUEcVHostResponse deleteUEcVHost(DeleteUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcFirewall - 获取防火墙信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcFirewallResponse describeUEcFirewall(DescribeUEcFirewallRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcFirewallResource - 防火墙绑定的资源列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcFirewallResourceResponse describeUEcFirewallResource(DescribeUEcFirewallResourceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcHolder - 获得容器组信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcHolderResponse describeUEcHolder(DescribeUEcHolderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcHolderIDC - 获取容器组机房信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcHolderIDCResponse describeUEcHolderIDC(DescribeUEcHolderIDCRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcIDC - 获取IDC机房列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcIDCResponse describeUEcIDC(DescribeUEcIDCRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcSubnet - 获取子网列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcSubnetResponse describeUEcSubnet(DescribeUEcSubnetRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcVHost - 获取虚拟机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcVHostResponse describeUEcVHost(DescribeUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUEcVHostISP - 获取虚拟机运营商信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUEcVHostISPResponse describeUEcVHostISP(DescribeUEcVHostISPRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcHolderLog - 获取容器日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcHolderLogResponse getUEcHolderLog(GetUEcHolderLogRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcHolderMetrics - 获取容器监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcHolderMetricsResponse getUEcHolderMetrics(GetUEcHolderMetricsRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcIDCCutInfo - 获得机房割接信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcIDCCutInfoResponse getUEcIDCCutInfo(GetUEcIDCCutInfoRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcIDCVHostData - 获取机房虚拟机监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcIDCVHostDataResponse getUEcIDCVHostData(GetUEcIDCVHostDataRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcImage - 获取镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcImageResponse getUEcImage(GetUEcImageRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcPodPrice - 获得容器组价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcPodPriceResponse getUEcPodPrice(GetUEcPodPriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcUpgradePrice - 获取虚拟机调整差价
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcUpgradePriceResponse getUEcUpgradePrice(GetUEcUpgradePriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcVHostData - 获取虚拟机监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcVHostDataResponse getUEcVHostData(GetUEcVHostDataRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUEcVHostPrice - 获取虚拟机价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUEcVHostPriceResponse getUEcVHostPrice(GetUEcVHostPriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ImportUEcCustomImage - 导入自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ImportUEcCustomImageResponse importUEcCustomImage(ImportUEcCustomImageRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * LoginUEcDocker - 登录容器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public LoginUEcDockerResponse loginUEcDocker(LoginUEcDockerRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUEcBandwidth - 修改节点带宽限制
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcBandwidthResponse modifyUEcBandwidth(ModifyUEcBandwidthRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUEcHolderName - 修改容器组名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcHolderNameResponse modifyUEcHolderName(ModifyUEcHolderNameRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUEcImageName - 修改镜像名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUEcImageNameResponse modifyUEcImageName(ModifyUEcImageNameRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * PoweroffUEcVHost - 虚拟机断电
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffUEcVHostResponse poweroffUEcVHost(PoweroffUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ReinstallUEcVHost - 虚拟机重装系统
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallUEcVHostResponse reinstallUEcVHost(ReinstallUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * RestartUEcHolder - 重启容器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUEcHolderResponse restartUEcHolder(RestartUEcHolderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * RestartUEcVHost - 重启虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUEcVHostResponse restartUEcVHost(RestartUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * StartUEcVHost - 启动UEC虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartUEcVHostResponse startUEcVHost(StartUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * StopUEcVHost - 停止UEC虚拟机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUEcVHostResponse stopUEcVHost(StopUEcVHostRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UnBindUEcFirewall - 解绑防火墙
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindUEcFirewallResponse unBindUEcFirewall(UnBindUEcFirewallRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UpdateUEcFirewall - 更新防火墙信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcFirewallResponse updateUEcFirewall(UpdateUEcFirewallRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UpdateUEcFirewallAttribute - 更新防火墙属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcFirewallAttributeResponse updateUEcFirewallAttribute(UpdateUEcFirewallAttributeRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UpdateUEcSubnet - 更新子网信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUEcSubnetResponse updateUEcSubnet(UpdateUEcSubnetRequest request) throws UCloudException;
}
