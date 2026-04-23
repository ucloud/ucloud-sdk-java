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

public class ListUHadoopFrameworkAppByUseCaseResponse extends Response {

    /** 使用场景的app版本信息 */
    @SerializedName("AppConfigSet")
    private List<AppConfigVersion> appConfigSet;

    public List<AppConfigVersion> getAppConfigSet() {
        return appConfigSet;
    }

    public void setAppConfigSet(List<AppConfigVersion> appConfigSet) {
        this.appConfigSet = appConfigSet;
    }

    public static class AppConfigVersion extends Response {

        /** UHadoop版本，值为 uhadoop 3.0|uhadoop 2.2|uhadoop 3.1 */
        @SerializedName("ReleaseVersion")
        private String releaseVersion;

        /** Hadoop版本，值为 hadoop3.2.1-udh3.0|hadoop3.3.4-udh3.1 |hadoop2.8.5-udh2.2 */
        @SerializedName("HadoopVersion")
        private String hadoopVersion;

        /**
         * 框架，值为'Hadoop'|'HDFS'|'MR'|'StarRocks'之一,框架，例如Hadoop|MR|HDFS|StarRocks Hadoop框架包含存储与计算服务
         * MR集群包含计算服务 HDFS只包含存储服务,StarRocks为StarRocks集群
         */
        @SerializedName("Framework")
        private String framework;

        /** 框架版本 */
        @SerializedName("FrameworkVersion")
        private String frameworkVersion;

        /** 框架示例 */
        @SerializedName("UseCases")
        private List<UseCases> useCases;

        public String getReleaseVersion() {
            return releaseVersion;
        }

        public void setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
        }

        public String getHadoopVersion() {
            return hadoopVersion;
        }

        public void setHadoopVersion(String hadoopVersion) {
            this.hadoopVersion = hadoopVersion;
        }

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
        }

        public String getFrameworkVersion() {
            return frameworkVersion;
        }

        public void setFrameworkVersion(String frameworkVersion) {
            this.frameworkVersion = frameworkVersion;
        }

        public List<UseCases> getUseCases() {
            return useCases;
        }

        public void setUseCases(List<UseCases> useCases) {
            this.useCases = useCases;
        }
    }

    public static class UseCases extends Response {

        /** 集群种类 */
        @SerializedName("ClusterCase")
        private String clusterCase;

        /** 依赖的组件 */
        @SerializedName("MustHas")
        private String mustHas;

        /** 组件版本 */
        @SerializedName("AppVersion")
        private String appVersion;

        public String getClusterCase() {
            return clusterCase;
        }

        public void setClusterCase(String clusterCase) {
            this.clusterCase = clusterCase;
        }

        public String getMustHas() {
            return mustHas;
        }

        public void setMustHas(String mustHas) {
            this.mustHas = mustHas;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }
    }
}
