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
import java.util.List;

public class GetUcdnDomainHitRateResponse extends Response {

    /** 请求数实例表。 */
    @SerializedName("HitRateList")
    private List<HitRateInfoV2> hitRateList;

    public List<HitRateInfoV2> getHitRateList() {
        return hitRateList;
    }

    public void setHitRateList(List<HitRateInfoV2> hitRateList) {
        this.hitRateList = hitRateList;
    }

    public static class HitRateInfoV2 extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 总流量命中率，单位% */
        @SerializedName("FlowHitRate")
        private Double flowHitRate;

        /** 请求数命中率，单位% */
        @SerializedName("RequestHitRate")
        private Double requestHitRate;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Double getFlowHitRate() {
            return flowHitRate;
        }

        public void setFlowHitRate(Double flowHitRate) {
            this.flowHitRate = flowHitRate;
        }

        public Double getRequestHitRate() {
            return requestHitRate;
        }

        public void setRequestHitRate(Double requestHitRate) {
            this.requestHitRate = requestHitRate;
        }
    }
}
