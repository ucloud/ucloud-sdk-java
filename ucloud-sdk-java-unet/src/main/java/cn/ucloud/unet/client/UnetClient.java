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
package cn.ucloud.unet.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.unet.models.AllocateEIPRequest;
import cn.ucloud.unet.models.AllocateEIPResponse;
import cn.ucloud.unet.models.AllocateShareBandwidthRequest;
import cn.ucloud.unet.models.AllocateShareBandwidthResponse;
import cn.ucloud.unet.models.AssociateEIPWithShareBandwidthRequest;
import cn.ucloud.unet.models.AssociateEIPWithShareBandwidthResponse;
import cn.ucloud.unet.models.BindEIPRequest;
import cn.ucloud.unet.models.BindEIPResponse;
import cn.ucloud.unet.models.CreateBandwidthPackageRequest;
import cn.ucloud.unet.models.CreateBandwidthPackageResponse;
import cn.ucloud.unet.models.CreateFirewallRequest;
import cn.ucloud.unet.models.CreateFirewallResponse;
import cn.ucloud.unet.models.DeleteBandwidthPackageRequest;
import cn.ucloud.unet.models.DeleteBandwidthPackageResponse;
import cn.ucloud.unet.models.DeleteFirewallRequest;
import cn.ucloud.unet.models.DeleteFirewallResponse;
import cn.ucloud.unet.models.DescribeBandwidthPackageRequest;
import cn.ucloud.unet.models.DescribeBandwidthPackageResponse;
import cn.ucloud.unet.models.DescribeBandwidthUsageRequest;
import cn.ucloud.unet.models.DescribeBandwidthUsageResponse;
import cn.ucloud.unet.models.DescribeEIPRequest;
import cn.ucloud.unet.models.DescribeEIPResponse;
import cn.ucloud.unet.models.DescribeFirewallRequest;
import cn.ucloud.unet.models.DescribeFirewallResourceRequest;
import cn.ucloud.unet.models.DescribeFirewallResourceResponse;
import cn.ucloud.unet.models.DescribeFirewallResponse;
import cn.ucloud.unet.models.DescribeShareBandwidthRequest;
import cn.ucloud.unet.models.DescribeShareBandwidthResponse;
import cn.ucloud.unet.models.DisassociateEIPWithShareBandwidthRequest;
import cn.ucloud.unet.models.DisassociateEIPWithShareBandwidthResponse;
import cn.ucloud.unet.models.DisassociateFirewallRequest;
import cn.ucloud.unet.models.DisassociateFirewallResponse;
import cn.ucloud.unet.models.GetEIPPayModeRequest;
import cn.ucloud.unet.models.GetEIPPayModeResponse;
import cn.ucloud.unet.models.GetEIPPriceRequest;
import cn.ucloud.unet.models.GetEIPPriceResponse;
import cn.ucloud.unet.models.GetEIPUpgradePriceRequest;
import cn.ucloud.unet.models.GetEIPUpgradePriceResponse;
import cn.ucloud.unet.models.GetThroughputDailyBillingInfoRequest;
import cn.ucloud.unet.models.GetThroughputDailyBillingInfoResponse;
import cn.ucloud.unet.models.GrantFirewallRequest;
import cn.ucloud.unet.models.GrantFirewallResponse;
import cn.ucloud.unet.models.ModifyEIPBandwidthRequest;
import cn.ucloud.unet.models.ModifyEIPBandwidthResponse;
import cn.ucloud.unet.models.ModifyEIPWeightRequest;
import cn.ucloud.unet.models.ModifyEIPWeightResponse;
import cn.ucloud.unet.models.ReleaseEIPRequest;
import cn.ucloud.unet.models.ReleaseEIPResponse;
import cn.ucloud.unet.models.ReleaseShareBandwidthRequest;
import cn.ucloud.unet.models.ReleaseShareBandwidthResponse;
import cn.ucloud.unet.models.ResizeShareBandwidthRequest;
import cn.ucloud.unet.models.ResizeShareBandwidthResponse;
import cn.ucloud.unet.models.SetEIPPayModeRequest;
import cn.ucloud.unet.models.SetEIPPayModeResponse;
import cn.ucloud.unet.models.UnBindEIPRequest;
import cn.ucloud.unet.models.UnBindEIPResponse;
import cn.ucloud.unet.models.UpdateEIPAttributeRequest;
import cn.ucloud.unet.models.UpdateEIPAttributeResponse;
import cn.ucloud.unet.models.UpdateFirewallAttributeRequest;
import cn.ucloud.unet.models.UpdateFirewallAttributeResponse;
import cn.ucloud.unet.models.UpdateFirewallRequest;
import cn.ucloud.unet.models.UpdateFirewallResponse;

