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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeNewUcdnPrefetchCacheTaskRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 提交任务时返回的任务ID */
    @UCloudParam("TaskId")
    private List<String> taskId;

    /** 查询的起始时间，格式为Unix Timestamp。如果有EndTime，BeginTime必须赋值 */
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 查询的结束时间，格式为Unix Timestamp。EndTime默认为当前时间，BeginTime默认为当前时间前一天时间。 */
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 需要获取的内容预热的状态，枚举值：success：成功；wait：等待处理；process：正在处理；failure：失败； unknow：未知，默认选择所有状态 */
    @UCloudParam("Status")
    private String status;

    /** 数据偏移量，默认为0，自然数 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 返回数据长度,默认全部，自然数 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 是否全站加速 默认false */
    @UCloudParam("IsDcdn")
    private Boolean isDcdn;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getIsDcdn() {
        return isDcdn;
    }

    public void setIsDcdn(Boolean isDcdn) {
        this.isDcdn = isDcdn;
    }
}
