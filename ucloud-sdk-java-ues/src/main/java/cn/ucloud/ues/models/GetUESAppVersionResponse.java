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
package cn.ucloud.ues.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUESAppVersionResponse extends Response {

    /** 服务应用版本个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 服务应用版本列表 */
    @SerializedName("AppVersionList")
    private List<AppVersion> appVersionList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AppVersion> getAppVersionList() {
        return appVersionList;
    }

    public void setAppVersionList(List<AppVersion> appVersionList) {
        this.appVersionList = appVersionList;
    }

    public static class AppVersion extends Response {

        /** 应用名称，默认值为elasticsearch */
        @SerializedName("AppName")
        private String appName;

        /** 应用版本号 */
        @SerializedName("AppVersion")
        private String appVersion;

        /** 是否支持多区部署，默认为false */
        @SerializedName("IsMultiZone")
        private Boolean isMultiZone;

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public Boolean getIsMultiZone() {
            return isMultiZone;
        }

        public void setIsMultiZone(Boolean isMultiZone) {
            this.isMultiZone = isMultiZone;
        }
    }
}
