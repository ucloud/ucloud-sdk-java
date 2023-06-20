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

public class DeleteVPCIntercomRequest extends Request {

    /** 源VPC所在地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 源VPC所在项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 源VPC短ID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 目的VPC短ID */
    @NotEmpty
    @UCloudParam("DstVPCId")
    private String dstVPCId;

    /** 目的VPC所在地域，默认为源VPC所在地域 */
    @UCloudParam("DstRegion")
    private String dstRegion;

    /** 目的VPC所在项目ID，默认为源VPC所在项目ID */
    @UCloudParam("DstProjectId")
    private String dstProjectId;

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

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getDstVPCId() {
        return dstVPCId;
    }

    public void setDstVPCId(String dstVPCId) {
        this.dstVPCId = dstVPCId;
    }

    public String getDstRegion() {
        return dstRegion;
    }

    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    public String getDstProjectId() {
        return dstProjectId;
    }

    public void setDstProjectId(String dstProjectId) {
        this.dstProjectId = dstProjectId;
    }
}
