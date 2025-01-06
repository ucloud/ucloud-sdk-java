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
package cn.ucloud.ufile.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUFileSSLCertRequest extends Request {

    /** 存储桶名称，全局唯一 */
    @NotEmpty
    @UCloudParam("BucketName")
    private String bucketName;

    /** 域名 */
    @NotEmpty
    @UCloudParam("Domain")
    private String domain;

    /** SSL证书名称 */
    @NotEmpty
    @UCloudParam("CertificateName")
    private String certificateName;

    /**
     * 填写SSL证书文件内容（PEM编码）。 证书文件内容填写格式：
     * 如果您的业务场景仅需确保服务端证书可信，则证书文件需要包含服务器证书（①）和中间证书（②）。如果您的中间证书和服务器证书是两个文件，您可以在证书链配置项填写中间证书内容即可。
     */
    @NotEmpty
    @UCloudParam("Certificate")
    private String certificate;

    /** 填写SSL证书私钥内容（PEM编码）。 */
    @NotEmpty
    @UCloudParam("CertificateKey")
    private String certificateKey;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
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

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCertificateKey() {
        return certificateKey;
    }

    public void setCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
    }
}
