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


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class CreateGlobalSSHInstanceResponse extends Response {

    /** 实例ID，资源唯一标识 */
    @SerializedName("InstanceId")
    private String instanceId;

    /** 加速域名，访问该域名可就近接入 */
    @SerializedName("AcceleratingDomain")
    private String acceleratingDomain;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAcceleratingDomain() {
        return acceleratingDomain;
    }

    public void setAcceleratingDomain(String acceleratingDomain) {
        this.acceleratingDomain = acceleratingDomain;
    }
}
