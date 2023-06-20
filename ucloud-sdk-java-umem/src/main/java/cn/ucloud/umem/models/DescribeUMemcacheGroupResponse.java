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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUMemcacheGroupResponse extends Response {

    /** 组的总的节点个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 组列表,参见 UMemcacheGroupSet */
    @SerializedName("DataSet")
    private List<UMemcacheGroupSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UMemcacheGroupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemcacheGroupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UMemcacheGroupSet extends Response {

        /** 组ID */
        @SerializedName("GroupId")
        private String groupId;

        /** 组名称 */
        @SerializedName("Name")
        private String name;

        /** 节点的配置ID */
        @SerializedName("ConfigId")
        private String configId;

        /** 节点的虚拟IP地址 */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** 节点分配的服务端口 */
        @SerializedName("Port")
        private Integer port;

        /** 容量单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 使用量单位MB */
        @SerializedName("UsedSize")
        private Integer usedSize;

        /** Memcache版本信息,默认为1.4.31 */
        @SerializedName("Version")
        private String version;

        /**
         * 状态标记 Creating // 初始化中 CreateFail // 创建失败 Deleting // 删除中 DeleteFail // 删除失败 Running // 运行
         * Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中 ConfigFail // 配置失败Restarting //
         * 重启中
         */
        @SerializedName("State")
        private String state;

        /** 创建时间 (UNIX时间戳) */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 (UNIX时间戳) */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 过期时间 (UNIX时间戳) */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费类型:Year,Month,Dynamic 默认Dynamic */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getUsedSize() {
            return usedSize;
        }

        public void setUsedSize(Integer usedSize) {
            this.usedSize = usedSize;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
