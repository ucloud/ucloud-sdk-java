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
package cn.ucloud.vpc.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.vpc.models.AddSnatRuleRequest;
import cn.ucloud.vpc.models.AddSnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.AddVPCNetworkRequest;
import cn.ucloud.vpc.models.AddVPCNetworkResponse;
        
        
        
import cn.ucloud.vpc.models.AddWhiteListResourceRequest;
import cn.ucloud.vpc.models.AddWhiteListResourceResponse;
        
        
        
import cn.ucloud.vpc.models.AllocateBatchSecondaryIpRequest;
import cn.ucloud.vpc.models.AllocateBatchSecondaryIpResponse;
        
        
        
import cn.ucloud.vpc.models.AllocateSecondaryIpRequest;
import cn.ucloud.vpc.models.AllocateSecondaryIpResponse;
        
        
        
import cn.ucloud.vpc.models.AllocateVIPRequest;
import cn.ucloud.vpc.models.AllocateVIPResponse;
        
        
        
import cn.ucloud.vpc.models.AssociateRouteTableRequest;
import cn.ucloud.vpc.models.AssociateRouteTableResponse;
        
        
        
import cn.ucloud.vpc.models.AttachNetworkInterfaceRequest;
import cn.ucloud.vpc.models.AttachNetworkInterfaceResponse;
        
        
        
import cn.ucloud.vpc.models.CloneRouteTableRequest;
import cn.ucloud.vpc.models.CloneRouteTableResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNATGWRequest;
import cn.ucloud.vpc.models.CreateNATGWResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNATGWPolicyRequest;
import cn.ucloud.vpc.models.CreateNATGWPolicyResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNetworkAclRequest;
import cn.ucloud.vpc.models.CreateNetworkAclResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.CreateNetworkAclAssociationResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNetworkAclEntryRequest;
import cn.ucloud.vpc.models.CreateNetworkAclEntryResponse;
        
        
        
import cn.ucloud.vpc.models.CreateNetworkInterfaceRequest;
import cn.ucloud.vpc.models.CreateNetworkInterfaceResponse;
        
        
        
import cn.ucloud.vpc.models.CreateRouteTableRequest;
import cn.ucloud.vpc.models.CreateRouteTableResponse;
        
        
        
import cn.ucloud.vpc.models.CreateSnatDnatRuleRequest;
import cn.ucloud.vpc.models.CreateSnatDnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.CreateSubnetRequest;
import cn.ucloud.vpc.models.CreateSubnetResponse;
        
        
        
import cn.ucloud.vpc.models.CreateVPCRequest;
import cn.ucloud.vpc.models.CreateVPCResponse;
        
        
        
import cn.ucloud.vpc.models.CreateVPCIntercomRequest;
import cn.ucloud.vpc.models.CreateVPCIntercomResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNATGWRequest;
import cn.ucloud.vpc.models.DeleteNATGWResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNATGWPolicyRequest;
import cn.ucloud.vpc.models.DeleteNATGWPolicyResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNetworkAclRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclAssociationResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNetworkAclEntryRequest;
import cn.ucloud.vpc.models.DeleteNetworkAclEntryResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteNetworkInterfaceRequest;
import cn.ucloud.vpc.models.DeleteNetworkInterfaceResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteRouteTableRequest;
import cn.ucloud.vpc.models.DeleteRouteTableResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteSecondaryIpRequest;
import cn.ucloud.vpc.models.DeleteSecondaryIpResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteSnatDnatRuleRequest;
import cn.ucloud.vpc.models.DeleteSnatDnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteSnatRuleRequest;
import cn.ucloud.vpc.models.DeleteSnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteSubnetRequest;
import cn.ucloud.vpc.models.DeleteSubnetResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteVPCRequest;
import cn.ucloud.vpc.models.DeleteVPCResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteVPCIntercomRequest;
import cn.ucloud.vpc.models.DeleteVPCIntercomResponse;
        
        
        
