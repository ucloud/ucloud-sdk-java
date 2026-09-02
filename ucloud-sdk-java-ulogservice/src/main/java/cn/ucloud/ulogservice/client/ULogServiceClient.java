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
package cn.ucloud.ulogservice.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ulogservice.models.BindULogServiceGroupToCollectConfRequest;
import cn.ucloud.ulogservice.models.BindULogServiceGroupToCollectConfResponse;
import cn.ucloud.ulogservice.models.CreateULogServiceCollectConfRequest;
import cn.ucloud.ulogservice.models.CreateULogServiceCollectConfResponse;
import cn.ucloud.ulogservice.models.CreateULogServiceLogSetRequest;
import cn.ucloud.ulogservice.models.CreateULogServiceLogSetResponse;
import cn.ucloud.ulogservice.models.CreateULogServiceMachineGroupRequest;
import cn.ucloud.ulogservice.models.CreateULogServiceMachineGroupResponse;
import cn.ucloud.ulogservice.models.CreateULogServiceTopicRequest;
import cn.ucloud.ulogservice.models.CreateULogServiceTopicResponse;
import cn.ucloud.ulogservice.models.DeleteULogServiceCollectConfRequest;
import cn.ucloud.ulogservice.models.DeleteULogServiceCollectConfResponse;
import cn.ucloud.ulogservice.models.DeleteULogServiceLogSetRequest;
import cn.ucloud.ulogservice.models.DeleteULogServiceLogSetResponse;
import cn.ucloud.ulogservice.models.DeleteULogServiceMachineGroupRequest;
import cn.ucloud.ulogservice.models.DeleteULogServiceMachineGroupResponse;
import cn.ucloud.ulogservice.models.DeleteULogServiceTopicRequest;
import cn.ucloud.ulogservice.models.DeleteULogServiceTopicResponse;
import cn.ucloud.ulogservice.models.DescribeULogServiceMachineGroupRequest;
import cn.ucloud.ulogservice.models.DescribeULogServiceMachineGroupResponse;
import cn.ucloud.ulogservice.models.GetULogServiceTopicFieldRequest;
import cn.ucloud.ulogservice.models.GetULogServiceTopicFieldResponse;
import cn.ucloud.ulogservice.models.ListULogServiceCollectConfRequest;
import cn.ucloud.ulogservice.models.ListULogServiceCollectConfResponse;
import cn.ucloud.ulogservice.models.ListULogServiceLogSetRequest;
import cn.ucloud.ulogservice.models.ListULogServiceLogSetResponse;
import cn.ucloud.ulogservice.models.ListULogServiceMachineGroupRequest;
import cn.ucloud.ulogservice.models.ListULogServiceMachineGroupResponse;
import cn.ucloud.ulogservice.models.ListULogServiceTopicRequest;
import cn.ucloud.ulogservice.models.ListULogServiceTopicResponse;
import cn.ucloud.ulogservice.models.QueryULogServiceLogRequest;
import cn.ucloud.ulogservice.models.QueryULogServiceLogResponse;
import cn.ucloud.ulogservice.models.UpdateULogServiceCollectConfRequest;
import cn.ucloud.ulogservice.models.UpdateULogServiceCollectConfResponse;
import cn.ucloud.ulogservice.models.UpdateULogServiceMachineGroupRequest;
import cn.ucloud.ulogservice.models.UpdateULogServiceMachineGroupResponse;
import cn.ucloud.ulogservice.models.UpdateULogServiceTopicFieldRequest;
import cn.ucloud.ulogservice.models.UpdateULogServiceTopicFieldResponse;

/** This client is used to call actions of **ULogService** service */
public class ULogServiceClient extends DefaultClient implements ULogServiceClientInterface {
    public ULogServiceClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BindULogServiceGroupToCollectConf - 日志主题采集配置绑定机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindULogServiceGroupToCollectConfResponse bindULogServiceGroupToCollectConf(
            BindULogServiceGroupToCollectConfRequest request) throws UCloudException {
        request.setAction("BindULogServiceGroupToCollectConf");
        return (BindULogServiceGroupToCollectConfResponse)
                this.invoke(request, BindULogServiceGroupToCollectConfResponse.class);
    }

