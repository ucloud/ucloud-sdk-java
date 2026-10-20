/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udns.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUDNSZoneForwardResponse extends Response {

    /** 转发目标VPC所属VPC */
    @SerializedName("VPCProjectId")
    private String vpcProjectId;

    /** 转发目标VPC所属地域 */
    @SerializedName("VPCRegion")
    private String vpcRegion;

    /** 转发目标VPC的ID */
    @SerializedName("VPCId")
    private String vpcId;

    /** 转发目标DNS 服务器地址 */
    @SerializedName("Servers")
    private List<String> servers;

    public String getVPCProjectId() {
        return vpcProjectId;
    }

    public void setVPCProjectId(String vpcProjectId) {
        this.vpcProjectId = vpcProjectId;
    }

    public String getVPCRegion() {
        return vpcRegion;
    }

    public void setVPCRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}