/** This client is used to call actions of **UNet** service */
public class UNetClient extends DefaultClient implements UNetClientInterface {
    public UNetClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AllocateEIP - 根据提供信息, 申请弹性IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AllocateEIP
     */
    public AllocateEIPResponse allocateEIP(AllocateEIPRequest request) throws UCloudException {
        request.setAction("AllocateEIP");
        return (AllocateEIPResponse) this.invoke(request, AllocateEIPResponse.class);
    }

    /**
     * AllocateShareBandwidth - 开通共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AllocateShareBandwidth
     */
    public AllocateShareBandwidthResponse allocateShareBandwidth(
            AllocateShareBandwidthRequest request) throws UCloudException {
        request.setAction("AllocateShareBandwidth");
        return (AllocateShareBandwidthResponse)
                this.invoke(request, AllocateShareBandwidthResponse.class);
    }

    /**
     * AssociateEIPWithShareBandwidth - 将EIP加入共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AssociateEIPWithShareBandwidth
     */
    public AssociateEIPWithShareBandwidthResponse associateEIPWithShareBandwidth(
            AssociateEIPWithShareBandwidthRequest request) throws UCloudException {
        request.setAction("AssociateEIPWithShareBandwidth");
        return (AssociateEIPWithShareBandwidthResponse)
                this.invoke(request, AssociateEIPWithShareBandwidthResponse.class);
    }

    /**
     * BindEIP - 将尚未使用的弹性IP绑定到指定的资源
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/BindEIP
     */
    public BindEIPResponse bindEIP(BindEIPRequest request) throws UCloudException {
        request.setAction("BindEIP");
        return (BindEIPResponse) this.invoke(request, BindEIPResponse.class);
    }

    /**
     * CreateBandwidthPackage - 为非共享带宽模式下, 已绑定资源实例的带宽计费弹性IP附加临时带宽包
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/CreateBandwidthPackage
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(
            CreateBandwidthPackageRequest request) throws UCloudException {
        request.setAction("CreateBandwidthPackage");
        return (CreateBandwidthPackageResponse)
                this.invoke(request, CreateBandwidthPackageResponse.class);
    }

    /**
     * CreateFirewall - 创建防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/CreateFirewall
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request)
            throws UCloudException {
        request.setAction("CreateFirewall");
        return (CreateFirewallResponse) this.invoke(request, CreateFirewallResponse.class);
    }

    /**
     * DeleteBandwidthPackage - 删除弹性IP上已附加带宽包
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DeleteBandwidthPackage
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(
            DeleteBandwidthPackageRequest request) throws UCloudException {
        request.setAction("DeleteBandwidthPackage");
        return (DeleteBandwidthPackageResponse)
                this.invoke(request, DeleteBandwidthPackageResponse.class);
    }

    /**
     * DeleteFirewall - 删除防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DeleteFirewall
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request)
            throws UCloudException {
        request.setAction("DeleteFirewall");
        return (DeleteFirewallResponse) this.invoke(request, DeleteFirewallResponse.class);
    }

    /**
     * DescribeBandwidthPackage - 获取某地域下的带宽包信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeBandwidthPackage
     */
    public DescribeBandwidthPackageResponse describeBandwidthPackage(
            DescribeBandwidthPackageRequest request) throws UCloudException {
        request.setAction("DescribeBandwidthPackage");
        return (DescribeBandwidthPackageResponse)
                this.invoke(request, DescribeBandwidthPackageResponse.class);
    }

    /**
     * DescribeBandwidthUsage - 获取带宽用量信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeBandwidthUsage
     */
    public DescribeBandwidthUsageResponse describeBandwidthUsage(
            DescribeBandwidthUsageRequest request) throws UCloudException {
        request.setAction("DescribeBandwidthUsage");
        return (DescribeBandwidthUsageResponse)
                this.invoke(request, DescribeBandwidthUsageResponse.class);
    }

