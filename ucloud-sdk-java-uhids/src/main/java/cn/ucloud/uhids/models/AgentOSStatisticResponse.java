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
package cn.ucloud.uhids.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AgentOSStatisticResponse extends Response {

    /** 操作系统安装量统计结果 */
    @SerializedName("Result")
    private OSList result;

    public OSList getResult() {
        return result;
    }

    public void setResult(OSList result) {
        this.result = result;
    }

    public static class OSInfo extends Response {

        /** 主机数 */
        @SerializedName("Count")
        private Integer count;

        /** 系统类型 */
        @SerializedName("OSType")
        private String osType;

        /** 系统版本列表 */
        @SerializedName("Version")
        private List<OSVersion> version;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getOSType() {
            return osType;
        }

        public void setOSType(String osType) {
            this.osType = osType;
        }

        public List<OSVersion> getVersion() {
            return version;
        }

        public void setVersion(List<OSVersion> version) {
            this.version = version;
        }
    }

    public static class OSList extends Response {

        /** 主机操作系统总数 */
        @SerializedName("Total")
        private Integer total;

        /** 主机操作系统列表 */
        @SerializedName("OS")
        private List<OSInfo> os;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<OSInfo> getOS() {
            return os;
        }

        public void setOS(List<OSInfo> os) {
            this.os = os;
        }
    }

    public static class OSVersion extends Response {

        /** 系统名称 */
        @SerializedName("Name")
        private String name;

        /** 该版本系统安装主机数 */
        @SerializedName("Count")
        private Integer count;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }
}
