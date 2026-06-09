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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CheckUHostResourceCapacityResponse extends Response {

    /** 资源是否充足 */
    @SerializedName("ResourceEnough")
    private Boolean resourceEnough;

    /** 随机的资源对应的RdmaClusterId数组，若资源不足则为空，只有快杰系列机型，以及A800才可能有此字段 */
    @SerializedName("RdmaClusterIds")
    private List<String> rdmaClusterIds;

    public Boolean getResourceEnough() {
        return resourceEnough;
    }

    public void setResourceEnough(Boolean resourceEnough) {
        this.resourceEnough = resourceEnough;
    }

    public List<String> getRdmaClusterIds() {
        return rdmaClusterIds;
    }

    public void setRdmaClusterIds(List<String> rdmaClusterIds) {
        this.rdmaClusterIds = rdmaClusterIds;
    }
}
