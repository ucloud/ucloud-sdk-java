/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.uphone.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUPhoneJobResponse extends Response {

    
        
    /**
     * Job信息，详情见数据结构Job（如果Status为等待中，此字段为空）	
     */
    @SerializedName("Jobs")
    private List<Job> jobs;
        
    
        
    /**
     * Job总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class Job extends Response {
            
        
    /**
     * Job的唯一标识Id	
     */
    @SerializedName("JobId")
    private String jobId;
        
    
        
    /**
     * Job创建时间，格式为Unix时间戳。	
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * Job处理开始时间，格式为Unix时间戳。	
     */
    @SerializedName("BeginTime")
    private Integer beginTime;
        
    
        
    /**
     * Job处理结束时间，格式为Unix时间戳。	
     */
    @SerializedName("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 任务状态
* 等待中：PENDING
* 运行中：RUNNING
* 成功：SUCCESS
* 部分成功：PARTIAL_SUCCESS
* 失败：FAILED
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * Job类型，仅支持INSTALL_APP、UNINSTALL_APP、RUN_ASYNC_COMMAND。
     */
    @SerializedName("JobType")
    private String jobType;
        
    
        
    /**
     * Task信息，详情见数据结构Task（如果State为PENDING，此字段为空）	
     */
    @SerializedName("Tasks")
    private List<Task> tasks;
        
    
        
    /**
     * 安装/卸载Job相关的应用版本唯一标识
     */
    @SerializedName("AppVersionId")
    private String appVersionId;
        
    
        
    /**
     * 此Job相关的云手机唯一标识
     */
    @SerializedName("UPhoneIds")
    private List<String> uPhoneIds;
        
    
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
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
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    public String getAppVersionId() {
        return appVersionId;
    }

    public void setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
    }
    
    public List<String> getUPhoneIds() {
        return uPhoneIds;
    }

    public void setUPhoneIds(List<String> uPhoneIds) {
        this.uPhoneIds = uPhoneIds;
    }
    
        }
        public static class Task extends Response {
            
        
    /**
     * Task的唯一标识	
     */
    @SerializedName("TaskId")
    private String taskId;
        
    
        
    /**
     * 任务处理开始时间，格式为Unix时间戳。	
     */
    @SerializedName("BeginTime")
    private Integer beginTime;
        
    
        
    /**
     * 任务处理结束时间，格式为Unix时间戳。	
     */
    @SerializedName("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 任务状态
* 等待中：PENDING
* 运行中：RUNNING
* 成功：SUCCESS
* 失败：FAILED
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * Task错误信息
     */
    @SerializedName("ErrorMsg")
    private String errorMsg;
        
    
        
    /**
     * 异步任务执行结果
     */
    @SerializedName("ExecuteMsg")
    private String executeMsg;
        
    
        
    /**
     * 云手机的唯一标识，云手机相关任务包含此字段。	
     */
    @SerializedName("UPhoneId")
    private String uPhoneId;
        
    
        
    /**
     * 安装/卸载任务相关的应用版本唯一标识ID
     */
    @SerializedName("AppVersionId")
    private String appVersionId;
        
    
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
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
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    public String getExecuteMsg() {
        return executeMsg;
    }

    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }
    
    public String getUPhoneId() {
        return uPhoneId;
    }

    public void setUPhoneId(String uPhoneId) {
        this.uPhoneId = uPhoneId;
    }
    
    public String getAppVersionId() {
        return appVersionId;
    }

    public void setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
    }
    
        }
}









