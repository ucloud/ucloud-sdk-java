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
package cn.ucloud.usms.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUSMSSignatureQualificationResponse extends Response {

    /** 签名资质总个数 */
    @SerializedName("Total")
    private Integer total;

    /** 签名资质结果集合 */
    @SerializedName("Data")
    private List<OutSignatureQualification> data;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<OutSignatureQualification> getData() {
        return data;
    }

    public void setData(List<OutSignatureQualification> data) {
        this.data = data;
    }

    public static class OutSignatureQualification extends Response {

        /** 资质Id */
        @SerializedName("QualificationId")
        private String qualificationId;

        /** 项目Id */
        @SerializedName("AccountId")
        private Integer accountId;

        /** 资质名称 */
        @SerializedName("Name")
        private String name;

        /** 资质属性: 0-自用 1-他用 */
        @SerializedName("Attr")
        private Integer attr;

        /** 公司名称 */
        @SerializedName("CompanyName")
        private String companyName;

        /** 负责人姓名 */
        @SerializedName("ManagerName")
        private String managerName;

        /** 经办人姓名 */
        @SerializedName("HandlerName")
        private String handlerName;

        /** 状态:0-草稿 1-审核中 2-审核通过 3-审核未通过 4-人工禁用 */
        @SerializedName("Status")
        private Integer status;

        /** 审核未通过错误码 */
        @SerializedName("ErrCode")
        private Integer errCode;

        /** 审核未通过错误原因 */
        @SerializedName("ErrDesc")
        private String errDesc;

        /** 创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间戳 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 审核开始时间戳 */
        @SerializedName("ReviewStartTime")
        private Integer reviewStartTime;

        /** 审核完成时间戳 */
        @SerializedName("ReviewEndTime")
        private Integer reviewEndTime;

        public String getQualificationId() {
            return qualificationId;
        }

        public void setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
        }

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAttr() {
            return attr;
        }

        public void setAttr(Integer attr) {
            this.attr = attr;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getManagerName() {
            return managerName;
        }

        public void setManagerName(String managerName) {
            this.managerName = managerName;
        }

        public String getHandlerName() {
            return handlerName;
        }

        public void setHandlerName(String handlerName) {
            this.handlerName = handlerName;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getErrCode() {
            return errCode;
        }

        public void setErrCode(Integer errCode) {
            this.errCode = errCode;
        }

        public String getErrDesc() {
            return errDesc;
        }

        public void setErrDesc(String errDesc) {
            this.errDesc = errDesc;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getReviewStartTime() {
            return reviewStartTime;
        }

        public void setReviewStartTime(Integer reviewStartTime) {
            this.reviewStartTime = reviewStartTime;
        }

        public Integer getReviewEndTime() {
            return reviewEndTime;
        }

        public void setReviewEndTime(Integer reviewEndTime) {
            this.reviewEndTime = reviewEndTime;
        }
    }
}
