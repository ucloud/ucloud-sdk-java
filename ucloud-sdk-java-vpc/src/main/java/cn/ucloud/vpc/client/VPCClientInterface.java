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
package cn.ucloud.vpc.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.vpc.models.AddSnatRuleRequest;
import cn.ucloud.vpc.models.AddSnatRuleResponse;
import cn.ucloud.vpc.models.AddVPCNetworkRequest;
import cn.ucloud.vpc.models.AddVPCNetworkResponse;
import cn.ucloud.vpc.models.AddWhiteListResourceRequest;
import cn.ucloud.vpc.models.AddWhiteListResourceResponse;
import cn.ucloud.vpc.models.AllocateSecondaryIpRequest;
import cn.ucloud.vpc.models.AllocateSecondaryIpResponse;
import cn.ucloud.vpc.models.AllocateVIPRequest;
import cn.ucloud.vpc.models.AllocateVIPResponse;
import cn.ucloud.vpc.models.AssociateRouteTableRequest;
import cn.ucloud.vpc.models.AssociateRouteTableResponse;
import cn.ucloud.vpc.models.CloneRouteTableRequest;
import cn.ucloud.vpc.models.CloneRouteTableResponse;
import cn.ucloud.vpc.models.CreateNATGWPolicyRequest;
import cn.ucloud.vpc.models.CreateNATGWPolicyResponse;
import cn.ucloud.vpc.models.CreateNATGWRequest;
import cn.ucloud.vpc.models.CreateNATGWResponse;
import cn.ucloud.vpc.models.CreateNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.CreateNetworkAclAssociationResponse;
import cn.ucloud.vpc.models.CreateNetworkAclEntryRequest;
import cn.ucloud.vpc.models.CreateNetworkAclEntryResponse;
import cn.ucloud.vpc.models.CreateNetworkAclRequest;
import cn.ucloud.vpc.models.CreateNetworkAclResponse;
import cn.ucloud.vpc.models.CreateRouteTableRequest;
import cn.ucloud.vpc.models.CreateRouteTableResponse;
import cn.ucloud.vpc.models.CreateSubnetRequest;
import cn.ucloud.vpc.models.CreateSubnetResponse;
import cn.ucloud.vpc.models.CreateVPCIntercomRequest;
import cn.ucloud.vpc.models.CreateVPCIntercomResponse;
import cn.ucloud.vpc.models.CreateVPCRequest;
import cn.ucloud.vpc.models.CreateVPCResponse;
import cn.ucloud.vpc.models.DeleteNATGWPolicyRequest;
import cn.ucloud.vpc.models.DeleteNATGWPolicyResponse;
import cn.ucloud.vpc.models.DeleteNATGWRequest;
import cn.ucloud.vpc.models.DeleteNATGWResponse;
import cn.ucloud.vpc.models.DeleteNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclAssociationResponse;
import cn.ucloud.vpc.models.DeleteNetworkAclEntryRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclEntryResponse;
import cn.ucloud.vpc.models.DeleteNetworkAclRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclResponse;
import cn.ucloud.vpc.models.DeleteRouteTableRequest;
import cn.ucloud.vpc.models.DeleteRouteTableResponse;
import cn.ucloud.vpc.models.DeleteSecondaryIpRequest;
import cn.ucloud.vpc.models.DeleteSecondaryIpResponse;
import cn.ucloud.vpc.models.DeleteSnatRuleRequest;
import cn.ucloud.vpc.models.DeleteSnatRuleResponse;
import cn.ucloud.vpc.models.DeleteSubnetRequest;
import cn.ucloud.vpc.models.DeleteSubnetResponse;
import cn.ucloud.vpc.models.DeleteVPCIntercomRequest;
import cn.ucloud.vpc.models.DeleteVPCIntercomResponse;
import cn.ucloud.vpc.models.DeleteVPCRequest;
import cn.ucloud.vpc.models.DeleteVPCResponse;
import cn.ucloud.vpc.models.DeleteWhiteListResourceRequest;
import cn.ucloud.vpc.models.DeleteWhiteListResourceResponse;
import cn.ucloud.vpc.models.DescribeNATGWPolicyRequest;
import cn.ucloud.vpc.models.DescribeNATGWPolicyResponse;
import cn.ucloud.vpc.models.DescribeNATGWRequest;
import cn.ucloud.vpc.models.DescribeNATGWResponse;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationBySubnetRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationBySubnetResponse;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationResponse;
import cn.ucloud.vpc.models.DescribeNetworkAclEntryRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclEntryResponse;
import cn.ucloud.vpc.models.DescribeNetworkAclRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclResponse;
import cn.ucloud.vpc.models.DescribeRouteTableRequest;
import cn.ucloud.vpc.models.DescribeRouteTableResponse;
import cn.ucloud.vpc.models.DescribeSecondaryIpRequest;
import cn.ucloud.vpc.models.DescribeSecondaryIpResponse;
import cn.ucloud.vpc.models.DescribeSnatRuleRequest;
import cn.ucloud.vpc.models.DescribeSnatRuleResponse;
import cn.ucloud.vpc.models.DescribeSubnetRequest;
import cn.ucloud.vpc.models.DescribeSubnetResourceRequest;
import cn.ucloud.vpc.models.DescribeSubnetResourceResponse;
import cn.ucloud.vpc.models.DescribeSubnetResponse;
import cn.ucloud.vpc.models.DescribeVIPRequest;
import cn.ucloud.vpc.models.DescribeVIPResponse;
import cn.ucloud.vpc.models.DescribeVPCIntercomRequest;
import cn.ucloud.vpc.models.DescribeVPCIntercomResponse;
import cn.ucloud.vpc.models.DescribeVPCRequest;
import cn.ucloud.vpc.models.DescribeVPCResponse;
import cn.ucloud.vpc.models.DescribeWhiteListResourceRequest;
import cn.ucloud.vpc.models.DescribeWhiteListResourceResponse;
import cn.ucloud.vpc.models.EnableWhiteListRequest;
import cn.ucloud.vpc.models.EnableWhiteListResponse;
import cn.ucloud.vpc.models.GetAvailableResourceForPolicyRequest;
import cn.ucloud.vpc.models.GetAvailableResourceForPolicyResponse;
import cn.ucloud.vpc.models.GetAvailableResourceForSnatRuleRequest;
import cn.ucloud.vpc.models.GetAvailableResourceForSnatRuleResponse;
import cn.ucloud.vpc.models.GetAvailableResourceForWhiteListRequest;
import cn.ucloud.vpc.models.GetAvailableResourceForWhiteListResponse;
import cn.ucloud.vpc.models.GetNetworkAclTargetResourceRequest;
import cn.ucloud.vpc.models.GetNetworkAclTargetResourceResponse;
import cn.ucloud.vpc.models.ListSubnetForNATGWRequest;
import cn.ucloud.vpc.models.ListSubnetForNATGWResponse;
import cn.ucloud.vpc.models.ModifyRouteRuleRequest;
import cn.ucloud.vpc.models.ModifyRouteRuleResponse;
import cn.ucloud.vpc.models.MoveSecondaryIPMacRequest;
import cn.ucloud.vpc.models.MoveSecondaryIPMacResponse;
import cn.ucloud.vpc.models.ReleaseVIPRequest;
import cn.ucloud.vpc.models.ReleaseVIPResponse;
import cn.ucloud.vpc.models.SetGwDefaultExportRequest;
import cn.ucloud.vpc.models.SetGwDefaultExportResponse;
import cn.ucloud.vpc.models.UpdateNATGWPolicyRequest;
import cn.ucloud.vpc.models.UpdateNATGWPolicyResponse;
import cn.ucloud.vpc.models.UpdateNATGWSubnetRequest;
import cn.ucloud.vpc.models.UpdateNATGWSubnetResponse;
import cn.ucloud.vpc.models.UpdateNetworkAclEntryRequest;
import cn.ucloud.vpc.models.UpdateNetworkAclEntryResponse;
import cn.ucloud.vpc.models.UpdateNetworkAclRequest;
import cn.ucloud.vpc.models.UpdateNetworkAclResponse;
import cn.ucloud.vpc.models.UpdateRouteTableAttributeRequest;
import cn.ucloud.vpc.models.UpdateRouteTableAttributeResponse;
import cn.ucloud.vpc.models.UpdateSnatRuleRequest;
import cn.ucloud.vpc.models.UpdateSnatRuleResponse;
import cn.ucloud.vpc.models.UpdateSubnetAttributeRequest;
import cn.ucloud.vpc.models.UpdateSubnetAttributeResponse;
import cn.ucloud.vpc.models.UpdateVIPAttributeRequest;
import cn.ucloud.vpc.models.UpdateVIPAttributeResponse;
import cn.ucloud.vpc.models.UpdateVPCNetworkRequest;
import cn.ucloud.vpc.models.UpdateVPCNetworkResponse;

