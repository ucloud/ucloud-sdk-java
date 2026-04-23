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
package cn.ucloud.ues.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUESNodeConfResponse extends Response {

    /** 所有节点配置信息的个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 服务节点配置信息列表 */
    @SerializedName("NodeConfList")
    private List<NodeConf> nodeConfList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NodeConf> getNodeConfList() {
        return nodeConfList;
    }

    public void setNodeConfList(List<NodeConf> nodeConfList) {
        this.nodeConfList = nodeConfList;
    }

    public static class NodeConf extends Response {

        /** 内存，单位为GB */
        @SerializedName("Memory")
        private Integer memory;

        /** CPU数量 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 节点配置标识 */
        @SerializedName("NodeConf")
        private String nodeConf;

        /** 磁盘类型[RSSD|SSD] */
        @SerializedName("DiskType")
        private String diskType;

        /** 磁盘大小，单位为GB */
        @SerializedName("DiskSize")
        private Integer diskSize;

        /** 是否支持安全组[true|false] */
        @SerializedName("IsSecGroup")
        private Boolean isSecGroup;

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public String getNodeConf() {
            return nodeConf;
        }

        public void setNodeConf(String nodeConf) {
            this.nodeConf = nodeConf;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }

        public Boolean getIsSecGroup() {
            return isSecGroup;
        }

        public void setIsSecGroup(Boolean isSecGroup) {
            this.isSecGroup = isSecGroup;
        }
    }
}
