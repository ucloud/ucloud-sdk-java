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

package cn.ucloud.ufile.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeBucketResponse extends Response {

    
        
    /**
     * Bucket的描述信息 参数见 UFileBucketSet
     */
    @SerializedName("DataSet")
    private List<UFileBucketSet> dataSet;
        
    
    public List<UFileBucketSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileBucketSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class UFileBucketSet extends Response {
            
        
    /**
     * Bucket所属地域
     */
    @SerializedName("Region")
    private String region;
        
    
        
    /**
     * Bucket名称
     */
    @SerializedName("BucketName")
    private String bucketName;
        
    
        
    /**
     * Bucket的ID
     */
    @SerializedName("BucketId")
    private String bucketId;
        
    
        
    /**
     * Bucket的域名集合 参数见 UFileDomainSet
     */
    @SerializedName("Domain")
    private UFileDomainSet domain;
        
    
        
    /**
     * 与Bucket关联的CND加速域名的ID列表
     */
    @SerializedName("CdnDomainId")
    private List<String> cdnDomainId;
        
    
        
    /**
     * Bucket访问类型
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * Bucket的创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * Bucket的修改时间
     */
    @SerializedName("ModifyTime")
    private Integer modifyTime;
        
    
        
    /**
     * Bucket所属业务, general或vod或udb general: 普通业务； vod: 视频云业务; udb: 云数据库业务
     */
    @SerializedName("Biz")
    private String biz;
        
    
        
    /**
     * 所属业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 是否存在自定义域名。0不存在，1存在，2错误
     */
    @SerializedName("HasUserDomain")
    private Integer hasUserDomain;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }
    
    public UFileDomainSet getDomain() {
        return domain;
    }

    public void setDomain(UFileDomainSet domain) {
        this.domain = domain;
    }
    
    public List<String> getCdnDomainId() {
        return cdnDomainId;
    }

    public void setCdnDomainId(List<String> cdnDomainId) {
        this.cdnDomainId = cdnDomainId;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public Integer getHasUserDomain() {
        return hasUserDomain;
    }

    public void setHasUserDomain(Integer hasUserDomain) {
        this.hasUserDomain = hasUserDomain;
    }
    
        }
        public static class UFileDomainSet extends Response {
            
        
    /**
     * 源站域名
     */
    @SerializedName("Src")
    private List<String> src;
        
    
        
    /**
     * UCDN加速域名
     */
    @SerializedName("Cdn")
    private List<String> cdn;
        
    
        
    /**
     * 用户自定义源站域名
     */
    @SerializedName("CustomSrc")
    private List<String> customSrc;
        
    
        
    /**
     * 用户自定义CDN加速域名
     */
    @SerializedName("CustomCdn")
    private List<String> customCdn;
        
    
    public List<String> getSrc() {
        return src;
    }

    public void setSrc(List<String> src) {
        this.src = src;
    }
    
    public List<String> getCdn() {
        return cdn;
    }

    public void setCdn(List<String> cdn) {
        this.cdn = cdn;
    }
    
    public List<String> getCustomSrc() {
        return customSrc;
    }

    public void setCustomSrc(List<String> customSrc) {
        this.customSrc = customSrc;
    }
    
    public List<String> getCustomCdn() {
        return customCdn;
    }

    public void setCustomCdn(List<String> customCdn) {
        this.customCdn = customCdn;
    }
    
        }
}









