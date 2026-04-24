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
package cn.ucloud.uhids.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class QueryPayInfoResponse extends Response {

    /** 未消费预付费点数 */
    @SerializedName("BillPoint")
    private Integer billPoint;

    /** 预付费点数剩余使用时长 */
    @SerializedName("RemainTime")
    private String remainTime;

    /** 预付费点数过期时间 */
    @SerializedName("ExpiratTime")
    private String expiratTime;

    /** 自动续费开关 */
    @SerializedName("AutoRenew")
    private Boolean autoRenew;

    /** 自动企业版开关 */
    @SerializedName("AutoBusinessVer")
    private Boolean autoBusinessVer;

    /** 用户最近一次购买的点数大小 */
    @SerializedName("RenewPointNum")
    private Integer renewPointNum;

    /** 公司ID */
    @SerializedName("CompanyId")
    private Integer companyId;

    /** 项目ID */
    @SerializedName("OrganizationId")
    private Integer organizationId;

    /** 资源ID */
    @SerializedName("ResourceLongId")
    private String resourceLongId;

    /** 更改时间 */
    @SerializedName("UpdateTime")
    private String updateTime;

    public Integer getBillPoint() {
        return billPoint;
    }

    public void setBillPoint(Integer billPoint) {
        this.billPoint = billPoint;
    }

    public String getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    public String getExpiratTime() {
        return expiratTime;
    }

    public void setExpiratTime(String expiratTime) {
        this.expiratTime = expiratTime;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public Boolean getAutoBusinessVer() {
        return autoBusinessVer;
    }

    public void setAutoBusinessVer(Boolean autoBusinessVer) {
        this.autoBusinessVer = autoBusinessVer;
    }

    public Integer getRenewPointNum() {
        return renewPointNum;
    }

    public void setRenewPointNum(Integer renewPointNum) {
        this.renewPointNum = renewPointNum;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getResourceLongId() {
        return resourceLongId;
    }

    public void setResourceLongId(String resourceLongId) {
        this.resourceLongId = resourceLongId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
