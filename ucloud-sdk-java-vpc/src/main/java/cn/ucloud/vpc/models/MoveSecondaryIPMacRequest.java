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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class MoveSecondaryIPMacRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list): false
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** Secondary IP: false */
    @NotEmpty
    @UCloudParam("Ip")
    private String ip;

    /** 旧 Mac。Secondary IP 当前所绑定的 Mac: false */
    @NotEmpty
    @UCloudParam("OldMac")
    private String oldMac;

    /** 新 Mac。Secondary IP 迁移的目的 Mac: false */
    @NotEmpty
    @UCloudParam("NewMac")
    private String newMac;

    /** 子网 ID。IP/OldMac/NewMac 三者必须在同一子网: false */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOldMac() {
        return oldMac;
    }

    public void setOldMac(String oldMac) {
        this.oldMac = oldMac;
    }

    public String getNewMac() {
        return newMac;
    }

    public void setNewMac(String newMac) {
        this.newMac = newMac;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
}
