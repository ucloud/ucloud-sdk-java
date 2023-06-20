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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeBandwidthUsageResponse extends Response {

    /** EIPSet中的元素个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 单个弹性IP的带宽用量详细信息, 详见 UnetBandwidthUsageEIPSet, 如没有弹性IP资源则没有该返回值。 */
    @SerializedName("EIPSet")
    private List<UnetBandwidthUsageEIPSet> eipSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UnetBandwidthUsageEIPSet> getEIPSet() {
        return eipSet;
    }

    public void setEIPSet(List<UnetBandwidthUsageEIPSet> eipSet) {
        this.eipSet = eipSet;
    }

    public static class UnetBandwidthUsageEIPSet extends Response {

        /** 最近5分钟带宽用量, 单位Mbps */
        @SerializedName("CurBandwidth")
        private Double curBandwidth;

        /** 弹性IP资源ID */
        @SerializedName("EIPId")
        private String eipId;

        public Double getCurBandwidth() {
            return curBandwidth;
        }

        public void setCurBandwidth(Double curBandwidth) {
            this.curBandwidth = curBandwidth;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }
    }
}
