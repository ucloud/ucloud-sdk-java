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
package cn.ucloud.udb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUDBInstanceSlaveBackupSwitchRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 主库的Id */
    @NotEmpty
    @UCloudParam("MasterDBId")
    private String masterDBId;

    /** 从库的备份开关，范围[0,1],0表示从库备份功能关闭,1 表示从库备份开关打开。 */
    @NotEmpty
    @UCloudParam("BackupSwitch")
    private Integer backupSwitch;

    /** 从库的Id,如果从库备份开关设定为打开，则必须赋值。 */
    @UCloudParam("SlaveDBId")
    private String slaveDBId;

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

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public Integer getBackupSwitch() {
        return backupSwitch;
    }

    public void setBackupSwitch(Integer backupSwitch) {
        this.backupSwitch = backupSwitch;
    }

    public String getSlaveDBId() {
        return slaveDBId;
    }

    public void setSlaveDBId(String slaveDBId) {
        this.slaveDBId = slaveDBId;
    }
}
