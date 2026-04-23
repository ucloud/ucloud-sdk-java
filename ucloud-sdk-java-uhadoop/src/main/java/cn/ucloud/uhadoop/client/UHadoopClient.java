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
package cn.ucloud.uhadoop.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhadoop.models.AddUHadoopInstanceNodeRequest;
import cn.ucloud.uhadoop.models.AddUHadoopInstanceNodeResponse;
import cn.ucloud.uhadoop.models.CreateUHadoopInstanceRequest;
import cn.ucloud.uhadoop.models.CreateUHadoopInstanceResponse;
import cn.ucloud.uhadoop.models.DeleteUHadoopInstanceRequest;
import cn.ucloud.uhadoop.models.DeleteUHadoopInstanceResponse;
import cn.ucloud.uhadoop.models.DescribeUHadoopInstanceRequest;
import cn.ucloud.uhadoop.models.DescribeUHadoopInstanceResponse;
import cn.ucloud.uhadoop.models.GetUHadoopNodeTypeRequest;
import cn.ucloud.uhadoop.models.GetUHadoopNodeTypeResponse;
import cn.ucloud.uhadoop.models.ListUHadoopFrameworkAppByUseCaseRequest;
import cn.ucloud.uhadoop.models.ListUHadoopFrameworkAppByUseCaseResponse;
import cn.ucloud.uhadoop.models.ListUHadoopFrameworkAppRequest;
import cn.ucloud.uhadoop.models.ListUHadoopFrameworkAppResponse;
import cn.ucloud.uhadoop.models.ListUHadoopInstanceRequest;
import cn.ucloud.uhadoop.models.ListUHadoopInstanceResponse;
import cn.ucloud.uhadoop.models.RestartUHadoopServiceRequest;
import cn.ucloud.uhadoop.models.RestartUHadoopServiceResponse;
import cn.ucloud.uhadoop.models.UpgradeUHadoopNodeDiskRequest;
import cn.ucloud.uhadoop.models.UpgradeUHadoopNodeDiskResponse;
import cn.ucloud.uhadoop.models.UpgradeUHadoopNodeRequest;
import cn.ucloud.uhadoop.models.UpgradeUHadoopNodeResponse;

/** This client is used to call actions of **UHadoop** service */
public class UHadoopClient extends DefaultClient implements UHadoopClientInterface {
    public UHadoopClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddUHadoopInstanceNode - 给集群添加节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUHadoopInstanceNodeResponse addUHadoopInstanceNode(
            AddUHadoopInstanceNodeRequest request) throws UCloudException {
        request.setAction("AddUHadoopInstanceNode");
        return (AddUHadoopInstanceNodeResponse)
                this.invoke(request, AddUHadoopInstanceNodeResponse.class);
    }

    /**
     * CreateUHadoopInstance - 新建集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUHadoopInstanceResponse createUHadoopInstance(CreateUHadoopInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUHadoopInstance");
        return (CreateUHadoopInstanceResponse)
                this.invoke(request, CreateUHadoopInstanceResponse.class);
    }

    /**
     * DeleteUHadoopInstance - 删除集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUHadoopInstanceResponse deleteUHadoopInstance(DeleteUHadoopInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUHadoopInstance");
        return (DeleteUHadoopInstanceResponse)
                this.invoke(request, DeleteUHadoopInstanceResponse.class);
    }

    /**
     * DescribeUHadoopInstance - 描述集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUHadoopInstanceResponse describeUHadoopInstance(
            DescribeUHadoopInstanceRequest request) throws UCloudException {
        request.setAction("DescribeUHadoopInstance");
        return (DescribeUHadoopInstanceResponse)
                this.invoke(request, DescribeUHadoopInstanceResponse.class);
    }

    /**
     * GetUHadoopNodeType - 获取节点类型信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHadoopNodeTypeResponse getUHadoopNodeType(GetUHadoopNodeTypeRequest request)
            throws UCloudException {
        request.setAction("GetUHadoopNodeType");
        return (GetUHadoopNodeTypeResponse) this.invoke(request, GetUHadoopNodeTypeResponse.class);
    }

    /**
     * ListUHadoopFrameworkApp - 列举可选app
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUHadoopFrameworkAppResponse listUHadoopFrameworkApp(
            ListUHadoopFrameworkAppRequest request) throws UCloudException {
        request.setAction("ListUHadoopFrameworkApp");
        return (ListUHadoopFrameworkAppResponse)
                this.invoke(request, ListUHadoopFrameworkAppResponse.class);
    }

    /**
     * ListUHadoopFrameworkAppByUseCase - 按使用场景列出框架和应用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUHadoopFrameworkAppByUseCaseResponse listUHadoopFrameworkAppByUseCase(
            ListUHadoopFrameworkAppByUseCaseRequest request) throws UCloudException {
        request.setAction("ListUHadoopFrameworkAppByUseCase");
        return (ListUHadoopFrameworkAppByUseCaseResponse)
                this.invoke(request, ListUHadoopFrameworkAppByUseCaseResponse.class);
    }

    /**
     * ListUHadoopInstance - 列出用户所有的集群
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUHadoopInstanceResponse listUHadoopInstance(ListUHadoopInstanceRequest request)
            throws UCloudException {
        request.setAction("ListUHadoopInstance");
        return (ListUHadoopInstanceResponse)
                this.invoke(request, ListUHadoopInstanceResponse.class);
    }

    /**
     * RestartUHadoopService - 重启集群服务（包含start|stop|restart）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUHadoopServiceResponse restartUHadoopService(RestartUHadoopServiceRequest request)
            throws UCloudException {
        request.setAction("RestartUHadoopService");
        return (RestartUHadoopServiceResponse)
                this.invoke(request, RestartUHadoopServiceResponse.class);
    }

    /**
     * UpgradeUHadoopNode - 升级uhadoop节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeUHadoopNodeResponse upgradeUHadoopNode(UpgradeUHadoopNodeRequest request)
            throws UCloudException {
        request.setAction("UpgradeUHadoopNode");
        return (UpgradeUHadoopNodeResponse) this.invoke(request, UpgradeUHadoopNodeResponse.class);
    }

    /**
     * UpgradeUHadoopNodeDisk - 扩容集群节点磁盘
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeUHadoopNodeDiskResponse upgradeUHadoopNodeDisk(
            UpgradeUHadoopNodeDiskRequest request) throws UCloudException {
        request.setAction("UpgradeUHadoopNodeDisk");
        return (UpgradeUHadoopNodeDiskResponse)
                this.invoke(request, UpgradeUHadoopNodeDiskResponse.class);
    }
}
