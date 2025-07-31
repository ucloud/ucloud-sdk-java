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

public class ListAlertRecordRequest extends Request {

    /** 项目ID。 */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 开始时间，查询告警记录开始时间(不支持查询距当前时间一年前的数据) */
    @NotEmpty
    @UCloudParam("StartAt")
    private Integer startAt;

    /** 结束时间，查询告警记录结束时间(查询开始时间和结束时间不能超过一个月) */
    @NotEmpty
    @UCloudParam("EndAt")
    private Integer endAt;

    /** 模糊查询(支持资源id模糊搜索) */
    @UCloudParam("Fuzzy")
    private String fuzzy;

    /** */
    @UCloudParam("Filter")
    private Filter filter;

    /** 排序(默认根据告警发生时间倒序) */
    @UCloudParam("OrderType")
    private String orderType;

    /** 查询返回数量，默认值300，最大值：300。 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 数据偏移量 (默认0) */
    @UCloudParam("Offset")
    private Integer offset;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getEndAt() {
        return endAt;
    }

    public void setEndAt(Integer endAt) {
        this.endAt = endAt;
    }

    public String getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public static class Filter extends Request {

        /** 产品类型，根据产品类型精确搜索对应的告警记录 */
        @UCloudParam("ProductTypes")
        private List<Integer> productTypes;

        /** 告警级别，根据告警级别精确搜索对应的告警记录 */
        @UCloudParam("Levels")
        private List<String> levels;

        /** 告警状态，根据告警状态精确搜索对应的告警记录 */
        @UCloudParam("Status")
        private List<String> status;

        public List<Integer> getProductTypes() {
            return productTypes;
        }

        public void setProductTypes(List<Integer> productTypes) {
            this.productTypes = productTypes;
        }

        public List<String> getLevels() {
            return levels;
        }

        public void setLevels(List<String> levels) {
            this.levels = levels;
        }

        public List<String> getStatus() {
            return status;
        }

        public void setStatus(List<String> status) {
            this.status = status;
        }
    }
}
