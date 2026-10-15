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
package cn.ucloud.uk8s.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uk8s.models.AddUK8SAutoScalingGroupV2Request;
import cn.ucloud.uk8s.models.AddUK8SAutoScalingGroupV2Response;
import cn.ucloud.uk8s.models.AddUK8SExistingUHostRequest;
import cn.ucloud.uk8s.models.AddUK8SExistingUHostResponse;
import cn.ucloud.uk8s.models.AddUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.AddUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.AddUK8SPHostNodeRequest;
import cn.ucloud.uk8s.models.AddUK8SPHostNodeResponse;
import cn.ucloud.uk8s.models.AddUK8SUHostNodeRequest;
import cn.ucloud.uk8s.models.AddUK8SUHostNodeResponse;
import cn.ucloud.uk8s.models.CreateUK8SClusterV2Request;
import cn.ucloud.uk8s.models.CreateUK8SClusterV2Response;
import cn.ucloud.uk8s.models.CreateUK8SULSConfigRequest;
import cn.ucloud.uk8s.models.CreateUK8SULSConfigResponse;
import cn.ucloud.uk8s.models.DelUK8SClusterNodeV2Request;
import cn.ucloud.uk8s.models.DelUK8SClusterNodeV2Response;
import cn.ucloud.uk8s.models.DelUK8SClusterRequest;
import cn.ucloud.uk8s.models.DelUK8SClusterResponse;
import cn.ucloud.uk8s.models.DeleteUK8SAutoScalingGroupRequest;
import cn.ucloud.uk8s.models.DeleteUK8SAutoScalingGroupResponse;
import cn.ucloud.uk8s.models.DeleteUK8SULSConfigRequest;
import cn.ucloud.uk8s.models.DeleteUK8SULSConfigResponse;
import cn.ucloud.uk8s.models.DescribeUK8SAutoscalerGroupRequest;
import cn.ucloud.uk8s.models.DescribeUK8SAutoscalerGroupResponse;
import cn.ucloud.uk8s.models.DescribeUK8SClusterRequest;
import cn.ucloud.uk8s.models.DescribeUK8SClusterResponse;
import cn.ucloud.uk8s.models.DescribeUK8SImageRequest;
import cn.ucloud.uk8s.models.DescribeUK8SImageResponse;
import cn.ucloud.uk8s.models.DescribeUK8SNodeRequest;
import cn.ucloud.uk8s.models.DescribeUK8SNodeResponse;
import cn.ucloud.uk8s.models.EnableUK8SAutoscalerRequest;
import cn.ucloud.uk8s.models.EnableUK8SAutoscalerResponse;
import cn.ucloud.uk8s.models.GetClusterConfigRequest;
import cn.ucloud.uk8s.models.GetClusterConfigResponse;
import cn.ucloud.uk8s.models.GetUK8SAvailableInstanceTypesRequest;
import cn.ucloud.uk8s.models.GetUK8SAvailableInstanceTypesResponse;
import cn.ucloud.uk8s.models.GetUK8SCNINodeInfoRequest;
import cn.ucloud.uk8s.models.GetUK8SCNINodeInfoResponse;
import cn.ucloud.uk8s.models.GetUK8SIpamdStatusRequest;
import cn.ucloud.uk8s.models.GetUK8SIpamdStatusResponse;
import cn.ucloud.uk8s.models.GetUK8SLoadBalancerControllerRequest;
import cn.ucloud.uk8s.models.GetUK8SLoadBalancerControllerResponse;
import cn.ucloud.uk8s.models.GetUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.GetUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.GetUK8SPluginInfoRequest;
import cn.ucloud.uk8s.models.GetUK8SPluginInfoResponse;
import cn.ucloud.uk8s.models.GetUK8SVersionsRequest;
import cn.ucloud.uk8s.models.GetUK8SVersionsResponse;
import cn.ucloud.uk8s.models.ListUK8SClusterNodeV2Request;
import cn.ucloud.uk8s.models.ListUK8SClusterNodeV2Response;
import cn.ucloud.uk8s.models.ListUK8SClusterV2Request;
import cn.ucloud.uk8s.models.ListUK8SClusterV2Response;
import cn.ucloud.uk8s.models.ListUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.ListUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.ListUK8SULSConfigRequest;
import cn.ucloud.uk8s.models.ListUK8SULSConfigResponse;
import cn.ucloud.uk8s.models.ModifyUK8SClusterNameRequest;
import cn.ucloud.uk8s.models.ModifyUK8SClusterNameResponse;
import cn.ucloud.uk8s.models.RemoveUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.RemoveUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.UpdateUK8SAutoScalingGroupV2Request;
import cn.ucloud.uk8s.models.UpdateUK8SAutoScalingGroupV2Response;
import cn.ucloud.uk8s.models.UpdateUK8SAutoscalerRequest;
import cn.ucloud.uk8s.models.UpdateUK8SAutoscalerResponse;
import cn.ucloud.uk8s.models.UpdateUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.UpdateUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.UpdateUK8SULSConfigRequest;
import cn.ucloud.uk8s.models.UpdateUK8SULSConfigResponse;

