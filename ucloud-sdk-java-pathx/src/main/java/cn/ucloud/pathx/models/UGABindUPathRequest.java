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
package cn.ucloud.pathx.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UGABindUPathRequest extends Request {

    /** 项目ID。请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 加速配置实例ID，格式uga-xxxx */
    @NotEmpty
    @UCloudParam("UGAId")
    private String ugaId;

    /** 加速线路实例ID，格式upath-xxx */
    @NotEmpty
    @UCloudParam("UPathId")
    private String uPathId;

    /** 代金券 */
    @UCloudParam("CouponId")
    private String couponId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAId() {
        return ugaId;
    }

    public void setUGAId(String ugaId) {
        this.ugaId = ugaId;
    }

    public String getUPathId() {
        return uPathId;
    }

    public void setUPathId(String uPathId) {
        this.uPathId = uPathId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