    /**
     * DescribeEIP - 获取弹性IP信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeEIP
     */
    public DescribeEIPResponse describeEIP(DescribeEIPRequest request) throws UCloudException {
        request.setAction("DescribeEIP");
        return (DescribeEIPResponse) this.invoke(request, DescribeEIPResponse.class);
    }

    /**
     * DescribeFirewall - 获取防火墙组信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeFirewall
     */
    public DescribeFirewallResponse describeFirewall(DescribeFirewallRequest request)
            throws UCloudException {
        request.setAction("DescribeFirewall");
        return (DescribeFirewallResponse) this.invoke(request, DescribeFirewallResponse.class);
    }

    /**
     * DescribeFirewallResource - 获取防火墙组所绑定资源的外网IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeFirewallResource
     */
    public DescribeFirewallResourceResponse describeFirewallResource(
            DescribeFirewallResourceRequest request) throws UCloudException {
        request.setAction("DescribeFirewallResource");
        return (DescribeFirewallResourceResponse)
                this.invoke(request, DescribeFirewallResourceResponse.class);
    }

    /**
     * DescribeShareBandwidth - 获取共享带宽信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeShareBandwidth
     */
    public DescribeShareBandwidthResponse describeShareBandwidth(
            DescribeShareBandwidthRequest request) throws UCloudException {
        request.setAction("DescribeShareBandwidth");
        return (DescribeShareBandwidthResponse)
                this.invoke(request, DescribeShareBandwidthResponse.class);
    }

    /**
     * DisassociateEIPWithShareBandwidth - 将EIP移出共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DisassociateEIPWithShareBandwidth
     */
    public DisassociateEIPWithShareBandwidthResponse disassociateEIPWithShareBandwidth(
            DisassociateEIPWithShareBandwidthRequest request) throws UCloudException {
        request.setAction("DisassociateEIPWithShareBandwidth");
        return (DisassociateEIPWithShareBandwidthResponse)
                this.invoke(request, DisassociateEIPWithShareBandwidthResponse.class);
    }

    /**
     * DisassociateFirewall - 解绑资源上的防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DisassociateFirewall
     */
    public DisassociateFirewallResponse disassociateFirewall(DisassociateFirewallRequest request)
            throws UCloudException {
        request.setAction("DisassociateFirewall");
        return (DisassociateFirewallResponse)
                this.invoke(request, DisassociateFirewallResponse.class);
    }

    /**
     * GetEIPPayMode - 获取弹性IP计费模式
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPPayMode
     */
    public GetEIPPayModeResponse getEIPPayMode(GetEIPPayModeRequest request)
            throws UCloudException {
        request.setAction("GetEIPPayMode");
        return (GetEIPPayModeResponse) this.invoke(request, GetEIPPayModeResponse.class);
    }

    /**
     * GetEIPPrice - 获取弹性IP价格
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPPrice
     */
    public GetEIPPriceResponse getEIPPrice(GetEIPPriceRequest request) throws UCloudException {
        request.setAction("GetEIPPrice");
        return (GetEIPPriceResponse) this.invoke(request, GetEIPPriceResponse.class);
    }

    /**
     * GetEIPUpgradePrice - 获取弹性IP带宽改动价格
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPUpgradePrice
     */
    public GetEIPUpgradePriceResponse getEIPUpgradePrice(GetEIPUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetEIPUpgradePrice");
        return (GetEIPUpgradePriceResponse) this.invoke(request, GetEIPUpgradePriceResponse.class);
    }

    /**
     * GetThroughputDailyBillingInfo - 获取流量计费EIP每日流量计费信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetThroughputDailyBillingInfo
     */
    public GetThroughputDailyBillingInfoResponse getThroughputDailyBillingInfo(
            GetThroughputDailyBillingInfoRequest request) throws UCloudException {
        request.setAction("GetThroughputDailyBillingInfo");
        return (GetThroughputDailyBillingInfoResponse)
                this.invoke(request, GetThroughputDailyBillingInfoResponse.class);
    }

