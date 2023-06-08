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


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribePathXSSLResponse extends Response {

    
        
    /**
     * SSL证书详细信息，具体结构见 PathXSSLSet
     */
    @SerializedName("DataSet")
    private List<PathXSSLSet> dataSet;
        
    
        
    /**
     * 符合条件的证书总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<PathXSSLSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<PathXSSLSet> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class PathXSSLSet extends Response {
            
        
    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private String sslId;
        
    
        
    /**
     * SSL证书的名字
     */
    @SerializedName("SSLName")
    private String sslName;
        
    
        
    /**
     * 证书域名
     */
    @SerializedName("SubjectName")
    private String subjectName;
        
    
        
    /**
     * 证书过期时间 时间戳
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
        
    
        
    /**
     * 证书来源，0：用户上传 1: 免费颁发
     */
    @SerializedName("SourceType")
    private Integer sourceType;
        
    
        
    /**
     * SSL证书（用户证书、私钥、ca证书合并）内容md5值
     */
    @SerializedName("SSLMD5")
    private String sslmd5;
        
    
        
    /**
     * SSL证书的创建时间 时间戳
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * SSL证书绑定的对象
     */
    @SerializedName("SSLBindedTargetSet")
    private List<SSLBindedTargetSet> sslBindedTargetSet;
        
    
        
    /**
     * SSL证书内容
     */
    @SerializedName("SSLContent")
    private String sslContent;
        
    
    public String getSSLId() {
        return sslId;
    }

    public void setSSLId(String sslId) {
        this.sslId = sslId;
    }
    
    public String getSSLName() {
        return sslName;
    }

    public void setSSLName(String sslName) {
        this.sslName = sslName;
    }
    
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
    
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
    
    public String getSSLMD5() {
        return sslmd5;
    }

    public void setSSLMD5(String sslmd5) {
        this.sslmd5 = sslmd5;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public List<SSLBindedTargetSet> getSSLBindedTargetSet() {
        return sslBindedTargetSet;
    }

    public void setSSLBindedTargetSet(List<SSLBindedTargetSet> sslBindedTargetSet) {
        this.sslBindedTargetSet = sslBindedTargetSet;
    }
    
    public String getSSLContent() {
        return sslContent;
    }

    public void setSSLContent(String sslContent) {
        this.sslContent = sslContent;
    }
    
        }
        public static class SSLBindedTargetSet extends Response {
            
        
    /**
     * SSL证书绑定到的实例ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
        
    
        
    /**
     * SSL证书绑定到的实例名称
     */
    @SerializedName("ResourceName")
    private String resourceName;
        
    
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
        }
}









