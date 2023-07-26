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

package cn.ucloud.cube.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ListCubePodResponse extends Response {

    
        
    /**
     * 容器实例yaml列表，以base64编码
     */
    @SerializedName("Pods")
    private List<String> pods;
        
    
        
    /**
     * 容器实例总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<String> getPods() {
        return pods;
    }

    public void setPods(List<String> pods) {
        this.pods = pods;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
}









