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

public class CopySecGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 源安全组ID */
    @NotEmpty
    @UCloudParam("SecGroupId")
    private String secGroupId;

    /** 目的地域 */
    @NotEmpty
    @UCloudParam("DstRegion")
    private String dstRegion;

    /** 目的项目ID */
    @NotEmpty
    @UCloudParam("DstProjectId")
    private String dstProjectId;

    /** 目的VPC ID */
    @NotEmpty
    @UCloudParam("DstVPCId")
    private String dstVPCId;

    /** 目的安全组名称，最长64个字符 */
    @UCloudParam("DstName")
    private String dstName;

    /** 目的安全组备注 */
    @UCloudParam("DstRemark")
    private String dstRemark;

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

    public String getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(String secGroupId) {
        this.secGroupId = secGroupId;
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

    public String getDstVPCId() {
        return dstVPCId;
    }

    public void setDstVPCId(String dstVPCId) {
        this.dstVPCId = dstVPCId;
    }

    public String getDstName() {
        return dstName;
    }

    public void setDstName(String dstName) {
        this.dstName = dstName;
    }

    public String getDstRemark() {
        return dstRemark;
    }

    public void setDstRemark(String dstRemark) {
        this.dstRemark = dstRemark;
    }
}
