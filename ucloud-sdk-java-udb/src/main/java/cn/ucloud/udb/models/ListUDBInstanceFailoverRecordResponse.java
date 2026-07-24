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
package cn.ucloud.udb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUDBInstanceFailoverRecordResponse extends Response {

    /** 容灾记录列表 */
    @SerializedName("Dataset")
    private List<FailoverRecord> dataset;

    public List<FailoverRecord> getDataset() {
        return dataset;
    }

    public void setDataset(List<FailoverRecord> dataset) {
        this.dataset = dataset;
    }

    public static class FailoverRecord extends Response {

        /** 时间ID */
        @SerializedName("SessionId")
        private String sessionId;

        /** 容灾类型 */
        @SerializedName("FailoverType")
        private Integer failoverType;

        /** 开始时间 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 结束时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 容灾状态 */
        @SerializedName("FailoverState")
        private String failoverState;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public Integer getFailoverType() {
            return failoverType;
        }

        public void setFailoverType(Integer failoverType) {
            this.failoverType = failoverType;
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

        public String getFailoverState() {
            return failoverState;
        }

        public void setFailoverState(String failoverState) {
            this.failoverState = failoverState;
        }
    }
}
