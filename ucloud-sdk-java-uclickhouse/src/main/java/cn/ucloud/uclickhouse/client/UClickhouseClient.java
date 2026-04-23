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
package cn.ucloud.uclickhouse.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uclickhouse.models.CreateUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.CreateUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.DescribeUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.DescribeUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.DestroyUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.DestroyUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.ExpandUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.ExpandUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.GetUClickhouseClusterCreateOptionRequest;
import cn.ucloud.uclickhouse.models.GetUClickhouseClusterCreateOptionResponse;
import cn.ucloud.uclickhouse.models.ListUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.ListUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.ResizeUClickhouseClusterRequest;
import cn.ucloud.uclickhouse.models.ResizeUClickhouseClusterResponse;
import cn.ucloud.uclickhouse.models.RestartUClickhouseClusterServiceRequest;
import cn.ucloud.uclickhouse.models.RestartUClickhouseClusterServiceResponse;

/** This client is used to call actions of **UClickhouse** service */
public class UClickhouseClient extends DefaultClient implements UClickhouseClientInterface {
    public UClickhouseClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUClickhouseCluster - 创建UClickhouse集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUClickhouseClusterResponse createUClickhouseCluster(
            CreateUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("CreateUClickhouseCluster");
        return (CreateUClickhouseClusterResponse)
                this.invoke(request, CreateUClickhouseClusterResponse.class);
    }

    /**
     * DescribeUClickhouseCluster - 获取集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUClickhouseClusterResponse describeUClickhouseCluster(
            DescribeUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("DescribeUClickhouseCluster");
        return (DescribeUClickhouseClusterResponse)
                this.invoke(request, DescribeUClickhouseClusterResponse.class);
    }

    /**
     * DestroyUClickhouseCluster - 删除CK集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DestroyUClickhouseClusterResponse destroyUClickhouseCluster(
            DestroyUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("DestroyUClickhouseCluster");
        return (DestroyUClickhouseClusterResponse)
                this.invoke(request, DestroyUClickhouseClusterResponse.class);
    }

    /**
     * ExpandUClickhouseCluster - 集群水平扩容
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ExpandUClickhouseClusterResponse expandUClickhouseCluster(
            ExpandUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("ExpandUClickhouseCluster");
        return (ExpandUClickhouseClusterResponse)
                this.invoke(request, ExpandUClickhouseClusterResponse.class);
    }

    /**
     * GetUClickhouseClusterCreateOption - 获取Clickhouse的创建配置项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUClickhouseClusterCreateOptionResponse getUClickhouseClusterCreateOption(
            GetUClickhouseClusterCreateOptionRequest request) throws UCloudException {
        request.setAction("GetUClickhouseClusterCreateOption");
        return (GetUClickhouseClusterCreateOptionResponse)
                this.invoke(request, GetUClickhouseClusterCreateOptionResponse.class);
    }

    /**
     * ListUClickhouseCluster - 获取UClickhouse集群列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUClickhouseClusterResponse listUClickhouseCluster(
            ListUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("ListUClickhouseCluster");
        return (ListUClickhouseClusterResponse)
                this.invoke(request, ListUClickhouseClusterResponse.class);
    }

    /**
     * ResizeUClickhouseCluster - 集群改配
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUClickhouseClusterResponse resizeUClickhouseCluster(
            ResizeUClickhouseClusterRequest request) throws UCloudException {
        request.setAction("ResizeUClickhouseCluster");
        return (ResizeUClickhouseClusterResponse)
                this.invoke(request, ResizeUClickhouseClusterResponse.class);
    }

    /**
     * RestartUClickhouseClusterService - 重启集群的UClickhouse服务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUClickhouseClusterServiceResponse restartUClickhouseClusterService(
            RestartUClickhouseClusterServiceRequest request) throws UCloudException {
        request.setAction("RestartUClickhouseClusterService");
        return (RestartUClickhouseClusterServiceResponse)
                this.invoke(request, RestartUClickhouseClusterServiceResponse.class);
    }
}
