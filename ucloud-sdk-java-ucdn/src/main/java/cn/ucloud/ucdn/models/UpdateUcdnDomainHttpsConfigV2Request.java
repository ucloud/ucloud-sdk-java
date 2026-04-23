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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUcdnDomainHttpsConfigV2Request extends Request {

    /** 域名对应的资源Id */
    @NotEmpty
    @UCloudParam("DomainId")
    private String domainId;

    /** 开启或关闭加速 enable或disable 当加速区域含国内的时候，此参数为必传 */
    @UCloudParam("HttpsStatusCn")
    private String httpsStatusCn;

    /** 开启或关闭加速 enable或disable 当加速区域含国外的时候，此参数为必传 */
    @UCloudParam("HttpsStatusAbroad")
    private String httpsStatusAbroad;

    /** 证书名称，开启加速必传 */
    @UCloudParam("CertName")
    private String certName;

    /** 证书id(可能是ucdn的id，也可能是ussl的id) */
    @UCloudParam("CertId")
    private Integer certId;

    /** 证书类型 ucdn/ussl */
    @UCloudParam("CertType")
    private String certType;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getHttpsStatusCn() {
        return httpsStatusCn;
    }

    public void setHttpsStatusCn(String httpsStatusCn) {
        this.httpsStatusCn = httpsStatusCn;
    }

    public String getHttpsStatusAbroad() {
        return httpsStatusAbroad;
    }

    public void setHttpsStatusAbroad(String httpsStatusAbroad) {
        this.httpsStatusAbroad = httpsStatusAbroad;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public Integer getCertId() {
        return certId;
    }

    public void setCertId(Integer certId) {
        this.certId = certId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }
}
