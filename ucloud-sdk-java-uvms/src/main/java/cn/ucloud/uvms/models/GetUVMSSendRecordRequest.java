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
package cn.ucloud.uvms.models;


import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUVMSSendRecordRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 页码，默认0 */
    @UCloudParam("Page")
    private Integer page;

    /** 每页数量，默认10 */
    @UCloudParam("NumPerPage")
    private Integer numPerPage;

    /** call_start_time(拨打时间)/receive_time（回执时间） */
    @UCloudParam("OrderBy")
    private String orderBy;

    /** asc\desc */
    @UCloudParam("OrderType")
    private String orderType;

    /** 开始时间-拨打时间，默认最近7天 */
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 结束时间-拨打时间，默认当前 */
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 模糊搜索，支持 主叫号码和被叫号码 */
    @UCloudParam("FuzzySearch")
    private String fuzzySearch;

    /** 任务编号 */
    @UCloudParam("TaskNo")
    private String taskNo;

    /** 国际码，国内CN */
    @UCloudParam("BrevityCode")
    private String brevityCode;

    /** 排除国际码 */
    @UCloudParam("ExcludeBrevityCode")
    private String excludeBrevityCode;

    /** 目标1验证码2通知3营销 */
    @UCloudParam("Purpose")
    private Integer purpose;

    /** 被叫号码，精确查询 */
    @UCloudParam("PhoneNumber")
    private String phoneNumber;

    /** 目标ID */
    @UCloudParam("TemplateId")
    private String templateId;

    /** 被叫城市编码 */
    @UCloudParam("CalledCityCode")
    private String calledCityCode;

    /** 被叫运营商 cmcc中国移动，cucc中国联通,ctcc中国电信 */
    @UCloudParam("CalledOperatorCode")
    private String calledOperatorCode;

    /** 主叫城市编码 */
    @UCloudParam("CallingCityCode")
    private String callingCityCode;

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

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getFuzzySearch() {
        return fuzzySearch;
    }

    public void setFuzzySearch(String fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getBrevityCode() {
        return brevityCode;
    }

    public void setBrevityCode(String brevityCode) {
        this.brevityCode = brevityCode;
    }

    public String getExcludeBrevityCode() {
        return excludeBrevityCode;
    }

    public void setExcludeBrevityCode(String excludeBrevityCode) {
        this.excludeBrevityCode = excludeBrevityCode;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getCalledCityCode() {
        return calledCityCode;
    }

    public void setCalledCityCode(String calledCityCode) {
        this.calledCityCode = calledCityCode;
    }

    public String getCalledOperatorCode() {
        return calledOperatorCode;
    }

    public void setCalledOperatorCode(String calledOperatorCode) {
        this.calledOperatorCode = calledOperatorCode;
    }

    public String getCallingCityCode() {
        return callingCityCode;
    }

    public void setCallingCityCode(String callingCityCode) {
        this.callingCityCode = callingCityCode;
    }
}
