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

public class DescribeUHostTagsResponse extends Response {

    
        
    /**
     * 已有主机的业务组总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 业务组集合见 UHostTagSet
     */
    @SerializedName("TagSet")
    private List<UHostTagSet> tagSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<UHostTagSet> getTagSet() {
        return tagSet;
    }

    public void setTagSet(List<UHostTagSet> tagSet) {
        this.tagSet = tagSet;
    }
    
        public static class UHostTagSet extends Response {
            
        
    /**
     * 业务组名称
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 该业务组中包含的主机个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
        }
}









