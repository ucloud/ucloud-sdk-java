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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUHadoopFrameworkAppResponse extends Response {

    /** 应用配置详情 */
    @SerializedName("AppConfigSet")
    private List<AppConfigSet> appConfigSet;

    public List<AppConfigSet> getAppConfigSet() {
        return appConfigSet;
    }

    public void setAppConfigSet(List<AppConfigSet> appConfigSet) {
        this.appConfigSet = appConfigSet;
    }

    public static class AppConfigSet extends Response {

        /** 需要安装的应用如：Hive,HBase, Spark,Hue,Pig等其他组件 */
        @SerializedName("AppName")
        private String appName;

        /** 应用的版本号(0.13.1,0.98.6 等等) */
        @SerializedName("AppVersion")
        private String appVersion;

        /**
         * 应用的状态(运行中)'Running'｜(已停止)'Stopped'｜(启动中)'Starting'｜(停止中)'Stopping'|(启动失败)'StartFailed'|(停止失败)'StopFailed'|(安装中)'Installing'|(安装失败)'InstallFailed'|(未安装)'NotInstalled',
         */
        @SerializedName("AppStatus")
        private String appStatus;

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

        public String getAppStatus() {
            return appStatus;
        }

        public void setAppStatus(String appStatus) {
            this.appStatus = appStatus;
        }
    }
}
