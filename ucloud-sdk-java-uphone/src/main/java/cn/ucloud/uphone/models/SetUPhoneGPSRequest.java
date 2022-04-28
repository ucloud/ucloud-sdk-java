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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class SetUPhoneGPSRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /** */
    @UCloudParam("UPhoneGPSs")
    private List<UPhoneGPSs> uPhoneGPSs;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<UPhoneGPSs> getUPhoneGPSs() {
        return uPhoneGPSs;
    }

    public void setUPhoneGPSs(List<UPhoneGPSs> uPhoneGPSs) {
        this.uPhoneGPSs = uPhoneGPSs;
    }

    public static class UPhoneGPSs extends Request {

        /** 云手机ID */
        @UCloudParam("UPhoneId")
        private String uPhoneId;

        /** 经度：-180~180 */
        @UCloudParam("Longitude")
        private Double longitude;

        /** 纬度：-90~90 */
        @UCloudParam("Latitude")
        private Double latitude;

        /** 海拔 */
        @UCloudParam("Altitude")
        private Double altitude;

        public String getUPhoneId() {
            return uPhoneId;
        }

        public void setUPhoneId(String uPhoneId) {
            this.uPhoneId = uPhoneId;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getAltitude() {
            return altitude;
        }

        public void setAltitude(Double altitude) {
            this.altitude = altitude;
        }
    }
}
