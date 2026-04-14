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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCompShareGpuInventoryResponse extends Response {

    /**
     * 返回为嵌套map：，key为池子名称 （Exclusive：独占，Spot ：抢占） value : 库存余量信息map {key 可用区ID，value：GPU卡余量map
     * （key：GPU机型，value：余量GPU卡数量），举例：{"Exclusive":{10027:{"2080":10}}}}
     */
    @SerializedName("GpuInventoryByZone")
    private Object gpuInventoryByZone;

    /** 缓存更新时间（5min更新一次） */
    @SerializedName("UpdateTime")
    private Integer updateTime;

    /** 不支持抢占的GPU机型 */
    @SerializedName("SpotUnsupportedGpuTypes")
    private List<String> spotUnsupportedGpuTypes;

    public Object getGpuInventoryByZone() {
        return gpuInventoryByZone;
    }

    public void setGpuInventoryByZone(Object gpuInventoryByZone) {
        this.gpuInventoryByZone = gpuInventoryByZone;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public List<String> getSpotUnsupportedGpuTypes() {
        return spotUnsupportedGpuTypes;
    }

    public void setSpotUnsupportedGpuTypes(List<String> spotUnsupportedGpuTypes) {
        this.spotUnsupportedGpuTypes = spotUnsupportedGpuTypes;
    }
}
