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
package cn.ucloud.cube.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetCubeExtendInfoResponse extends Response {

    /** CubeExtendInfo */
    @SerializedName("ExtendInfo")
    private List<CubeExtendInfo> extendInfo;

    public List<CubeExtendInfo> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(List<CubeExtendInfo> extendInfo) {
        this.extendInfo = extendInfo;
    }

    public static class EIPAddr extends Response {

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        /** 线路名称BGP或者internalation */
        @SerializedName("OperatorName")
        private String operatorName;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }
    }

    public static class CubeExtendInfo extends Response {

        /** Cube的Id */
        @SerializedName("CubeId")
        private String cubeId;

        /** Cube的名称 */
        @SerializedName("Name")
        private String name;

        /** EIPSet */
        @SerializedName("Eip")
        private List<EIPSet> eip;

        /** 资源有效期 */
        @SerializedName("Expiration")
        private Integer expiration;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        public String getCubeId() {
            return cubeId;
        }

        public void setCubeId(String cubeId) {
            this.cubeId = cubeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<EIPSet> getEip() {
            return eip;
        }

        public void setEip(List<EIPSet> eip) {
            this.eip = eip;
        }

        public Integer getExpiration() {
            return expiration;
        }

        public void setExpiration(Integer expiration) {
            this.expiration = expiration;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }

    public static class EIPSet extends Response {

        /** EIP带宽值 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 带宽类型0标准普通带宽，1表示共享带宽 */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** EIP创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** EIP地址 */
        @SerializedName("EIPAddr")
        private List<EIPAddr> eipAddr;

        /** EIPId */
        @SerializedName("EIPId")
        private String eipId;

        /** 付费模式，带宽付费或者流量付费 */
        @SerializedName("PayMode")
        private String payMode;

        /** EIP绑定对象的资源Id */
        @SerializedName("Resource")
        private String resource;

        /** EIP状态，表示使用中或者空闲 */
        @SerializedName("Status")
        private String status;

        /** EIP权重 */
        @SerializedName("Weight")
        private Integer weight;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public Integer getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(Integer bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<EIPAddr> getEIPAddr() {
            return eipAddr;
        }

        public void setEIPAddr(List<EIPAddr> eipAddr) {
            this.eipAddr = eipAddr;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }
}