import cn.ucloud.vpc.models.DeleteWhiteListResourceRequest;
import cn.ucloud.vpc.models.DeleteWhiteListResourceResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeInstanceNetworkInterfaceRequest;
import cn.ucloud.vpc.models.DescribeInstanceNetworkInterfaceResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNATGWRequest;
import cn.ucloud.vpc.models.DescribeNATGWResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNATGWPolicyRequest;
import cn.ucloud.vpc.models.DescribeNATGWPolicyResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNetworkAclRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationBySubnetRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclAssociationBySubnetResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNetworkAclEntryRequest;
import cn.ucloud.vpc.models.DescribeNetworkAclEntryResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeNetworkInterfaceRequest;
import cn.ucloud.vpc.models.DescribeNetworkInterfaceResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeRouteTableRequest;
import cn.ucloud.vpc.models.DescribeRouteTableResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeSecondaryIpRequest;
import cn.ucloud.vpc.models.DescribeSecondaryIpResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeSnatDnatRuleRequest;
import cn.ucloud.vpc.models.DescribeSnatDnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeSnatRuleRequest;
import cn.ucloud.vpc.models.DescribeSnatRuleResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeSubnetRequest;
import cn.ucloud.vpc.models.DescribeSubnetResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeSubnetResourceRequest;
import cn.ucloud.vpc.models.DescribeSubnetResourceResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeVIPRequest;
import cn.ucloud.vpc.models.DescribeVIPResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeVPCRequest;
import cn.ucloud.vpc.models.DescribeVPCResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeVPCIntercomRequest;
import cn.ucloud.vpc.models.DescribeVPCIntercomResponse;
        
        
        
import cn.ucloud.vpc.models.DescribeWhiteListResourceRequest;
import cn.ucloud.vpc.models.DescribeWhiteListResourceResponse;
        
        
        
import cn.ucloud.vpc.models.DetachNetworkInterfaceRequest;
import cn.ucloud.vpc.models.DetachNetworkInterfaceResponse;
        
        
        
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
        
        
        
import cn.ucloud.vpc.models.UpdateNetworkAclRequest;
import cn.ucloud.vpc.models.UpdateNetworkAclResponse;
        
        
        
import cn.ucloud.vpc.models.UpdateNetworkAclEntryRequest;
import cn.ucloud.vpc.models.UpdateNetworkAclEntryResponse;
        
        
        
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

/**
 * This client is used to call actions of **VPC** service
 */
