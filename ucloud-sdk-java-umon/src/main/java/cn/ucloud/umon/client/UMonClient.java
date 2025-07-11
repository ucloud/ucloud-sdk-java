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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
public class UMonClient extends DefaultClient implements UMonClientInterface {
    public UMonClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BindAlarmTemplate - 绑定告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindAlarmTemplateResponse bindAlarmTemplate(BindAlarmTemplateRequest request)
            throws UCloudException {
        request.setAction("BindAlarmTemplate");
        return (BindAlarmTemplateResponse) this.invoke(request, BindAlarmTemplateResponse.class);
    }

    /**
     * DescribeResourceMetric - 获取资源支持监控指标信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeResourceMetricResponse describeResourceMetric(
            DescribeResourceMetricRequest request) throws UCloudException {
        request.setAction("DescribeResourceMetric");
        return (DescribeResourceMetricResponse)
                this.invoke(request, DescribeResourceMetricResponse.class);
    }

    /**
     * GetAlarmRecordList - 获取告警记录列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetAlarmRecordListResponse getAlarmRecordList(GetAlarmRecordListRequest request)
            throws UCloudException {
        request.setAction("GetAlarmRecordList");
        return (GetAlarmRecordListResponse) this.invoke(request, GetAlarmRecordListResponse.class);
    }

    /**
     * GetAlarmTemplateList - 获取告警模板列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetAlarmTemplateListResponse getAlarmTemplateList(GetAlarmTemplateListRequest request)
            throws UCloudException {
        request.setAction("GetAlarmTemplateList");
        return (GetAlarmTemplateListResponse)
                this.invoke(request, GetAlarmTemplateListResponse.class);
    }

    /**
     * GetMetric - 获取监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetMetricResponse getMetric(GetMetricRequest request) throws UCloudException {
        request.setAction("GetMetric");
        return (GetMetricResponse) this.invoke(request, GetMetricResponse.class);
    }

    /**
     * GetMetricOverview - 获取监控概况数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetMetricOverviewResponse getMetricOverview(GetMetricOverviewRequest request)
            throws UCloudException {
        request.setAction("GetMetricOverview");
        return (GetMetricOverviewResponse) this.invoke(request, GetMetricOverviewResponse.class);
    }

    /**
     * GetResourceAlarmTemplate - 获取资源绑定的告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetResourceAlarmTemplateResponse getResourceAlarmTemplate(
            GetResourceAlarmTemplateRequest request) throws UCloudException {
        request.setAction("GetResourceAlarmTemplate");
        return (GetResourceAlarmTemplateResponse)
                this.invoke(request, GetResourceAlarmTemplateResponse.class);
    }

    /**
     * UnbindAlarmTemplate - 解绑告警模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindAlarmTemplateResponse unbindAlarmTemplate(UnbindAlarmTemplateRequest request)
            throws UCloudException {
        request.setAction("UnbindAlarmTemplate");
        return (UnbindAlarmTemplateResponse)
                this.invoke(request, UnbindAlarmTemplateResponse.class);
    }
}
