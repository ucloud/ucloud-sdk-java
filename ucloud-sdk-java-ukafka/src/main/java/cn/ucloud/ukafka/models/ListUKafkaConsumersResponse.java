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

public class ListUKafkaConsumersResponse extends Response {

    /** 消费者组列表 */
    @SerializedName("Groups")
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public static class Group extends Response {

        /** 消费者组组名 */
        @SerializedName("GroupName")
        private String groupName;

        /** 消费者组类型 */
        @SerializedName("Type")
        private String type;

        /** 订阅 Topic 数量 */
        @SerializedName("NumOfTopics")
        private Integer numOfTopics;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getNumOfTopics() {
            return numOfTopics;
        }

        public void setNumOfTopics(Integer numOfTopics) {
            this.numOfTopics = numOfTopics;
        }
    }
}
