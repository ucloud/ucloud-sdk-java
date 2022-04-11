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

import cn.ucloud.common.client.Client;
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
public interface UK8SClientInterface extends Client {

    /**
     * AddUK8SExistingUHost - 添加Node节点（已有云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    AddUK8SExistingUHostResponse addUK8SExistingUHost(AddUK8SExistingUHostRequest request)
            throws UCloudException;

    /**
     * AddUK8SNodeGroup - 添加UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    AddUK8SNodeGroupResponse addUK8SNodeGroup(AddUK8SNodeGroupRequest request)
            throws UCloudException;

    /**
     * AddUK8SPHostNode - 添加Node节点（物理云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    AddUK8SPHostNodeResponse addUK8SPHostNode(AddUK8SPHostNodeRequest request)
            throws UCloudException;

    /**
     * AddUK8SUHostNode - 添加Node节点（云主机）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    AddUK8SUHostNodeResponse addUK8SUHostNode(AddUK8SUHostNodeRequest request)
            throws UCloudException;

    /**
     * CreateUK8SClusterV2 - 创建UK8S集群V2版
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateUK8SClusterV2Response createUK8SClusterV2(CreateUK8SClusterV2Request request)
            throws UCloudException;

    /**
     * DelUK8SCluster - 删除UK8S集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DelUK8SClusterResponse delUK8SCluster(DelUK8SClusterRequest request) throws UCloudException;

    /**
     * DelUK8SClusterNodeV2 - 删除Node节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DelUK8SClusterNodeV2Response delUK8SClusterNodeV2(DelUK8SClusterNodeV2Request request)
            throws UCloudException;

    /**
     * DescribeUK8SCluster - 获取集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUK8SClusterResponse describeUK8SCluster(DescribeUK8SClusterRequest request)
            throws UCloudException;

    /**
     * DescribeUK8SImage - 获取可用镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUK8SImageResponse describeUK8SImage(DescribeUK8SImageRequest request)
            throws UCloudException;

    /**
     * DescribeUK8SNode - 获取 UK8S 节点详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeUK8SNodeResponse describeUK8SNode(DescribeUK8SNodeRequest request)
            throws UCloudException;

    /**
     * ListUK8SClusterNodeV2 - 获取UK8S集群节点信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ListUK8SClusterNodeV2Response listUK8SClusterNodeV2(ListUK8SClusterNodeV2Request request)
            throws UCloudException;

    /**
     * ListUK8SClusterV2 - 获取UK8S集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ListUK8SClusterV2Response listUK8SClusterV2(ListUK8SClusterV2Request request)
            throws UCloudException;

    /**
     * ListUK8SNodeGroup - 列出UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ListUK8SNodeGroupResponse listUK8SNodeGroup(ListUK8SNodeGroupRequest request)
            throws UCloudException;

    /**
     * RemoveUK8SNodeGroup - 删除UK8S节点池
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    RemoveUK8SNodeGroupResponse removeUK8SNodeGroup(RemoveUK8SNodeGroupRequest request)
            throws UCloudException;
}
