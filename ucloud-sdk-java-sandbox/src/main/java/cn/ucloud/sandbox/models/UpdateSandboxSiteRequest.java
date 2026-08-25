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
package cn.ucloud.sandbox.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateSandboxSiteRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 站点沙箱ID */
    @NotEmpty
    @UCloudParam("SandboxID")
    private String sandboxID;

    /** 更新站点空间名称 */
    @UCloudParam("Name")
    private String name;

    /** 更新站点空间API Key */
    @UCloudParam("APIKey")
    private String apiKey;

    /** 更新站点空间Key ID（需要和APIKey一起传） */
    @UCloudParam("KeyID")
    private String keyID;

    /** 更新站点空间环境变量，格式为["Key=Value"] */
    @UCloudParam("Envs")
    private String envs;

    /** 访问码 */
    @UCloudParam("AccessCode")
    private String accessCode;

    /** */
    @UCloudParam("IPAccess")
    private IPAccess ipAccess;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSandboxID() {
        return sandboxID;
    }

    public void setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAPIKey() {
        return apiKey;
    }

    public void setAPIKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getKeyID() {
        return keyID;
    }

    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }

    public String getEnvs() {
        return envs;
    }

    public void setEnvs(String envs) {
        this.envs = envs;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public IPAccess getIPAccess() {
        return ipAccess;
    }

    public void setIPAccess(IPAccess ipAccess) {
        this.ipAccess = ipAccess;
    }

    public static class IPAccess extends Request {

        /** 访问限制IP，格式 ["192.168.1.2","192.168.1.3"] */
        @UCloudParam("IPList")
        private String ipList;

        /** 访问模式， - ""：无IP限制 - "allow":白名单模式 - "deny":黑名单 */
        @UCloudParam("Mode")
        private String mode;

        public String getIPList() {
            return ipList;
        }

        public void setIPList(String ipList) {
            this.ipList = ipList;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }
    }
}
