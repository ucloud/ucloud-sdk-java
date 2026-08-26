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

public class ListULogServiceTopicResponse extends Response {

    /** 主题列表 */
    @SerializedName("Data")
    private List<TopicInfo> data;

    /** 主题总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<TopicInfo> getData() {
        return data;
    }

    public void setData(List<TopicInfo> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class TopicInfo extends Response {

        /** 主题名称 */
        @SerializedName("TopicName")
        private String topicName;

        /** 主题ID */
        @SerializedName("TopicId")
        private String topicId;

        /** 分区数量，固定是2 */
        @SerializedName("TopicShardNum")
        private Integer topicShardNum;

        /** 保存时间 1~730 天 */
        @SerializedName("ReserveAge")
        private Integer reserveAge;

        /** 是否保留：0 - NORMAL, 1 - RESERVED */
        @SerializedName("IsReserved")
        private Integer isReserved;

        /** 主题描述 */
        @SerializedName("TopicDesc")
        private String topicDesc;

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public String getTopicId() {
            return topicId;
        }

        public void setTopicId(String topicId) {
            this.topicId = topicId;
        }

        public Integer getTopicShardNum() {
            return topicShardNum;
        }

        public void setTopicShardNum(Integer topicShardNum) {
            this.topicShardNum = topicShardNum;
        }

        public Integer getReserveAge() {
            return reserveAge;
        }

        public void setReserveAge(Integer reserveAge) {
            this.reserveAge = reserveAge;
        }

        public Integer getIsReserved() {
            return isReserved;
        }

        public void setIsReserved(Integer isReserved) {
            this.isReserved = isReserved;
        }

        public String getTopicDesc() {
            return topicDesc;
        }

        public void setTopicDesc(String topicDesc) {
            this.topicDesc = topicDesc;
        }
    }
}
