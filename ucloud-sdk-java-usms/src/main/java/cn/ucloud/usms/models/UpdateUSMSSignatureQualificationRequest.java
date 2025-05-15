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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUSMSSignatureQualificationRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资质Id */
    @NotEmpty
    @UCloudParam("QualificationId")
    private String qualificationId;

    /** 状态：0-草稿，1-提交审核 */
    @NotEmpty
    @UCloudParam("Status")
    private Integer status;

    /** 资质名称 */
    @UCloudParam("Name")
    private String name;

    /** 资质属性，0-自用 1-他用 */
    @UCloudParam("Attr")
    private Integer attr;

    /** 公司名称，长度限制100 */
    @UCloudParam("CompanyName")
    private String companyName;

    /** 公司统一社会信用代码 */
    @UCloudParam("CompanyCreditCode")
    private String companyCreditCode;

    /** 公司证件文件FileId */
    @UCloudParam("CompanyCertificateFileId")
    private String companyCertificateFileId;

    /** 公司工作现场照片FileId */
    @UCloudParam("CompanyWorkScenePhotosFileId")
    private String companyWorkScenePhotosFileId;

    /** 经办人姓名 */
    @UCloudParam("HandlerName")
    private String handlerName;

    /** 经办人身份证号码 */
    @UCloudParam("HandlerIDNumber")
    private String handlerIDNumber;

    /** 经办人身份证人像面图片FileId */
    @UCloudParam("HandlerIDCardFrontImageFileId")
    private String handlerIDCardFrontImageFileId;

    /** 经办人身份证国徽面图片FileId */
    @UCloudParam("HandlerIDCardBackImageFileId")
    private String handlerIDCardBackImageFileId;

    /** 经办人手持身份证图片FileId */
    @UCloudParam("HandlerHandHeldImageFileId")
    private String handlerHandHeldImageFileId;

    /** 法人姓名 */
    @UCloudParam("ManagerName")
    private String managerName;

    /** 法人身份证号码 */
    @UCloudParam("ManagerIDNumber")
    private String managerIDNumber;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCompanyCertificateFileId() {
        return companyCertificateFileId;
    }

    public void setCompanyCertificateFileId(String companyCertificateFileId) {
        this.companyCertificateFileId = companyCertificateFileId;
    }

    public String getCompanyWorkScenePhotosFileId() {
        return companyWorkScenePhotosFileId;
    }

    public void setCompanyWorkScenePhotosFileId(String companyWorkScenePhotosFileId) {
        this.companyWorkScenePhotosFileId = companyWorkScenePhotosFileId;
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

    public String getHandlerIDCardFrontImageFileId() {
        return handlerIDCardFrontImageFileId;
    }

    public void setHandlerIDCardFrontImageFileId(String handlerIDCardFrontImageFileId) {
        this.handlerIDCardFrontImageFileId = handlerIDCardFrontImageFileId;
    }

    public String getHandlerIDCardBackImageFileId() {
        return handlerIDCardBackImageFileId;
    }

    public void setHandlerIDCardBackImageFileId(String handlerIDCardBackImageFileId) {
        this.handlerIDCardBackImageFileId = handlerIDCardBackImageFileId;
    }

    public String getHandlerHandHeldImageFileId() {
        return handlerHandHeldImageFileId;
    }

    public void setHandlerHandHeldImageFileId(String handlerHandHeldImageFileId) {
        this.handlerHandHeldImageFileId = handlerHandHeldImageFileId;
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
}
