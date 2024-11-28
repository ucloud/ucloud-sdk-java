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

public class QueryMetricDataSummaryRequest extends Request {

    /** 地域，全局产品可以不传，其他必传 */
    @UCloudParam("Region")
    private String region;

    /** 项目ID。 */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 产品类型 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    /** 跳过的数量 */
    @NotEmpty
    @UCloudParam("Offset")
    private Integer offset;

    /** 当前页数据尺寸 */
    @NotEmpty
    @UCloudParam("Limit")
    private Integer limit;

    /** 指定要查询的指标列表，不指定则使用默认的指标集合 */
    @UCloudParam("Metrics")
    private List<String> metrics;

    /** 指定要查询的资源ID列表 */
    @UCloudParam("ResourceIds")
    private List<String> resourceIds;

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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }
}
