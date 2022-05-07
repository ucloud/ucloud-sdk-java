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

public class GetUcdnDomainOriginRequestNumResponse extends Response {

    /** 请求数实例表。 */
    @SerializedName("RequestList")
    private List<RequestInfoV2> requestList;

    public List<RequestInfoV2> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<RequestInfoV2> requestList) {
        this.requestList = requestList;
    }

    public static class RequestInfoV2 extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 返回值返回指定时间区间内的cdn收到的请求次数之和 */
        @SerializedName("CdnRequest")
        private Double cdnRequest;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Double getCdnRequest() {
            return cdnRequest;
        }

        public void setCdnRequest(Double cdnRequest) {
            this.cdnRequest = cdnRequest;
        }
    }
}
