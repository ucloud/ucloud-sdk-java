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

public class ListUHostsecWarnStatisticsV2Response extends Response {

    /** 主机安全各告警统计值 */
    @SerializedName("WarnStatistics")
    private WarnStatistics warnStatistics;

    public WarnStatistics getWarnStatistics() {
        return warnStatistics;
    }

    public void setWarnStatistics(WarnStatistics warnStatistics) {
        this.warnStatistics = warnStatistics;
    }

    public static class WarnStatistics extends Response {

        /** 安全基线检查告警统计值 */
        @SerializedName("BaseCheck")
        private Integer baseCheck;

        /** 异常登录告警统计值 */
        @SerializedName("AbnormalLogin")
        private Integer abnormalLogin;

        /** 暴力破解成功告警统计值 */
        @SerializedName("SshBruteSucceeded")
        private Integer sshBruteSucceeded;

        /** 木马告警统计值 */
        @SerializedName("Trojan")
        private Integer trojan;

        /** 漏洞检查告警统计值 */
        @SerializedName("VulCheck")
        private Integer vulCheck;

        /** 暴力破解失败统计值 */
        @SerializedName("SshBruteFailed")
        private Integer sshBruteFailed;

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

        public Integer getSshBruteFailed() {
            return sshBruteFailed;
        }

        public void setSshBruteFailed(Integer sshBruteFailed) {
            this.sshBruteFailed = sshBruteFailed;
        }
    }
}
