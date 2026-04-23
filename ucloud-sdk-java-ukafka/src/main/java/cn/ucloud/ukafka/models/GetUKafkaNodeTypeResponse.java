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

public class GetUKafkaNodeTypeResponse extends Response {

    /** 机型信息列表 */
    @SerializedName("NodeTypeSet")
    private List<InstanceType> nodeTypeSet;

    public List<InstanceType> getNodeTypeSet() {
        return nodeTypeSet;
    }

    public void setNodeTypeSet(List<InstanceType> nodeTypeSet) {
        this.nodeTypeSet = nodeTypeSet;
    }

    public static class DiskSet extends Response {

        /** 磁盘类型。Boot 表示系统盘，Data 表示数据盘 */
        @SerializedName("Type")
        private String type;

        /** 磁盘大小 */
        @SerializedName("Size")
        private String size;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }
    }

    public static class InstanceType extends Response {

        /** 机型磁盘类型信息 */
        @SerializedName("DiskSet")
        private DiskSet diskSet;

        /** CPU核心数 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 磁盘类型。RSSD 表示固态云盘，SSD 表示本地固态盘，COMMON 表示本地 SATA 盘 */
        @SerializedName("DiskType")
        private String diskType;

        /** 机型名称 */
        @SerializedName("NodeTypeName")
        private String nodeTypeName;

        /** 内存大小（单位 MB） */
        @SerializedName("Memory")
        private String memory;

        public DiskSet getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(DiskSet diskSet) {
            this.diskSet = diskSet;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public String getNodeTypeName() {
            return nodeTypeName;
        }

        public void setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }
    }
}
