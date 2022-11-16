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

package cn.ucloud.uphone.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUPhoneAllowanceResponse extends Response {

    
        
    /**
     * 手机型号以及可创建数量
     */
    @SerializedName("UPhoneAllowance")
    private List<UPhoneAllowance> uPhoneAllowance;
        
    
    public List<UPhoneAllowance> getUPhoneAllowance() {
        return uPhoneAllowance;
    }

    public void setUPhoneAllowance(List<UPhoneAllowance> uPhoneAllowance) {
        this.uPhoneAllowance = uPhoneAllowance;
    }
    
        public static class UPhoneAllowance extends Response {
            
        
    /**
     * 枚举值，云手机型号名称，取值：UPhone X，UPhone Plus，UPhone Pro
     */
    @SerializedName("ModelName")
    private String modelName;
        
    
        
    /**
     * 可创建云手机个数
     */
    @SerializedName("Allowance")
    private Integer allowance;
        
    
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public Integer getAllowance() {
        return allowance;
    }

    public void setAllowance(Integer allowance) {
        this.allowance = allowance;
    }
    
        }
}









