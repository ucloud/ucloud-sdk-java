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
package cn.ucloud.ulb.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ulb.models.AddSSLBindingRequest;
import cn.ucloud.ulb.models.AddSSLBindingResponse;
import cn.ucloud.ulb.models.AddTargetsRequest;
import cn.ucloud.ulb.models.AddTargetsResponse;
import cn.ucloud.ulb.models.AllocateBackendRequest;
import cn.ucloud.ulb.models.AllocateBackendResponse;
import cn.ucloud.ulb.models.BindSSLRequest;
import cn.ucloud.ulb.models.BindSSLResponse;
import cn.ucloud.ulb.models.CreateListenerRequest;
import cn.ucloud.ulb.models.CreateListenerResponse;
import cn.ucloud.ulb.models.CreateLoadBalancerRequest;
import cn.ucloud.ulb.models.CreateLoadBalancerResponse;
import cn.ucloud.ulb.models.CreatePolicyRequest;
import cn.ucloud.ulb.models.CreatePolicyResponse;
import cn.ucloud.ulb.models.CreateRuleRequest;
import cn.ucloud.ulb.models.CreateRuleResponse;
import cn.ucloud.ulb.models.CreateSSLRequest;
import cn.ucloud.ulb.models.CreateSSLResponse;
import cn.ucloud.ulb.models.CreateSecurityPolicyRequest;
import cn.ucloud.ulb.models.CreateSecurityPolicyResponse;
import cn.ucloud.ulb.models.CreateULBRequest;
import cn.ucloud.ulb.models.CreateULBResponse;
import cn.ucloud.ulb.models.CreateVServerRequest;
import cn.ucloud.ulb.models.CreateVServerResponse;
import cn.ucloud.ulb.models.DeleteListenerRequest;
import cn.ucloud.ulb.models.DeleteListenerResponse;
import cn.ucloud.ulb.models.DeleteLoadBalancerRequest;
import cn.ucloud.ulb.models.DeleteLoadBalancerResponse;
import cn.ucloud.ulb.models.DeletePolicyRequest;
import cn.ucloud.ulb.models.DeletePolicyResponse;
import cn.ucloud.ulb.models.DeleteRuleRequest;
import cn.ucloud.ulb.models.DeleteRuleResponse;
import cn.ucloud.ulb.models.DeleteSSLBindingRequest;
import cn.ucloud.ulb.models.DeleteSSLBindingResponse;
import cn.ucloud.ulb.models.DeleteSSLRequest;
import cn.ucloud.ulb.models.DeleteSSLResponse;
import cn.ucloud.ulb.models.DeleteSecurityPolicyRequest;
import cn.ucloud.ulb.models.DeleteSecurityPolicyResponse;
import cn.ucloud.ulb.models.DeleteULBRequest;
import cn.ucloud.ulb.models.DeleteULBResponse;
import cn.ucloud.ulb.models.DeleteVServerRequest;
import cn.ucloud.ulb.models.DeleteVServerResponse;
import cn.ucloud.ulb.models.DescribeListenersRequest;
import cn.ucloud.ulb.models.DescribeListenersResponse;
import cn.ucloud.ulb.models.DescribeLoadBalancersRequest;
import cn.ucloud.ulb.models.DescribeLoadBalancersResponse;
import cn.ucloud.ulb.models.DescribeRulesRequest;
import cn.ucloud.ulb.models.DescribeRulesResponse;
import cn.ucloud.ulb.models.DescribeSSLRequest;
import cn.ucloud.ulb.models.DescribeSSLResponse;
import cn.ucloud.ulb.models.DescribeSSLV2Request;
import cn.ucloud.ulb.models.DescribeSSLV2Response;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesRequest;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesResponse;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesV2Request;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesV2Response;
import cn.ucloud.ulb.models.DescribeSupportCiphersRequest;
import cn.ucloud.ulb.models.DescribeSupportCiphersResponse;
import cn.ucloud.ulb.models.DescribeULBRequest;
import cn.ucloud.ulb.models.DescribeULBResponse;
import cn.ucloud.ulb.models.DescribeULBSimpleRequest;
import cn.ucloud.ulb.models.DescribeULBSimpleResponse;
import cn.ucloud.ulb.models.DescribeVServerRequest;
import cn.ucloud.ulb.models.DescribeVServerResponse;
import cn.ucloud.ulb.models.ReleaseBackendRequest;
import cn.ucloud.ulb.models.ReleaseBackendResponse;
import cn.ucloud.ulb.models.RemoveTargetsRequest;
import cn.ucloud.ulb.models.RemoveTargetsResponse;
import cn.ucloud.ulb.models.UnBindSecurityPolicyRequest;
import cn.ucloud.ulb.models.UnBindSecurityPolicyResponse;
import cn.ucloud.ulb.models.UnbindSSLRequest;
import cn.ucloud.ulb.models.UnbindSSLResponse;
import cn.ucloud.ulb.models.UpdateBackendAttributeRequest;
import cn.ucloud.ulb.models.UpdateBackendAttributeResponse;
import cn.ucloud.ulb.models.UpdateBackendBatchRequest;
import cn.ucloud.ulb.models.UpdateBackendBatchResponse;
import cn.ucloud.ulb.models.UpdateListenerAttributeRequest;
import cn.ucloud.ulb.models.UpdateListenerAttributeResponse;
import cn.ucloud.ulb.models.UpdateLoadBalancerAttributeRequest;
import cn.ucloud.ulb.models.UpdateLoadBalancerAttributeResponse;
import cn.ucloud.ulb.models.UpdatePolicyRequest;
import cn.ucloud.ulb.models.UpdatePolicyResponse;
import cn.ucloud.ulb.models.UpdateRuleAttributeRequest;
import cn.ucloud.ulb.models.UpdateRuleAttributeResponse;
import cn.ucloud.ulb.models.UpdateSSLAttributeRequest;
import cn.ucloud.ulb.models.UpdateSSLAttributeResponse;
import cn.ucloud.ulb.models.UpdateSSLBindingRequest;
import cn.ucloud.ulb.models.UpdateSSLBindingResponse;
import cn.ucloud.ulb.models.UpdateSecurityPolicyRequest;
import cn.ucloud.ulb.models.UpdateSecurityPolicyResponse;
import cn.ucloud.ulb.models.UpdateTargetsAttributeRequest;
import cn.ucloud.ulb.models.UpdateTargetsAttributeResponse;
import cn.ucloud.ulb.models.UpdateULBAttributeRequest;
import cn.ucloud.ulb.models.UpdateULBAttributeResponse;
import cn.ucloud.ulb.models.UpdateVServerAttributeRequest;
import cn.ucloud.ulb.models.UpdateVServerAttributeResponse;

