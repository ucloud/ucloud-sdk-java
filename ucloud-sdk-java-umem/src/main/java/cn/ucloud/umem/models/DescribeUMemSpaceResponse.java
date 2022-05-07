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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUMemSpaceResponse extends Response {

    /** JSON 格式的UMem内存空间实例列表, 详细参见 UMemSpaceSet */
    @SerializedName("DataSet")
    private List<UMemSpaceSet> dataSet;

    /** 根据过滤条件得到的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UMemSpaceSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemSpaceSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UMemSpaceSet extends Response {

        /** 可用区，参见[可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** */
        @SerializedName("Tag")
        private String tag;

        /** 运维时间 0 //0点 1 //1点 依次类推 */
        @SerializedName("RewriteTime")
        private Integer rewriteTime;

        /** 内存空间ID */
        @SerializedName("SpaceId")
        private String spaceId;

        /** */
        @SerializedName("SubnetId")
        private String subnetId;

        /** */
        @SerializedName("VPCId")
        private String vpcId;

        /** 内存空间名称 */
        @SerializedName("Name")
        private String name;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 空间类型:single(无热备),double(热备) */
        @SerializedName("Type")
        private String type;

        /** 协议类型: memcache, redis */
        @SerializedName("Protocol")
        private String protocol;

        /** 容量单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 使用量单位MB */
        @SerializedName("UsedSize")
        private Integer usedSize;

        /** Starting:创建中 Running:运行中 Fail:失败 */
        @SerializedName("State")
        private String state;

        /** Year, Month, Dynamic, Trial */
        @SerializedName("ChargeType")
        private String chargeType;

        /** IP端口信息请参见 UMemSpaceAddressSet */
        @SerializedName("Address")
        private List<UMemSpaceAddressSet> address;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getRewriteTime() {
            return rewriteTime;
        }

        public void setRewriteTime(Integer rewriteTime) {
            this.rewriteTime = rewriteTime;
        }

        public String getSpaceId() {
            return spaceId;
        }

        public void setSpaceId(String spaceId) {
            this.spaceId = spaceId;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getUsedSize() {
            return usedSize;
        }

        public void setUsedSize(Integer usedSize) {
            this.usedSize = usedSize;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public List<UMemSpaceAddressSet> getAddress() {
            return address;
        }

        public void setAddress(List<UMemSpaceAddressSet> address) {
            this.address = address;
        }
    }

    public static class UMemSpaceAddressSet extends Response {

        /** UMem实例访问IP */
        @SerializedName("IP")
        private String ip;

        /** UMem实例访问Port */
        @SerializedName("Port")
        private Integer port;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}
