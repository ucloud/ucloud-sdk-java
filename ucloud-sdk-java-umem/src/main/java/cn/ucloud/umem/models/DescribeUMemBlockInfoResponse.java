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

    /** 分布式redis 分片信息: false */
    @SerializedName("DataSet")
    private List<UMemBlockInfo> dataSet;

    public List<UMemBlockInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemBlockInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UMemBlockInfo extends Response {

        /** 分片id: false */
        @SerializedName("BlockId")
        private String blockId;

        /** 分片ip: false */
        @SerializedName("BlockVip")
        private String blockVip;

        /** 分片端口: false */
        @SerializedName("BlockPort")
        private Integer blockPort;

        /** 容量单位GB: false */
        @SerializedName("BlockSize")
        private Integer blockSize;

        /** 使用量单位MB: false */
        @SerializedName("BlockUsedSize")
        private Integer blockUsedSize;

        /**
         * 实例状态 Starting // 创建中 Creating // 初始化中 CreateFail // 创建失败 Fail // 创建失败 Deleting // 删除中
         * DeleteFail // 删除失败 Running // 运行 Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中
         * ConfigFail // 配置失败Restarting // 重启中 SetPasswordFail //设置密码失败: false
         */
        @SerializedName("BlockState")
        private String blockState;

        /** 分片维护的键槽起始值: false */
        @SerializedName("BlockSlotBegin")
        private Integer blockSlotBegin;

        /** 分片维护的键槽结束值: false */
        @SerializedName("BlockSlotEnd")
        private Integer blockSlotEnd;

        public String getBlockId() {
            return blockId;
        }

        public void setBlockId(String blockId) {
            this.blockId = blockId;
        }

        public String getBlockVip() {
            return blockVip;
        }

        public void setBlockVip(String blockVip) {
            this.blockVip = blockVip;
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

        public Integer getBlockUsedSize() {
            return blockUsedSize;
        }

        public void setBlockUsedSize(Integer blockUsedSize) {
            this.blockUsedSize = blockUsedSize;
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
    }
}
