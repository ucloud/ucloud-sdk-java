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
import cn.ucloud.uk8s.models.DelUK8SClusterNodeV2Request;
import cn.ucloud.uk8s.models.DelUK8SClusterNodeV2Response;
import cn.ucloud.uk8s.models.DelUK8SClusterRequest;
import cn.ucloud.uk8s.models.DelUK8SClusterResponse;
import cn.ucloud.uk8s.models.DescribeUK8SClusterRequest;
import cn.ucloud.uk8s.models.DescribeUK8SClusterResponse;
import cn.ucloud.uk8s.models.DescribeUK8SImageRequest;
import cn.ucloud.uk8s.models.DescribeUK8SImageResponse;
import cn.ucloud.uk8s.models.DescribeUK8SNodeRequest;
import cn.ucloud.uk8s.models.DescribeUK8SNodeResponse;
import cn.ucloud.uk8s.models.ListUK8SClusterNodeV2Request;
import cn.ucloud.uk8s.models.ListUK8SClusterNodeV2Response;
import cn.ucloud.uk8s.models.ListUK8SClusterV2Request;
import cn.ucloud.uk8s.models.ListUK8SClusterV2Response;
import cn.ucloud.uk8s.models.ListUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.ListUK8SNodeGroupResponse;
import cn.ucloud.uk8s.models.RemoveUK8SNodeGroupRequest;
import cn.ucloud.uk8s.models.RemoveUK8SNodeGroupResponse;

/** This client is used to call actions of **UK8S** service */
public class UK8SClient extends DefaultClient implements UK8SClientInterface {
    public UK8SClient(Config config, Credential credential) {
        super(config, credential);
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
}
