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

public class DescribeUPhoneCitiesResponse extends Response {

    /** 云手机城市实例列表，每项参数可见数据模型 [CityInstance](#CityInstance) */
    @SerializedName("UPhoneCities")
    private List<CityInstance> uPhoneCities;

    public List<CityInstance> getUPhoneCities() {
        return uPhoneCities;
    }

    public void setUPhoneCities(List<CityInstance> uPhoneCities) {
        this.uPhoneCities = uPhoneCities;
    }

    public static class CityInstance extends Response {

        /** 城市Id，eg: cn-shanghai, cn-jinan */
        @SerializedName("CityId")
        private String cityId;

        /** 城市名称，eg:上海二、济南市 */
        @SerializedName("CityName")
        private String cityName;

        /** 表示该城市资源是否售罄 */
        @SerializedName("IsSoldOut")
        private Boolean isSoldOut;

        /**
         * 城市类型。枚举值： <br>
         * * CENTER，中心城市 <br>
         * * EDGE，边缘计算城市
         */
        @SerializedName("CityType")
        private String cityType;

        /** 城市别名。如cn-sh2 */
        @SerializedName("CityAlias")
        private String cityAlias;

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Boolean getIsSoldOut() {
            return isSoldOut;
        }

        public void setIsSoldOut(Boolean isSoldOut) {
            this.isSoldOut = isSoldOut;
        }

        public String getCityType() {
            return cityType;
        }

        public void setCityType(String cityType) {
            this.cityType = cityType;
        }

        public String getCityAlias() {
            return cityAlias;
        }

        public void setCityAlias(String cityAlias) {
            this.cityAlias = cityAlias;
        }
    }
}
