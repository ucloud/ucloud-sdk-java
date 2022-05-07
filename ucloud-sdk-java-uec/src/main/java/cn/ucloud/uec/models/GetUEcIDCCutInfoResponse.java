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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUEcIDCCutInfoResponse extends Response {

    /** 机房割接信息 */
    @SerializedName("IDCCutInfo")
    private List<IDCCutInfo> idcCutInfo;

    /** 满足条件的机房总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<IDCCutInfo> getIDCCutInfo() {
        return idcCutInfo;
    }

    public void setIDCCutInfo(List<IDCCutInfo> idcCutInfo) {
        this.idcCutInfo = idcCutInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class IDCCutInfo extends Response {

        /** 机房名称 */
        @SerializedName("IDCName")
        private String idcName;

        /** 省份 */
        @SerializedName("Province")
        private String province;

        /** 城市 */
        @SerializedName("City")
        private String city;

        /** 割接开始时间 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 割接结束时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 割接类型（中断、抖动、断电） */
        @SerializedName("CutType")
        private String cutType;

        /** 受影响的资源信息列表 */
        @SerializedName("ResourceSet")
        private List<ResourceSet> resourceSet;

        public String getIDCName() {
            return idcName;
        }

        public void setIDCName(String idcName) {
            this.idcName = idcName;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
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

        public String getCutType() {
            return cutType;
        }

        public void setCutType(String cutType) {
            this.cutType = cutType;
        }

        public List<ResourceSet> getResourceSet() {
            return resourceSet;
        }

        public void setResourceSet(List<ResourceSet> resourceSet) {
            this.resourceSet = resourceSet;
        }
    }

    public static class ResourceSet extends Response {

        /** 节点id */
        @SerializedName("NodeId")
        private String nodeId;

        /** 机器外网ip集合 */
        @SerializedName("OuterIps")
        private List<String> outerIps;

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public List<String> getOuterIps() {
            return outerIps;
        }

        public void setOuterIps(List<String> outerIps) {
            this.outerIps = outerIps;
        }
    }
}
