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

package cn.ucloud.uhost.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class CreateUHostKeyPairResponse extends Response {

    
        
    /**
     * 密钥信息
     */
    @SerializedName("KeyPair")
    private KeyPair keyPair;
        
    
    public KeyPair getKeyPair() {
        return keyPair;
    }

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }
    
        public static class KeyPair extends Response {
            
        
    /**
     * 项目ID。
     */
    @SerializedName("ProjectId")
    private String projectId;
        
    
        
    /**
     * 密钥对ID。
     */
    @SerializedName("KeyPairId")
    private String keyPairId;
        
    
        
    /**
     * 密钥对名称。 长度为1~63个英文或中文字符。
     */
    @SerializedName("KeyPairName")
    private String keyPairName;
        
    
        
    /**
     * 密钥对指纹。md5(ProjectId|KeyPairId|PublicKey)
     */
    @SerializedName("KeyPairFingerPrint")
    private String keyPairFingerPrint;
        
    
        
    /**
     * 密钥对的私钥内容。只有创建接口才会返回。
     */
    @SerializedName("PrivateKeyBody")
    private String privateKeyBody;
        
    
        
    /**
     * 密钥对的创建时间，格式为Unix Timestamp。
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getKeyPairId() {
        return keyPairId;
    }

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }
    
    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }
    
    public String getKeyPairFingerPrint() {
        return keyPairFingerPrint;
    }

    public void setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
    }
    
    public String getPrivateKeyBody() {
        return privateKeyBody;
    }

    public void setPrivateKeyBody(String privateKeyBody) {
        this.privateKeyBody = privateKeyBody;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
        }
}









