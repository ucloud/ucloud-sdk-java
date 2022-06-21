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
package cn.ucloud.uphone.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUPhoneServerModelResponse extends Response {

    /** ServerModelInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 服务器model的库存 */
    @SerializedName("Stock")
    private List<StockInfo> stock;

    /** ServerModel实例列表，每项参数可见数据模型 ServerModelInstance */
    @SerializedName("ServerModels")
    private List<ServerModelInstance> serverModels;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<StockInfo> getStock() {
        return stock;
    }

    public void setStock(List<StockInfo> stock) {
        this.stock = stock;
    }

    public List<ServerModelInstance> getServerModels() {
        return serverModels;
    }

    public void setServerModels(List<ServerModelInstance> serverModels) {
        this.serverModels = serverModels;
    }

    public static class UPhoneSpec extends Response {

        /** 手机规格名 */
        @SerializedName("UPhoneModelName")
        private String uPhoneModelName;

        /** 手机开数，即该服务器规格能生成对应手机规格的云手机个数 */
        @SerializedName("UPhoneCount")
        private Integer uPhoneCount;

        public String getUPhoneModelName() {
            return uPhoneModelName;
        }

        public void setUPhoneModelName(String uPhoneModelName) {
            this.uPhoneModelName = uPhoneModelName;
        }

        public Integer getUPhoneCount() {
            return uPhoneCount;
        }

        public void setUPhoneCount(Integer uPhoneCount) {
            this.uPhoneCount = uPhoneCount;
        }
    }

    public static class ServerDiskSet extends Response {

        /** 磁盘类型。请参考磁盘类型。 */
        @SerializedName("DiskType")
        private String diskType;

        /**
         * 是否是系统盘。枚举值：
         *
         * <p>> True，是系统盘
         *
         * <p>> False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。
         */
        @SerializedName("IsBoot")
        private Boolean isBoot;

        /** 磁盘大小，单位: GB */
        @SerializedName("Size")
        private Integer size;

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Boolean getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(Boolean isBoot) {
            this.isBoot = isBoot;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }
    }

    public static class StockInfo extends Response {

        /** ServerModel名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** 资源余量 */
        @SerializedName("StockCount")
        private Integer stockCount;

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getStockCount() {
            return stockCount;
        }

        public void setStockCount(Integer stockCount) {
            this.stockCount = stockCount;
        }
    }

    public static class ServerModelInstance extends Response {

        /** ServerModel名称 */
        @SerializedName("ServerModelName")
        private String serverModelName;

        /** 虚拟CPU核数。可选参数：1-64（具体机型与CPU的对应关系参照控制台）。 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小。单位：MB。 */
        @SerializedName("Memory")
        private Integer memory;

        /** 磁盘信息见 UPhoneDiskSet */
        @SerializedName("DiskSet")
        private List<ServerDiskSet> diskSet;

        /** GPU类型 */
        @SerializedName("GPUType")
        private String gpuType;

        /** GPU个数 */
        @SerializedName("GPU")
        private Integer gpu;

        /** 【数组】手机说明，包含该服务器规格所能创建的手机规格名及对应手机开数。每项参数可见数据模型 [UPhoneSpec](#UPhoneSpec) */
        @SerializedName("UPhoneSpecs")
        private List<UPhoneSpec> uPhoneSpecs;

        /** 表示该机型是否上线，用于前端判断是否开放给用户。枚举值： >AVAILABLE，开放 >UNAVAILABLE, 不开放 */
        @SerializedName("ServerModelState")
        private String serverModelState;

        public String getServerModelName() {
            return serverModelName;
        }

        public void setServerModelName(String serverModelName) {
            this.serverModelName = serverModelName;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public List<ServerDiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<ServerDiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public String getGPUType() {
            return gpuType;
        }

        public void setGPUType(String gpuType) {
            this.gpuType = gpuType;
        }

        public Integer getGPU() {
            return gpu;
        }

        public void setGPU(Integer gpu) {
            this.gpu = gpu;
        }

        public List<UPhoneSpec> getUPhoneSpecs() {
            return uPhoneSpecs;
        }

        public void setUPhoneSpecs(List<UPhoneSpec> uPhoneSpecs) {
            this.uPhoneSpecs = uPhoneSpecs;
        }

        public String getServerModelState() {
            return serverModelState;
        }

        public void setServerModelState(String serverModelState) {
            this.serverModelState = serverModelState;
        }
    }
}
