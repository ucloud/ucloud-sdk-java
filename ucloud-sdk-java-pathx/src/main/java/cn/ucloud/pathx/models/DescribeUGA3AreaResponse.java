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
package cn.ucloud.pathx.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUGA3AreaResponse extends Response {

    /**
     * 支持源站的地区,比如： AreaSet[{ "Area": "首尔", "AreaCode": "ICN", "CountryCode": "CN", "ContinentCode":
     * "CN" }]
     *
     * <p>ContinentCode:["CN","NA","OT"];"CN":表示国内，"NA":表示美洲，“OT"：表示欧洲等其他地区
     */
    @SerializedName("AreaSet")
    private List<ForwardArea> areaSet;

    public List<ForwardArea> getAreaSet() {
        return areaSet;
    }

    public void setAreaSet(List<ForwardArea> areaSet) {
        this.areaSet = areaSet;
    }

    public static class ForwardArea extends Response {

        /** 源站区域代码 */
        @SerializedName("AreaCode")
        private String areaCode;

        /** 源站区域中文 */
        @SerializedName("Area")
        private String area;

        /** 国家代码 */
        @SerializedName("CountryCode")
        private String countryCode;

        /** 国旗unicode */
        @SerializedName("FlagUnicode")
        private String flagUnicode;

        /** 国旗 emoji */
        @SerializedName("FlagEmoji")
        private String flagEmoji;

        /** 大陆代码 */
        @SerializedName("ContinentCode")
        private String continentCode;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getFlagUnicode() {
            return flagUnicode;
        }

        public void setFlagUnicode(String flagUnicode) {
            this.flagUnicode = flagUnicode;
        }

        public String getFlagEmoji() {
            return flagEmoji;
        }

        public void setFlagEmoji(String flagEmoji) {
            this.flagEmoji = flagEmoji;
        }

        public String getContinentCode() {
            return continentCode;
        }

        public void setContinentCode(String continentCode) {
            this.continentCode = continentCode;
        }
    }
}
