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

package cn.ucloud.vpc.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeSnatDnatRuleResponse extends Response {

    
        
    /**
     * 规则信息
     */
    @SerializedName("DataSet")
    private List<SnatDnatRuleInfo> dataSet;
        
    
    public List<SnatDnatRuleInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SnatDnatRuleInfo> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class SnatDnatRuleInfo extends Response {
            
        
    /**
     * 内网IP地址
     */
    @SerializedName("PrivateIp")
    private String privateIp;
        
    
        
    /**
     * 映射所使用的NAT网关资源ID
     */
    @SerializedName("NATGWId")
    private String natgwId;
        
    
        
    /**
     * EIP的IP地址
     */
    @SerializedName("EIP")
    private String eip;
        
    
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
    
    public String getNATGWId() {
        return natgwId;
    }

    public void setNATGWId(String natgwId) {
        this.natgwId = natgwId;
    }
    
    public String getEIP() {
        return eip;
    }

    public void setEIP(String eip) {
        this.eip = eip;
    }
    
        }
}









