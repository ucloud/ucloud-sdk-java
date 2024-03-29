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
package cn.ucloud.ulb.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class AllocateBackendResponse extends Response {

    /**
     * 所添加的后端资源在CLB中的对象ID，（为CLB系统中使用，与资源自身ID无关），可用于
     * UpdateBackendAttribute/UpdateBackendAttributeBatch/ReleaseBackend
     */
    @SerializedName("BackendId")
    private String backendId;

    public String getBackendId() {
        return backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }
}
