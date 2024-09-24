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

public class DescribeUMemBlockInfoResponse extends Response {

    /** 分布式redis 分片信息 */
    @SerializedName("DataSet")
    private List<UMemBlockInfo> dataSet;

    /** 集群读写分离策略。 枚举值[ "Custom": 用户自定义节点权重， "Uniform": 包括主节点在内的所有节点平均读请求， "ReadOnly": 读请求均分至只读节点] */
    @SerializedName("ReadMode")
    private String readMode;

    public List<UMemBlockInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemBlockInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public String getReadMode() {
        return readMode;
    }

    public void setReadMode(String readMode) {
        this.readMode = readMode;
    }

    public static class UMemBlockInfo extends Response {

        /** 分片id */
        @SerializedName("BlockId")
        private String blockId;

        /** 分片端口 */
        @SerializedName("BlockPort")
        private Integer blockPort;

        /** 容量单位GB */
        @SerializedName("BlockSize")
        private Integer blockSize;

        /**
         * 实例状态 Starting // 创建中 Creating // 初始化中 CreateFail // 创建失败 Fail // 创建失败 Deleting // 删除中
         * DeleteFail // 删除失败 Running // 运行 Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中
         * ConfigFail // 配置失败Restarting // 重启中 SetPasswordFail //设置密码失败 UpgradeMemInit //任务初始化
         */
        @SerializedName("BlockState")
        private String blockState;

        /** 分片维护的键槽起始值 */
        @SerializedName("BlockSlotBegin")
        private Integer blockSlotBegin;

        /** 分片维护的键槽结束值 */
        @SerializedName("BlockSlotEnd")
        private Integer blockSlotEnd;

        /** 分片ip */
        @SerializedName("BlockVip")
        private String blockVip;

        /** 使用量单位MB */
        @SerializedName("BlockUsedSize")
        private Integer blockUsedSize;

        /** 分片类型，master 或者 slave */
        @SerializedName("BlockType")
        private String blockType;

        /** 分片读权重 */
        @SerializedName("BlockReadWeight")
        private Integer blockReadWeight;

        /** 分片名称 */
        @SerializedName("BlockName")
        private String blockName;

        public String getBlockId() {
            return blockId;
        }

        public void setBlockId(String blockId) {
            this.blockId = blockId;
        }

        public Integer getBlockPort() {
            return blockPort;
        }

        public void setBlockPort(Integer blockPort) {
            this.blockPort = blockPort;
        }

        public Integer getBlockSize() {
            return blockSize;
        }

        public void setBlockSize(Integer blockSize) {
            this.blockSize = blockSize;
        }

        public String getBlockState() {
            return blockState;
        }

        public void setBlockState(String blockState) {
            this.blockState = blockState;
        }

        public Integer getBlockSlotBegin() {
            return blockSlotBegin;
        }

        public void setBlockSlotBegin(Integer blockSlotBegin) {
            this.blockSlotBegin = blockSlotBegin;
        }

        public Integer getBlockSlotEnd() {
            return blockSlotEnd;
        }

        public void setBlockSlotEnd(Integer blockSlotEnd) {
            this.blockSlotEnd = blockSlotEnd;
        }

        public String getBlockVip() {
            return blockVip;
        }

        public void setBlockVip(String blockVip) {
            this.blockVip = blockVip;
        }

        public Integer getBlockUsedSize() {
            return blockUsedSize;
        }

        public void setBlockUsedSize(Integer blockUsedSize) {
            this.blockUsedSize = blockUsedSize;
        }

        public String getBlockType() {
            return blockType;
        }

        public void setBlockType(String blockType) {
            this.blockType = blockType;
        }

        public Integer getBlockReadWeight() {
            return blockReadWeight;
        }

        public void setBlockReadWeight(Integer blockReadWeight) {
            this.blockReadWeight = blockReadWeight;
        }

        public String getBlockName() {
            return blockName;
        }

        public void setBlockName(String blockName) {
            this.blockName = blockName;
        }
    }
}
