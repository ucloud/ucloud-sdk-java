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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListCompShareTeamOperateLogResponse extends Response {

    /** 团队操作日志列表 */
    @SerializedName("Logs")
    private List<CompShareTeamOperateLogInfo> logs;

    /** 总条目数 */
    @SerializedName("Total")
    private Integer total;

    /** 操作类型枚举列表 */
    @SerializedName("OperateTypeList")
    private List<String> operateTypeList;

    /** 状态枚举列表 */
    @SerializedName("StatusList")
    private List<String> statusList;

    public List<CompShareTeamOperateLogInfo> getLogs() {
        return logs;
    }

    public void setLogs(List<CompShareTeamOperateLogInfo> logs) {
        this.logs = logs;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<String> getOperateTypeList() {
        return operateTypeList;
    }

    public void setOperateTypeList(List<String> operateTypeList) {
        this.operateTypeList = operateTypeList;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public static class CompShareTeamOperateLogInfo extends Response {

        /** 操作内容 */
        @SerializedName("Content")
        private String content;

        /** 操作类型 */
        @SerializedName("OperateType")
        private String operateType;

        /** 操作日志的创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 操作状态 */
        @SerializedName("Status")
        private String status;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getOperateType() {
            return operateType;
        }

        public void setOperateType(String operateType) {
            this.operateType = operateType;
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
