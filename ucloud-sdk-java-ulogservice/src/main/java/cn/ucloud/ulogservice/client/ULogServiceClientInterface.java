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

import cn.ucloud.common.client.Client;
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
public interface ULogServiceClientInterface extends Client {

    /**
     * BindULogServiceGroupToCollectConf - 日志主题采集配置绑定机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindULogServiceGroupToCollectConfResponse bindULogServiceGroupToCollectConf(
            BindULogServiceGroupToCollectConfRequest request) throws UCloudException;

    /**
     * CreateULogServiceCollectConf - 创建采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceCollectConfResponse createULogServiceCollectConf(
            CreateULogServiceCollectConfRequest request) throws UCloudException;

    /**
     * CreateULogServiceLogSet - 创建日志集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceLogSetResponse createULogServiceLogSet(
            CreateULogServiceLogSetRequest request) throws UCloudException;

    /**
     * CreateULogServiceMachineGroup - 创建机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceMachineGroupResponse createULogServiceMachineGroup(
            CreateULogServiceMachineGroupRequest request) throws UCloudException;

    /**
     * CreateULogServiceTopic - 创建ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULogServiceTopicResponse createULogServiceTopic(
            CreateULogServiceTopicRequest request) throws UCloudException;

    /**
     * DeleteULogServiceCollectConf - 删除日志主题采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceCollectConfResponse deleteULogServiceCollectConf(
            DeleteULogServiceCollectConfRequest request) throws UCloudException;

    /**
     * DeleteULogServiceLogSet - 删除日志集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceLogSetResponse deleteULogServiceLogSet(
            DeleteULogServiceLogSetRequest request) throws UCloudException;

    /**
     * DeleteULogServiceMachineGroup - 删除机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceMachineGroupResponse deleteULogServiceMachineGroup(
            DeleteULogServiceMachineGroupRequest request) throws UCloudException;

    /**
     * DeleteULogServiceTopic - 删除ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteULogServiceTopicResponse deleteULogServiceTopic(
            DeleteULogServiceTopicRequest request) throws UCloudException;

    /**
     * DescribeULogServiceMachineGroup - 查询日志采集机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULogServiceMachineGroupResponse describeULogServiceMachineGroup(
            DescribeULogServiceMachineGroupRequest request) throws UCloudException;

    /**
     * GetULogServiceTopicField - 获取ULogService主题索引字段
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULogServiceTopicFieldResponse getULogServiceTopicField(
            GetULogServiceTopicFieldRequest request) throws UCloudException;

    /**
     * ListULogServiceCollectConf - 查询日志主题采集配置列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceCollectConfResponse listULogServiceCollectConf(
            ListULogServiceCollectConfRequest request) throws UCloudException;

    /**
     * ListULogServiceLogSet - 查询日志集列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceLogSetResponse listULogServiceLogSet(ListULogServiceLogSetRequest request)
            throws UCloudException;

    /**
     * ListULogServiceMachineGroup - 查看机器组列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceMachineGroupResponse listULogServiceMachineGroup(
            ListULogServiceMachineGroupRequest request) throws UCloudException;

    /**
     * ListULogServiceTopic - 获取ULogService主题
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListULogServiceTopicResponse listULogServiceTopic(ListULogServiceTopicRequest request)
            throws UCloudException;

    /**
     * QueryULogServiceLog - 查询ULogService日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryULogServiceLogResponse queryULogServiceLog(QueryULogServiceLogRequest request)
            throws UCloudException;

    /**
     * UpdateULogServiceCollectConf - 修改日志主题采集配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceCollectConfResponse updateULogServiceCollectConf(
            UpdateULogServiceCollectConfRequest request) throws UCloudException;

    /**
     * UpdateULogServiceMachineGroup - 更新日志机器组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceMachineGroupResponse updateULogServiceMachineGroup(
            UpdateULogServiceMachineGroupRequest request) throws UCloudException;

    /**
     * UpdateULogServiceTopicField - 更新ULogService主题索引字段
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateULogServiceTopicFieldResponse updateULogServiceTopicField(
            UpdateULogServiceTopicFieldRequest request) throws UCloudException;
}
