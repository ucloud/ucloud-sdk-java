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
package cn.ucloud.uwsc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCPEResponse extends Response {

    /** cpe 详情 */
    @SerializedName("CPEInfos")
    private List<CPEInfo> cpeInfos;

    public List<CPEInfo> getCPEInfos() {
        return cpeInfos;
    }

    public void setCPEInfos(List<CPEInfo> cpeInfos) {
        this.cpeInfos = cpeInfos;
    }

    public static class CPEInfo extends Response {

        /** 资源ID */
        @SerializedName("CPEId")
        private String cpeId;

        /** 资源名称 */
        @SerializedName("CPEName")
        private String cpeName;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 设备型号 */
        @SerializedName("DeviceTypeName")
        private String deviceTypeName;

        /** 供应商 */
        @SerializedName("Vendor")
        private String vendor;

        /** 绑定的UWAN资源ID */
        @SerializedName("PopGwId")
        private List<String> popGwId;

        /** 设备SN */
        @SerializedName("Sn")
        private String sn;

        /** 状态 */
        @SerializedName("Status")
        private Integer status;

        /** 配置更新时间 */
        @SerializedName("ConfUpdateTime")
        private Integer confUpdateTime;

        /** 端口 */
        @SerializedName("Ports")
        private List<String> ports;

        /** 链路数量 */
        @SerializedName("LinkNum")
        private Integer linkNum;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 是否与线路绑定 */
        @SerializedName("LineStatus")
        private String lineStatus;

        /** 绑定的UReach线路资源ID */
        @SerializedName("ResourceIds")
        private List<String> resourceIds;

        /** 有效使用时间(天) */
        @SerializedName("UseTime")
        private Integer useTime;

        public String getCPEId() {
            return cpeId;
        }

        public void setCPEId(String cpeId) {
            this.cpeId = cpeId;
        }

        public String getCPEName() {
            return cpeName;
        }

        public void setCPEName(String cpeName) {
            this.cpeName = cpeName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getDeviceTypeName() {
            return deviceTypeName;
        }

        public void setDeviceTypeName(String deviceTypeName) {
            this.deviceTypeName = deviceTypeName;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public List<String> getPopGwId() {
            return popGwId;
        }

        public void setPopGwId(List<String> popGwId) {
            this.popGwId = popGwId;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getConfUpdateTime() {
            return confUpdateTime;
        }

        public void setConfUpdateTime(Integer confUpdateTime) {
            this.confUpdateTime = confUpdateTime;
        }

        public List<String> getPorts() {
            return ports;
        }

        public void setPorts(List<String> ports) {
            this.ports = ports;
        }

        public Integer getLinkNum() {
            return linkNum;
        }

        public void setLinkNum(Integer linkNum) {
            this.linkNum = linkNum;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getLineStatus() {
            return lineStatus;
        }

        public void setLineStatus(String lineStatus) {
            this.lineStatus = lineStatus;
        }

        public List<String> getResourceIds() {
            return resourceIds;
        }

        public void setResourceIds(List<String> resourceIds) {
            this.resourceIds = resourceIds;
        }

        public Integer getUseTime() {
            return useTime;
        }

        public void setUseTime(Integer useTime) {
            this.useTime = useTime;
        }
    }
}
