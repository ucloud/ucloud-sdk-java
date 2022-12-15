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

public class GetUcdnProIspRequestNumV2Response extends Response {

    /** 按省份的请求数实例表。具体参考下面RequestList */
    @SerializedName("RequestNumSet")
    private List<ProIspRequestNumSetV2> requestNumSet;

    public List<ProIspRequestNumSetV2> getRequestNumSet() {
        return requestNumSet;
    }

    public void setRequestNumSet(List<ProIspRequestNumSetV2> requestNumSet) {
        this.requestNumSet = requestNumSet;
    }

    public static class ProIspRequestListV2 extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 返回值返回指定时间区间内的请求数 */
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

    public static class ProIspRequestNumSetV2 extends Response {

        /** 省份代码 */
        @SerializedName("Province")
        private String province;

        /** 省份请求数实例表 ProIspRequestListV2 */
        @SerializedName("RequestList")
        private List<ProIspRequestListV2> requestList;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public List<ProIspRequestListV2> getRequestList() {
            return requestList;
        }

        public void setRequestList(List<ProIspRequestListV2> requestList) {
            this.requestList = requestList;
        }
    }
}
