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
package cn.ucloud.uhids.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUHostsecAgentDeploymentStatisticsResponse extends Response {

    /** 已安装台数 */
    @SerializedName("Installed")
    private Integer installed;

    /** 未安装台数 */
    @SerializedName("Uninstalled")
    private Integer uninstalled;

    public Integer getInstalled() {
        return installed;
    }

    public void setInstalled(Integer installed) {
        this.installed = installed;
    }

    public Integer getUninstalled() {
        return uninstalled;
    }

    public void setUninstalled(Integer uninstalled) {
        this.uninstalled = uninstalled;
    }
}
