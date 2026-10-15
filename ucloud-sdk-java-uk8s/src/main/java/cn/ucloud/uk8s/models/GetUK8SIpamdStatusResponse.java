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

public class GetUK8SIpamdStatusResponse extends Response {

    /** 是否已经安装 */
    @SerializedName("Installed")
    private Boolean installed;

    /** 当前ipamd的版本 */
    @SerializedName("Version")
    private String version;

    /** ipamd可用最新版本 */
    @SerializedName("LastVersion")
    private String lastVersion;

    /** 最新版本的发布日期 */
    @SerializedName("ReleaseDate")
    private Integer releaseDate;

    /** 当前 ipamd 插件的创建时间，Unix 时间戳，单位秒。 */
    @SerializedName("OpenTime")
    private Integer openTime;

    /** 当前 CNI 初始化模式。 */
    @SerializedName("CNIInitMode")
    private String cniInitMode;

    /** 当前已安装的 ipamd 版本是否支持切换 CNI 初始化模式。 */
    @SerializedName("CNIInitVersionReady")
    private Boolean cniInitVersionReady;

    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public String getCNIInitMode() {
        return cniInitMode;
    }

    public void setCNIInitMode(String cniInitMode) {
        this.cniInitMode = cniInitMode;
    }

    public Boolean getCNIInitVersionReady() {
        return cniInitVersionReady;
    }

    public void setCNIInitVersionReady(Boolean cniInitVersionReady) {
        this.cniInitVersionReady = cniInitVersionReady;
    }
}
