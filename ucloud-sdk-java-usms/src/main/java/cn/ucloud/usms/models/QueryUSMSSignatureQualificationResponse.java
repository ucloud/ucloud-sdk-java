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

public class QueryUSMSSignatureQualificationResponse extends Response {

    /** 签名资质详细信息 */
    @SerializedName("Data")
    private OutSignatureQualificationDetail data;

    public OutSignatureQualificationDetail getData() {
        return data;
    }

    public void setData(OutSignatureQualificationDetail data) {
        this.data = data;
    }

    public static class OutSignatureQualificationDetail extends Response {

        /** 资质Id */
        @SerializedName("QualificationId")
        private String qualificationId;

        /** 资质名称 */
        @SerializedName("Name")
        private String name;

        /** 资质属性：0-自用，1-他用 */
        @SerializedName("Attr")
        private Integer attr;

        /** 公司名称 */
        @SerializedName("CompanyName")
        private String companyName;

        /** 统一社会信用代码 */
        @SerializedName("CompanyCreditCode")
        private String companyCreditCode;

        /** 公司证件文件链接 */
        @SerializedName("CompanyCertificateFile")
        private String companyCertificateFile;

        /** 负责人姓名 */
        @SerializedName("ManagerName")
        private String managerName;

        /** 负责人证件号码 */
        @SerializedName("ManagerIDNumber")
        private String managerIDNumber;

        /** 经办人姓名 */
        @SerializedName("HandlerName")
        private String handlerName;

        /** 经办人证件号码 */
        @SerializedName("HandlerIDNumber")
        private String handlerIDNumber;

        /** 经办人身份证人像面图片链接 */
        @SerializedName("HandlerIDCardFrontImage")
        private String handlerIDCardFrontImage;

        /** 经办人身份证国徽面图片链接 */
        @SerializedName("HandlerIDCardBackImage")
        private String handlerIDCardBackImage;

        /** 经办人手持身份证图片链接 */
        @SerializedName("HandlerHandHeldImage")
        private String handlerHandHeldImage;

        /** 工作现场照片链接 */
        @SerializedName("CompanyWorkScenePhotos")
        private String companyWorkScenePhotos;

        /** 授权委托书文件链接 */
        @SerializedName("PowerOfAttorney")
        private String powerOfAttorney;

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

        public String getCompanyCreditCode() {
            return companyCreditCode;
        }

        public void setCompanyCreditCode(String companyCreditCode) {
            this.companyCreditCode = companyCreditCode;
        }

        public String getCompanyCertificateFile() {
            return companyCertificateFile;
        }

        public void setCompanyCertificateFile(String companyCertificateFile) {
            this.companyCertificateFile = companyCertificateFile;
        }

        public String getManagerName() {
            return managerName;
        }

        public void setManagerName(String managerName) {
            this.managerName = managerName;
        }

        public String getManagerIDNumber() {
            return managerIDNumber;
        }

        public void setManagerIDNumber(String managerIDNumber) {
            this.managerIDNumber = managerIDNumber;
        }

        public String getHandlerName() {
            return handlerName;
        }

        public void setHandlerName(String handlerName) {
            this.handlerName = handlerName;
        }

        public String getHandlerIDNumber() {
            return handlerIDNumber;
        }

        public void setHandlerIDNumber(String handlerIDNumber) {
            this.handlerIDNumber = handlerIDNumber;
        }

        public String getHandlerIDCardFrontImage() {
            return handlerIDCardFrontImage;
        }

        public void setHandlerIDCardFrontImage(String handlerIDCardFrontImage) {
            this.handlerIDCardFrontImage = handlerIDCardFrontImage;
        }

        public String getHandlerIDCardBackImage() {
            return handlerIDCardBackImage;
        }

        public void setHandlerIDCardBackImage(String handlerIDCardBackImage) {
            this.handlerIDCardBackImage = handlerIDCardBackImage;
        }

        public String getHandlerHandHeldImage() {
            return handlerHandHeldImage;
        }

        public void setHandlerHandHeldImage(String handlerHandHeldImage) {
            this.handlerHandHeldImage = handlerHandHeldImage;
        }

        public String getCompanyWorkScenePhotos() {
            return companyWorkScenePhotos;
        }

        public void setCompanyWorkScenePhotos(String companyWorkScenePhotos) {
            this.companyWorkScenePhotos = companyWorkScenePhotos;
        }

        public String getPowerOfAttorney() {
            return powerOfAttorney;
        }

        public void setPowerOfAttorney(String powerOfAttorney) {
            this.powerOfAttorney = powerOfAttorney;
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
