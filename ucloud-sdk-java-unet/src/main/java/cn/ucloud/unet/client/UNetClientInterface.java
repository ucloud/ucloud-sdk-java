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

import cn.ucloud.common.client.Client;
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
public interface UNetClientInterface extends Client {

    /**
     * AllocateEIP - 申请弹性IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AllocateEIP
     */
    public AllocateEIPResponse allocateEIP(AllocateEIPRequest request) throws UCloudException;

    /**
     * AllocateShareBandwidth - 开通共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AllocateShareBandwidth
     */
    public AllocateShareBandwidthResponse allocateShareBandwidth(
            AllocateShareBandwidthRequest request) throws UCloudException;

    /**
     * AssociateEIPWithShareBandwidth - 将EIP加入共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/AssociateEIPWithShareBandwidth
     */
    public AssociateEIPWithShareBandwidthResponse associateEIPWithShareBandwidth(
            AssociateEIPWithShareBandwidthRequest request) throws UCloudException;

    /**
     * BindEIP - 绑定弹性IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/BindEIP
     */
    public BindEIPResponse bindEIP(BindEIPRequest request) throws UCloudException;

    /**
     * CreateBandwidthPackage - 创建带宽包
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/CreateBandwidthPackage
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(
            CreateBandwidthPackageRequest request) throws UCloudException;

    /**
     * CreateFirewall - 创建防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/CreateFirewall
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request)
            throws UCloudException;

    /**
     * DeleteBandwidthPackage - 删除带宽包
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DeleteBandwidthPackage
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(
            DeleteBandwidthPackageRequest request) throws UCloudException;

    /**
     * DeleteFirewall - 删除防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DeleteFirewall
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request)
            throws UCloudException;

    /**
     * DescribeBandwidthPackage - 获取带宽包信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeBandwidthPackage
     */
    public DescribeBandwidthPackageResponse describeBandwidthPackage(
            DescribeBandwidthPackageRequest request) throws UCloudException;

    /**
     * DescribeBandwidthUsage - 获取带宽用量
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeBandwidthUsage
     */
    public DescribeBandwidthUsageResponse describeBandwidthUsage(
            DescribeBandwidthUsageRequest request) throws UCloudException;

    /**
     * DescribeEIP - 获取弹性IP信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeEIP
     */
    public DescribeEIPResponse describeEIP(DescribeEIPRequest request) throws UCloudException;

    /**
     * DescribeFirewall - 获取防火墙信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeFirewall
     */
    public DescribeFirewallResponse describeFirewall(DescribeFirewallRequest request)
            throws UCloudException;

    /**
     * DescribeFirewallResource - 获取防火墙绑定资源
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeFirewallResource
     */
    public DescribeFirewallResourceResponse describeFirewallResource(
            DescribeFirewallResourceRequest request) throws UCloudException;

    /**
     * DescribeShareBandwidth - 获取共享带宽信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DescribeShareBandwidth
     */
    public DescribeShareBandwidthResponse describeShareBandwidth(
            DescribeShareBandwidthRequest request) throws UCloudException;

    /**
     * DisassociateEIPWithShareBandwidth - 将EIP移出共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DisassociateEIPWithShareBandwidth
     */
    public DisassociateEIPWithShareBandwidthResponse disassociateEIPWithShareBandwidth(
            DisassociateEIPWithShareBandwidthRequest request) throws UCloudException;

    /**
     * DisassociateFirewall - 解绑防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/DisassociateFirewall
     */
    public DisassociateFirewallResponse disassociateFirewall(DisassociateFirewallRequest request)
            throws UCloudException;

    /**
     * GetEIPPayMode - 获取弹性IP计费方式
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPPayMode
     */
    public GetEIPPayModeResponse getEIPPayMode(GetEIPPayModeRequest request) throws UCloudException;

    /**
     * GetEIPPrice - 获取弹性IP价格
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPPrice
     */
    public GetEIPPriceResponse getEIPPrice(GetEIPPriceRequest request) throws UCloudException;

    /**
     * GetEIPUpgradePrice - 获取弹性IP带宽改动价格
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetEIPUpgradePrice
     */
    public GetEIPUpgradePriceResponse getEIPUpgradePrice(GetEIPUpgradePriceRequest request)
            throws UCloudException;

    /**
     * GetThroughputDailyBillingInfo - 获取流量计费EIP每日流量计费信息
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GetThroughputDailyBillingInfo
     */
    public GetThroughputDailyBillingInfoResponse getThroughputDailyBillingInfo(
            GetThroughputDailyBillingInfoRequest request) throws UCloudException;

    /**
     * GrantFirewall - 应用防火墙
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/GrantFirewall
     */
    public GrantFirewallResponse grantFirewall(GrantFirewallRequest request) throws UCloudException;

    /**
     * ModifyEIPBandwidth - 调整弹性IP带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ModifyEIPBandwidth
     */
    public ModifyEIPBandwidthResponse modifyEIPBandwidth(ModifyEIPBandwidthRequest request)
            throws UCloudException;

    /**
     * ModifyEIPWeight - 修改弹性IP出口权重
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ModifyEIPWeight
     */
    public ModifyEIPWeightResponse modifyEIPWeight(ModifyEIPWeightRequest request)
            throws UCloudException;

    /**
     * ReleaseEIP - 释放弹性IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ReleaseEIP
     */
    public ReleaseEIPResponse releaseEIP(ReleaseEIPRequest request) throws UCloudException;

    /**
     * ReleaseShareBandwidth - 关闭共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ReleaseShareBandwidth
     */
    public ReleaseShareBandwidthResponse releaseShareBandwidth(ReleaseShareBandwidthRequest request)
            throws UCloudException;

    /**
     * ResizeShareBandwidth - 调整共享带宽
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/ResizeShareBandwidth
     */
    public ResizeShareBandwidthResponse resizeShareBandwidth(ResizeShareBandwidthRequest request)
            throws UCloudException;

    /**
     * SetEIPPayMode - 设置弹性IP计费方式
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/SetEIPPayMode
     */
    public SetEIPPayModeResponse setEIPPayMode(SetEIPPayModeRequest request) throws UCloudException;

    /**
     * UnBindEIP - 解绑弹性IP
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UnBindEIP
     */
    public UnBindEIPResponse unBindEIP(UnBindEIPRequest request) throws UCloudException;

    /**
     * UpdateEIPAttribute - 更新弹性IP属性
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateEIPAttribute
     */
    public UpdateEIPAttributeResponse updateEIPAttribute(UpdateEIPAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateFirewall - 更新防火墙规则
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateFirewall
     */
    public UpdateFirewallResponse updateFirewall(UpdateFirewallRequest request)
            throws UCloudException;

    /**
     * UpdateFirewallAttribute - 更新防火墙属性
     *
     * <p>See also: https://docs.ucloud.cn/api/unet-api/UpdateFirewallAttribute
     */
    public UpdateFirewallAttributeResponse updateFirewallAttribute(
            UpdateFirewallAttributeRequest request) throws UCloudException;
}
