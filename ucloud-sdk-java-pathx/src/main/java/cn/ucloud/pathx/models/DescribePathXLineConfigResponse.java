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

public class DescribePathXLineConfigResponse extends Response {

    /** UGAA线路列表,参考UGAALine字段定义 */
    @SerializedName("LineSet")
    private List<UGAALine> lineSet;

    public List<UGAALine> getLineSet() {
        return lineSet;
    }

    public void setLineSet(List<UGAALine> lineSet) {
        this.lineSet = lineSet;
    }

    public static class LineDetail extends Response {

        /** 线路源 */
        @SerializedName("LineFrom")
        private String lineFrom;

        /** 线路目的 */
        @SerializedName("LineTo")
        private String lineTo;

        /** 线路计费Id */
        @SerializedName("LineId")
        private String lineId;

        /** 线路源中文名称 */
        @SerializedName("LineFromName")
        private String lineFromName;

        /** 线路目的中文名称 */
        @SerializedName("LineToName")
        private String lineToName;

        public String getLineFrom() {
            return lineFrom;
        }

        public void setLineFrom(String lineFrom) {
            this.lineFrom = lineFrom;
        }

        public String getLineTo() {
            return lineTo;
        }

        public void setLineTo(String lineTo) {
            this.lineTo = lineTo;
        }

        public String getLineId() {
            return lineId;
        }

        public void setLineId(String lineId) {
            this.lineId = lineId;
        }

        public String getLineFromName() {
            return lineFromName;
        }

        public void setLineFromName(String lineFromName) {
            this.lineFromName = lineFromName;
        }

        public String getLineToName() {
            return lineToName;
        }

        public void setLineToName(String lineToName) {
            this.lineToName = lineToName;
        }
    }

    public static class UGAALine extends Response {

        /** 线路源 */
        @SerializedName("LineFrom")
        private String lineFrom;

        /** 线路目的 */
        @SerializedName("LineTo")
        private String lineTo;

        /** 线路源中文名称 */
        @SerializedName("LineFromName")
        private String lineFromName;

        /** 线路目的中文名称 */
        @SerializedName("LineToName")
        private String lineToName;

        /** 线路可售最大带宽 */
        @SerializedName("MaxBandwidth")
        private Integer maxBandwidth;

        /** 线路计费Id */
        @SerializedName("LineId")
        private String lineId;

        /** 子线路信息 */
        @SerializedName("LineDetail")
        private List<LineDetail> lineDetail;

        public String getLineFrom() {
            return lineFrom;
        }

        public void setLineFrom(String lineFrom) {
            this.lineFrom = lineFrom;
        }

        public String getLineTo() {
            return lineTo;
        }

        public void setLineTo(String lineTo) {
            this.lineTo = lineTo;
        }

        public String getLineFromName() {
            return lineFromName;
        }

        public void setLineFromName(String lineFromName) {
            this.lineFromName = lineFromName;
        }

        public String getLineToName() {
            return lineToName;
        }

        public void setLineToName(String lineToName) {
            this.lineToName = lineToName;
        }

        public Integer getMaxBandwidth() {
            return maxBandwidth;
        }

        public void setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
        }

        public String getLineId() {
            return lineId;
        }

        public void setLineId(String lineId) {
            this.lineId = lineId;
        }

        public List<LineDetail> getLineDetail() {
            return lineDetail;
        }

        public void setLineDetail(List<LineDetail> lineDetail) {
            this.lineDetail = lineDetail;
        }
    }
}
