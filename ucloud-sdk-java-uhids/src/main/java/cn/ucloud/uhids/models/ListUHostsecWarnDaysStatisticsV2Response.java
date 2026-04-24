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

public class ListUHostsecWarnDaysStatisticsV2Response extends Response {

    /** 按天的统计对象数组 */
    @SerializedName("Statistics")
    private List<Statistics> statistics;

    public List<Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    public static class Statistics extends Response {

        /** 进行告警统计的时间 */
        @SerializedName("Date")
        private String date;

        /** 安全基线检查告警统计值 */
        @SerializedName("BaseCheck")
        private Integer baseCheck;

        /** 异常登录告警统计值 */
        @SerializedName("AbnormalLogin")
        private Integer abnormalLogin;

        /** 暴力破解成功告警统计值 */
        @SerializedName("SshBruteSucceeded")
        private Integer sshBruteSucceeded;

        /** 暴力破解失败统计值 */
        @SerializedName("SshBruteFailed")
        private Integer sshBruteFailed;

        /** 木马告警统计值 */
        @SerializedName("Trojan")
        private Integer trojan;

        /** 漏洞检查告警统计值 */
        @SerializedName("VulCheck")
        private Integer vulCheck;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getBaseCheck() {
            return baseCheck;
        }

        public void setBaseCheck(Integer baseCheck) {
            this.baseCheck = baseCheck;
        }

        public Integer getAbnormalLogin() {
            return abnormalLogin;
        }

        public void setAbnormalLogin(Integer abnormalLogin) {
            this.abnormalLogin = abnormalLogin;
        }

        public Integer getSshBruteSucceeded() {
            return sshBruteSucceeded;
        }

        public void setSshBruteSucceeded(Integer sshBruteSucceeded) {
            this.sshBruteSucceeded = sshBruteSucceeded;
        }

        public Integer getSshBruteFailed() {
            return sshBruteFailed;
        }

        public void setSshBruteFailed(Integer sshBruteFailed) {
            this.sshBruteFailed = sshBruteFailed;
        }

        public Integer getTrojan() {
            return trojan;
        }

        public void setTrojan(Integer trojan) {
            this.trojan = trojan;
        }

        public Integer getVulCheck() {
            return vulCheck;
        }

        public void setVulCheck(Integer vulCheck) {
            this.vulCheck = vulCheck;
        }
    }
}
