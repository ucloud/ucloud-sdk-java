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
package cn.ucloud.ucdn.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUcdnDomain95BandwidthV2Response extends Response {

    /** 查询时间期间的95带宽时间点 Unix时间戳 */
    @SerializedName("Time")
    private Integer time;

    /** 查询期间的CDN的95带宽值，单位Mbps */
    @SerializedName("CdnBandwidth")
    private Double cdnBandwidth;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getCdnBandwidth() {
        return cdnBandwidth;
    }

    public void setCdnBandwidth(Double cdnBandwidth) {
        this.cdnBandwidth = cdnBandwidth;
    }
}
