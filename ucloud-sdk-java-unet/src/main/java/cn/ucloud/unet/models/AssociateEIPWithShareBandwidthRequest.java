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
package cn.ucloud.unet.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class AssociateEIPWithShareBandwidthRequest extends Request {

    /** 地域。: false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 : false */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要加入共享带宽的EIP的资源Id: false */
    @NotEmpty
    @UCloudParam("EIPIds")
    private List<String> eipIds;

    /** 共享带宽ID: false */
    @NotEmpty
    @UCloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    /** 共享带宽类型，IPv4或者IPv6，不传默认IPv4: false */
    @UCloudParam("IPVersion")
    private String ipVersion;

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

    public List<String> getEIPIds() {
        return eipIds;
    }

    public void setEIPIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public String getIPVersion() {
        return ipVersion;
    }

    public void setIPVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }
}
