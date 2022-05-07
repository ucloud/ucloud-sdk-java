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
package cn.ucloud.ulb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateSSLRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** SSL证书的名字，默认值为空 */
    @NotEmpty
    @UCloudParam("SSLName")
    private String sslName;

    /** 所添加的SSL证书类型，目前只支持Pem格式 */
    @UCloudParam("SSLType")
    private String sslType;

    /** SSL证书的完整内容，包括用户证书、加密证书的私钥、CA证书 */
    @UCloudParam("SSLContent")
    private String sslContent;

    /** 用户的证书 */
    @UCloudParam("UserCert")
    private String userCert;

    /** 加密证书的私钥 */
    @UCloudParam("PrivateKey")
    private String privateKey;

    /** CA证书 */
    @UCloudParam("CaCert")
    private String caCert;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSSLName() {
        return sslName;
    }

    public void setSSLName(String sslName) {
        this.sslName = sslName;
    }

    public String getSSLType() {
        return sslType;
    }

    public void setSSLType(String sslType) {
        this.sslType = sslType;
    }

    public String getSSLContent() {
        return sslContent;
    }

    public void setSSLContent(String sslContent) {
        this.sslContent = sslContent;
    }

    public String getUserCert() {
        return userCert;
    }

    public void setUserCert(String userCert) {
        this.userCert = userCert;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getCaCert() {
        return caCert;
    }

    public void setCaCert(String caCert) {
        this.caCert = caCert;
    }
}
