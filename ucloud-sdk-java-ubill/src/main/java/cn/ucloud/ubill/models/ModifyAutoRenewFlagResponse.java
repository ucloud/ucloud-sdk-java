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

package cn.ucloud.ubill.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ModifyAutoRenewFlagResponse extends Response {

    
        
    /**
     * 操作成功资源数量
     */
    @SerializedName("Success")
    private Integer success;
        
    
        
    /**
     * 操作失败资源数量
     */
    @SerializedName("Fail")
    private Integer fail;
        
    
        
    /**
     * 开关资源自动续费结果数组
     */
    @SerializedName("ResultSet")
    private List<ResultSet> resultSet;
        
    
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }
    
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }
    
    public List<ResultSet> getResultSet() {
        return resultSet;
    }

    public void setResultSet(List<ResultSet> resultSet) {
        this.resultSet = resultSet;
    }
    
        public static class ResultSet extends Response {
            
        
    /**
     * 续费结果(0:成功，失败返回错误码)
     */
    @SerializedName("RetCode")
    private Integer retCode;
        
    
        
    /**
     * 错误信息描述
     */
    @SerializedName("Message")
    private String message;
        
    
        
    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
        
    
    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
        }
}









