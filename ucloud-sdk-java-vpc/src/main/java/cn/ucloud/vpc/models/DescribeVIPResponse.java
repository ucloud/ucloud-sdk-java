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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeVIPResponse extends Response {

    /** 内网VIP详情，请见VIPDetailSet */
    @SerializedName("VIPSet")
    private List<VIPDetailSet> vipSet;

    /** 内网VIP地址列表 */
    @SerializedName("DataSet")
    private List<String> dataSet;

    /** vip数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<VIPDetailSet> getVIPSet() {
        return vipSet;
    }

    public void setVIPSet(List<VIPDetailSet> vipSet) {
        this.vipSet = vipSet;
    }

    public List<String> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<String> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class VIPDetailSet extends Response {

        /** 地域 */
        @SerializedName("Zone")
        private String zone;

        /** 虚拟ip id */
        @SerializedName("VIPId")
        private String vipId;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 真实主机ip */
        @SerializedName("RealIp")
        private String realIp;

        /** 虚拟ip */
        @SerializedName("VIP")
        private String vip;

        /** 子网id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** VPC id */
        @SerializedName("VPCId")
        private String vpcId;

        /** VIP名称 */
        @SerializedName("Name")
        private String name;

        /** VIP备注 */
        @SerializedName("Remark")
        private String remark;

        /** VIP所属业务组 */
        @SerializedName("Tag")
        private String tag;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getVIPId() {
            return vipId;
        }

        public void setVIPId(String vipId) {
            this.vipId = vipId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getRealIp() {
            return realIp;
        }

        public void setRealIp(String realIp) {
            this.realIp = realIp;
        }

        public String getVIP() {
            return vip;
        }

        public void setVIP(String vip) {
            this.vip = vip;
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

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
