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

public class DescribePOPGWResponse extends Response {

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** UWAN 实例信息 */
    @SerializedName("POPGWInfos")
    private List<POPGWInfo> popgwInfos;

    /** 请求 ID */
    @SerializedName("RequestId")
    private String requestId;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<POPGWInfo> getPOPGWInfos() {
        return popgwInfos;
    }

    public void setPOPGWInfos(List<POPGWInfo> popgwInfos) {
        this.popgwInfos = popgwInfos;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public static class BWPackageInfo extends Response {

        /** UWAN 网关带宽 ID */
        @SerializedName("BwId")
        private String bwId;

        /** 带宽包名称 */
        @SerializedName("Name")
        private String name;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 计费方式eg:(固定带宽) */
        @SerializedName("PayMode")
        private String payMode;

        /** 付费方式eg:(Month) */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 网关外网 IP */
        @SerializedName("PublicIp")
        private String publicIp;

        /** 最大带宽值 */
        @SerializedName("BandWidth")
        private Double bandWidth;

        /** 过期时间 */
        @SerializedName("DueTime")
        private Integer dueTime;

        public String getBwId() {
            return bwId;
        }

        public void setBwId(String bwId) {
            this.bwId = bwId;
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

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getPublicIp() {
            return publicIp;
        }

        public void setPublicIp(String publicIp) {
            this.publicIp = publicIp;
        }

        public Double getBandWidth() {
            return bandWidth;
        }

        public void setBandWidth(Double bandWidth) {
            this.bandWidth = bandWidth;
        }

        public Integer getDueTime() {
            return dueTime;
        }

        public void setDueTime(Integer dueTime) {
            this.dueTime = dueTime;
        }
    }

    public static class POPGWInfo extends Response {

        /** 地域信息 */
        @SerializedName("Region")
        private String region;

        /** 网关实例 ID */
        @SerializedName("PopGwId")
        private String popGwId;

        /** 网关名称 */
        @SerializedName("Name")
        private String name;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 带宽包信息 */
        @SerializedName("BWPackageInfo")
        private BWPackageInfo bwPackageInfo;

        /** 云联网信息 */
        @SerializedName("UGNInfo")
        private UGNInfo ugnInfo;

        /** CPE数量 */
        @SerializedName("CPENum")
        private Integer cpeNum;

        /** 客户网关数量 */
        @SerializedName("CENum")
        private Integer ceNum;

        /** VCPE 数量 */
        @SerializedName("VCPENum")
        private Integer vcpeNum;

        /** 唯一标识 */
        @SerializedName("VNI")
        private Integer vni;

        /** 过期时间 */
        @SerializedName("DueTime")
        private Integer dueTime;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 规格：IPSec、SSL */
        @SerializedName("Type")
        private String type;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getPopGwId() {
            return popGwId;
        }

        public void setPopGwId(String popGwId) {
            this.popGwId = popGwId;
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public BWPackageInfo getBWPackageInfo() {
            return bwPackageInfo;
        }

        public void setBWPackageInfo(BWPackageInfo bwPackageInfo) {
            this.bwPackageInfo = bwPackageInfo;
        }

        public UGNInfo getUGNInfo() {
            return ugnInfo;
        }

        public void setUGNInfo(UGNInfo ugnInfo) {
            this.ugnInfo = ugnInfo;
        }

        public Integer getCPENum() {
            return cpeNum;
        }

        public void setCPENum(Integer cpeNum) {
            this.cpeNum = cpeNum;
        }

        public Integer getCENum() {
            return ceNum;
        }

        public void setCENum(Integer ceNum) {
            this.ceNum = ceNum;
        }

        public Integer getVCPENum() {
            return vcpeNum;
        }

        public void setVCPENum(Integer vcpeNum) {
            this.vcpeNum = vcpeNum;
        }

        public Integer getVNI() {
            return vni;
        }

        public void setVNI(Integer vni) {
            this.vni = vni;
        }

        public Integer getDueTime() {
            return dueTime;
        }

        public void setDueTime(Integer dueTime) {
            this.dueTime = dueTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class UGNBWInfo extends Response {

        /** UGN带宽包ID */
        @SerializedName("UGNBWId")
        private String ugnbwId;

        /** UGN带宽包名称 */
        @SerializedName("UGNBWName")
        private String ugnbwName;

        public String getUGNBWId() {
            return ugnbwId;
        }

        public void setUGNBWId(String ugnbwId) {
            this.ugnbwId = ugnbwId;
        }

        public String getUGNBWName() {
            return ugnbwName;
        }

        public void setUGNBWName(String ugnbwName) {
            this.ugnbwName = ugnbwName;
        }
    }

    public static class UGNInfo extends Response {

        /** 云联网 ID */
        @SerializedName("UGNId")
        private String ugnId;

        /** 云联网名称 */
        @SerializedName("UGNName")
        private String ugnName;

        /** UGN 带宽包信息 */
        @SerializedName("UGNBWInfos")
        private List<UGNBWInfo> ugnbwInfos;

        public String getUGNId() {
            return ugnId;
        }

        public void setUGNId(String ugnId) {
            this.ugnId = ugnId;
        }

        public String getUGNName() {
            return ugnName;
        }

        public void setUGNName(String ugnName) {
            this.ugnName = ugnName;
        }

        public List<UGNBWInfo> getUGNBWInfos() {
            return ugnbwInfos;
        }

        public void setUGNBWInfos(List<UGNBWInfo> ugnbwInfos) {
            this.ugnbwInfos = ugnbwInfos;
        }
    }
}
