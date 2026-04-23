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

public class GetUKafkaTopicInfoResponse extends Response {

    /** topic 分区信息 */
    @SerializedName("Partitions")
    private Object partitions;

    /** topic 属性 */
    @SerializedName("TopicProperty")
    private TopicProperty topicProperty;

    /** topic 消息动态 */
    @SerializedName("MessageState")
    private MessageState messageState;

    public Object getPartitions() {
        return partitions;
    }

    public void setPartitions(Object partitions) {
        this.partitions = partitions;
    }

    public TopicProperty getTopicProperty() {
        return topicProperty;
    }

    public void setTopicProperty(TopicProperty topicProperty) {
        this.topicProperty = topicProperty;
    }

    public MessageState getMessageState() {
        return messageState;
    }

    public void setMessageState(MessageState messageState) {
        this.messageState = messageState;
    }

    public static class MessageState extends Response {

        /** topic上次更新时间（时间戳） */
        @SerializedName("LastUpdateTime")
        private Integer lastUpdateTime;

        /** topic 每分钟流入消息速率 */
        @SerializedName("BytesInPerSec")
        private Double bytesInPerSec;

        /** topic 每分钟流出消息速率 */
        @SerializedName("BytesOutPerSec")
        private Double bytesOutPerSec;

        /** topic 每分钟流入消息条数 */
        @SerializedName("MessagesInPerSec")
        private Double messagesInPerSec;

        public Integer getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(Integer lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public Double getBytesInPerSec() {
            return bytesInPerSec;
        }

        public void setBytesInPerSec(Double bytesInPerSec) {
            this.bytesInPerSec = bytesInPerSec;
        }

        public Double getBytesOutPerSec() {
            return bytesOutPerSec;
        }

        public void setBytesOutPerSec(Double bytesOutPerSec) {
            this.bytesOutPerSec = bytesOutPerSec;
        }

        public Double getMessagesInPerSec() {
            return messagesInPerSec;
        }

        public void setMessagesInPerSec(Double messagesInPerSec) {
            this.messagesInPerSec = messagesInPerSec;
        }
    }

    public static class TopicProperty extends Response {

        /** 副本数量 */
        @SerializedName("NumOfReplica")
        private Integer numOfReplica;

        /** 分区数量 */
        @SerializedName("NumOfPartition")
        private Integer numOfPartition;

        /** broker 数量 */
        @SerializedName("NumOfBroker")
        private Integer numOfBroker;

        /** 占用 broker 数量 */
        @SerializedName("NumOfOccupyBroker")
        private Integer numOfOccupyBroker;

        /** 落后副本占比 */
        @SerializedName("UnderReplicasPer")
        private Double underReplicasPer;

        /** topic 的 broker 覆盖率 */
        @SerializedName("BrokerSpreadPer")
        private Double brokerSpreadPer;

        /** topic 的 broker 倾斜率 */
        @SerializedName("BrokerSkewedPer")
        private Double brokerSkewedPer;

        /** 优先副本占有率 */
        @SerializedName("PreferredReplicasPer")
        private Double preferredReplicasPer;

        /** topic 的 offset 之和 */
        @SerializedName("SumOfPartitionOffset")
        private Integer sumOfPartitionOffset;

        /** topic 的磁盘使用之和 */
        @SerializedName("SumTopicUsage")
        private Integer sumTopicUsage;

        public Integer getNumOfReplica() {
            return numOfReplica;
        }

        public void setNumOfReplica(Integer numOfReplica) {
            this.numOfReplica = numOfReplica;
        }

        public Integer getNumOfPartition() {
            return numOfPartition;
        }

        public void setNumOfPartition(Integer numOfPartition) {
            this.numOfPartition = numOfPartition;
        }

        public Integer getNumOfBroker() {
            return numOfBroker;
        }

        public void setNumOfBroker(Integer numOfBroker) {
            this.numOfBroker = numOfBroker;
        }

        public Integer getNumOfOccupyBroker() {
            return numOfOccupyBroker;
        }

        public void setNumOfOccupyBroker(Integer numOfOccupyBroker) {
            this.numOfOccupyBroker = numOfOccupyBroker;
        }

        public Double getUnderReplicasPer() {
            return underReplicasPer;
        }

        public void setUnderReplicasPer(Double underReplicasPer) {
            this.underReplicasPer = underReplicasPer;
        }

        public Double getBrokerSpreadPer() {
            return brokerSpreadPer;
        }

        public void setBrokerSpreadPer(Double brokerSpreadPer) {
            this.brokerSpreadPer = brokerSpreadPer;
        }

        public Double getBrokerSkewedPer() {
            return brokerSkewedPer;
        }

        public void setBrokerSkewedPer(Double brokerSkewedPer) {
            this.brokerSkewedPer = brokerSkewedPer;
        }

        public Double getPreferredReplicasPer() {
            return preferredReplicasPer;
        }

        public void setPreferredReplicasPer(Double preferredReplicasPer) {
            this.preferredReplicasPer = preferredReplicasPer;
        }

        public Integer getSumOfPartitionOffset() {
            return sumOfPartitionOffset;
        }

        public void setSumOfPartitionOffset(Integer sumOfPartitionOffset) {
            this.sumOfPartitionOffset = sumOfPartitionOffset;
        }

        public Integer getSumTopicUsage() {
            return sumTopicUsage;
        }

        public void setSumTopicUsage(Integer sumTopicUsage) {
            this.sumTopicUsage = sumTopicUsage;
        }
    }
}
