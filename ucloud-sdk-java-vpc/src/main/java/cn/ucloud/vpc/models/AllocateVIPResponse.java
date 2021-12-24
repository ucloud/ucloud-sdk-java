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

public class AllocateVIPResponse extends Response {

    /** 申请到的VIP资源相关信息: false */
    @SerializedName("VIPSet")
    private List<VIPSet> vipSet;

    /** 申请到的VIP地址: false */
    @SerializedName("DataSet")
    private List<String> dataSet;

    public List<VIPSet> getVIPSet() {
        return vipSet;
    }

    public void setVIPSet(List<VIPSet> vipSet) {
        this.vipSet = vipSet;
    }

    public List<String> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<String> dataSet) {
        this.dataSet = dataSet;
    }

    public static class VIPSet extends Response {

        /** 虚拟ip: false */
        @SerializedName("VIP")
        private String vip;

        /** 虚拟ip id: false */
        @SerializedName("VIPId")
        private String vipId;

        /** VPC id: false */
        @SerializedName("VPCId")
        private String vpcId;

        public String getVIP() {
            return vip;
        }

        public void setVIP(String vip) {
            this.vip = vip;
        }

        public String getVIPId() {
            return vipId;
        }

        public void setVIPId(String vipId) {
            this.vipId = vipId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }
    }
}
