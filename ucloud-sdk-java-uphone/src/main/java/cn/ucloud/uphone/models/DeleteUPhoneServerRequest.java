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
package cn.ucloud.uphone.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DeleteUPhoneServerRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 云手机服务器的实例ID 可通过 [DescribeUPhoneServer]()获取 */
    @NotEmpty
    @UCloudParam("ServerId")
    private String serverId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /** 删除云手机服务器时是否释放绑定的EIP。默认为false。 */
    @UCloudParam("ReleaseEIP")
    private Boolean releaseEIP;

    /** 删除云手机服务器时是否同时删除挂载的数据盘。默认为false。 */
    @UCloudParam("ReleaseUDisk")
    private Boolean releaseUDisk;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Boolean getReleaseEIP() {
        return releaseEIP;
    }

    public void setReleaseEIP(Boolean releaseEIP) {
        this.releaseEIP = releaseEIP;
    }

    public Boolean getReleaseUDisk() {
        return releaseUDisk;
    }

    public void setReleaseUDisk(Boolean releaseUDisk) {
        this.releaseUDisk = releaseUDisk;
    }
}