public class VPCClient extends DefaultClient implements VPCClientInterface {
    public VPCClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * AddSnatRule - 添加出口规则（SNAT规则）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AddSnatRuleResponse addSnatRule(AddSnatRuleRequest request) throws UCloudException {
            request.setAction("AddSnatRule");
            return (AddSnatRuleResponse) this.invoke(request, AddSnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * AddVPCNetwork - 添加VPC网段
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AddVPCNetworkResponse addVPCNetwork(AddVPCNetworkRequest request) throws UCloudException {
            request.setAction("AddVPCNetwork");
            return (AddVPCNetworkResponse) this.invoke(request, AddVPCNetworkResponse.class);
        }
        
        
        
        
        
        
        /**
         * AddWhiteListResource - 添加NAT网关白名单
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AddWhiteListResourceResponse addWhiteListResource(AddWhiteListResourceRequest request) throws UCloudException {
            request.setAction("AddWhiteListResource");
            return (AddWhiteListResourceResponse) this.invoke(request, AddWhiteListResourceResponse.class);
        }
        
        
        
        
        
        
        /**
         * AllocateBatchSecondaryIp - 批量申请虚拟网卡辅助IP
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AllocateBatchSecondaryIpResponse allocateBatchSecondaryIp(AllocateBatchSecondaryIpRequest request) throws UCloudException {
            request.setAction("AllocateBatchSecondaryIp");
            return (AllocateBatchSecondaryIpResponse) this.invoke(request, AllocateBatchSecondaryIpResponse.class);
        }
        
        
        
        
        
        
        /**
         * AllocateSecondaryIp - 分配ip
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AllocateSecondaryIpResponse allocateSecondaryIp(AllocateSecondaryIpRequest request) throws UCloudException {
            request.setAction("AllocateSecondaryIp");
            return (AllocateSecondaryIpResponse) this.invoke(request, AllocateSecondaryIpResponse.class);
        }
        
        
        
        
        
        
        /**
         * AllocateVIP - 申请内网虚拟IP
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AllocateVIPResponse allocateVIP(AllocateVIPRequest request) throws UCloudException {
            request.setAction("AllocateVIP");
            return (AllocateVIPResponse) this.invoke(request, AllocateVIPResponse.class);
        }
        
        
        
        
        
        
        /**
         * AssociateRouteTable - 绑定子网的路由表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) throws UCloudException {
            request.setAction("AssociateRouteTable");
            return (AssociateRouteTableResponse) this.invoke(request, AssociateRouteTableResponse.class);
        }
        
        
        
        
        
        
        /**
         * AttachNetworkInterface - 绑定网卡到云主机
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("AttachNetworkInterface");
            return (AttachNetworkInterfaceResponse) this.invoke(request, AttachNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * CloneRouteTable - 克隆路由表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CloneRouteTableResponse cloneRouteTable(CloneRouteTableRequest request) throws UCloudException {
            request.setAction("CloneRouteTable");
            return (CloneRouteTableResponse) this.invoke(request, CloneRouteTableResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNATGW - 创建NAT网关
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNATGWResponse createNATGW(CreateNATGWRequest request) throws UCloudException {
            request.setAction("CreateNATGW");
            return (CreateNATGWResponse) this.invoke(request, CreateNATGWResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNATGWPolicy - 添加NAT网关端口转发规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNATGWPolicyResponse createNATGWPolicy(CreateNATGWPolicyRequest request) throws UCloudException {
            request.setAction("CreateNATGWPolicy");
            return (CreateNATGWPolicyResponse) this.invoke(request, CreateNATGWPolicyResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNetworkAcl - 创建网络ACL
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws UCloudException {
            request.setAction("CreateNetworkAcl");
            return (CreateNetworkAclResponse) this.invoke(request, CreateNetworkAclResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNetworkAclAssociation - 创建ACL的绑定关系
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNetworkAclAssociationResponse createNetworkAclAssociation(CreateNetworkAclAssociationRequest request) throws UCloudException {
            request.setAction("CreateNetworkAclAssociation");
            return (CreateNetworkAclAssociationResponse) this.invoke(request, CreateNetworkAclAssociationResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNetworkAclEntry - 创建ACL的规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNetworkAclEntryResponse createNetworkAclEntry(CreateNetworkAclEntryRequest request) throws UCloudException {
            request.setAction("CreateNetworkAclEntry");
            return (CreateNetworkAclEntryResponse) this.invoke(request, CreateNetworkAclEntryResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateNetworkInterface - 创建虚拟网卡
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("CreateNetworkInterface");
            return (CreateNetworkInterfaceResponse) this.invoke(request, CreateNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateRouteTable - 创建路由表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) throws UCloudException {
            request.setAction("CreateRouteTable");
            return (CreateRouteTableResponse) this.invoke(request, CreateRouteTableResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateSnatDnatRule - 使用NAT创建内外网IP映射
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateSnatDnatRuleResponse createSnatDnatRule(CreateSnatDnatRuleRequest request) throws UCloudException {
            request.setAction("CreateSnatDnatRule");
            return (CreateSnatDnatRuleResponse) this.invoke(request, CreateSnatDnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateSubnet - 创建子网
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws UCloudException {
            request.setAction("CreateSubnet");
            return (CreateSubnetResponse) this.invoke(request, CreateSubnetResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateVPC - 创建VPC
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateVPCResponse createVPC(CreateVPCRequest request) throws UCloudException {
            request.setAction("CreateVPC");
            return (CreateVPCResponse) this.invoke(request, CreateVPCResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateVPCIntercom - 新建VPC互通
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateVPCIntercomResponse createVPCIntercom(CreateVPCIntercomRequest request) throws UCloudException {
            request.setAction("CreateVPCIntercom");
            return (CreateVPCIntercomResponse) this.invoke(request, CreateVPCIntercomResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNATGW - 删除NAT网关
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNATGWResponse deleteNATGW(DeleteNATGWRequest request) throws UCloudException {
            request.setAction("DeleteNATGW");
            return (DeleteNATGWResponse) this.invoke(request, DeleteNATGWResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNATGWPolicy - 删除NAT网关端口转发规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNATGWPolicyResponse deleteNATGWPolicy(DeleteNATGWPolicyRequest request) throws UCloudException {
            request.setAction("DeleteNATGWPolicy");
            return (DeleteNATGWPolicyResponse) this.invoke(request, DeleteNATGWPolicyResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNetworkAcl - 删除网络ACL
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws UCloudException {
            request.setAction("DeleteNetworkAcl");
            return (DeleteNetworkAclResponse) this.invoke(request, DeleteNetworkAclResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNetworkAclAssociation - 删除网络ACL绑定关系
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNetworkAclAssociationResponse deleteNetworkAclAssociation(DeleteNetworkAclAssociationRequest request) throws UCloudException {
            request.setAction("DeleteNetworkAclAssociation");
            return (DeleteNetworkAclAssociationResponse) this.invoke(request, DeleteNetworkAclAssociationResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNetworkAclEntry - 删除ACL的规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNetworkAclEntryResponse deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) throws UCloudException {
            request.setAction("DeleteNetworkAclEntry");
            return (DeleteNetworkAclEntryResponse) this.invoke(request, DeleteNetworkAclEntryResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteNetworkInterface - 删除网卡
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("DeleteNetworkInterface");
            return (DeleteNetworkInterfaceResponse) this.invoke(request, DeleteNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteRouteTable - 删除自定义路由表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) throws UCloudException {
            request.setAction("DeleteRouteTable");
            return (DeleteRouteTableResponse) this.invoke(request, DeleteRouteTableResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteSecondaryIp - 删除Ip
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteSecondaryIpResponse deleteSecondaryIp(DeleteSecondaryIpRequest request) throws UCloudException {
            request.setAction("DeleteSecondaryIp");
            return (DeleteSecondaryIpResponse) this.invoke(request, DeleteSecondaryIpResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteSnatDnatRule - 删除NAT创建内外网IP映射规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteSnatDnatRuleResponse deleteSnatDnatRule(DeleteSnatDnatRuleRequest request) throws UCloudException {
            request.setAction("DeleteSnatDnatRule");
            return (DeleteSnatDnatRuleResponse) this.invoke(request, DeleteSnatDnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteSnatRule - 删除出口规则（SNAT规则）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteSnatRuleResponse deleteSnatRule(DeleteSnatRuleRequest request) throws UCloudException {
            request.setAction("DeleteSnatRule");
            return (DeleteSnatRuleResponse) this.invoke(request, DeleteSnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteSubnet - 删除子网
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws UCloudException {
            request.setAction("DeleteSubnet");
            return (DeleteSubnetResponse) this.invoke(request, DeleteSubnetResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteVPC - 删除VPC
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteVPCResponse deleteVPC(DeleteVPCRequest request) throws UCloudException {
            request.setAction("DeleteVPC");
            return (DeleteVPCResponse) this.invoke(request, DeleteVPCResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteVPCIntercom - 删除VPC互通
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteVPCIntercomResponse deleteVPCIntercom(DeleteVPCIntercomRequest request) throws UCloudException {
            request.setAction("DeleteVPCIntercom");
            return (DeleteVPCIntercomResponse) this.invoke(request, DeleteVPCIntercomResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteWhiteListResource - 删除NAT网关白名单列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteWhiteListResourceResponse deleteWhiteListResource(DeleteWhiteListResourceRequest request) throws UCloudException {
            request.setAction("DeleteWhiteListResource");
            return (DeleteWhiteListResourceResponse) this.invoke(request, DeleteWhiteListResourceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeInstanceNetworkInterface - 展示云主机绑定的网卡信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeInstanceNetworkInterfaceResponse describeInstanceNetworkInterface(DescribeInstanceNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("DescribeInstanceNetworkInterface");
            return (DescribeInstanceNetworkInterfaceResponse) this.invoke(request, DescribeInstanceNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNATGW - 获取NAT网关信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNATGWResponse describeNATGW(DescribeNATGWRequest request) throws UCloudException {
            request.setAction("DescribeNATGW");
            return (DescribeNATGWResponse) this.invoke(request, DescribeNATGWResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNATGWPolicy - 展示NAT网关端口转发规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNATGWPolicyResponse describeNATGWPolicy(DescribeNATGWPolicyRequest request) throws UCloudException {
            request.setAction("DescribeNATGWPolicy");
            return (DescribeNATGWPolicyResponse) this.invoke(request, DescribeNATGWPolicyResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNetworkAcl - 获取网络ACL
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNetworkAclResponse describeNetworkAcl(DescribeNetworkAclRequest request) throws UCloudException {
            request.setAction("DescribeNetworkAcl");
            return (DescribeNetworkAclResponse) this.invoke(request, DescribeNetworkAclResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNetworkAclAssociation - 获取网络ACL的绑定关系列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNetworkAclAssociationResponse describeNetworkAclAssociation(DescribeNetworkAclAssociationRequest request) throws UCloudException {
            request.setAction("DescribeNetworkAclAssociation");
            return (DescribeNetworkAclAssociationResponse) this.invoke(request, DescribeNetworkAclAssociationResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNetworkAclAssociationBySubnet - 获取子网的ACL绑定信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNetworkAclAssociationBySubnetResponse describeNetworkAclAssociationBySubnet(DescribeNetworkAclAssociationBySubnetRequest request) throws UCloudException {
            request.setAction("DescribeNetworkAclAssociationBySubnet");
            return (DescribeNetworkAclAssociationBySubnetResponse) this.invoke(request, DescribeNetworkAclAssociationBySubnetResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNetworkAclEntry - 获取ACL的规则信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNetworkAclEntryResponse describeNetworkAclEntry(DescribeNetworkAclEntryRequest request) throws UCloudException {
            request.setAction("DescribeNetworkAclEntry");
            return (DescribeNetworkAclEntryResponse) this.invoke(request, DescribeNetworkAclEntryResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNetworkInterface - 展示虚拟网卡信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNetworkInterfaceResponse describeNetworkInterface(DescribeNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("DescribeNetworkInterface");
            return (DescribeNetworkInterfaceResponse) this.invoke(request, DescribeNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeRouteTable - 获取路由表详细信息(包括路由策略)
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeRouteTableResponse describeRouteTable(DescribeRouteTableRequest request) throws UCloudException {
            request.setAction("DescribeRouteTable");
            return (DescribeRouteTableResponse) this.invoke(request, DescribeRouteTableResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeSecondaryIp - 查询SecondaryIp
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeSecondaryIpResponse describeSecondaryIp(DescribeSecondaryIpRequest request) throws UCloudException {
            request.setAction("DescribeSecondaryIp");
            return (DescribeSecondaryIpResponse) this.invoke(request, DescribeSecondaryIpResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeSnatDnatRule - 获取基于NAT创建的内外网IP映射规则信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeSnatDnatRuleResponse describeSnatDnatRule(DescribeSnatDnatRuleRequest request) throws UCloudException {
            request.setAction("DescribeSnatDnatRule");
            return (DescribeSnatDnatRuleResponse) this.invoke(request, DescribeSnatDnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeSnatRule - 获取Nat网关的出口规则（SNAT规则）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeSnatRuleResponse describeSnatRule(DescribeSnatRuleRequest request) throws UCloudException {
            request.setAction("DescribeSnatRule");
            return (DescribeSnatRuleResponse) this.invoke(request, DescribeSnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeSubnet - 获取子网信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeSubnetResponse describeSubnet(DescribeSubnetRequest request) throws UCloudException {
            request.setAction("DescribeSubnet");
            return (DescribeSubnetResponse) this.invoke(request, DescribeSubnetResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeSubnetResource - 展示子网资源
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeSubnetResourceResponse describeSubnetResource(DescribeSubnetResourceRequest request) throws UCloudException {
            request.setAction("DescribeSubnetResource");
            return (DescribeSubnetResourceResponse) this.invoke(request, DescribeSubnetResourceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeVIP - 获取内网虚拟IP信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeVIPResponse describeVIP(DescribeVIPRequest request) throws UCloudException {
            request.setAction("DescribeVIP");
            return (DescribeVIPResponse) this.invoke(request, DescribeVIPResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeVPC - 获取VPC信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeVPCResponse describeVPC(DescribeVPCRequest request) throws UCloudException {
            request.setAction("DescribeVPC");
            return (DescribeVPCResponse) this.invoke(request, DescribeVPCResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeVPCIntercom - 获取VPC互通信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeVPCIntercomResponse describeVPCIntercom(DescribeVPCIntercomRequest request) throws UCloudException {
            request.setAction("DescribeVPCIntercom");
            return (DescribeVPCIntercomResponse) this.invoke(request, DescribeVPCIntercomResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeWhiteListResource - 展示NAT网关白名单资源列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeWhiteListResourceResponse describeWhiteListResource(DescribeWhiteListResourceRequest request) throws UCloudException {
            request.setAction("DescribeWhiteListResource");
            return (DescribeWhiteListResourceResponse) this.invoke(request, DescribeWhiteListResourceResponse.class);
        }
        
        
        
        
        
        
        /**
         * DetachNetworkInterface - 解绑云主机关联网卡
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) throws UCloudException {
            request.setAction("DetachNetworkInterface");
            return (DetachNetworkInterfaceResponse) this.invoke(request, DetachNetworkInterfaceResponse.class);
        }
        
        
        
        
        
        
        /**
         * EnableWhiteList - 修改NAT网关白名单开关
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public EnableWhiteListResponse enableWhiteList(EnableWhiteListRequest request) throws UCloudException {
            request.setAction("EnableWhiteList");
            return (EnableWhiteListResponse) this.invoke(request, EnableWhiteListResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetAvailableResourceForPolicy - 获取NAT网关可配置端口转发规则的资源信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetAvailableResourceForPolicyResponse getAvailableResourceForPolicy(GetAvailableResourceForPolicyRequest request) throws UCloudException {
            request.setAction("GetAvailableResourceForPolicy");
            return (GetAvailableResourceForPolicyResponse) this.invoke(request, GetAvailableResourceForPolicyResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetAvailableResourceForSnatRule - 获得可添加snat规则（出口规则）的资源列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetAvailableResourceForSnatRuleResponse getAvailableResourceForSnatRule(GetAvailableResourceForSnatRuleRequest request) throws UCloudException {
            request.setAction("GetAvailableResourceForSnatRule");
            return (GetAvailableResourceForSnatRuleResponse) this.invoke(request, GetAvailableResourceForSnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetAvailableResourceForWhiteList - 获取NAT网关可添加白名单的资源
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetAvailableResourceForWhiteListResponse getAvailableResourceForWhiteList(GetAvailableResourceForWhiteListRequest request) throws UCloudException {
            request.setAction("GetAvailableResourceForWhiteList");
            return (GetAvailableResourceForWhiteListResponse) this.invoke(request, GetAvailableResourceForWhiteListResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetNetworkAclTargetResource - 获取ACL规则应用目标列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetNetworkAclTargetResourceResponse getNetworkAclTargetResource(GetNetworkAclTargetResourceRequest request) throws UCloudException {
            request.setAction("GetNetworkAclTargetResource");
            return (GetNetworkAclTargetResourceResponse) this.invoke(request, GetNetworkAclTargetResourceResponse.class);
        }
        
        
        
        
        
        
        /**
         * ListSubnetForNATGW - 展示NAT网关可绑定的子网列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListSubnetForNATGWResponse listSubnetForNATGW(ListSubnetForNATGWRequest request) throws UCloudException {
            request.setAction("ListSubnetForNATGW");
            return (ListSubnetForNATGWResponse) this.invoke(request, ListSubnetForNATGWResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyRouteRule - 路由策略增、删、改
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyRouteRuleResponse modifyRouteRule(ModifyRouteRuleRequest request) throws UCloudException {
            request.setAction("ModifyRouteRule");
            return (ModifyRouteRuleResponse) this.invoke(request, ModifyRouteRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * MoveSecondaryIPMac - 迁移SecondaryIP
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public MoveSecondaryIPMacResponse moveSecondaryIPMac(MoveSecondaryIPMacRequest request) throws UCloudException {
            request.setAction("MoveSecondaryIPMac");
            return (MoveSecondaryIPMacResponse) this.invoke(request, MoveSecondaryIPMacResponse.class);
        }
        
        
        
        
        
        
        /**
         * ReleaseVIP - 释放内网虚拟IP
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ReleaseVIPResponse releaseVIP(ReleaseVIPRequest request) throws UCloudException {
            request.setAction("ReleaseVIP");
            return (ReleaseVIPResponse) this.invoke(request, ReleaseVIPResponse.class);
        }
        
        
        
        
        
        
        /**
         * SetGwDefaultExport - 设置NAT网关的默认出口
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public SetGwDefaultExportResponse setGwDefaultExport(SetGwDefaultExportRequest request) throws UCloudException {
            request.setAction("SetGwDefaultExport");
            return (SetGwDefaultExportResponse) this.invoke(request, SetGwDefaultExportResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateNATGWPolicy - 更新NAT网关端口转发规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateNATGWPolicyResponse updateNATGWPolicy(UpdateNATGWPolicyRequest request) throws UCloudException {
            request.setAction("UpdateNATGWPolicy");
            return (UpdateNATGWPolicyResponse) this.invoke(request, UpdateNATGWPolicyResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateNATGWSubnet - 更新NAT网关绑定的子网
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateNATGWSubnetResponse updateNATGWSubnet(UpdateNATGWSubnetRequest request) throws UCloudException {
            request.setAction("UpdateNATGWSubnet");
            return (UpdateNATGWSubnetResponse) this.invoke(request, UpdateNATGWSubnetResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateNetworkAcl - 更改ACL
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateNetworkAclResponse updateNetworkAcl(UpdateNetworkAclRequest request) throws UCloudException {
            request.setAction("UpdateNetworkAcl");
            return (UpdateNetworkAclResponse) this.invoke(request, UpdateNetworkAclResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateNetworkAclEntry - 更新ACL的规则
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateNetworkAclEntryResponse updateNetworkAclEntry(UpdateNetworkAclEntryRequest request) throws UCloudException {
            request.setAction("UpdateNetworkAclEntry");
            return (UpdateNetworkAclEntryResponse) this.invoke(request, UpdateNetworkAclEntryResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateRouteTableAttribute - 更新路由表基本信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateRouteTableAttributeResponse updateRouteTableAttribute(UpdateRouteTableAttributeRequest request) throws UCloudException {
            request.setAction("UpdateRouteTableAttribute");
            return (UpdateRouteTableAttributeResponse) this.invoke(request, UpdateRouteTableAttributeResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateSnatRule - 更新出口规则（SNAT规则）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateSnatRuleResponse updateSnatRule(UpdateSnatRuleRequest request) throws UCloudException {
            request.setAction("UpdateSnatRule");
            return (UpdateSnatRuleResponse) this.invoke(request, UpdateSnatRuleResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateSubnetAttribute - 更新子网信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateSubnetAttributeResponse updateSubnetAttribute(UpdateSubnetAttributeRequest request) throws UCloudException {
            request.setAction("UpdateSubnetAttribute");
            return (UpdateSubnetAttributeResponse) this.invoke(request, UpdateSubnetAttributeResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateVIPAttribute - 更新VIP信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateVIPAttributeResponse updateVIPAttribute(UpdateVIPAttributeRequest request) throws UCloudException {
            request.setAction("UpdateVIPAttribute");
            return (UpdateVIPAttributeResponse) this.invoke(request, UpdateVIPAttributeResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateVPCNetwork - 更新VPC网段
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateVPCNetworkResponse updateVPCNetwork(UpdateVPCNetworkRequest request) throws UCloudException {
            request.setAction("UpdateVPCNetwork");
            return (UpdateVPCNetworkResponse) this.invoke(request, UpdateVPCNetworkResponse.class);
        }
}
