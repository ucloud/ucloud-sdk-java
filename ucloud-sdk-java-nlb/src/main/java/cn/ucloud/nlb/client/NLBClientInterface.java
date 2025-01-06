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

import cn.ucloud.common.client.Client;
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
public interface NLBClientInterface extends Client {

    /**
     * AddNLBTargets - 添加后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddNLBTargetsResponse addNLBTargets(AddNLBTargetsRequest request) throws UCloudException;

    /**
     * CreateNLBListener - 创建监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateNLBListenerResponse createNLBListener(CreateNLBListenerRequest request)
            throws UCloudException;

    /**
     * CreateNetworkLoadBalancer - 创建网络型负载均衡
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateNetworkLoadBalancerResponse createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request) throws UCloudException;

    /**
     * DeleteNLBListener - 删除一个网络型负载均衡监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteNLBListenerResponse deleteNLBListener(DeleteNLBListenerRequest request)
            throws UCloudException;

    /**
     * DeleteNetworkLoadBalancer - 删除负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteNetworkLoadBalancerResponse deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request) throws UCloudException;

    /**
     * DescribeNLBListeners - 描述监听器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNLBListenersResponse describeNLBListeners(DescribeNLBListenersRequest request)
            throws UCloudException;

    /**
     * DescribeNetworkLoadBalancers - 描述负载均衡实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNetworkLoadBalancersResponse describeNetworkLoadBalancers(
            DescribeNetworkLoadBalancersRequest request) throws UCloudException;

    /**
     * GetNetworkLoadBalancerPrice - 获取负载均衡价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNetworkLoadBalancerPriceResponse getNetworkLoadBalancerPrice(
            GetNetworkLoadBalancerPriceRequest request) throws UCloudException;

    /**
     * RemoveNLBTargets - 删除后端服务节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveNLBTargetsResponse removeNLBTargets(RemoveNLBTargetsRequest request)
            throws UCloudException;

    /**
     * UpdateNLBListenerAttribute - 更新监听器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNLBListenerAttributeResponse updateNLBListenerAttribute(
            UpdateNLBListenerAttributeRequest request) throws UCloudException;

    /**
     * UpdateNLBTargetsAttribute - 更新后端服务节点属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNLBTargetsAttributeResponse updateNLBTargetsAttribute(
            UpdateNLBTargetsAttributeRequest request) throws UCloudException;

    /**
     * UpdateNetworkLoadBalancerAttribute - 更新负载均衡实例属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateNetworkLoadBalancerAttributeResponse updateNetworkLoadBalancerAttribute(
            UpdateNetworkLoadBalancerAttributeRequest request) throws UCloudException;
}
