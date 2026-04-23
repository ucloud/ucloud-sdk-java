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
package cn.ucloud.ukafka.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUKafkaFrameworkVersionResponse extends Response {

    /** kafka版本 */
    @SerializedName("FrameworkVersions")
    private List<Version> frameworkVersions;

    public List<Version> getFrameworkVersions() {
        return frameworkVersions;
    }

    public void setFrameworkVersions(List<Version> frameworkVersions) {
        this.frameworkVersions = frameworkVersions;
    }

    public static class Version extends Response {

        /** kafka版本 */
        @SerializedName("Version")
        private String version;

        /** kafka 版本标签。recommend 表示推荐版本，beta 表示公测版本 */
        @SerializedName("Label")
        private String label;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
}
