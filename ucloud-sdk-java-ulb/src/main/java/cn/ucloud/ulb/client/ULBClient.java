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
import cn.ucloud.ulb.models.AllocateBackendRequest;
import cn.ucloud.ulb.models.AllocateBackendResponse;
import cn.ucloud.ulb.models.BindSSLRequest;
import cn.ucloud.ulb.models.BindSSLResponse;
import cn.ucloud.ulb.models.CreatePolicyRequest;
import cn.ucloud.ulb.models.CreatePolicyResponse;
import cn.ucloud.ulb.models.CreateSSLRequest;
import cn.ucloud.ulb.models.CreateSSLResponse;
import cn.ucloud.ulb.models.CreateULBRequest;
import cn.ucloud.ulb.models.CreateULBResponse;
import cn.ucloud.ulb.models.CreateVServerRequest;
import cn.ucloud.ulb.models.CreateVServerResponse;
import cn.ucloud.ulb.models.DeletePolicyRequest;
import cn.ucloud.ulb.models.DeletePolicyResponse;
import cn.ucloud.ulb.models.DeleteSSLRequest;
import cn.ucloud.ulb.models.DeleteSSLResponse;
import cn.ucloud.ulb.models.DeleteULBRequest;
import cn.ucloud.ulb.models.DeleteULBResponse;
import cn.ucloud.ulb.models.DeleteVServerRequest;
import cn.ucloud.ulb.models.DeleteVServerResponse;
import cn.ucloud.ulb.models.DescribeSSLRequest;
import cn.ucloud.ulb.models.DescribeSSLResponse;
import cn.ucloud.ulb.models.DescribeULBRequest;
import cn.ucloud.ulb.models.DescribeULBResponse;
import cn.ucloud.ulb.models.DescribeULBSimpleRequest;
import cn.ucloud.ulb.models.DescribeULBSimpleResponse;
import cn.ucloud.ulb.models.DescribeVServerRequest;
import cn.ucloud.ulb.models.DescribeVServerResponse;
import cn.ucloud.ulb.models.ReleaseBackendRequest;
import cn.ucloud.ulb.models.ReleaseBackendResponse;
import cn.ucloud.ulb.models.UnbindSSLRequest;
import cn.ucloud.ulb.models.UnbindSSLResponse;
import cn.ucloud.ulb.models.UpdateBackendAttributeRequest;
import cn.ucloud.ulb.models.UpdateBackendAttributeResponse;
import cn.ucloud.ulb.models.UpdatePolicyRequest;
import cn.ucloud.ulb.models.UpdatePolicyResponse;
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
     * AllocateBackend - 添加ULB后端资源实例
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/AllocateBackend
     */
    public AllocateBackendResponse allocateBackend(AllocateBackendRequest request)
            throws UCloudException {
        request.setAction("AllocateBackend");
        return (AllocateBackendResponse) this.invoke(request, AllocateBackendResponse.class);
    }

    /**
     * BindSSL - 将SSL证书绑定到VServer
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/BindSSL
     */
    public BindSSLResponse bindSSL(BindSSLRequest request) throws UCloudException {
        request.setAction("BindSSL");
        return (BindSSLResponse) this.invoke(request, BindSSLResponse.class);
    }

    /**
     * CreatePolicy - 创建VServer内容转发策略
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/CreatePolicy
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws UCloudException {
        request.setAction("CreatePolicy");
        return (CreatePolicyResponse) this.invoke(request, CreatePolicyResponse.class);
    }

    /**
     * CreateSSL - 创建SSL证书，可以把整个 Pem 证书内容传过来，或者把证书、私钥、CA证书分别传过来
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/CreateSSL
     */
    public CreateSSLResponse createSSL(CreateSSLRequest request) throws UCloudException {
        request.setAction("CreateSSL");
        return (CreateSSLResponse) this.invoke(request, CreateSSLResponse.class);
    }

    /**
     * CreateULB - 创建负载均衡实例，可以选择内网或者外网
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/CreateULB
     */
    public CreateULBResponse createULB(CreateULBRequest request) throws UCloudException {
        request.setAction("CreateULB");
        return (CreateULBResponse) this.invoke(request, CreateULBResponse.class);
    }

    /**
     * CreateVServer - 创建VServer实例，定义监听的协议和端口以及负载均衡算法
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/CreateVServer
     */
    public CreateVServerResponse createVServer(CreateVServerRequest request)
            throws UCloudException {
        request.setAction("CreateVServer");
        return (CreateVServerResponse) this.invoke(request, CreateVServerResponse.class);
    }

    /**
     * DeletePolicy - 删除内容转发策略
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DeletePolicy
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws UCloudException {
        request.setAction("DeletePolicy");
        return (DeletePolicyResponse) this.invoke(request, DeletePolicyResponse.class);
    }

    /**
     * DeleteSSL - 删除SSL证书
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DeleteSSL
     */
    public DeleteSSLResponse deleteSSL(DeleteSSLRequest request) throws UCloudException {
        request.setAction("DeleteSSL");
        return (DeleteSSLResponse) this.invoke(request, DeleteSSLResponse.class);
    }

    /**
     * DeleteULB - 删除负载均衡实例
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DeleteULB
     */
    public DeleteULBResponse deleteULB(DeleteULBRequest request) throws UCloudException {
        request.setAction("DeleteULB");
        return (DeleteULBResponse) this.invoke(request, DeleteULBResponse.class);
    }

    /**
     * DeleteVServer - 删除VServer实例
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DeleteVServer
     */
    public DeleteVServerResponse deleteVServer(DeleteVServerRequest request)
            throws UCloudException {
        request.setAction("DeleteVServer");
        return (DeleteVServerResponse) this.invoke(request, DeleteVServerResponse.class);
    }

    /**
     * DescribeSSL - 获取SSL证书信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DescribeSSL
     */
    public DescribeSSLResponse describeSSL(DescribeSSLRequest request) throws UCloudException {
        request.setAction("DescribeSSL");
        return (DescribeSSLResponse) this.invoke(request, DescribeSSLResponse.class);
    }

    /**
     * DescribeULB - 获取ULB详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DescribeULB
     */
    public DescribeULBResponse describeULB(DescribeULBRequest request) throws UCloudException {
        request.setAction("DescribeULB");
        return (DescribeULBResponse) this.invoke(request, DescribeULBResponse.class);
    }

    /**
     * DescribeULBSimple - 获取ULB信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DescribeULBSimple
     */
    public DescribeULBSimpleResponse describeULBSimple(DescribeULBSimpleRequest request)
            throws UCloudException {
        request.setAction("DescribeULBSimple");
        return (DescribeULBSimpleResponse) this.invoke(request, DescribeULBSimpleResponse.class);
    }

    /**
     * DescribeVServer - 获取ULB下的VServer的详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/DescribeVServer
     */
    public DescribeVServerResponse describeVServer(DescribeVServerRequest request)
            throws UCloudException {
        request.setAction("DescribeVServer");
        return (DescribeVServerResponse) this.invoke(request, DescribeVServerResponse.class);
    }

    /**
     * ReleaseBackend - 从VServer释放后端资源实例
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/ReleaseBackend
     */
    public ReleaseBackendResponse releaseBackend(ReleaseBackendRequest request)
            throws UCloudException {
        request.setAction("ReleaseBackend");
        return (ReleaseBackendResponse) this.invoke(request, ReleaseBackendResponse.class);
    }

    /**
     * UnbindSSL - 从VServer解绑SSL证书
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/UnbindSSL
     */
    public UnbindSSLResponse unbindSSL(UnbindSSLRequest request) throws UCloudException {
        request.setAction("UnbindSSL");
        return (UnbindSSLResponse) this.invoke(request, UnbindSSLResponse.class);
    }

    /**
     * UpdateBackendAttribute - 更新ULB后端资源实例(服务节点)属性
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/UpdateBackendAttribute
     */
    public UpdateBackendAttributeResponse updateBackendAttribute(
            UpdateBackendAttributeRequest request) throws UCloudException {
        request.setAction("UpdateBackendAttribute");
        return (UpdateBackendAttributeResponse)
                this.invoke(request, UpdateBackendAttributeResponse.class);
    }

    /**
     * UpdatePolicy - 更新内容转发规则，包括转发规则后的服务节点
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/UpdatePolicy
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws UCloudException {
        request.setAction("UpdatePolicy");
        return (UpdatePolicyResponse) this.invoke(request, UpdatePolicyResponse.class);
    }

    /**
     * UpdateULBAttribute - 更新ULB名字业务组备注等属性字段
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/UpdateULBAttribute
     */
    public UpdateULBAttributeResponse updateULBAttribute(UpdateULBAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateULBAttribute");
        return (UpdateULBAttributeResponse) this.invoke(request, UpdateULBAttributeResponse.class);
    }

    /**
     * UpdateVServerAttribute - 更新VServer实例属性
     *
     * <p>See also: https://docs.ucloud.cn/api/ulb-api/UpdateVServerAttribute
     */
    public UpdateVServerAttributeResponse updateVServerAttribute(
            UpdateVServerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateVServerAttribute");
        return (UpdateVServerAttributeResponse)
                this.invoke(request, UpdateVServerAttributeResponse.class);
    }
}
