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
package cn.ucloud.umon.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMetricOverviewResponse extends Response {

    /** JSON格式监控数据列表 */
    @SerializedName("DataSet")
    private List<ResourceItemSet> dataSet;

    /** 系统更新时间，格式为Unix Timestamp */
    @SerializedName("RefreshTime")
    private Integer refreshTime;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceType;

    /** 返回总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ResourceItemSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ResourceItemSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Integer refreshTime) {
        this.refreshTime = refreshTime;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ResourceItemSet extends Response {

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("Name")
        private String name;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
