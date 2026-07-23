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

public class GetClusterConfigResponse extends Response {

    /** 配置信息 */
    @SerializedName("KubeConfig")
    private String kubeConfig;

    /** 开启公网apiserver的情况下，有数据返回。 */
    @SerializedName("ExternalKubeConfig")
    private String externalKubeConfig;

    /** 用于标示 kubeconfig 是否可以进行替换更新 */
    @SerializedName("Updatable")
    private Boolean updatable;

    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public String getExternalKubeConfig() {
        return externalKubeConfig;
    }

    public void setExternalKubeConfig(String externalKubeConfig) {
        this.externalKubeConfig = externalKubeConfig;
    }

    public Boolean getUpdatable() {
        return updatable;
    }

    public void setUpdatable(Boolean updatable) {
        this.updatable = updatable;
    }
}
