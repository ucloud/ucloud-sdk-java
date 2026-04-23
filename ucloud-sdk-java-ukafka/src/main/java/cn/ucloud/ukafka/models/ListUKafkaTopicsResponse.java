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
package cn.ucloud.ukafka.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUKafkaTopicsResponse extends Response {

    /** topic 信息列表 */
    @SerializedName("TopicList")
    private List<TopicInfo> topicList;

    /** 列表长度 */
    @SerializedName("Length")
    private Integer length;

    public List<TopicInfo> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<TopicInfo> topicList) {
        this.topicList = topicList;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public static class TopicInfo extends Response {

        /** topic 名称 */
        @SerializedName("Topic")
        private String topic;

        /** 分区数量 */
        @SerializedName("NumOfPartition")
        private Integer numOfPartition;

        /** 占用 broker 数量 */
        @SerializedName("NumOfOccupyBroker")
        private Integer numOfOccupyBroker;

        /** 副本数量 */
        @SerializedName("NumOfReplica")
        private Integer numOfReplica;

        /** 落后副本占比 */
        @SerializedName("UnderReplicasPer")
        private Double underReplicasPer;

        /** topic 状态 */
        @SerializedName("Status")
        private String status;

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public Integer getNumOfPartition() {
            return numOfPartition;
        }

        public void setNumOfPartition(Integer numOfPartition) {
            this.numOfPartition = numOfPartition;
        }

        public Integer getNumOfOccupyBroker() {
            return numOfOccupyBroker;
        }

        public void setNumOfOccupyBroker(Integer numOfOccupyBroker) {
            this.numOfOccupyBroker = numOfOccupyBroker;
        }

        public Integer getNumOfReplica() {
            return numOfReplica;
        }

        public void setNumOfReplica(Integer numOfReplica) {
            this.numOfReplica = numOfReplica;
        }

        public Double getUnderReplicasPer() {
            return underReplicasPer;
        }

        public void setUnderReplicasPer(Double underReplicasPer) {
            this.underReplicasPer = underReplicasPer;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
