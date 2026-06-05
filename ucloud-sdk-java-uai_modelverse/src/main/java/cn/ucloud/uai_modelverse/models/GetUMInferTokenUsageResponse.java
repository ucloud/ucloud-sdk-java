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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUMInferTokenUsageResponse extends Response {

    /** token使用详情 */
    @SerializedName("Data")
    private TokenUsage data;

    public TokenUsage getData() {
        return data;
    }

    public void setData(TokenUsage data) {
        this.data = data;
    }

    public static class TokenUsage extends Response {

        /** 总token量 */
        @SerializedName("Total")
        private Integer total;

        /** 输出总token */
        @SerializedName("InTotal")
        private Integer inTotal;

        /** 输出总token */
        @SerializedName("OutTotal")
        private Integer outTotal;

        /** 生图总张数 */
        @SerializedName("ImageGenerationNum")
        private Integer imageGenerationNum;

        /** 请求总次数 */
        @SerializedName("RequestTotal")
        private Integer requestTotal;

        /** 每个时间戳的token使用量 */
        @SerializedName("Usages")
        private List<TokenUsageTimestamp> usages;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getInTotal() {
            return inTotal;
        }

        public void setInTotal(Integer inTotal) {
            this.inTotal = inTotal;
        }

        public Integer getOutTotal() {
            return outTotal;
        }

        public void setOutTotal(Integer outTotal) {
            this.outTotal = outTotal;
        }

        public Integer getImageGenerationNum() {
            return imageGenerationNum;
        }

        public void setImageGenerationNum(Integer imageGenerationNum) {
            this.imageGenerationNum = imageGenerationNum;
        }

        public Integer getRequestTotal() {
            return requestTotal;
        }

        public void setRequestTotal(Integer requestTotal) {
            this.requestTotal = requestTotal;
        }

        public List<TokenUsageTimestamp> getUsages() {
            return usages;
        }

        public void setUsages(List<TokenUsageTimestamp> usages) {
            this.usages = usages;
        }
    }

    public static class TokenUsageTimestamp extends Response {

        /** 类型，in输入 out输出 total总 request_count 请求次数 image_generation 生图张数 */
        @SerializedName("Type")
        private String type;

        /** 数量 */
        @SerializedName("Count")
        private Integer count;

        /** unix时间戳 */
        @SerializedName("Timestamp")
        private Integer timestamp;

        /** 模型名称 */
        @SerializedName("Model")
        private String model;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
