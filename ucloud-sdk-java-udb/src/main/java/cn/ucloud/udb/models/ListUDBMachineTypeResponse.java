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

public class ListUDBMachineTypeResponse extends Response {

    /** 计算规格列表 */
    @SerializedName("DataSet")
    private List<MachineType> dataSet;

    /** 默认计算规格 */
    @SerializedName("DefaultMachineType")
    private MachineType defaultMachineType;

    public List<MachineType> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<MachineType> dataSet) {
        this.dataSet = dataSet;
    }

    public MachineType getDefaultMachineType() {
        return defaultMachineType;
    }

    public void setDefaultMachineType(MachineType defaultMachineType) {
        this.defaultMachineType = defaultMachineType;
    }

    public static class MachineType extends Response {

        /**
         * 计算规格id, 目前支持CPU和内存比1:2、1:4、1:8三类配比规格;
         *
         * <p>规格的格式为："机型.配比.CPU核数规格"；
         *
         * <p>机型支持o和n两种机型，分别代表快杰NVMe和SSD云盘机型；
         *
         * <p>配比映射关系如下: 2m代表CPU内存配比1比2， 4m代表CPU内存配比1比4， 8m代表CPU内存配比1比8，
         *
         * <p>CPU核数规格射关系如下： small代表1C， medium代表2C， xlarge代表4C， 2xlarge代表8C， 4xlarge代表16C，
         * 8xlarge代表32C， 16xlarge代表64C，
         *
         * <p>例如 "o.mysql4m.medium"表示 创建快杰NVMe机型2C8G的实例， "o.mysql8m.4xlarge"表示创建快杰NVMe机型16C128G的实例
         */
        @SerializedName("ID")
        private String id;

        /** 计算规格描述，格式为"nCmG"，表示n核mG内存实例 */
        @SerializedName("Description")
        private String description;

        /** 规格cpu核数 */
        @SerializedName("Cpu")
        private Integer cpu;

        /** 规格内存大小，单位（GB） */
        @SerializedName("Memory")
        private Integer memory;

        /** 内部云主机机型，可选"o/n" */
        @SerializedName("Os")
        private String os;

        /** 内存/cpu配比 */
        @SerializedName("Group")
        private String group;

        public String getID() {
            return id;
        }

        public void setID(String id) {
            this.id = id;
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

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }
    }
}