/** This client is used to call actions of **ULB** service */
public class ULBClient extends DefaultClient implements ULBClientInterface {
    public ULBClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddSSLBinding - 新增监听器绑定证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddSSLBindingResponse addSSLBinding(AddSSLBindingRequest request)
            throws UCloudException {
        request.setAction("AddSSLBinding");
        return (AddSSLBindingResponse) this.invoke(request, AddSSLBindingResponse.class);
    }

    /**
     * AddTargets - 添加应用型负载均衡的后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddTargetsResponse addTargets(AddTargetsRequest request) throws UCloudException {
        request.setAction("AddTargets");
        return (AddTargetsResponse) this.invoke(request, AddTargetsResponse.class);
    }

    /**
     * AllocateBackend - 添加传统型负载均衡的后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AllocateBackendResponse allocateBackend(AllocateBackendRequest request)
            throws UCloudException {
        request.setAction("AllocateBackend");
        return (AllocateBackendResponse) this.invoke(request, AllocateBackendResponse.class);
    }

    /**
     * BindSSL - 传统型负载均衡绑定SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindSSLResponse bindSSL(BindSSLRequest request) throws UCloudException {
        request.setAction("BindSSL");
        return (BindSSLResponse) this.invoke(request, BindSSLResponse.class);
    }

    /**
     * CreateListener - 创建应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateListenerResponse createListener(CreateListenerRequest request)
            throws UCloudException {
        request.setAction("CreateListener");
        return (CreateListenerResponse) this.invoke(request, CreateListenerResponse.class);
    }

    /**
     * CreateLoadBalancer - 创建应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request)
            throws UCloudException {
        request.setAction("CreateLoadBalancer");
        return (CreateLoadBalancerResponse) this.invoke(request, CreateLoadBalancerResponse.class);
    }

    /**
     * CreatePolicy - 传统型负载均衡创建内容转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws UCloudException {
        request.setAction("CreatePolicy");
        return (CreatePolicyResponse) this.invoke(request, CreatePolicyResponse.class);
    }

    /**
     * CreateRule - 创建应用型负载均衡的转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws UCloudException {
        request.setAction("CreateRule");
        return (CreateRuleResponse) this.invoke(request, CreateRuleResponse.class);
    }

    /**
     * CreateSSL - 创建SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSSLResponse createSSL(CreateSSLRequest request) throws UCloudException {
        request.setAction("CreateSSL");
        return (CreateSSLResponse) this.invoke(request, CreateSSLResponse.class);
    }

    /**
     * CreateSecurityPolicy - 创建安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request)
            throws UCloudException {
        request.setAction("CreateSecurityPolicy");
        return (CreateSecurityPolicyResponse)
                this.invoke(request, CreateSecurityPolicyResponse.class);
    }

    /**
     * CreateULB - 创建传统型负载均衡负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULBResponse createULB(CreateULBRequest request) throws UCloudException {
        request.setAction("CreateULB");
        return (CreateULBResponse) this.invoke(request, CreateULBResponse.class);
    }

    /**
     * CreateVServer - 创建CLB的VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateVServerResponse createVServer(CreateVServerRequest request)
            throws UCloudException {
        request.setAction("CreateVServer");
        return (CreateVServerResponse) this.invoke(request, CreateVServerResponse.class);
    }

    /**
     * DeleteListener - 删除应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request)
            throws UCloudException {
        request.setAction("DeleteListener");
        return (DeleteListenerResponse) this.invoke(request, DeleteListenerResponse.class);
    }

    /**
     * DeleteLoadBalancer - 删除应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request)
            throws UCloudException {
        request.setAction("DeleteLoadBalancer");
        return (DeleteLoadBalancerResponse) this.invoke(request, DeleteLoadBalancerResponse.class);
    }

    /**
     * DeletePolicy - 删除传统型负载均衡的内容转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws UCloudException {
        request.setAction("DeletePolicy");
        return (DeletePolicyResponse) this.invoke(request, DeletePolicyResponse.class);
    }

    /**
     * DeleteRule - 删除应用型负载均衡的转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws UCloudException {
        request.setAction("DeleteRule");
        return (DeleteRuleResponse) this.invoke(request, DeleteRuleResponse.class);
    }

    /**
     * DeleteSSL - 删除SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSSLResponse deleteSSL(DeleteSSLRequest request) throws UCloudException {
        request.setAction("DeleteSSL");
        return (DeleteSSLResponse) this.invoke(request, DeleteSSLResponse.class);
    }

    /**
     * DeleteSSLBinding - 删除监听器绑定的扩展证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSSLBindingResponse deleteSSLBinding(DeleteSSLBindingRequest request)
            throws UCloudException {
        request.setAction("DeleteSSLBinding");
        return (DeleteSSLBindingResponse) this.invoke(request, DeleteSSLBindingResponse.class);
    }

    /**
     * DeleteSecurityPolicy - 删除安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request)
            throws UCloudException {
        request.setAction("DeleteSecurityPolicy");
        return (DeleteSecurityPolicyResponse)
                this.invoke(request, DeleteSecurityPolicyResponse.class);
    }

    /**
     * DeleteULB - 删除传统型负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULBResponse deleteULB(DeleteULBRequest request) throws UCloudException {
        request.setAction("DeleteULB");
        return (DeleteULBResponse) this.invoke(request, DeleteULBResponse.class);
    }

    /**
     * DeleteVServer - 删除CLB的VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteVServerResponse deleteVServer(DeleteVServerRequest request)
            throws UCloudException {
        request.setAction("DeleteVServer");
        return (DeleteVServerResponse) this.invoke(request, DeleteVServerResponse.class);
    }

    /**
     * DescribeListeners - 描述应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeListenersResponse describeListeners(DescribeListenersRequest request)
            throws UCloudException {
        request.setAction("DescribeListeners");
        return (DescribeListenersResponse) this.invoke(request, DescribeListenersResponse.class);
    }

    /**
     * DescribeLoadBalancers - 描述应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request)
            throws UCloudException {
        request.setAction("DescribeLoadBalancers");
        return (DescribeLoadBalancersResponse)
                this.invoke(request, DescribeLoadBalancersResponse.class);
    }

    /**
     * DescribeRules - 描述应用型负载均衡转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request)
            throws UCloudException {
        request.setAction("DescribeRules");
        return (DescribeRulesResponse) this.invoke(request, DescribeRulesResponse.class);
    }

    /**
     * DescribeSSL - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSSLResponse describeSSL(DescribeSSLRequest request) throws UCloudException {
        request.setAction("DescribeSSL");
        return (DescribeSSLResponse) this.invoke(request, DescribeSSLResponse.class);
    }

    /**
     * DescribeSSLV2 - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSSLV2Response describeSSLV2(DescribeSSLV2Request request)
            throws UCloudException {
        request.setAction("DescribeSSLV2");
        return (DescribeSSLV2Response) this.invoke(request, DescribeSSLV2Response.class);
    }

    /**
     * DescribeSecurityPolicies - 获取安全策略的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSecurityPoliciesResponse describeSecurityPolicies(
            DescribeSecurityPoliciesRequest request) throws UCloudException {
        request.setAction("DescribeSecurityPolicies");
        return (DescribeSecurityPoliciesResponse)
                this.invoke(request, DescribeSecurityPoliciesResponse.class);
    }

    /**
     * DescribeSecurityPoliciesV2 - 获取安全策略的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSecurityPoliciesV2Response describeSecurityPoliciesV2(
            DescribeSecurityPoliciesV2Request request) throws UCloudException {
        request.setAction("DescribeSecurityPoliciesV2");
        return (DescribeSecurityPoliciesV2Response)
                this.invoke(request, DescribeSecurityPoliciesV2Response.class);
    }

    /**
     * DescribeSupportCiphers - 描述支持的加密套件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSupportCiphersResponse describeSupportCiphers(
            DescribeSupportCiphersRequest request) throws UCloudException {
        request.setAction("DescribeSupportCiphers");
        return (DescribeSupportCiphersResponse)
                this.invoke(request, DescribeSupportCiphersResponse.class);
    }

    /**
     * DescribeULB - 获取传统型负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBResponse describeULB(DescribeULBRequest request) throws UCloudException {
        request.setAction("DescribeULB");
        return (DescribeULBResponse) this.invoke(request, DescribeULBResponse.class);
    }

    /**
     * DescribeULBSimple - 获取传统型负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBSimpleResponse describeULBSimple(DescribeULBSimpleRequest request)
            throws UCloudException {
        request.setAction("DescribeULBSimple");
        return (DescribeULBSimpleResponse) this.invoke(request, DescribeULBSimpleResponse.class);
    }

    /**
     * DescribeVServer - 获取CLB下的VServer信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeVServerResponse describeVServer(DescribeVServerRequest request)
            throws UCloudException {
        request.setAction("DescribeVServer");
        return (DescribeVServerResponse) this.invoke(request, DescribeVServerResponse.class);
    }

    /**
     * ReleaseBackend - 释放传统型负载均衡的后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReleaseBackendResponse releaseBackend(ReleaseBackendRequest request)
            throws UCloudException {
        request.setAction("ReleaseBackend");
        return (ReleaseBackendResponse) this.invoke(request, ReleaseBackendResponse.class);
    }

    /**
     * RemoveTargets - 删除应用型负载均衡的后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveTargetsResponse removeTargets(RemoveTargetsRequest request)
            throws UCloudException {
        request.setAction("RemoveTargets");
        return (RemoveTargetsResponse) this.invoke(request, RemoveTargetsResponse.class);
    }

    /**
     * UnBindSecurityPolicy - 解绑安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindSecurityPolicyResponse unBindSecurityPolicy(UnBindSecurityPolicyRequest request)
            throws UCloudException {
        request.setAction("UnBindSecurityPolicy");
        return (UnBindSecurityPolicyResponse)
                this.invoke(request, UnBindSecurityPolicyResponse.class);
    }

    /**
     * UnbindSSL - 传统型负载均衡解绑SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindSSLResponse unbindSSL(UnbindSSLRequest request) throws UCloudException {
        request.setAction("UnbindSSL");
        return (UnbindSSLResponse) this.invoke(request, UnbindSSLResponse.class);
    }

    /**
     * UpdateBackendAttribute - 更新传统型负载均衡的后端实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBackendAttributeResponse updateBackendAttribute(
            UpdateBackendAttributeRequest request) throws UCloudException {
        request.setAction("UpdateBackendAttribute");
        return (UpdateBackendAttributeResponse)
                this.invoke(request, UpdateBackendAttributeResponse.class);
    }

    /**
     * UpdateBackendBatch - 批量更新后端实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBackendBatchResponse updateBackendBatch(UpdateBackendBatchRequest request)
            throws UCloudException {
        request.setAction("UpdateBackendBatch");
        return (UpdateBackendBatchResponse) this.invoke(request, UpdateBackendBatchResponse.class);
    }

    /**
     * UpdateListenerAttribute - 更新应用型负载均衡监听器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateListenerAttributeResponse updateListenerAttribute(
            UpdateListenerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateListenerAttribute");
        return (UpdateListenerAttributeResponse)
                this.invoke(request, UpdateListenerAttributeResponse.class);
    }

    /**
     * UpdateLoadBalancerAttribute - 更新应用型负载均衡实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(
            UpdateLoadBalancerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateLoadBalancerAttribute");
        return (UpdateLoadBalancerAttributeResponse)
                this.invoke(request, UpdateLoadBalancerAttributeResponse.class);
    }

    /**
     * UpdatePolicy - 更新传统型负载均衡内容转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws UCloudException {
        request.setAction("UpdatePolicy");
        return (UpdatePolicyResponse) this.invoke(request, UpdatePolicyResponse.class);
    }

    /**
     * UpdateRuleAttribute - 更新应用型负载均衡的转发规则属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateRuleAttributeResponse updateRuleAttribute(UpdateRuleAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateRuleAttribute");
        return (UpdateRuleAttributeResponse)
                this.invoke(request, UpdateRuleAttributeResponse.class);
    }

    /**
     * UpdateSSLAttribute - 更新SSL属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSSLAttributeResponse updateSSLAttribute(UpdateSSLAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateSSLAttribute");
        return (UpdateSSLAttributeResponse) this.invoke(request, UpdateSSLAttributeResponse.class);
    }

    /**
     * UpdateSSLBinding - 更换证书绑定关系
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSSLBindingResponse updateSSLBinding(UpdateSSLBindingRequest request)
            throws UCloudException {
        request.setAction("UpdateSSLBinding");
        return (UpdateSSLBindingResponse) this.invoke(request, UpdateSSLBindingResponse.class);
    }

    /**
     * UpdateSecurityPolicy - 更新安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSecurityPolicyResponse updateSecurityPolicy(UpdateSecurityPolicyRequest request)
            throws UCloudException {
        request.setAction("UpdateSecurityPolicy");
        return (UpdateSecurityPolicyResponse)
                this.invoke(request, UpdateSecurityPolicyResponse.class);
    }

    /**
     * UpdateTargetsAttribute - 更新应用型负载均衡的后端服务节点属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateTargetsAttributeResponse updateTargetsAttribute(
            UpdateTargetsAttributeRequest request) throws UCloudException {
        request.setAction("UpdateTargetsAttribute");
        return (UpdateTargetsAttributeResponse)
                this.invoke(request, UpdateTargetsAttributeResponse.class);
    }

    /**
     * UpdateULBAttribute - 更新传统型负载均衡属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULBAttributeResponse updateULBAttribute(UpdateULBAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateULBAttribute");
        return (UpdateULBAttributeResponse) this.invoke(request, UpdateULBAttributeResponse.class);
    }

    /**
     * UpdateVServerAttribute - 更新传统型负载均衡VServer属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateVServerAttributeResponse updateVServerAttribute(
            UpdateVServerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateVServerAttribute");
        return (UpdateVServerAttributeResponse)
                this.invoke(request, UpdateVServerAttributeResponse.class);
    }
}
