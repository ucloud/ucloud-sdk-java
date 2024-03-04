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
package cn.ucloud.umongodb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ModifyUMongoDBBackupParamRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 自动备份预期星期几(1～7),默认 3,7 (周三，周日) */
    @UCloudParam("AutoBackupToggleWeek")
    private String autoBackupToggleWeek;

    /** 自动备份预期开始时间范围(00:00~23:59),默认 5:00~6:00 */
    @UCloudParam("AutoBackupToggleTime")
    private String autoBackupToggleTime;

    /** 是否禁用,true:禁用;false:开启 */
    @UCloudParam("Disabled")
    private Boolean disabled;

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

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getAutoBackupToggleWeek() {
        return autoBackupToggleWeek;
    }

    public void setAutoBackupToggleWeek(String autoBackupToggleWeek) {
        this.autoBackupToggleWeek = autoBackupToggleWeek;
    }

    public String getAutoBackupToggleTime() {
        return autoBackupToggleTime;
    }

    public void setAutoBackupToggleTime(String autoBackupToggleTime) {
        this.autoBackupToggleTime = autoBackupToggleTime;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}
