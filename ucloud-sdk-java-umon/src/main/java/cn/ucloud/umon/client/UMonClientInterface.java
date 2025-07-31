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
package cn.ucloud.umon.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.umon.models.BindAlarmTemplateRequest;
import cn.ucloud.umon.models.BindAlarmTemplateResponse;
import cn.ucloud.umon.models.DescribeResourceMetricRequest;
import cn.ucloud.umon.models.DescribeResourceMetricResponse;
import cn.ucloud.umon.models.GetAlarmRecordListRequest;
import cn.ucloud.umon.models.GetAlarmRecordListResponse;
import cn.ucloud.umon.models.GetAlarmTemplateListRequest;
import cn.ucloud.umon.models.GetAlarmTemplateListResponse;
import cn.ucloud.umon.models.GetMetricOverviewRequest;
import cn.ucloud.umon.models.GetMetricOverviewResponse;
import cn.ucloud.umon.models.GetMetricRequest;
import cn.ucloud.umon.models.GetMetricResponse;
import cn.ucloud.umon.models.GetResourceAlarmTemplateRequest;
import cn.ucloud.umon.models.GetResourceAlarmTemplateResponse;
import cn.ucloud.umon.models.UnbindAlarmTemplateRequest;
import cn.ucloud.umon.models.UnbindAlarmTemplateResponse;

/** This client is used to call actions of **UMon** service */
public interface UMonClientInterface extends Client {

    /**
     * BindAlarmTemplate - 绑定告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindAlarmTemplateResponse bindAlarmTemplate(BindAlarmTemplateRequest request)
            throws UCloudException;

    /**
     * DescribeResourceMetric - 获取资源支持监控指标信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeResourceMetricResponse describeResourceMetric(
            DescribeResourceMetricRequest request) throws UCloudException;

    /**
     * GetAlarmRecordList - 获取告警记录列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetAlarmRecordListResponse getAlarmRecordList(GetAlarmRecordListRequest request)
            throws UCloudException;

    /**
     * GetAlarmTemplateList - 获取告警模板列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetAlarmTemplateListResponse getAlarmTemplateList(GetAlarmTemplateListRequest request)
            throws UCloudException;

    /**
     * GetMetric - 获取监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetMetricResponse getMetric(GetMetricRequest request) throws UCloudException;

    /**
     * GetMetricOverview - 获取监控概况数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetMetricOverviewResponse getMetricOverview(GetMetricOverviewRequest request)
            throws UCloudException;

    /**
     * GetResourceAlarmTemplate - 获取资源绑定的告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetResourceAlarmTemplateResponse getResourceAlarmTemplate(
            GetResourceAlarmTemplateRequest request) throws UCloudException;

    /**
     * UnbindAlarmTemplate - 解绑告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindAlarmTemplateResponse unbindAlarmTemplate(UnbindAlarmTemplateRequest request)
            throws UCloudException;
}