    /**
     * CreateULogServiceCollectConf - 创建采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceCollectConfResponse createULogServiceCollectConf(
            CreateULogServiceCollectConfRequest request) throws UCloudException {
        request.setAction("CreateULogServiceCollectConf");
        return (CreateULogServiceCollectConfResponse)
                this.invoke(request, CreateULogServiceCollectConfResponse.class);
    }

    /**
     * CreateULogServiceLogSet - 创建日志集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceLogSetResponse createULogServiceLogSet(
            CreateULogServiceLogSetRequest request) throws UCloudException {
        request.setAction("CreateULogServiceLogSet");
        return (CreateULogServiceLogSetResponse)
                this.invoke(request, CreateULogServiceLogSetResponse.class);
    }

    /**
     * CreateULogServiceMachineGroup - 创建机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceMachineGroupResponse createULogServiceMachineGroup(
            CreateULogServiceMachineGroupRequest request) throws UCloudException {
        request.setAction("CreateULogServiceMachineGroup");
        return (CreateULogServiceMachineGroupResponse)
                this.invoke(request, CreateULogServiceMachineGroupResponse.class);
    }

    /**
     * CreateULogServiceTopic - 创建ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceTopicResponse createULogServiceTopic(
            CreateULogServiceTopicRequest request) throws UCloudException {
        request.setAction("CreateULogServiceTopic");
        return (CreateULogServiceTopicResponse)
                this.invoke(request, CreateULogServiceTopicResponse.class);
    }

    /**
     * DeleteULogServiceCollectConf - 删除日志主题采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceCollectConfResponse deleteULogServiceCollectConf(
            DeleteULogServiceCollectConfRequest request) throws UCloudException {
        request.setAction("DeleteULogServiceCollectConf");
        return (DeleteULogServiceCollectConfResponse)
                this.invoke(request, DeleteULogServiceCollectConfResponse.class);
    }

    /**
     * DeleteULogServiceLogSet - 删除日志集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceLogSetResponse deleteULogServiceLogSet(
            DeleteULogServiceLogSetRequest request) throws UCloudException {
        request.setAction("DeleteULogServiceLogSet");
        return (DeleteULogServiceLogSetResponse)
                this.invoke(request, DeleteULogServiceLogSetResponse.class);
    }

    /**
     * DeleteULogServiceMachineGroup - 删除机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceMachineGroupResponse deleteULogServiceMachineGroup(
            DeleteULogServiceMachineGroupRequest request) throws UCloudException {
        request.setAction("DeleteULogServiceMachineGroup");
        return (DeleteULogServiceMachineGroupResponse)
                this.invoke(request, DeleteULogServiceMachineGroupResponse.class);
    }

    /**
     * DeleteULogServiceTopic - 删除ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceTopicResponse deleteULogServiceTopic(
            DeleteULogServiceTopicRequest request) throws UCloudException {
        request.setAction("DeleteULogServiceTopic");
        return (DeleteULogServiceTopicResponse)
                this.invoke(request, DeleteULogServiceTopicResponse.class);
    }

    /**
     * DescribeULogServiceMachineGroup - 查询日志采集机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULogServiceMachineGroupResponse describeULogServiceMachineGroup(
            DescribeULogServiceMachineGroupRequest request) throws UCloudException {
        request.setAction("DescribeULogServiceMachineGroup");
        return (DescribeULogServiceMachineGroupResponse)
                this.invoke(request, DescribeULogServiceMachineGroupResponse.class);
    }

    /**
     * GetULogServiceTopicField - 获取ULogService主题索引字段
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULogServiceTopicFieldResponse getULogServiceTopicField(
            GetULogServiceTopicFieldRequest request) throws UCloudException {
        request.setAction("GetULogServiceTopicField");
        return (GetULogServiceTopicFieldResponse)
                this.invoke(request, GetULogServiceTopicFieldResponse.class);
    }

    /**
     * ListULogServiceCollectConf - 查询日志主题采集配置列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceCollectConfResponse listULogServiceCollectConf(
            ListULogServiceCollectConfRequest request) throws UCloudException {
        request.setAction("ListULogServiceCollectConf");
        return (ListULogServiceCollectConfResponse)
                this.invoke(request, ListULogServiceCollectConfResponse.class);
    }

    /**
     * ListULogServiceLogSet - 查询日志集列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceLogSetResponse listULogServiceLogSet(ListULogServiceLogSetRequest request)
            throws UCloudException {
        request.setAction("ListULogServiceLogSet");
        return (ListULogServiceLogSetResponse)
                this.invoke(request, ListULogServiceLogSetResponse.class);
    }

    /**
     * ListULogServiceMachineGroup - 查看机器组列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceMachineGroupResponse listULogServiceMachineGroup(
            ListULogServiceMachineGroupRequest request) throws UCloudException {
        request.setAction("ListULogServiceMachineGroup");
        return (ListULogServiceMachineGroupResponse)
                this.invoke(request, ListULogServiceMachineGroupResponse.class);
    }

    /**
     * ListULogServiceTopic - 获取ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceTopicResponse listULogServiceTopic(ListULogServiceTopicRequest request)
            throws UCloudException {
        request.setAction("ListULogServiceTopic");
        return (ListULogServiceTopicResponse)
                this.invoke(request, ListULogServiceTopicResponse.class);
    }

    /**
     * QueryULogServiceLog - 查询ULogService日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryULogServiceLogResponse queryULogServiceLog(QueryULogServiceLogRequest request)
            throws UCloudException {
        request.setAction("QueryULogServiceLog");
        return (QueryULogServiceLogResponse)
                this.invoke(request, QueryULogServiceLogResponse.class);
    }

    /**
     * UpdateULogServiceCollectConf - 修改日志主题采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceCollectConfResponse updateULogServiceCollectConf(
            UpdateULogServiceCollectConfRequest request) throws UCloudException {
        request.setAction("UpdateULogServiceCollectConf");
        return (UpdateULogServiceCollectConfResponse)
                this.invoke(request, UpdateULogServiceCollectConfResponse.class);
    }

    /**
     * UpdateULogServiceMachineGroup - 更新日志机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceMachineGroupResponse updateULogServiceMachineGroup(
            UpdateULogServiceMachineGroupRequest request) throws UCloudException {
        request.setAction("UpdateULogServiceMachineGroup");
        return (UpdateULogServiceMachineGroupResponse)
                this.invoke(request, UpdateULogServiceMachineGroupResponse.class);
    }

    /**
     * UpdateULogServiceTopicField - 更新ULogService主题索引字段
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceTopicFieldResponse updateULogServiceTopicField(
            UpdateULogServiceTopicFieldRequest request) throws UCloudException {
        request.setAction("UpdateULogServiceTopicField");
        return (UpdateULogServiceTopicFieldResponse)
                this.invoke(request, UpdateULogServiceTopicFieldResponse.class);
    }
}
