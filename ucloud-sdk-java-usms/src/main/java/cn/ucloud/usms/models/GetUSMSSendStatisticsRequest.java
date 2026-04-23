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

public class GetUSMSSendStatisticsRequest extends Request {

    /**
     * 项目ID，不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 页编号，从0开始 */
    @NotEmpty
    @UCloudParam("Page")
    private Integer page;

    /** 每页记录个数 */
    @NotEmpty
    @UCloudParam("NumPerPage")
    private Integer numPerPage;

    /** 排序字段，如BrevityCode表示按照BrevityCode排列，配合OrderType使用。目前支持SendDate、BrevityCode */
    @NotEmpty
    @UCloudParam("OrderBy")
    private String orderBy;

    /** 排序方式，asc-正序 desc-倒序 */
    @NotEmpty
    @UCloudParam("OrderType")
    private String orderType;

    /** 开始日期，格式为YYYY-MM-DD */
    @NotEmpty
    @UCloudParam("StartDate")
    private String startDate;

    /** 结束日期，格式为YYYY-MM-DD */
    @NotEmpty
    @UCloudParam("EndDate")
    private String endDate;

    /** 国内标记，0-国际短信 1-国内短信 */
    @NotEmpty
    @UCloudParam("Domestic")
    private Integer domestic;

    /** 国际简码，如CN表示中国，当需要查询多个国家时，使用-分割，如CN-ID。 */
    @UCloudParam("BrevityCode")
    private String brevityCode;

    /** 短信类型，1-验证码 2-通知类 3-营销类 */
    @UCloudParam("Purpose")
    private Integer purpose;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDomestic() {
        return domestic;
    }

    public void setDomestic(Integer domestic) {
        this.domestic = domestic;
    }

    public String getBrevityCode() {
        return brevityCode;
    }

    public void setBrevityCode(String brevityCode) {
        this.brevityCode = brevityCode;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }
}
