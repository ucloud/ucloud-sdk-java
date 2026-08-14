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

public class ListAlertStrategyRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 模糊查询(支持告警策略名称模糊搜索) */
    @UCloudParam("Fuzzy")
    private String fuzzy;

    /** */
    @UCloudParam("Filter")
    private Filter filter;

    /** 资源id集合,根据资源id返回绑定的告警策略列表 */
    @UCloudParam("Resources")
    private List<String> resources;

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

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
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

        /** 产品ID，参见 [产品概览](https://docs.ucloud.cn/cloudwatch/metric/intro) */
        @UCloudParam("ProductTypes")
        private List<Integer> productTypes;

        /** 告警策略id，根据策略id获取告警策略列表 */
        @UCloudParam("AlertStrategyIDs")
        private List<Integer> alertStrategyIDs;

        /** 告警策略状态，根据告警策略状态精确搜索对应的告警策略，枚举值：0-停用，1-启用 */
        @UCloudParam("Status")
        private List<Integer> status;

        public List<Integer> getProductTypes() {
            return productTypes;
        }

        public void setProductTypes(List<Integer> productTypes) {
            this.productTypes = productTypes;
        }

        public List<Integer> getAlertStrategyIDs() {
            return alertStrategyIDs;
        }

        public void setAlertStrategyIDs(List<Integer> alertStrategyIDs) {
            this.alertStrategyIDs = alertStrategyIDs;
        }

        public List<Integer> getStatus() {
            return status;
        }

        public void setStatus(List<Integer> status) {
            this.status = status;
        }
    }
}
