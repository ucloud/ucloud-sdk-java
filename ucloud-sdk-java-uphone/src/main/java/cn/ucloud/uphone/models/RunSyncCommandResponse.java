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

public class RunSyncCommandResponse extends Response {

    
        
    /**
     * 云主机实例列表，每项参数可见数据模型 [UPhoneCommandResult](#UPhoneCommandResult)
     */
    @SerializedName("Results")
    private List<UPhoneCommandResult> results;
        
    
    public List<UPhoneCommandResult> getResults() {
        return results;
    }

    public void setResults(List<UPhoneCommandResult> results) {
        this.results = results;
    }
    
        public static class UPhoneCommandResult extends Response {
            
        
    /**
     * 云手机实例的资源ID。
     */
    @SerializedName("UPhoneId")
    private String uPhoneId;
        
    
        
    /**
     * 同步shell命令的执行结果。
     */
    @SerializedName("ExecuteMsg")
    private String executeMsg;
        
    
    public String getUPhoneId() {
        return uPhoneId;
    }

    public void setUPhoneId(String uPhoneId) {
        this.uPhoneId = uPhoneId;
    }
    
    public String getExecuteMsg() {
        return executeMsg;
    }

    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }
    
        }
}









