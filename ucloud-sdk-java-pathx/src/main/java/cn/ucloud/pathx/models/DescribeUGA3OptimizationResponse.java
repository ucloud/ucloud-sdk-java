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
import java.util.List;

public class DescribeUGA3OptimizationResponse extends Response {

    /** 加速详情 */
    @SerializedName("AccelerationInfos")
    private List<AccelerationInfo> accelerationInfos;

    public List<AccelerationInfo> getAccelerationInfos() {
        return accelerationInfos;
    }

    public void setAccelerationInfos(List<AccelerationInfo> accelerationInfos) {
        this.accelerationInfos = accelerationInfos;
    }

    public static class NodeDelays extends Response {

        /** 加速区域 */
        @SerializedName("Area")
        private String area;

        /** 加速区域Code */
        @SerializedName("AreaCode")
        private String areaCode;

        /** 国家代码 */
        @SerializedName("CountryCode")
        private String countryCode;

        /** 国旗Code */
        @SerializedName("FlagUnicode")
        private String flagUnicode;

        /** 国旗Emoji */
        @SerializedName("FlagEmoji")
        private String flagEmoji;

        /** 加速延迟 */
        @SerializedName("Latency")
        private Double latency;

        /** 公网延迟 */
        @SerializedName("LatencyInternet")
        private Double latencyInternet;

        /** 加速提升比例 */
        @SerializedName("LatencyOptimization")
        private Double latencyOptimization;

        /** 加速后丢包率 */
        @SerializedName("Loss")
        private Double loss;

        /** 原始丢包率 */
        @SerializedName("LossInternet")
        private Double lossInternet;

        /** 丢包下降比例 */
        @SerializedName("LossOptimization")
        private Double lossOptimization;

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getFlagUnicode() {
            return flagUnicode;
        }

        public void setFlagUnicode(String flagUnicode) {
            this.flagUnicode = flagUnicode;
        }

        public String getFlagEmoji() {
            return flagEmoji;
        }

        public void setFlagEmoji(String flagEmoji) {
            this.flagEmoji = flagEmoji;
        }

        public Double getLatency() {
            return latency;
        }

        public void setLatency(Double latency) {
            this.latency = latency;
        }

        public Double getLatencyInternet() {
            return latencyInternet;
        }

        public void setLatencyInternet(Double latencyInternet) {
            this.latencyInternet = latencyInternet;
        }

        public Double getLatencyOptimization() {
            return latencyOptimization;
        }

        public void setLatencyOptimization(Double latencyOptimization) {
            this.latencyOptimization = latencyOptimization;
        }

        public Double getLoss() {
            return loss;
        }

        public void setLoss(Double loss) {
            this.loss = loss;
        }

        public Double getLossInternet() {
            return lossInternet;
        }

        public void setLossInternet(Double lossInternet) {
            this.lossInternet = lossInternet;
        }

        public Double getLossOptimization() {
            return lossOptimization;
        }

        public void setLossOptimization(Double lossOptimization) {
            this.lossOptimization = lossOptimization;
        }
    }

    public static class AccelerationInfo extends Response {

        /** 加速大区代码 */
        @SerializedName("AccelerationArea")
        private String accelerationArea;

        /** 加速大区名称 */
        @SerializedName("AccelerationName")
        private String accelerationName;

        /** 加速提升情况 */
        @SerializedName("NodeInfo")
        private List<NodeDelays> nodeInfo;

        public String getAccelerationArea() {
            return accelerationArea;
        }

        public void setAccelerationArea(String accelerationArea) {
            this.accelerationArea = accelerationArea;
        }

        public String getAccelerationName() {
            return accelerationName;
        }

        public void setAccelerationName(String accelerationName) {
            this.accelerationName = accelerationName;
        }

        public List<NodeDelays> getNodeInfo() {
            return nodeInfo;
        }

        public void setNodeInfo(List<NodeDelays> nodeInfo) {
            this.nodeInfo = nodeInfo;
        }
    }
}
