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
package cn.ucloud.cloudwatch.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class QueryMetricDataSetRequest extends Request {

    /** 地域。 全局产品可不传，其他类型必传。 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。 */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源类型 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    /** 开始时间 */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 截止时间 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 计算方式，枚举值如下： raw:原始值, max:最大值, min:最小值, avg:平均值, sum:求和 */
    @NotEmpty
    @UCloudParam("CalcMethod")
    private String calcMethod;

    /**
     * 周期即：数据查询时，后端上报数据点的频率，选择不同的自定义时间范围，对应的周期不同： 0<时间范围<=1h——周期：1分钟/5分钟 1h<时间范围<=3h——周期：1分钟/5分钟/1小时
     * 3h<时间范围<=24h——周期：5分钟/1小时 1天<时间范围<=30天——周期：1小时/6小时/24小时 需将周期转化为单位为秒的数值，传入参数
     */
    @NotEmpty
    @UCloudParam("Period")
    private Integer period;

    /** */
    @UCloudParam("MetricInfos")
    private List<MetricInfos> metricInfos;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getCalcMethod() {
        return calcMethod;
    }

    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public List<MetricInfos> getMetricInfos() {
        return metricInfos;
    }

    public void setMetricInfos(List<MetricInfos> metricInfos) {
        this.metricInfos = metricInfos;
    }

    public static class MetricInfos extends Request {

        /** 指标名 */
        @NotEmpty
        @UCloudParam("Metric")
        private String metric;

        /** 指标所属资源id */
        @NotEmpty
        @UCloudParam("ResourceId")
        private String resourceId;

        /** */
        @UCloudParam("TagList")
        private List<MetricInfosTagList> tagList;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public List<MetricInfosTagList> getTagList() {
            return tagList;
        }

        public void setTagList(List<MetricInfosTagList> tagList) {
            this.tagList = tagList;
        }
    }

    public static class MetricInfosTagList extends Request {

        /** 要查询指标的Tag的key */
        @UCloudParam("TagKey")
        private String tagKey;

        /** 要查询指标的Tag的Value */
        @UCloudParam("TagValues")
        private List<String> tagValues;

        public String getTagKey() {
            return tagKey;
        }

        public void setTagKey(String tagKey) {
            this.tagKey = tagKey;
        }

        public List<String> getTagValues() {
            return tagValues;
        }

        public void setTagValues(List<String> tagValues) {
            this.tagValues = tagValues;
        }
    }
}
