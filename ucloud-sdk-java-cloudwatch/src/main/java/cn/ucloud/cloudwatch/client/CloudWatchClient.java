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
import cn.ucloud.cloudwatch.models.CreateAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.CreateAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.CreateAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.CreateAlertStrategyTemplateResponse;
import cn.ucloud.cloudwatch.models.DeleteAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.DeleteAlertStrategyTemplateResponse;
import cn.ucloud.cloudwatch.models.EnableAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.EnableAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.GetProductMetricsRequest;
import cn.ucloud.cloudwatch.models.GetProductMetricsResponse;
import cn.ucloud.cloudwatch.models.ListAlertRecordRequest;
import cn.ucloud.cloudwatch.models.ListAlertRecordResponse;
import cn.ucloud.cloudwatch.models.ListAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.ListAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.ListAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.ListAlertStrategyTemplateResponse;
import cn.ucloud.cloudwatch.models.ListMonitorProductRequest;
import cn.ucloud.cloudwatch.models.ListMonitorProductResponse;
import cn.ucloud.cloudwatch.models.ModifyAlertStrategyRemarkRequest;
import cn.ucloud.cloudwatch.models.ModifyAlertStrategyRemarkResponse;
import cn.ucloud.cloudwatch.models.QueryMetricDataSetRequest;
import cn.ucloud.cloudwatch.models.QueryMetricDataSetResponse;
import cn.ucloud.cloudwatch.models.QueryMetricDataSummaryRequest;
import cn.ucloud.cloudwatch.models.QueryMetricDataSummaryResponse;
import cn.ucloud.cloudwatch.models.UnBindAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.UnBindAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.UpdateAlertStrategyRequest;
import cn.ucloud.cloudwatch.models.UpdateAlertStrategyResponse;
import cn.ucloud.cloudwatch.models.UpdateAlertStrategyTemplateRequest;
import cn.ucloud.cloudwatch.models.UpdateAlertStrategyTemplateResponse;
import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;

/** This client is used to call actions of **CloudWatch** service */
public class CloudWatchClient extends DefaultClient implements CloudWatchClientInterface {
    public CloudWatchClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BindAlertStrategy - 绑定告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindAlertStrategyResponse bindAlertStrategy(BindAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("BindAlertStrategy");
        return (BindAlertStrategyResponse) this.invoke(request, BindAlertStrategyResponse.class);
    }

    /**
     * CreateAlertStrategy - 创建告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateAlertStrategyResponse createAlertStrategy(CreateAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("CreateAlertStrategy");
        return (CreateAlertStrategyResponse)
                this.invoke(request, CreateAlertStrategyResponse.class);
    }

    /**
     * CreateAlertStrategyTemplate - 新建条件模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateAlertStrategyTemplateResponse createAlertStrategyTemplate(
            CreateAlertStrategyTemplateRequest request) throws UCloudException {
        request.setAction("CreateAlertStrategyTemplate");
        return (CreateAlertStrategyTemplateResponse)
                this.invoke(request, CreateAlertStrategyTemplateResponse.class);
    }

    /**
     * DeleteAlertStrategyTemplate - 删除告警条件模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAlertStrategyTemplateResponse deleteAlertStrategyTemplate(
            DeleteAlertStrategyTemplateRequest request) throws UCloudException {
        request.setAction("DeleteAlertStrategyTemplate");
        return (DeleteAlertStrategyTemplateResponse)
                this.invoke(request, DeleteAlertStrategyTemplateResponse.class);
    }

    /**
     * EnableAlertStrategy - 是否启用告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public EnableAlertStrategyResponse enableAlertStrategy(EnableAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("EnableAlertStrategy");
        return (EnableAlertStrategyResponse)
                this.invoke(request, EnableAlertStrategyResponse.class);
    }

    /**
     * GetProductMetrics - 获取云产品关联的指标列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetProductMetricsResponse getProductMetrics(GetProductMetricsRequest request)
            throws UCloudException {
        request.setAction("GetProductMetrics");
        return (GetProductMetricsResponse) this.invoke(request, GetProductMetricsResponse.class);
    }

    /**
     * ListAlertRecord - 告警记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAlertRecordResponse listAlertRecord(ListAlertRecordRequest request)
            throws UCloudException {
        request.setAction("ListAlertRecord");
        return (ListAlertRecordResponse) this.invoke(request, ListAlertRecordResponse.class);
    }

    /**
     * ListAlertStrategy - 获取告警策略列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAlertStrategyResponse listAlertStrategy(ListAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("ListAlertStrategy");
        return (ListAlertStrategyResponse) this.invoke(request, ListAlertStrategyResponse.class);
    }

    /**
     * ListAlertStrategyTemplate - 条件模板列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAlertStrategyTemplateResponse listAlertStrategyTemplate(
            ListAlertStrategyTemplateRequest request) throws UCloudException {
        request.setAction("ListAlertStrategyTemplate");
        return (ListAlertStrategyTemplateResponse)
                this.invoke(request, ListAlertStrategyTemplateResponse.class);
    }

    /**
     * ListMonitorProduct - 获取监控对象类型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListMonitorProductResponse listMonitorProduct(ListMonitorProductRequest request)
            throws UCloudException {
        request.setAction("ListMonitorProduct");
        return (ListMonitorProductResponse) this.invoke(request, ListMonitorProductResponse.class);
    }

    /**
     * ModifyAlertStrategyRemark - 修改告警策略备注
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyAlertStrategyRemarkResponse modifyAlertStrategyRemark(
            ModifyAlertStrategyRemarkRequest request) throws UCloudException {
        request.setAction("ModifyAlertStrategyRemark");
        return (ModifyAlertStrategyRemarkResponse)
                this.invoke(request, ModifyAlertStrategyRemarkResponse.class);
    }

    /**
     * QueryMetricDataSet - 查询监控指标数据集
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMetricDataSetResponse queryMetricDataSet(QueryMetricDataSetRequest request)
            throws UCloudException {
        request.setAction("QueryMetricDataSet");
        return (QueryMetricDataSetResponse) this.invoke(request, QueryMetricDataSetResponse.class);
    }

    /**
     * QueryMetricDataSummary - 获取资源看图属性列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMetricDataSummaryResponse queryMetricDataSummary(
            QueryMetricDataSummaryRequest request) throws UCloudException {
        request.setAction("QueryMetricDataSummary");
        return (QueryMetricDataSummaryResponse)
                this.invoke(request, QueryMetricDataSummaryResponse.class);
    }

    /**
     * UnBindAlertStrategy - 解绑告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindAlertStrategyResponse unBindAlertStrategy(UnBindAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("UnBindAlertStrategy");
        return (UnBindAlertStrategyResponse)
                this.invoke(request, UnBindAlertStrategyResponse.class);
    }

    /**
     * UpdateAlertStrategy - 更新告警策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateAlertStrategyResponse updateAlertStrategy(UpdateAlertStrategyRequest request)
            throws UCloudException {
        request.setAction("UpdateAlertStrategy");
        return (UpdateAlertStrategyResponse)
                this.invoke(request, UpdateAlertStrategyResponse.class);
    }

    /**
     * UpdateAlertStrategyTemplate - 编辑条件模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateAlertStrategyTemplateResponse updateAlertStrategyTemplate(
            UpdateAlertStrategyTemplateRequest request) throws UCloudException {
        request.setAction("UpdateAlertStrategyTemplate");
        return (UpdateAlertStrategyTemplateResponse)
                this.invoke(request, UpdateAlertStrategyTemplateResponse.class);
    }
}
