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
package cn.ucloud.cloudwatch.client;

import cn.ucloud.cloudwatch.models.BindAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.BindAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.CreateAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.CreateAlertStrategyTemplateResponse;
import cn.ucloud.cloudwatch.models.DeleteAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.DeleteAlertStrategyTemplateResponse;
import cn.ucloud.cloudwatch.models.GetProductMetricsRequest;
import cn.ucloud.cloudwatch.models.GetProductMetricsResponse;
import cn.ucloud.cloudwatch.models.ListAlertRecordRequest;
import cn.ucloud.cloudwatch.models.ListAlertRecordResponse;
import cn.ucloud.cloudwatch.models.ListAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.ListAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.ListMonitorProductRequest;
import cn.ucloud.cloudwatch.models.ListMonitorProductResponse;
import cn.ucloud.cloudwatch.models.QueryMetricDataSetRequest;
import cn.ucloud.cloudwatch.models.QueryMetricDataSetResponse;
import cn.ucloud.cloudwatch.models.QueryMetricDataSummaryRequest;
import cn.ucloud.cloudwatch.models.QueryMetricDataSummaryResponse;
import cn.ucloud.cloudwatch.models.UnBindAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.UnBindAlertStrategyResponse;
import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;

/** This client is used to call actions of **CloudWatch** service */
public interface CloudWatchClientInterface extends Client {

    /**
     * BindAlertStrategy - 绑定告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindAlertStrategyResponse bindAlertStrategy(BindAlertStrategyRequest request)
            throws UCloudException;

    /**
     * CreateAlertStrategyTemplate - 新建条件模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateAlertStrategyTemplateResponse createAlertStrategyTemplate(
            CreateAlertStrategyTemplateRequest request) throws UCloudException;

    /**
     * DeleteAlertStrategyTemplate - 删除告警策略模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAlertStrategyTemplateResponse deleteAlertStrategyTemplate(
            DeleteAlertStrategyTemplateRequest request) throws UCloudException;

    /**
     * GetProductMetrics - 获取云产品关联的指标列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetProductMetricsResponse getProductMetrics(GetProductMetricsRequest request)
            throws UCloudException;

    /**
     * ListAlertRecord - 告警记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAlertRecordResponse listAlertRecord(ListAlertRecordRequest request)
            throws UCloudException;

    /**
     * ListAlertStrategy - 获取告警策略列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAlertStrategyResponse listAlertStrategy(ListAlertStrategyRequest request)
            throws UCloudException;

    /**
     * ListMonitorProduct - 获取监控对象类型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListMonitorProductResponse listMonitorProduct(ListMonitorProductRequest request)
            throws UCloudException;

    /**
     * QueryMetricDataSet - 查询监控指标数据集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMetricDataSetResponse queryMetricDataSet(QueryMetricDataSetRequest request)
            throws UCloudException;

    /**
     * QueryMetricDataSummary - 获取资源看图属性列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMetricDataSummaryResponse queryMetricDataSummary(
            QueryMetricDataSummaryRequest request) throws UCloudException;

    /**
     * UnBindAlertStrategy - 解绑告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindAlertStrategyResponse unBindAlertStrategy(UnBindAlertStrategyRequest request)
            throws UCloudException;
}
