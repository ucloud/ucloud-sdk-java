/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.pathx.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreatePathXSSLRequest extends Request {

    
        
    /**
     * 项目ID org-xxx格式。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * SSL证书的名字
     */
    @NotEmpty
    @UCloudParam("SSLName")
    private String sslName;
        
    
        
    /**
     * 所添加的SSL证书类型，目前只支持Pem格式
     */
    @UCloudParam("SSLType")
    private String sslType;
        
    
        
    /**
     * SSL证书的完整内容，私钥不可使用密码，包括加密证书的私钥、用户证书或CA证书等
     */
    @UCloudParam("SSLContent")
    private String sslContent;
        
    
        
    /**
     * 用户自签证书内容
     */
    @UCloudParam("UserCert")
    private String userCert;
        
    
        
    /**
     * 加密证书的私钥，不可使用密码保护，开启密码保护后，重启服务需要输入密码
     */
    @UCloudParam("PrivateKey")
    private String privateKey;
        
    
        
    /**
     * CA颁发证书内容
     */
    @UCloudParam("CACert")
    private String caCert;
        
    
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
    
    public String getCACert() {
        return caCert;
    }

    public void setCACert(String caCert) {
        this.caCert = caCert;
    }
    
}









