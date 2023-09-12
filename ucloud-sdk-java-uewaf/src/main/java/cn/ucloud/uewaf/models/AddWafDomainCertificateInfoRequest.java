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
package cn.ucloud.uewaf.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddWafDomainCertificateInfoRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 域名 */
    @NotEmpty
    @UCloudParam("Domain")
    private String domain;

    /** 证书名称 */
    @NotEmpty
    @UCloudParam("CertificateName")
    private String certificateName;

    /** ssl公钥 */
    @NotEmpty
    @UCloudParam("SslPublicKey")
    private String sslPublicKey;

    /** 证书MD5校验值，开启keyless只需要计算公钥的md5 */
    @NotEmpty
    @UCloudParam("SslMD")
    private String sslMD;

    /** keyless开关，默认关闭；可选值：开启(on)，关闭(off) */
    @NotEmpty
    @UCloudParam("SslKeyless")
    private String sslKeyless;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getSslPublicKey() {
        return sslPublicKey;
    }

    public void setSslPublicKey(String sslPublicKey) {
        this.sslPublicKey = sslPublicKey;
    }

    public String getSslMD() {
        return sslMD;
    }

    public void setSslMD(String sslMD) {
        this.sslMD = sslMD;
    }

    public String getSslKeyless() {
        return sslKeyless;
    }

    public void setSslKeyless(String sslKeyless) {
        this.sslKeyless = sslKeyless;
    }
}