    /**
     * GrantFirewall - 将防火墙应用到资源上
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GrantFirewall
     */
    public GrantFirewallResponse grantFirewall(GrantFirewallRequest request)
            throws UCloudException {
        request.setAction("GrantFirewall");
        return (GrantFirewallResponse) this.invoke(request, GrantFirewallResponse.class);
    }

    /**
     * ModifyEIPBandwidth - 调整弹性IP的外网带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ModifyEIPBandwidth
     */
    public ModifyEIPBandwidthResponse modifyEIPBandwidth(ModifyEIPBandwidthRequest request)
            throws UCloudException {
        request.setAction("ModifyEIPBandwidth");
        return (ModifyEIPBandwidthResponse) this.invoke(request, ModifyEIPBandwidthResponse.class);
    }

    /**
     * ModifyEIPWeight - 修改弹性IP的外网出口权重
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ModifyEIPWeight
     */
    public ModifyEIPWeightResponse modifyEIPWeight(ModifyEIPWeightRequest request)
            throws UCloudException {
        request.setAction("ModifyEIPWeight");
        return (ModifyEIPWeightResponse) this.invoke(request, ModifyEIPWeightResponse.class);
    }

    /**
     * ReleaseEIP - 释放弹性IP资源, 所释放弹性IP必须为非绑定状态.
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ReleaseEIP
     */
    public ReleaseEIPResponse releaseEIP(ReleaseEIPRequest request) throws UCloudException {
        request.setAction("ReleaseEIP");
        return (ReleaseEIPResponse) this.invoke(request, ReleaseEIPResponse.class);
    }

    /**
     * ReleaseShareBandwidth - 关闭共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ReleaseShareBandwidth
     */
    public ReleaseShareBandwidthResponse releaseShareBandwidth(ReleaseShareBandwidthRequest request)
            throws UCloudException {
        request.setAction("ReleaseShareBandwidth");
        return (ReleaseShareBandwidthResponse)
                this.invoke(request, ReleaseShareBandwidthResponse.class);
    }

    /**
     * ResizeShareBandwidth - 调整共享带宽的带宽值
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ResizeShareBandwidth
     */
    public ResizeShareBandwidthResponse resizeShareBandwidth(ResizeShareBandwidthRequest request)
            throws UCloudException {
        request.setAction("ResizeShareBandwidth");
        return (ResizeShareBandwidthResponse)
                this.invoke(request, ResizeShareBandwidthResponse.class);
    }

    /**
     * SetEIPPayMode - 设置弹性IP计费模式, 切换时会涉及付费/退费.
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/SetEIPPayMode
     */
    public SetEIPPayModeResponse setEIPPayMode(SetEIPPayModeRequest request)
            throws UCloudException {
        request.setAction("SetEIPPayMode");
        return (SetEIPPayModeResponse) this.invoke(request, SetEIPPayModeResponse.class);
    }

    /**
     * UnBindEIP - 将弹性IP从资源上解绑
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UnBindEIP
     */
    public UnBindEIPResponse unBindEIP(UnBindEIPRequest request) throws UCloudException {
        request.setAction("UnBindEIP");
        return (UnBindEIPResponse) this.invoke(request, UnBindEIPResponse.class);
    }

    /**
     * UpdateEIPAttribute - 更新弹性IP名称，业务组，备注等属性字段
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateEIPAttribute
     */
    public UpdateEIPAttributeResponse updateEIPAttribute(UpdateEIPAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateEIPAttribute");
        return (UpdateEIPAttributeResponse) this.invoke(request, UpdateEIPAttributeResponse.class);
    }

    /**
     * UpdateFirewall - 更新防火墙规则
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateFirewall
     */
    public UpdateFirewallResponse updateFirewall(UpdateFirewallRequest request)
            throws UCloudException {
        request.setAction("UpdateFirewall");
        return (UpdateFirewallResponse) this.invoke(request, UpdateFirewallResponse.class);
    }

    /**
     * UpdateFirewallAttribute - 更新防火墙规则
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateFirewallAttribute
     */
    public UpdateFirewallAttributeResponse updateFirewallAttribute(
            UpdateFirewallAttributeRequest request) throws UCloudException {
        request.setAction("UpdateFirewallAttribute");
        return (UpdateFirewallAttributeResponse)
                this.invoke(request, UpdateFirewallAttributeResponse.class);
    }
}
