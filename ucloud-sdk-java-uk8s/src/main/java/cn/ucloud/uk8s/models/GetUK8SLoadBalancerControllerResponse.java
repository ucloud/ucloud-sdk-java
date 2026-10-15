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
package cn.ucloud.uk8s.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUK8SLoadBalancerControllerResponse extends Response {

    /** 最新可用版本。 */
    @SerializedName("LastVersion")
    private String lastVersion;

    /** 当前安装版本。 */
    @SerializedName("Version")
    private String version;

    /** 是否安装 */
    @SerializedName("Installed")
    private Boolean installed;

    /** 安装时间，Unix 时间戳，单位秒。 */
    @SerializedName("CreateTime")
    private Integer createTime;

    /** 运行状态：unknown、running、notReady。 */
    @SerializedName("Status")
    private String status;

    public String getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
