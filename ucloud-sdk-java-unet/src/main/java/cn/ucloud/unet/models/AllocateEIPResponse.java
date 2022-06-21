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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllocateEIPResponse extends Response {

    /** 申请到的EIP资源详情 参见 UnetAllocateEIPSet */
    @SerializedName("EIPSet")
    private List<UnetAllocateEIPSet> eipSet;

    public List<UnetAllocateEIPSet> getEIPSet() {
        return eipSet;
    }

    public void setEIPSet(List<UnetAllocateEIPSet> eipSet) {
        this.eipSet = eipSet;
    }

    public static class UnetEIPAddrSet extends Response {

        /** 运营商信息如: 电信: Telecom, 联通: Unicom, 国际: International, Duplet: 双线IP（电信+联通), BGP: Bgp */
        @SerializedName("OperatorName")
        private String operatorName;

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }

    public static class UnetAllocateEIPSet extends Response {

        /** 申请到的EIP资源ID */
        @SerializedName("EIPId")
        private String eipId;

        /** 申请到的IPv4地址. */
        @SerializedName("EIPAddr")
        private List<UnetEIPAddrSet> eipAddr;

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public List<UnetEIPAddrSet> getEIPAddr() {
            return eipAddr;
        }

        public void setEIPAddr(List<UnetEIPAddrSet> eipAddr) {
            this.eipAddr = eipAddr;
        }
    }
}
