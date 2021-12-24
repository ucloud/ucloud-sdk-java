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

public class DescribeURedisConfigResponse extends Response {

    /** 根据过滤条件得到的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 配置文件列表 参见 URedisConfigSet */
    @SerializedName("DataSet")
    private List<URedisConfigSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<URedisConfigSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<URedisConfigSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class URedisConfigSet extends Response {

        /** Zone */
        @SerializedName("Zone")
        private String zone;

        /** 配置ID */
        @SerializedName("ConfigId")
        private String configId;

        /** 配置名称 */
        @SerializedName("Name")
        private String name;

        /** 配置描述 */
        @SerializedName("Description")
        private String description;

        /** 配置对应的Redis版本 */
        @SerializedName("Version")
        private String version;

        /** 置是否可以修改 */
        @SerializedName("IsModify")
        private String isModify;

        /** 配置所处的状态 */
        @SerializedName("State")
        private String state;

        /** 创建时间 (UNIX时间戳) */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 (UNIX时间戳) */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 是否是跨机房URedis(默认false) */
        @SerializedName("RegionFlag")
        private Boolean regionFlag;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getIsModify() {
            return isModify;
        }

        public void setIsModify(String isModify) {
            this.isModify = isModify;
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

        public Boolean getRegionFlag() {
            return regionFlag;
        }

        public void setRegionFlag(Boolean regionFlag) {
            this.regionFlag = regionFlag;
        }
    }
}
