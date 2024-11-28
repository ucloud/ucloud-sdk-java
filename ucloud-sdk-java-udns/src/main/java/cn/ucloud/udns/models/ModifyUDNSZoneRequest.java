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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ModifyUDNSZoneRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 域名资源ID */
    @NotEmpty
    @UCloudParam("DNSZoneId")
    private String dnsZoneId;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    /** 是否支持迭代。枚举值,"enable",支持迭代; "disable",不支持迭代 */
    @UCloudParam("IsRecursionEnabled")
    private String isRecursionEnabled;

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

    public String getDNSZoneId() {
        return dnsZoneId;
    }

    public void setDNSZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsRecursionEnabled() {
        return isRecursionEnabled;
    }

    public void setIsRecursionEnabled(String isRecursionEnabled) {
        this.isRecursionEnabled = isRecursionEnabled;
    }
}