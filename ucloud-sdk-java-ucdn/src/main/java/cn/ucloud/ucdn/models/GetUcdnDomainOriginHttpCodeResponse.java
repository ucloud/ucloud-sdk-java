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

public class GetUcdnDomainOriginHttpCodeResponse extends Response {

    /** 状态码实例表。详细见HttpCodeInfo */
    @SerializedName("HttpCodeDetail")
    private List<HttpCodeInfo> httpCodeDetail;

    public List<HttpCodeInfo> getHttpCodeDetail() {
        return httpCodeDetail;
    }

    public void setHttpCodeDetail(List<HttpCodeInfo> httpCodeDetail) {
        this.httpCodeDetail = httpCodeDetail;
    }

    public static class HttpCodeInfo extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 1xx数量 */
        @SerializedName("HttpOneXX")
        private Integer httpOneXX;

        /** 2xx数量 */
        @SerializedName("HttpTwoXX")
        private Integer httpTwoXX;

        /** 3xx数量 */
        @SerializedName("HttpThreeXX")
        private Integer httpThreeXX;

        /** 4xx数量 */
        @SerializedName("HttpFourXX")
        private Integer httpFourXX;

        /** 5xx数量 */
        @SerializedName("HttpFiveXX")
        private Integer httpFiveXX;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getHttpOneXX() {
            return httpOneXX;
        }

        public void setHttpOneXX(Integer httpOneXX) {
            this.httpOneXX = httpOneXX;
        }

        public Integer getHttpTwoXX() {
            return httpTwoXX;
        }

        public void setHttpTwoXX(Integer httpTwoXX) {
            this.httpTwoXX = httpTwoXX;
        }

        public Integer getHttpThreeXX() {
            return httpThreeXX;
        }

        public void setHttpThreeXX(Integer httpThreeXX) {
            this.httpThreeXX = httpThreeXX;
        }

        public Integer getHttpFourXX() {
            return httpFourXX;
        }

        public void setHttpFourXX(Integer httpFourXX) {
            this.httpFourXX = httpFourXX;
        }

        public Integer getHttpFiveXX() {
            return httpFiveXX;
        }

        public void setHttpFiveXX(Integer httpFiveXX) {
            this.httpFiveXX = httpFiveXX;
        }
    }
}
