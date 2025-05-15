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

import java.util.List;

public class GetUSMSSignatureQualificationRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 页索引 */
    @NotEmpty
    @UCloudParam("Page")
    private Integer page;

    /** 每页个数 */
    @NotEmpty
    @UCloudParam("NumPerPage")
    private Integer numPerPage;

    /** 排序字段，QualificationId/CreateTime */
    @NotEmpty
    @UCloudParam("OrderBy")
    private String orderBy;

    /** 排序类型: desc、asc */
    @NotEmpty
    @UCloudParam("OrderType")
    private String orderType;

    /** 签名资质属性: 0-自用，1-他用 */
    @UCloudParam("QualificationAttr")
    private Integer qualificationAttr;

    /** 签名资质状态: 0-草稿 1-审核中 2-审核通过 3-审核未通过 4-人工禁用 */
    @UCloudParam("Status")
    private Integer status;

    /** 项目ID列表 */
    @UCloudParam("InAccountIds")
    private List<String> inAccountIds;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getQualificationAttr() {
        return qualificationAttr;
    }

    public void setQualificationAttr(Integer qualificationAttr) {
        this.qualificationAttr = qualificationAttr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<String> getInAccountIds() {
        return inAccountIds;
    }

    public void setInAccountIds(List<String> inAccountIds) {
        this.inAccountIds = inAccountIds;
    }
}
