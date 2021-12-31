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

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeNewUcdnRefreshCacheTaskResponse extends Response {

    /** 刷新任务的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 刷新任务信息，参考TaskInfo */
    @SerializedName("TaskList")
    private List<TaskInfo> taskList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TaskInfo> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskInfo> taskList) {
        this.taskList = taskList;
    }

    public static class UrlProgressInfo extends Response {

        /** 刷新的单条url */
        @SerializedName("Url")
        private String url;

        /** 刷新任务创建的时间。格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 任务完成时间。格式为Unix Timestamp */
        @SerializedName("FinishTime")
        private Integer finishTime;

        /** 刷新任务的当前状态，枚举值：success：成功；wait：排队中；process：处理中；failure：失败； unknow：未知 */
        @SerializedName("Status")
        private String status;

        /** 刷新进度，单位% */
        @SerializedName("Progress")
        private Integer progress;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(Integer finishTime) {
            this.finishTime = finishTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getProgress() {
            return progress;
        }

        public void setProgress(Integer progress) {
            this.progress = progress;
        }
    }

    public static class TaskInfo extends Response {

        /** 提交任务时返回的任务ID */
        @SerializedName("TaskId")
        private String taskId;

        /** 任务url的信息列表，参考UrlProgressInfo */
        @SerializedName("UrlLists")
        private List<UrlProgressInfo> urlLists;

        /** 刷新任务创建的时间。格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 刷新任务的当前状态，枚举值：success：成功；wait：排队中；process：处理中；failure：失败； unknow：未知 */
        @SerializedName("Status")
        private String status;

        public String getTaskId() {
            return taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public List<UrlProgressInfo> getUrlLists() {
            return urlLists;
        }

        public void setUrlLists(List<UrlProgressInfo> urlLists) {
            this.urlLists = urlLists;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
