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

public class DescribeCompShareSoftwarePortResponse extends Response {

    /** 应用端口信息 */
    @SerializedName("SoftwarePort")
    private List<SoftwarePort> softwarePort;

    public List<SoftwarePort> getSoftwarePort() {
        return softwarePort;
    }

    public void setSoftwarePort(List<SoftwarePort> softwarePort) {
        this.softwarePort = softwarePort;
    }

    public static class SoftwarePort extends Response {

        /** 应用名称 */
        @SerializedName("Software")
        private String software;

        /** 端口号。范围: [1, 65535] */
        @SerializedName("Port")
        private Integer port;

        public String getSoftware() {
            return software;
        }

        public void setSoftware(String software) {
            this.software = software;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}
