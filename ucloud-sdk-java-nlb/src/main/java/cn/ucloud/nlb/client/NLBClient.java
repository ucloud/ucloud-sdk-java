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
package cn.ucloud.nlb.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.nlb.models.AddNLBTargetsRequest;
import cn.ucloud.nlb.models.AddNLBTargetsResponse;
import cn.ucloud.nlb.models.CreateNLBListenerRequest;
import cn.ucloud.nlb.models.CreateNLBListenerResponse;
import cn.ucloud.nlb.models.CreateNetworkLoadBalancerRequest;
import cn.ucloud.nlb.models.CreateNetworkLoadBalancerResponse;
import cn.ucloud.nlb.models.DeleteNLBListenerRequest;
import cn.ucloud.nlb.models.DeleteNLBListenerResponse;
import cn.ucloud.nlb.models.DeleteNetworkLoadBalancerRequest;
import cn.ucloud.nlb.models.DeleteNetworkLoadBalancerResponse;
import cn.ucloud.nlb.models.DescribeNLBListenersRequest;
import cn.ucloud.nlb.models.DescribeNLBListenersResponse;
import cn.ucloud.nlb.models.DescribeNetworkLoadBalancersRequest;
import cn.ucloud.nlb.models.DescribeNetworkLoadBalancersResponse;
import cn.ucloud.nlb.models.GetNetworkLoadBalancerPriceRequest;
import cn.ucloud.nlb.models.GetNetworkLoadBalancerPriceResponse;
import cn.ucloud.nlb.models.RemoveNLBTargetsRequest;
import cn.ucloud.nlb.models.RemoveNLBTargetsResponse;
import cn.ucloud.nlb.models.UpdateNLBListenerAttributeRequest;
import cn.ucloud.nlb.models.UpdateNLBListenerAttributeResponse;
import cn.ucloud.nlb.models.UpdateNLBTargetsAttributeRequest;
import cn.ucloud.nlb.models.UpdateNLBTargetsAttributeResponse;
import cn.ucloud.nlb.models.UpdateNetworkLoadBalancerAttributeRequest;
import cn.ucloud.nlb.models.UpdateNetworkLoadBalancerAttributeResponse;

/** This client is used to call actions of **NLB** service */
public class NLBClient extends DefaultClient implements NLBClientInterface {
    public NLBClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddNLBTargets - 添加后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddNLBTargetsResponse addNLBTargets(AddNLBTargetsRequest request)
            throws UCloudException {
        request.setAction("AddNLBTargets");
        return (AddNLBTargetsResponse) this.invoke(request, AddNLBTargetsResponse.class);
    }

    /**
     * CreateNLBListener - 创建监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateNLBListenerResponse createNLBListener(CreateNLBListenerRequest request)
            throws UCloudException {
        request.setAction("CreateNLBListener");
        return (CreateNLBListenerResponse) this.invoke(request, CreateNLBListenerResponse.class);
    }

    /**
     * CreateNetworkLoadBalancer - 创建网络型负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateNetworkLoadBalancerResponse createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request) throws UCloudException {
        request.setAction("CreateNetworkLoadBalancer");
        return (CreateNetworkLoadBalancerResponse)
                this.invoke(request, CreateNetworkLoadBalancerResponse.class);
    }

    /**
     * DeleteNLBListener - 删除一个网络型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteNLBListenerResponse deleteNLBListener(DeleteNLBListenerRequest request)
            throws UCloudException {
        request.setAction("DeleteNLBListener");
        return (DeleteNLBListenerResponse) this.invoke(request, DeleteNLBListenerResponse.class);
    }

    /**
     * DeleteNetworkLoadBalancer - 删除负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteNetworkLoadBalancerResponse deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request) throws UCloudException {
        request.setAction("DeleteNetworkLoadBalancer");
        return (DeleteNetworkLoadBalancerResponse)
                this.invoke(request, DeleteNetworkLoadBalancerResponse.class);
    }

    /**
     * DescribeNLBListeners - 描述监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNLBListenersResponse describeNLBListeners(DescribeNLBListenersRequest request)
            throws UCloudException {
        request.setAction("DescribeNLBListeners");
        return (DescribeNLBListenersResponse)
                this.invoke(request, DescribeNLBListenersResponse.class);
    }

    /**
     * DescribeNetworkLoadBalancers - 描述负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNetworkLoadBalancersResponse describeNetworkLoadBalancers(
            DescribeNetworkLoadBalancersRequest request) throws UCloudException {
        request.setAction("DescribeNetworkLoadBalancers");
        return (DescribeNetworkLoadBalancersResponse)
                this.invoke(request, DescribeNetworkLoadBalancersResponse.class);
    }

    /**
     * GetNetworkLoadBalancerPrice - 获取负载均衡价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNetworkLoadBalancerPriceResponse getNetworkLoadBalancerPrice(
            GetNetworkLoadBalancerPriceRequest request) throws UCloudException {
        request.setAction("GetNetworkLoadBalancerPrice");
        return (GetNetworkLoadBalancerPriceResponse)
                this.invoke(request, GetNetworkLoadBalancerPriceResponse.class);
    }

    /**
     * RemoveNLBTargets - 删除后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveNLBTargetsResponse removeNLBTargets(RemoveNLBTargetsRequest request)
            throws UCloudException {
        request.setAction("RemoveNLBTargets");
        return (RemoveNLBTargetsResponse) this.invoke(request, RemoveNLBTargetsResponse.class);
    }

    /**
     * UpdateNLBListenerAttribute - 更新监听器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNLBListenerAttributeResponse updateNLBListenerAttribute(
            UpdateNLBListenerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateNLBListenerAttribute");
        return (UpdateNLBListenerAttributeResponse)
                this.invoke(request, UpdateNLBListenerAttributeResponse.class);
    }

    /**
     * UpdateNLBTargetsAttribute - 更新后端服务节点属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNLBTargetsAttributeResponse updateNLBTargetsAttribute(
            UpdateNLBTargetsAttributeRequest request) throws UCloudException {
        request.setAction("UpdateNLBTargetsAttribute");
        return (UpdateNLBTargetsAttributeResponse)
                this.invoke(request, UpdateNLBTargetsAttributeResponse.class);
    }

    /**
     * UpdateNetworkLoadBalancerAttribute - 更新负载均衡实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNetworkLoadBalancerAttributeResponse updateNetworkLoadBalancerAttribute(
            UpdateNetworkLoadBalancerAttributeRequest request) throws UCloudException {
        request.setAction("UpdateNetworkLoadBalancerAttribute");
        return (UpdateNetworkLoadBalancerAttributeResponse)
                this.invoke(request, UpdateNetworkLoadBalancerAttributeResponse.class);
    }
}