/** This client is used to call actions of **VPC** service */
public interface VPCClientInterface extends Client {

    /**
     * AddSnatRule - 添加出口规则（SNAT规则）
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AddSnatRule
     */
    public AddSnatRuleResponse addSnatRule(AddSnatRuleRequest request) throws UCloudException;

    /**
     * AddVPCNetwork - 添加VPC网段
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AddVPCNetwork
     */
    public AddVPCNetworkResponse addVPCNetwork(AddVPCNetworkRequest request) throws UCloudException;

    /**
     * AddWhiteListResource - 添加NAT网关白名单
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AddWhiteListResource
     */
    public AddWhiteListResourceResponse addWhiteListResource(AddWhiteListResourceRequest request)
            throws UCloudException;

    /**
     * AllocateSecondaryIp - 分配ip
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AllocateSecondaryIp
     */
    public AllocateSecondaryIpResponse allocateSecondaryIp(AllocateSecondaryIpRequest request)
            throws UCloudException;

    /**
     * AllocateVIP - 申请内网虚拟IP
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AllocateVIP
     */
    public AllocateVIPResponse allocateVIP(AllocateVIPRequest request) throws UCloudException;

    /**
     * AssociateRouteTable - 绑定子网的路由表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/AssociateRouteTable
     */
    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request)
            throws UCloudException;

    /**
     * CloneRouteTable - 克隆路由表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CloneRouteTable
     */
    public CloneRouteTableResponse cloneRouteTable(CloneRouteTableRequest request)
            throws UCloudException;

    /**
     * CreateNATGW - 创建NAT网关
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateNATGW
     */
    public CreateNATGWResponse createNATGW(CreateNATGWRequest request) throws UCloudException;

    /**
     * CreateNATGWPolicy - 添加NAT网关端口转发规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateNATGWPolicy
     */
    public CreateNATGWPolicyResponse createNATGWPolicy(CreateNATGWPolicyRequest request)
            throws UCloudException;

    /**
     * CreateNetworkAcl - 创建网络ACL
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateNetworkAcl
     */
    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request)
            throws UCloudException;

    /**
     * CreateNetworkAclAssociation - 创建ACL的绑定关系
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateNetworkAclAssociation
     */
    public CreateNetworkAclAssociationResponse createNetworkAclAssociation(
            CreateNetworkAclAssociationRequest request) throws UCloudException;

    /**
     * CreateNetworkAclEntry - 创建ACL的规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateNetworkAclEntry
     */
    public CreateNetworkAclEntryResponse createNetworkAclEntry(CreateNetworkAclEntryRequest request)
            throws UCloudException;

    /**
     * CreateRouteTable - 创建路由表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateRouteTable
     */
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request)
            throws UCloudException;

    /**
     * CreateSubnet - 创建子网
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateSubnet
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws UCloudException;

    /**
     * CreateVPC - 创建VPC
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateVPC
     */
    public CreateVPCResponse createVPC(CreateVPCRequest request) throws UCloudException;

    /**
     * CreateVPCIntercom - 新建VPC互通
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/CreateVPCIntercom
     */
    public CreateVPCIntercomResponse createVPCIntercom(CreateVPCIntercomRequest request)
            throws UCloudException;

    /**
     * DeleteNATGW - 删除NAT网关
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteNATGW
     */
    public DeleteNATGWResponse deleteNATGW(DeleteNATGWRequest request) throws UCloudException;

    /**
     * DeleteNATGWPolicy - 删除NAT网关端口转发规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteNATGWPolicy
     */
    public DeleteNATGWPolicyResponse deleteNATGWPolicy(DeleteNATGWPolicyRequest request)
            throws UCloudException;

    /**
     * DeleteNetworkAcl - 删除网络ACL
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteNetworkAcl
     */
    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request)
            throws UCloudException;

    /**
     * DeleteNetworkAclAssociation - 删除网络ACL绑定关系
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteNetworkAclAssociation
     */
    public DeleteNetworkAclAssociationResponse deleteNetworkAclAssociation(
            DeleteNetworkAclAssociationRequest request) throws UCloudException;

    /**
     * DeleteNetworkAclEntry - 删除ACL的规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteNetworkAclEntry
     */
    public DeleteNetworkAclEntryResponse deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request)
            throws UCloudException;

    /**
     * DeleteRouteTable - 删除自定义路由表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteRouteTable
     */
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request)
            throws UCloudException;

    /**
     * DeleteSecondaryIp - 删除Ip
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteSecondaryIp
     */
    public DeleteSecondaryIpResponse deleteSecondaryIp(DeleteSecondaryIpRequest request)
            throws UCloudException;

    /**
     * DeleteSnatRule - 删除出口规则（SNAT规则）
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteSnatRule
     */
    public DeleteSnatRuleResponse deleteSnatRule(DeleteSnatRuleRequest request)
            throws UCloudException;

    /**
     * DeleteSubnet - 删除子网
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteSubnet
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws UCloudException;

    /**
     * DeleteVPC - 删除VPC
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteVPC
     */
    public DeleteVPCResponse deleteVPC(DeleteVPCRequest request) throws UCloudException;

    /**
     * DeleteVPCIntercom - 删除VPC互通
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteVPCIntercom
     */
    public DeleteVPCIntercomResponse deleteVPCIntercom(DeleteVPCIntercomRequest request)
            throws UCloudException;

    /**
     * DeleteWhiteListResource - 删除NAT网关白名单列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DeleteWhiteListResource
     */
    public DeleteWhiteListResourceResponse deleteWhiteListResource(
            DeleteWhiteListResourceRequest request) throws UCloudException;

    /**
     * DescribeNATGW - 获取NAT网关信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNATGW
     */
    public DescribeNATGWResponse describeNATGW(DescribeNATGWRequest request) throws UCloudException;

    /**
     * DescribeNATGWPolicy - 展示NAT网关端口转发规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNATGWPolicy
     */
    public DescribeNATGWPolicyResponse describeNATGWPolicy(DescribeNATGWPolicyRequest request)
            throws UCloudException;

    /**
     * DescribeNetworkAcl - 获取网络ACL
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNetworkAcl
     */
    public DescribeNetworkAclResponse describeNetworkAcl(DescribeNetworkAclRequest request)
            throws UCloudException;

    /**
     * DescribeNetworkAclAssociation - 获取网络ACL的绑定关系列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNetworkAclAssociation
     */
    public DescribeNetworkAclAssociationResponse describeNetworkAclAssociation(
            DescribeNetworkAclAssociationRequest request) throws UCloudException;

    /**
     * DescribeNetworkAclAssociationBySubnet - 获取子网的ACL绑定信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNetworkAclAssociationBySubnet
     */
    public DescribeNetworkAclAssociationBySubnetResponse describeNetworkAclAssociationBySubnet(
            DescribeNetworkAclAssociationBySubnetRequest request) throws UCloudException;

    /**
     * DescribeNetworkAclEntry - 获取ACL的规则信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeNetworkAclEntry
     */
    public DescribeNetworkAclEntryResponse describeNetworkAclEntry(
            DescribeNetworkAclEntryRequest request) throws UCloudException;

    /**
     * DescribeRouteTable - 获取路由表详细信息(包括路由策略)
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeRouteTable
     */
    public DescribeRouteTableResponse describeRouteTable(DescribeRouteTableRequest request)
            throws UCloudException;

    /**
     * DescribeSecondaryIp - 查询SecondaryIp
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeSecondaryIp
     */
    public DescribeSecondaryIpResponse describeSecondaryIp(DescribeSecondaryIpRequest request)
            throws UCloudException;

    /**
     * DescribeSnatRule - 获取Nat网关的出口规则（SNAT规则）
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeSnatRule
     */
    public DescribeSnatRuleResponse describeSnatRule(DescribeSnatRuleRequest request)
            throws UCloudException;

    /**
     * DescribeSubnet - 获取子网信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeSubnet
     */
    public DescribeSubnetResponse describeSubnet(DescribeSubnetRequest request)
            throws UCloudException;

    /**
     * DescribeSubnetResource - 展示子网资源
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeSubnetResource
     */
    public DescribeSubnetResourceResponse describeSubnetResource(
            DescribeSubnetResourceRequest request) throws UCloudException;

    /**
     * DescribeVIP - 获取内网虚拟IP信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeVIP
     */
    public DescribeVIPResponse describeVIP(DescribeVIPRequest request) throws UCloudException;

    /**
     * DescribeVPC - 获取VPC信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeVPC
     */
    public DescribeVPCResponse describeVPC(DescribeVPCRequest request) throws UCloudException;

    /**
     * DescribeVPCIntercom - 获取VPC互通信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeVPCIntercom
     */
    public DescribeVPCIntercomResponse describeVPCIntercom(DescribeVPCIntercomRequest request)
            throws UCloudException;

    /**
     * DescribeWhiteListResource - 展示NAT网关白名单资源列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/DescribeWhiteListResource
     */
    public DescribeWhiteListResourceResponse describeWhiteListResource(
            DescribeWhiteListResourceRequest request) throws UCloudException;

    /**
     * EnableWhiteList - 修改NAT网关白名单开关
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/EnableWhiteList
     */
    public EnableWhiteListResponse enableWhiteList(EnableWhiteListRequest request)
            throws UCloudException;

    /**
     * GetAvailableResourceForPolicy - 获取NAT网关可配置端口转发规则的资源信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/GetAvailableResourceForPolicy
     */
    public GetAvailableResourceForPolicyResponse getAvailableResourceForPolicy(
            GetAvailableResourceForPolicyRequest request) throws UCloudException;

    /**
     * GetAvailableResourceForSnatRule - 获得可添加snat规则（出口规则）的资源列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/GetAvailableResourceForSnatRule
     */
    public GetAvailableResourceForSnatRuleResponse getAvailableResourceForSnatRule(
            GetAvailableResourceForSnatRuleRequest request) throws UCloudException;

    /**
     * GetAvailableResourceForWhiteList - 获取NAT网关可添加白名单的资源
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/GetAvailableResourceForWhiteList
     */
    public GetAvailableResourceForWhiteListResponse getAvailableResourceForWhiteList(
            GetAvailableResourceForWhiteListRequest request) throws UCloudException;

    /**
     * GetNetworkAclTargetResource - 获取ACL规则应用目标列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/GetNetworkAclTargetResource
     */
    public GetNetworkAclTargetResourceResponse getNetworkAclTargetResource(
            GetNetworkAclTargetResourceRequest request) throws UCloudException;

    /**
     * ListSubnetForNATGW - 展示NAT网关可绑定的子网列表
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/ListSubnetForNATGW
     */
    public ListSubnetForNATGWResponse listSubnetForNATGW(ListSubnetForNATGWRequest request)
            throws UCloudException;

    /**
     * ModifyRouteRule - 路由策略增、删、改
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/ModifyRouteRule
     */
    public ModifyRouteRuleResponse modifyRouteRule(ModifyRouteRuleRequest request)
            throws UCloudException;

    /**
     * MoveSecondaryIPMac - 迁移SecondaryIP
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/MoveSecondaryIPMac
     */
    public MoveSecondaryIPMacResponse moveSecondaryIPMac(MoveSecondaryIPMacRequest request)
            throws UCloudException;

    /**
     * ReleaseVIP - 释放内网虚拟IP
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/ReleaseVIP
     */
    public ReleaseVIPResponse releaseVIP(ReleaseVIPRequest request) throws UCloudException;

    /**
     * SetGwDefaultExport - 设置NAT网关的默认出口
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/SetGwDefaultExport
     */
    public SetGwDefaultExportResponse setGwDefaultExport(SetGwDefaultExportRequest request)
            throws UCloudException;

    /**
     * UpdateNATGWPolicy - 更新NAT网关端口转发规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateNATGWPolicy
     */
    public UpdateNATGWPolicyResponse updateNATGWPolicy(UpdateNATGWPolicyRequest request)
            throws UCloudException;

    /**
     * UpdateNATGWSubnet - 更新NAT网关绑定的子网
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateNATGWSubnet
     */
    public UpdateNATGWSubnetResponse updateNATGWSubnet(UpdateNATGWSubnetRequest request)
            throws UCloudException;

    /**
     * UpdateNetworkAcl - 更改ACL
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateNetworkAcl
     */
    public UpdateNetworkAclResponse updateNetworkAcl(UpdateNetworkAclRequest request)
            throws UCloudException;

    /**
     * UpdateNetworkAclEntry - 更新ACL的规则
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateNetworkAclEntry
     */
    public UpdateNetworkAclEntryResponse updateNetworkAclEntry(UpdateNetworkAclEntryRequest request)
            throws UCloudException;

    /**
     * UpdateRouteTableAttribute - 更新路由表基本信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateRouteTableAttribute
     */
    public UpdateRouteTableAttributeResponse updateRouteTableAttribute(
            UpdateRouteTableAttributeRequest request) throws UCloudException;

    /**
     * UpdateSnatRule - 更新出口规则（SNAT规则）
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateSnatRule
     */
    public UpdateSnatRuleResponse updateSnatRule(UpdateSnatRuleRequest request)
            throws UCloudException;

    /**
     * UpdateSubnetAttribute - 更新子网信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateSubnetAttribute
     */
    public UpdateSubnetAttributeResponse updateSubnetAttribute(UpdateSubnetAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateVIPAttribute - 更新VIP信息
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateVIPAttribute
     */
    public UpdateVIPAttributeResponse updateVIPAttribute(UpdateVIPAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateVPCNetwork - 更新VPC网段
     *
     * <p>See also: https://docs.ucloud.cn/api/vpc-api/UpdateVPCNetwork
     */
    public UpdateVPCNetworkResponse updateVPCNetwork(UpdateVPCNetworkRequest request)
            throws UCloudException;
}
