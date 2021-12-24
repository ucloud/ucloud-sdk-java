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
package cn.ucloud.uaccount.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetRegionResponse extends Response {

    /** 各数据中心信息 */
    @SerializedName("Regions")
    private List<RegionInfo> regions;

    public List<RegionInfo> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionInfo> regions) {
        this.regions = regions;
    }

    public static class RegionInfo extends Response {

        /** 数据中心ID */
        @SerializedName("RegionId")
        private Integer regionId;

        /** 数据中心名称 */
        @SerializedName("RegionName")
        private String regionName;

        /** 是否用户当前默认数据中心 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /** 用户在此数据中心的权限位 */
        @SerializedName("BitMaps")
        private String bitMaps;

        /** 地域名字，如cn-bj */
        @SerializedName("Region")
        private String region;

        /** 可用区名字，如cn-bj-01 */
        @SerializedName("Zone")
        private String zone;

        public Integer getRegionId() {
            return regionId;
        }

        public void setRegionId(Integer regionId) {
            this.regionId = regionId;
        }

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public String getBitMaps() {
            return bitMaps;
        }

        public void setBitMaps(String bitMaps) {
            this.bitMaps = bitMaps;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }
    }
}
