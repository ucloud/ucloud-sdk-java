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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUcdnDomainLogResponse extends Response {

    /** 获取日志的连接地址。具体参考下面LogSetList */
    @SerializedName("LogSet")
    private List<LogSetList> logSet;

    public List<LogSetList> getLogSet() {
        return logSet;
    }

    public void setLogSet(List<LogSetList> logSet) {
        this.logSet = logSet;
    }

    public static class LogSetInfo extends Response {

        /** 日志时间UnixTime */
        @SerializedName("Time")
        private Integer time;

        /** 国内日志url列表 */
        @SerializedName("CnLog")
        private List<String> cnLog;

        /** 国外日志url列表 */
        @SerializedName("AbroadLog")
        private List<String> abroadLog;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public List<String> getCnLog() {
            return cnLog;
        }

        public void setCnLog(List<String> cnLog) {
            this.cnLog = cnLog;
        }

        public List<String> getAbroadLog() {
            return abroadLog;
        }

        public void setAbroadLog(List<String> abroadLog) {
            this.abroadLog = abroadLog;
        }
    }

    public static class LogSetList extends Response {

        /** 域名 */
        @SerializedName("Domain")
        private String domain;

        /** 域名信息列表，参考LogSetInfo */
        @SerializedName("Logs")
        private List<LogSetInfo> logs;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public List<LogSetInfo> getLogs() {
            return logs;
        }

        public void setLogs(List<LogSetInfo> logs) {
            this.logs = logs;
        }
    }
}
