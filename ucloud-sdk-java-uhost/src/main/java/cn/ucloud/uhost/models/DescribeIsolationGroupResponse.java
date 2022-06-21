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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeIsolationGroupResponse extends Response {

    /** 硬件隔离组集合。参见数据结构IsolationGroup。 */
    @SerializedName("IsolationGroupSet")
    private List<IsolationGroup> isolationGroupSet;

    /** 硬件隔离组总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<IsolationGroup> getIsolationGroupSet() {
        return isolationGroupSet;
    }

    public void setIsolationGroupSet(List<IsolationGroup> isolationGroupSet) {
        this.isolationGroupSet = isolationGroupSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class SpreadInfo extends Response {

        /** 可用区信息 */
        @SerializedName("Zone")
        private String zone;

        /** 当前地域所有可用区中硬件隔离组中云主机的数量，不超过7。 */
        @SerializedName("UHostCount")
        private Integer uHostCount;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public Integer getUHostCount() {
            return uHostCount;
        }

        public void setUHostCount(Integer uHostCount) {
            this.uHostCount = uHostCount;
        }
    }

    public static class IsolationGroup extends Response {

        /** 硬件隔离组名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 硬件隔离组id */
        @SerializedName("GroupId")
        private String groupId;

        /** 每个可用区中的机器数量。参见数据结构SpreadInfo。 */
        @SerializedName("SpreadInfoSet")
        private List<SpreadInfo> spreadInfoSet;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public List<SpreadInfo> getSpreadInfoSet() {
            return spreadInfoSet;
        }

        public void setSpreadInfoSet(List<SpreadInfo> spreadInfoSet) {
            this.spreadInfoSet = spreadInfoSet;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