/** This client is used to call actions of **UK8S** service */
public class UK8SClient extends DefaultClient implements UK8SClientInterface {
    public UK8SClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddUK8SAutoScalingGroupV2 - 集群增加伸缩组V2
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUK8SAutoScalingGroupV2Response addUK8SAutoScalingGroupV2(
            AddUK8SAutoScalingGroupV2Request request) throws UCloudException {
        request.setAction("AddUK8SAutoScalingGroupV2");
        return (AddUK8SAutoScalingGroupV2Response)
                this.invoke(request, AddUK8SAutoScalingGroupV2Response.class);
    }

    /**
     * AddUK8SExistingUHost - 添加Node节点（已有云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUK8SExistingUHostResponse addUK8SExistingUHost(AddUK8SExistingUHostRequest request)
            throws UCloudException {
        request.setAction("AddUK8SExistingUHost");
        return (AddUK8SExistingUHostResponse)
                this.invoke(request, AddUK8SExistingUHostResponse.class);
    }

    /**
     * AddUK8SNodeGroup - 添加UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUK8SNodeGroupResponse addUK8SNodeGroup(AddUK8SNodeGroupRequest request)
            throws UCloudException {
        request.setAction("AddUK8SNodeGroup");
        return (AddUK8SNodeGroupResponse) this.invoke(request, AddUK8SNodeGroupResponse.class);
    }

    /**
     * AddUK8SPHostNode - 添加Node节点（物理云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUK8SPHostNodeResponse addUK8SPHostNode(AddUK8SPHostNodeRequest request)
            throws UCloudException {
        request.setAction("AddUK8SPHostNode");
        return (AddUK8SPHostNodeResponse) this.invoke(request, AddUK8SPHostNodeResponse.class);
    }

    /**
     * AddUK8SUHostNode - 添加Node节点（云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUK8SUHostNodeResponse addUK8SUHostNode(AddUK8SUHostNodeRequest request)
            throws UCloudException {
        request.setAction("AddUK8SUHostNode");
        return (AddUK8SUHostNodeResponse) this.invoke(request, AddUK8SUHostNodeResponse.class);
    }

    /**
     * CreateUK8SClusterV2 - 创建UK8S集群V2版
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUK8SClusterV2Response createUK8SClusterV2(CreateUK8SClusterV2Request request)
            throws UCloudException {
        request.setAction("CreateUK8SClusterV2");
        return (CreateUK8SClusterV2Response)
                this.invoke(request, CreateUK8SClusterV2Response.class);
    }

    /**
     * CreateUK8SULSConfig - 创建UK8日志采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUK8SULSConfigResponse createUK8SULSConfig(CreateUK8SULSConfigRequest request)
            throws UCloudException {
        request.setAction("CreateUK8SULSConfig");
        return (CreateUK8SULSConfigResponse)
                this.invoke(request, CreateUK8SULSConfigResponse.class);
    }

    /**
     * DelUK8SCluster - 删除UK8S集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DelUK8SClusterResponse delUK8SCluster(DelUK8SClusterRequest request)
            throws UCloudException {
        request.setAction("DelUK8SCluster");
        return (DelUK8SClusterResponse) this.invoke(request, DelUK8SClusterResponse.class);
    }

    /**
     * DelUK8SClusterNodeV2 - 删除Node节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DelUK8SClusterNodeV2Response delUK8SClusterNodeV2(DelUK8SClusterNodeV2Request request)
            throws UCloudException {
        request.setAction("DelUK8SClusterNodeV2");
        return (DelUK8SClusterNodeV2Response)
                this.invoke(request, DelUK8SClusterNodeV2Response.class);
    }

    /**
     * DeleteUK8SAutoScalingGroup - 删除伸缩组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUK8SAutoScalingGroupResponse deleteUK8SAutoScalingGroup(
            DeleteUK8SAutoScalingGroupRequest request) throws UCloudException {
        request.setAction("DeleteUK8SAutoScalingGroup");
        return (DeleteUK8SAutoScalingGroupResponse)
                this.invoke(request, DeleteUK8SAutoScalingGroupResponse.class);
    }

    /**
     * DeleteUK8SULSConfig - 删除UK8S日志采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUK8SULSConfigResponse deleteUK8SULSConfig(DeleteUK8SULSConfigRequest request)
            throws UCloudException {
        request.setAction("DeleteUK8SULSConfig");
        return (DeleteUK8SULSConfigResponse)
                this.invoke(request, DeleteUK8SULSConfigResponse.class);
    }

    /**
     * DescribeUK8SAutoscalerGroup - 获取AutoscalerGroup信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUK8SAutoscalerGroupResponse describeUK8SAutoscalerGroup(
            DescribeUK8SAutoscalerGroupRequest request) throws UCloudException {
        request.setAction("DescribeUK8SAutoscalerGroup");
        return (DescribeUK8SAutoscalerGroupResponse)
                this.invoke(request, DescribeUK8SAutoscalerGroupResponse.class);
    }

    /**
     * DescribeUK8SCluster - 获取集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUK8SClusterResponse describeUK8SCluster(DescribeUK8SClusterRequest request)
            throws UCloudException {
        request.setAction("DescribeUK8SCluster");
        return (DescribeUK8SClusterResponse)
                this.invoke(request, DescribeUK8SClusterResponse.class);
    }

    /**
     * DescribeUK8SImage - 获取可用镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUK8SImageResponse describeUK8SImage(DescribeUK8SImageRequest request)
            throws UCloudException {
        request.setAction("DescribeUK8SImage");
        return (DescribeUK8SImageResponse) this.invoke(request, DescribeUK8SImageResponse.class);
    }

    /**
     * DescribeUK8SNode - 获取 UK8S 节点详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUK8SNodeResponse describeUK8SNode(DescribeUK8SNodeRequest request)
            throws UCloudException {
        request.setAction("DescribeUK8SNode");
        return (DescribeUK8SNodeResponse) this.invoke(request, DescribeUK8SNodeResponse.class);
    }

    /**
     * EnableUK8SAutoscaler - 开启/关闭伸缩器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public EnableUK8SAutoscalerResponse enableUK8SAutoscaler(EnableUK8SAutoscalerRequest request)
            throws UCloudException {
        request.setAction("EnableUK8SAutoscaler");
        return (EnableUK8SAutoscalerResponse)
                this.invoke(request, EnableUK8SAutoscalerResponse.class);
    }

    /**
     * GetClusterConfig - 获取集群配置文件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetClusterConfigResponse getClusterConfig(GetClusterConfigRequest request)
            throws UCloudException {
        request.setAction("GetClusterConfig");
        return (GetClusterConfigResponse) this.invoke(request, GetClusterConfigResponse.class);
    }

    /**
     * GetUK8SAvailableInstanceTypes - 获取可用机型
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SAvailableInstanceTypesResponse getUK8SAvailableInstanceTypes(
            GetUK8SAvailableInstanceTypesRequest request) throws UCloudException {
        request.setAction("GetUK8SAvailableInstanceTypes");
        return (GetUK8SAvailableInstanceTypesResponse)
                this.invoke(request, GetUK8SAvailableInstanceTypesResponse.class);
    }

    /**
     * GetUK8SCNINodeInfo - 获取 UK8S CNI 节点信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SCNINodeInfoResponse getUK8SCNINodeInfo(GetUK8SCNINodeInfoRequest request)
            throws UCloudException {
        request.setAction("GetUK8SCNINodeInfo");
        return (GetUK8SCNINodeInfoResponse) this.invoke(request, GetUK8SCNINodeInfoResponse.class);
    }

    /**
     * GetUK8SIpamdStatus - 获取ipamd插件的状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SIpamdStatusResponse getUK8SIpamdStatus(GetUK8SIpamdStatusRequest request)
            throws UCloudException {
        request.setAction("GetUK8SIpamdStatus");
        return (GetUK8SIpamdStatusResponse) this.invoke(request, GetUK8SIpamdStatusResponse.class);
    }

    /**
     * GetUK8SLoadBalancerController - 获取 uk8s LoadBalancerController
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SLoadBalancerControllerResponse getUK8SLoadBalancerController(
            GetUK8SLoadBalancerControllerRequest request) throws UCloudException {
        request.setAction("GetUK8SLoadBalancerController");
        return (GetUK8SLoadBalancerControllerResponse)
                this.invoke(request, GetUK8SLoadBalancerControllerResponse.class);
    }

    /**
     * GetUK8SNodeGroup - 列出某个UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SNodeGroupResponse getUK8SNodeGroup(GetUK8SNodeGroupRequest request)
            throws UCloudException {
        request.setAction("GetUK8SNodeGroup");
        return (GetUK8SNodeGroupResponse) this.invoke(request, GetUK8SNodeGroupResponse.class);
    }

    /**
     * GetUK8SPluginInfo - 查询集群插件信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SPluginInfoResponse getUK8SPluginInfo(GetUK8SPluginInfoRequest request)
            throws UCloudException {
        request.setAction("GetUK8SPluginInfo");
        return (GetUK8SPluginInfoResponse) this.invoke(request, GetUK8SPluginInfoResponse.class);
    }

    /**
     * GetUK8SVersions - 获取支持创建的UK8S集群版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUK8SVersionsResponse getUK8SVersions(GetUK8SVersionsRequest request)
            throws UCloudException {
        request.setAction("GetUK8SVersions");
        return (GetUK8SVersionsResponse) this.invoke(request, GetUK8SVersionsResponse.class);
    }

    /**
     * ListUK8SClusterNodeV2 - 获取UK8S集群节点信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUK8SClusterNodeV2Response listUK8SClusterNodeV2(ListUK8SClusterNodeV2Request request)
            throws UCloudException {
        request.setAction("ListUK8SClusterNodeV2");
        return (ListUK8SClusterNodeV2Response)
                this.invoke(request, ListUK8SClusterNodeV2Response.class);
    }

    /**
     * ListUK8SClusterV2 - 获取UK8S集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUK8SClusterV2Response listUK8SClusterV2(ListUK8SClusterV2Request request)
            throws UCloudException {
        request.setAction("ListUK8SClusterV2");
        return (ListUK8SClusterV2Response) this.invoke(request, ListUK8SClusterV2Response.class);
    }

    /**
     * ListUK8SNodeGroup - 列出UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUK8SNodeGroupResponse listUK8SNodeGroup(ListUK8SNodeGroupRequest request)
            throws UCloudException {
        request.setAction("ListUK8SNodeGroup");
        return (ListUK8SNodeGroupResponse) this.invoke(request, ListUK8SNodeGroupResponse.class);
    }

    /**
     * ListUK8SULSConfig - 查询UK8s的ULS日志采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUK8SULSConfigResponse listUK8SULSConfig(ListUK8SULSConfigRequest request)
            throws UCloudException {
        request.setAction("ListUK8SULSConfig");
        return (ListUK8SULSConfigResponse) this.invoke(request, ListUK8SULSConfigResponse.class);
    }

    /**
     * ModifyUK8SClusterName - 修改k8s集群名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUK8SClusterNameResponse modifyUK8SClusterName(ModifyUK8SClusterNameRequest request)
            throws UCloudException {
        request.setAction("ModifyUK8SClusterName");
        return (ModifyUK8SClusterNameResponse)
                this.invoke(request, ModifyUK8SClusterNameResponse.class);
    }

    /**
     * RemoveUK8SNodeGroup - 删除UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveUK8SNodeGroupResponse removeUK8SNodeGroup(RemoveUK8SNodeGroupRequest request)
            throws UCloudException {
        request.setAction("RemoveUK8SNodeGroup");
        return (RemoveUK8SNodeGroupResponse)
                this.invoke(request, RemoveUK8SNodeGroupResponse.class);
    }

    /**
     * UpdateUK8SAutoScalingGroupV2 - 集群修改伸缩组V2
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUK8SAutoScalingGroupV2Response updateUK8SAutoScalingGroupV2(
            UpdateUK8SAutoScalingGroupV2Request request) throws UCloudException {
        request.setAction("UpdateUK8SAutoScalingGroupV2");
        return (UpdateUK8SAutoScalingGroupV2Response)
                this.invoke(request, UpdateUK8SAutoScalingGroupV2Response.class);
    }

    /**
     * UpdateUK8SAutoscaler - 更新伸缩器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUK8SAutoscalerResponse updateUK8SAutoscaler(UpdateUK8SAutoscalerRequest request)
            throws UCloudException {
        request.setAction("UpdateUK8SAutoscaler");
        return (UpdateUK8SAutoscalerResponse)
                this.invoke(request, UpdateUK8SAutoscalerResponse.class);
    }

    /**
     * UpdateUK8SNodeGroup - 修改UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUK8SNodeGroupResponse updateUK8SNodeGroup(UpdateUK8SNodeGroupRequest request)
            throws UCloudException {
        request.setAction("UpdateUK8SNodeGroup");
        return (UpdateUK8SNodeGroupResponse)
                this.invoke(request, UpdateUK8SNodeGroupResponse.class);
    }

    /**
     * UpdateUK8SULSConfig - 更新UK8S日志采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUK8SULSConfigResponse updateUK8SULSConfig(UpdateUK8SULSConfigRequest request)
            throws UCloudException {
        request.setAction("UpdateUK8SULSConfig");
        return (UpdateUK8SULSConfigResponse)
                this.invoke(request, UpdateUK8SULSConfigResponse.class);
    }
}
