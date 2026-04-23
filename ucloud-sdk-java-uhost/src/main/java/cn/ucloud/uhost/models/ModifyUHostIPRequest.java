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
package cn.ucloud.uhost.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ModifyUHostIPRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写时为默认项目。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 需要修改为的 IP 地址。新的IP地址和旧IP地址必须属于统一子网，且和主机内部的配置文件一致。 */
    @NotEmpty
    @UCloudParam("PresentIpAddress")
    private String presentIpAddress;

    /** 指定云主机 ID。 */
    @NotEmpty
    @UCloudParam("UHostId")
    private String uHostId;

    /** 所需修改的原 IP 地址 ，当云主机只有一个IP地址时，此参数不必填写。 */
    @UCloudParam("PreviousIpAddress")
    private String previousIpAddress;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPresentIpAddress() {
        return presentIpAddress;
    }

    public void setPresentIpAddress(String presentIpAddress) {
        this.presentIpAddress = presentIpAddress;
    }

    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getPreviousIpAddress() {
        return previousIpAddress;
    }

    public void setPreviousIpAddress(String previousIpAddress) {
        this.previousIpAddress = previousIpAddress;
    }
}
