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
import cn.ucloud.ulb.models.AllocateBackendRequest;
import cn.ucloud.ulb.models.AllocateBackendResponse;
import cn.ucloud.ulb.models.BindSSLRequest;
import cn.ucloud.ulb.models.BindSSLResponse;
import cn.ucloud.ulb.models.CreatePolicyRequest;
import cn.ucloud.ulb.models.CreatePolicyResponse;
import cn.ucloud.ulb.models.CreateSSLRequest;
import cn.ucloud.ulb.models.CreateSSLResponse;
import cn.ucloud.ulb.models.CreateSecurityPolicyRequest;
import cn.ucloud.ulb.models.CreateSecurityPolicyResponse;
import cn.ucloud.ulb.models.CreateULBRequest;
import cn.ucloud.ulb.models.CreateULBResponse;
import cn.ucloud.ulb.models.CreateVServerRequest;
import cn.ucloud.ulb.models.CreateVServerResponse;
import cn.ucloud.ulb.models.DeletePolicyRequest;
import cn.ucloud.ulb.models.DeletePolicyResponse;
import cn.ucloud.ulb.models.DeleteSSLRequest;
import cn.ucloud.ulb.models.DeleteSSLResponse;
import cn.ucloud.ulb.models.DeleteSecurityPolicyRequest;
import cn.ucloud.ulb.models.DeleteSecurityPolicyResponse;
import cn.ucloud.ulb.models.DeleteULBRequest;
import cn.ucloud.ulb.models.DeleteULBResponse;
import cn.ucloud.ulb.models.DeleteVServerRequest;
import cn.ucloud.ulb.models.DeleteVServerResponse;
import cn.ucloud.ulb.models.DescribeSSLRequest;
import cn.ucloud.ulb.models.DescribeSSLResponse;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesRequest;
import cn.ucloud.ulb.models.DescribeSecurityPoliciesResponse;
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
import cn.ucloud.ulb.models.UnBindSecurityPolicyRequest;
import cn.ucloud.ulb.models.UnBindSecurityPolicyResponse;
import cn.ucloud.ulb.models.UnbindSSLRequest;
import cn.ucloud.ulb.models.UnbindSSLResponse;
import cn.ucloud.ulb.models.UpdateBackendAttributeRequest;
import cn.ucloud.ulb.models.UpdateBackendAttributeResponse;
import cn.ucloud.ulb.models.UpdatePolicyRequest;
import cn.ucloud.ulb.models.UpdatePolicyResponse;
import cn.ucloud.ulb.models.UpdateSSLAttributeRequest;
import cn.ucloud.ulb.models.UpdateSSLAttributeResponse;
import cn.ucloud.ulb.models.UpdateSSLBindingRequest;
import cn.ucloud.ulb.models.UpdateSSLBindingResponse;
import cn.ucloud.ulb.models.UpdateSecurityPolicyRequest;
import cn.ucloud.ulb.models.UpdateSecurityPolicyResponse;
import cn.ucloud.ulb.models.UpdateULBAttributeRequest;
import cn.ucloud.ulb.models.UpdateULBAttributeResponse;
import cn.ucloud.ulb.models.UpdateVServerAttributeRequest;
import cn.ucloud.ulb.models.UpdateVServerAttributeResponse;

/** This client is used to call actions of **ULB** service */
public interface ULBClientInterface extends Client {

    /**
     * AllocateBackend - 添加后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AllocateBackendResponse allocateBackend(AllocateBackendRequest request)
            throws UCloudException;

    /**
     * BindSSL - 绑定SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindSSLResponse bindSSL(BindSSLRequest request) throws UCloudException;

    /**
     * CreatePolicy - 创建内容转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws UCloudException;

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
     * CreateULB - 创建负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULBResponse createULB(CreateULBRequest request) throws UCloudException;

    /**
     * CreateVServer - 创建VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateVServerResponse createVServer(CreateVServerRequest request) throws UCloudException;

    /**
     * DeletePolicy - 删除转发策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws UCloudException;

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
     * DeleteULB - 删除负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULBResponse deleteULB(DeleteULBRequest request) throws UCloudException;

    /**
     * DeleteVServer - 删除VServer
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteVServerResponse deleteVServer(DeleteVServerRequest request) throws UCloudException;

    /**
     * DescribeSSL - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSSLResponse describeSSL(DescribeSSLRequest request) throws UCloudException;

    /**
     * DescribeSecurityPolicies - 获取安全策略的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSecurityPoliciesResponse describeSecurityPolicies(
            DescribeSecurityPoliciesRequest request) throws UCloudException;

    /**
     * DescribeSupportCiphers - 描述支持的加密套件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSupportCiphersResponse describeSupportCiphers(
            DescribeSupportCiphersRequest request) throws UCloudException;

    /**
     * DescribeULB - 获取负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBResponse describeULB(DescribeULBRequest request) throws UCloudException;

    /**
     * DescribeULBSimple - 获取负载均衡信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULBSimpleResponse describeULBSimple(DescribeULBSimpleRequest request)
            throws UCloudException;

    /**
     * DescribeVServer - 获取VServer信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeVServerResponse describeVServer(DescribeVServerRequest request)
            throws UCloudException;

    /**
     * ReleaseBackend - 释放后端实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReleaseBackendResponse releaseBackend(ReleaseBackendRequest request)
            throws UCloudException;

    /**
     * UnBindSecurityPolicy - 解绑安全策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindSecurityPolicyResponse unBindSecurityPolicy(UnBindSecurityPolicyRequest request)
            throws UCloudException;

    /**
     * UnbindSSL - 解绑SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindSSLResponse unbindSSL(UnbindSSLRequest request) throws UCloudException;

    /**
     * UpdateBackendAttribute - 更新后端实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBackendAttributeResponse updateBackendAttribute(
            UpdateBackendAttributeRequest request) throws UCloudException;

    /**
     * UpdatePolicy - 更新内容转发规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws UCloudException;

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
     * UpdateULBAttribute - 更新负载均衡属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULBAttributeResponse updateULBAttribute(UpdateULBAttributeRequest request)
            throws UCloudException;

    /**
     * UpdateVServerAttribute - 更新VServer属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateVServerAttributeResponse updateVServerAttribute(
            UpdateVServerAttributeRequest request) throws UCloudException;
}
