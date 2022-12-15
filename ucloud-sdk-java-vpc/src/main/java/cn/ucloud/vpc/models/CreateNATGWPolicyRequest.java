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


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateNATGWPolicyRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目Id。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * NAT网关Id
     */
    @NotEmpty
    @UCloudParam("NATGWId")
    private String natgwId;
        
    
        
    /**
     * 协议类型。枚举值为：TCP、UDP
     */
    @NotEmpty
    @UCloudParam("Protocol")
    private String protocol;
        
    
        
    /**
     * 源IP。填写对应的EIP Id
     */
    @NotEmpty
    @UCloudParam("SrcEIPId")
    private String srcEIPId;
        
    
        
    /**
     * 源端口。可填写固定端口，也可填写端口范围。支持的端口范围为1-65535
     */
    @NotEmpty
    @UCloudParam("SrcPort")
    private String srcPort;
        
    
        
    /**
     * 目标IP。填写对应的目标IP地址
     */
    @NotEmpty
    @UCloudParam("DstIP")
    private String dstIP;
        
    
        
    /**
     * 目标端口。可填写固定端口，也可填写端口范围。支持的端口范围为1-65535
     */
    @NotEmpty
    @UCloudParam("DstPort")
    private String dstPort;
        
    
        
    /**
     * 转发策略名称。默认为空
     */
    @UCloudParam("PolicyName")
    private String policyName;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getNATGWId() {
        return natgwId;
    }

    public void setNATGWId(String natgwId) {
        this.natgwId = natgwId;
    }
    
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    public String getSrcEIPId() {
        return srcEIPId;
    }

    public void setSrcEIPId(String srcEIPId) {
        this.srcEIPId = srcEIPId;
    }
    
    public String getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(String srcPort) {
        this.srcPort = srcPort;
    }
    
    public String getDstIP() {
        return dstIP;
    }

    public void setDstIP(String dstIP) {
        this.dstIP = dstIP;
    }
    
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }
    
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
}









