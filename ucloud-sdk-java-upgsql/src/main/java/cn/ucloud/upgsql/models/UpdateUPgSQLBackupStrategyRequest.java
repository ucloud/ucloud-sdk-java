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
package cn.ucloud.upgsql.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUPgSQLBackupStrategyRequest extends Request {

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

    /** DB实例Id */
    @NotEmpty
    @UCloudParam("InstanceID")
    private String instanceID;

    /** 自动备份预计开始时间范围(00:00~23:59)，例如:(3:00~4:00) */
    @UCloudParam("BackupTimeRange")
    private String backupTimeRange;

    /** 自动备份预期星期几(1~7)开始。默认1,2,3,4,5,6,7(星期一到星期日) */
    @UCloudParam("BackupWeek")
    private String backupWeek;

    /** 选择默认的备份方式 */
    @UCloudParam("BackupMethod")
    private String backupMethod;

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

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getBackupTimeRange() {
        return backupTimeRange;
    }

    public void setBackupTimeRange(String backupTimeRange) {
        this.backupTimeRange = backupTimeRange;
    }

    public String getBackupWeek() {
        return backupWeek;
    }

    public void setBackupWeek(String backupWeek) {
        this.backupWeek = backupWeek;
    }

    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }
}
