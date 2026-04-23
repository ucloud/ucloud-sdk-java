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

public class UpgradeUDBVersionRequest extends Request {

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

    /** db实例资源id */
    @NotEmpty
    @UCloudParam("DBId")
    private String dbId;

    /** db需要升级的小版本 */
    @NotEmpty
    @UCloudParam("DBSubVersion")
    private String dbSubVersion;

    /**
     * 切换类型，可选值为"immediately"和"customize"，分别代表立即切换和自定义切换时间，自定义切换时间需要填写SwitchStartTime和SwitchEndTime
     */
    @NotEmpty
    @UCloudParam("SwitchType")
    private String switchType;

    /** 该值为一个unix时间戳，代表开始切换实例的时间 */
    @UCloudParam("SwitchStartTime")
    private Integer switchStartTime;

    /** 该值为一个unix时间戳，代表开始预期切换实例结束的时间 */
    @UCloudParam("SwitchEndTime")
    private Integer switchEndTime;

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

    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }

    public String getDBSubVersion() {
        return dbSubVersion;
    }

    public void setDBSubVersion(String dbSubVersion) {
        this.dbSubVersion = dbSubVersion;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public Integer getSwitchStartTime() {
        return switchStartTime;
    }

    public void setSwitchStartTime(Integer switchStartTime) {
        this.switchStartTime = switchStartTime;
    }

    public Integer getSwitchEndTime() {
        return switchEndTime;
    }

    public void setSwitchEndTime(Integer switchEndTime) {
        this.switchEndTime = switchEndTime;
    }
}
