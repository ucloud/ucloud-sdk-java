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
package cn.ucloud.ulogservice.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListULogServiceLogSetResponse extends Response {

    /** 返回日志主题数据，是一个数组 */
    @SerializedName("Data")
    private List<LogSetInfo> data;

    public List<LogSetInfo> getData() {
        return data;
    }

    public void setData(List<LogSetInfo> data) {
        this.data = data;
    }

    public static class LogSetInfo extends Response {

        /** 日志集下主题数量 */
        @SerializedName("TopicCount")
        private Integer topicCount;

        /** 日志集备注 */
        @SerializedName("LogSetRemark")
        private String logSetRemark;

        /** 日志集名称 */
        @SerializedName("LogSetName")
        private String logSetName;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        public Integer getTopicCount() {
            return topicCount;
        }

        public void setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
        }

        public String getLogSetRemark() {
            return logSetRemark;
        }

        public void setLogSetRemark(String logSetRemark) {
            this.logSetRemark = logSetRemark;
        }

        public String getLogSetName() {
            return logSetName;
        }

        public void setLogSetName(String logSetName) {
            this.logSetName = logSetName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }
    }
}
