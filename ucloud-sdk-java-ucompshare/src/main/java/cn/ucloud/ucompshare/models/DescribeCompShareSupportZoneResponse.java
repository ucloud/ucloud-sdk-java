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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCompShareSupportZoneResponse extends Response {

    /** 可用区信息列表 */
    @SerializedName("ZoneInfo")
    private List<SupportZone> zoneInfo;

    public List<SupportZone> getZoneInfo() {
        return zoneInfo;
    }

    public void setZoneInfo(List<SupportZone> zoneInfo) {
        this.zoneInfo = zoneInfo;
    }

    public static class SupportZone extends Response {

        /** 地域名称 */
        @SerializedName("Region")
        private String region;

        /** 可用区名称 */
        @SerializedName("Zone")
        private String zone;

        /** 地域ID */
        @SerializedName("RegionId")
        private Integer regionId;

        /** 可用区ID */
        @SerializedName("ZoneId")
        private Integer zoneId;

        /** 可用区显示名称 */
        @SerializedName("Describe")
        private String describe;

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

        public Integer getRegionId() {
            return regionId;
        }

        public void setRegionId(Integer regionId) {
            this.regionId = regionId;
        }

        public Integer getZoneId() {
            return zoneId;
        }

        public void setZoneId(Integer zoneId) {
            this.zoneId = zoneId;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }
    }
}
