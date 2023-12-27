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

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
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
public interface ULBClientInterface extends Client {

    /**
     * AddTargets - 添加应用型负载均衡的后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddTargetsResponse addTargets(AddTargetsRequest request) throws UCloudException;

    /**
     * AllocateBackend - 添加传统型负载均衡的后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AllocateBackendResponse allocateBackend(AllocateBackendRequest request)
            throws UCloudException;

    /**
     * BindSSL - 传统型负载均衡绑定SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindSSLResponse bindSSL(BindSSLRequest request) throws UCloudException;

    /**
     * CreateListener - 创建应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateListenerResponse createListener(CreateListenerRequest request)
            throws UCloudException;

    /**
     * CreateLoadBalancer - 创建应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request)
            throws UCloudException;

    /**
     * CreatePolicy - 传统型负载均衡创建内容转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws UCloudException;

    /**
     * CreateRule - 创建应用型负载均衡的转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws UCloudException;

    /**
     * CreateSSL - 创建SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSSLResponse createSSL(CreateSSLRequest request) throws UCloudException;

    /**
     * CreateSecurityPolicy - 创建安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request)
            throws UCloudException;

    /**
     * CreateULB - 创建传统型负载均衡负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULBResponse createULB(CreateULBRequest request) throws UCloudException;

    /**
     * CreateVServer - 创建CLB的VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateVServerResponse createVServer(CreateVServerRequest request) throws UCloudException;

    /**
     * DeleteListener - 删除应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request)
            throws UCloudException;

    /**
     * DeleteLoadBalancer - 删除应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request)
            throws UCloudException;

    /**
     * DeletePolicy - 删除传统型负载均衡的内容转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws UCloudException;

    /**
     * DeleteRule - 删除应用型负载均衡的转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws UCloudException;

    /**
     * DeleteSSL - 删除SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSSLResponse deleteSSL(DeleteSSLRequest request) throws UCloudException;

    /**
     * DeleteSecurityPolicy - 删除安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request)
            throws UCloudException;

    /**
     * DeleteULB - 删除传统型负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULBResponse deleteULB(DeleteULBRequest request) throws UCloudException;

    /**
     * DeleteVServer - 删除CLB的VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteVServerResponse deleteVServer(DeleteVServerRequest request) throws UCloudException;

    /**
     * DescribeListeners - 描述应用型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeListenersResponse describeListeners(DescribeListenersRequest request)
            throws UCloudException;

    /**
     * DescribeLoadBalancers - 描述应用型负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request)
            throws UCloudException;

    /**
     * DescribeRules - 描述应用型负载均衡转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws UCloudException;

    /**
     * DescribeSSL - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSSLResponse describeSSL(DescribeSSLRequest request) throws UCloudException;

    /**
     * DescribeSSLV2 - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSSLV2Response describeSSLV2(DescribeSSLV2Request request) throws UCloudException;

    /**
     * DescribeSecurityPolicies - 获取安全策略的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSecurityPoliciesResponse describeSecurityPolicies(
            DescribeSecurityPoliciesRequest request) throws UCloudException;

    /**
     * DescribeSecurityPoliciesV2 - 获取安全策略的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSecurityPoliciesV2Response describeSecurityPoliciesV2(
            DescribeSecurityPoliciesV2Request request) throws UCloudException;

    /**
     * DescribeSupportCiphers - 描述支持的加密套件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSupportCiphersResponse describeSupportCiphers(
            DescribeSupportCiphersRequest request) throws UCloudException;

    /**
     * DescribeULB - 获取传统型负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBResponse describeULB(DescribeULBRequest request) throws UCloudException;

    /**
     * DescribeULBSimple - 获取传统型负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBSimpleResponse describeULBSimple(DescribeULBSimpleRequest request)
            throws UCloudException;

    /**
     * DescribeVServer - 获取CLB下的VServer信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeVServerResponse describeVServer(DescribeVServerRequest request)
            throws UCloudException;

    /**
     * ReleaseBackend - 释放传统型负载均衡的后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReleaseBackendResponse releaseBackend(ReleaseBackendRequest request)
            throws UCloudException;

    /**
     * RemoveTargets - 删除应用型负载均衡的后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveTargetsResponse removeTargets(RemoveTargetsRequest request) throws UCloudException;

    /**
     * UnBindSecurityPolicy - 解绑安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindSecurityPolicyResponse unBindSecurityPolicy(UnBindSecurityPolicyRequest request)
            throws UCloudException;

    /**
     * UnbindSSL - 传统型负载均衡解绑SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindSSLResponse unbindSSL(UnbindSSLRequest request) throws UCloudException;

    /**
     * UpdateBackendAttribute - 更新传统型负载均衡的后端实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBackendAttributeResponse updateBackendAttribute(
            UpdateBackendAttributeRequest request) throws UCloudException;

    /**
     * UpdateBackendBatch - 批量更新后端实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBackendBatchResponse updateBackendBatch(UpdateBackendBatchRequest request)
            throws UCloudException;

    /**
     * UpdateListenerAttribute - 更新应用型负载均衡监听器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateListenerAttributeResponse updateListenerAttribute(
            UpdateListenerAttributeRequest request) throws UCloudException;

    /**
     * UpdateLoadBalancerAttribute - 更新应用型负载均衡实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(
            UpdateLoadBalancerAttributeRequest request) throws UCloudException;

    /**
     * UpdatePolicy - 更新传统型负载均衡内容转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws UCloudException;

    /**
     * UpdateRuleAttribute - 更新应用型负载均衡的转发规则属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateRuleAttributeResponse updateRuleAttribute(UpdateRuleAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateSSLAttribute - 更新SSL属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSSLAttributeResponse updateSSLAttribute(UpdateSSLAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateSSLBinding - 更换证书绑定关系
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSSLBindingResponse updateSSLBinding(UpdateSSLBindingRequest request)
            throws UCloudException;

    /**
     * UpdateSecurityPolicy - 更新安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSecurityPolicyResponse updateSecurityPolicy(UpdateSecurityPolicyRequest request)
            throws UCloudException;

    /**
     * UpdateTargetsAttribute - 更新应用型负载均衡的后端服务节点属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateTargetsAttributeResponse updateTargetsAttribute(
            UpdateTargetsAttributeRequest request) throws UCloudException;

    /**
     * UpdateULBAttribute - 更新传统型负载均衡属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULBAttributeResponse updateULBAttribute(UpdateULBAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateVServerAttribute - 更新传统型负载均衡VServer属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateVServerAttributeResponse updateVServerAttribute(
            UpdateVServerAttributeRequest request) throws UCloudException;
}
