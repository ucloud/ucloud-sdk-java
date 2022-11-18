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
package cn.ucloud.umongodb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUMongoDBMachineTypeResponse extends Response {

    /** */
    @SerializedName("DataSet")
    private List<MongodbMachineType> dataSet;

    public List<MongodbMachineType> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<MongodbMachineType> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MongodbMachineType extends Response {

        /** 机器类型ID o.mongo2m.medium，o.mongo2m.xlarge */
        @SerializedName("MachineTypeId")
        private String machineTypeId;

        /** 配置简称 2C4G */
        @SerializedName("Description")
        private String description;

        /** cpu核数 */
        @SerializedName("Cpu")
        private Integer cpu;

        /** 内存用量(GB) */
        @SerializedName("Memory")
        private Integer memory;

        /** 机器类型，N/O */
        @SerializedName("UHhostMachineType")
        private String uHhostMachineType;

        /** 配置分组，2m , 4m */
        @SerializedName("Group")
        private String group;

        public String getMachineTypeId() {
            return machineTypeId;
        }

        public void setMachineTypeId(String machineTypeId) {
            this.machineTypeId = machineTypeId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getCpu() {
            return cpu;
        }

        public void setCpu(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public String getUHhostMachineType() {
            return uHhostMachineType;
        }

        public void setUHhostMachineType(String uHhostMachineType) {
            this.uHhostMachineType = uHhostMachineType;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }
    }
}
