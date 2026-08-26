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

public class ListULogServiceMachineGroupResponse extends Response {

    /** 机器组信息列表 */
    @SerializedName("MachineGroups")
    private List<MachineGroup> machineGroups;

    public List<MachineGroup> getMachineGroups() {
        return machineGroups;
    }

    public void setMachineGroups(List<MachineGroup> machineGroups) {
        this.machineGroups = machineGroups;
    }

    public static class MachineGroup extends Response {

        /** 机器组ID */
        @SerializedName("Id")
        private String id;

        /** 机器组名称 */
        @SerializedName("Name")
        private String name;

        /** 采集器识别类型：LABEL：机器标识，IP：IP类型 */
        @SerializedName("Type")
        private String type;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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
