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
package cn.ucloud.ipsecvpn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeRemoteVPNGatewayResponse extends Response {

    /** 符合条件的客户VPN网关总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 客户VPN网关列表, 每项参数详见 RemoteVPNGatewayDataSet: false */
    @SerializedName("DataSet")
    private List<RemoteVPNGatewayDataSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RemoteVPNGatewayDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<RemoteVPNGatewayDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class RemoteVPNGatewayDataSet extends Response {

        /** 客户网关ID: false */
        @SerializedName("RemoteVPNGatewayId")
        private String remoteVPNGatewayId;

        /** 客户网关名称: false */
        @SerializedName("RemoteVPNGatewayName")
        private String remoteVPNGatewayName;

        /** 客户网关IP地址: false */
        @SerializedName("RemoteVPNGatewayAddr")
        private String remoteVPNGatewayAddr;

        /** 用户组: false */
        @SerializedName("Tag")
        private String tag;

        /** 备注: false */
        @SerializedName("Remark")
        private String remark;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 活跃的隧道数量: false */
        @SerializedName("TunnelCount")
        private Integer tunnelCount;

        public String getRemoteVPNGatewayId() {
            return remoteVPNGatewayId;
        }

        public void setRemoteVPNGatewayId(String remoteVPNGatewayId) {
            this.remoteVPNGatewayId = remoteVPNGatewayId;
        }

        public String getRemoteVPNGatewayName() {
            return remoteVPNGatewayName;
        }

        public void setRemoteVPNGatewayName(String remoteVPNGatewayName) {
            this.remoteVPNGatewayName = remoteVPNGatewayName;
        }

        public String getRemoteVPNGatewayAddr() {
            return remoteVPNGatewayAddr;
        }

        public void setRemoteVPNGatewayAddr(String remoteVPNGatewayAddr) {
            this.remoteVPNGatewayAddr = remoteVPNGatewayAddr;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getTunnelCount() {
            return tunnelCount;
        }

        public void setTunnelCount(Integer tunnelCount) {
            this.tunnelCount = tunnelCount;
        }
    }
}
