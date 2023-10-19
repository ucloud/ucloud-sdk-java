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

package cn.ucloud.uai_modelverse.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class RunMVChatResponse extends Response {

    
        
    /**
     * 状态码描述
     */
    @SerializedName("Msg")
    private String msg;
        
    
        
    /**
     * 消息唯一标识
     */
    @SerializedName("ID")
    private Integer id;
        
    
        
    /**
     * 会话id
     */
    @SerializedName("SessionID")
    private Integer sessionID;
        
    
        
    /**
     * 回复内容
     */
    @SerializedName("Response")
    private String response;
        
    
        
    /**
     * 时间
     */
    @SerializedName("Time")
    private Integer time;
        
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }
    
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    
}









