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

public class GetUcdnDomainHttpCodeV2Response extends Response {

    /** 状态码实例表。详细见HttpCodeInfoV2 */
    @SerializedName("HttpCodeDetail")
    private List<HttpCodeInfoV2> httpCodeDetail;

    public List<HttpCodeInfoV2> getHttpCodeDetail() {
        return httpCodeDetail;
    }

    public void setHttpCodeDetail(List<HttpCodeInfoV2> httpCodeDetail) {
        this.httpCodeDetail = httpCodeDetail;
    }

    public static class HttpCodeV2Detail extends Response {

        /** 时间 */
        @SerializedName("Time")
        private Integer time;

        /** 当前分组的总状态码数 */
        @SerializedName("Total")
        private Integer total;

        /** http100数量 */
        @SerializedName("Http100")
        private Integer http100;

        /** http101数量 */
        @SerializedName("Http101")
        private Integer http101;

        /** http102数量 */
        @SerializedName("Http102")
        private Integer http102;

        /** http200数量 */
        @SerializedName("Http200")
        private Integer http200;

        /** http201数量 */
        @SerializedName("Http201")
        private Integer http201;

        /** http202数量 */
        @SerializedName("Http202")
        private Integer http202;

        /** http203数量 */
        @SerializedName("Http203")
        private Integer http203;

        /** http204数量 */
        @SerializedName("Http204")
        private Integer http204;

        /** http205数量 */
        @SerializedName("Http205")
        private Integer http205;

        /** http206数量 */
        @SerializedName("Http206")
        private Integer http206;

        /** http207数量 */
        @SerializedName("Http207")
        private Integer http207;

        /** http300数量 */
        @SerializedName("Http300")
        private Integer http300;

        /** http301数量 */
        @SerializedName("Http301")
        private Integer http301;

        /** http302数量 */
        @SerializedName("Http302")
        private Integer http302;

        /** http303数量 */
        @SerializedName("Http303")
        private Integer http303;

        /** http304数量 */
        @SerializedName("Http304")
        private Integer http304;

        /** http305数量 */
        @SerializedName("Http305")
        private Integer http305;

        /** http306数量 */
        @SerializedName("Http306")
        private Integer http306;

        /** http307数量 */
        @SerializedName("Http307")
        private Integer http307;

        /** http400数量 */
        @SerializedName("Http400")
        private Integer http400;

        /** http401数量 */
        @SerializedName("Http401")
        private Integer http401;

        /** http402数量 */
        @SerializedName("Http402")
        private Integer http402;

        /** http403数量 */
        @SerializedName("Http403")
        private Integer http403;

        /** http404数量 */
        @SerializedName("Http404")
        private Integer http404;

        /** http405数量 */
        @SerializedName("Http405")
        private Integer http405;

        /** http406数量 */
        @SerializedName("Http406")
        private Integer http406;

        /** http407数量 */
        @SerializedName("Http407")
        private Integer http407;

        /** http408数量 */
        @SerializedName("Http408")
        private Integer http408;

        /** http409数量 */
        @SerializedName("Http409")
        private Integer http409;

        /** http410数量 */
        @SerializedName("Http410")
        private Integer http410;

        /** http411数量 */
        @SerializedName("Http411")
        private Integer http411;

        /** http412数量 */
        @SerializedName("Http412")
        private Integer http412;

        /** http413数量 */
        @SerializedName("Http413")
        private Integer http413;

        /** http414数量 */
        @SerializedName("Http414")
        private Integer http414;

        /** http415数量 */
        @SerializedName("Http415")
        private Integer http415;

        /** http416数量 */
        @SerializedName("Http416")
        private Integer http416;

        /** http417数量 */
        @SerializedName("Http417")
        private Integer http417;

        /** http418数量 */
        @SerializedName("Http418")
        private Integer http418;

        /** http421数量 */
        @SerializedName("Http421")
        private Integer http421;

        /** http422数量 */
        @SerializedName("Http422")
        private Integer http422;

        /** http423数量 */
        @SerializedName("Http423")
        private Integer http423;

        /** http424数量 */
        @SerializedName("Http424")
        private Integer http424;

        /** http425数量 */
        @SerializedName("Http425")
        private Integer http425;

        /** http426数量 */
        @SerializedName("Http426")
        private Integer http426;

        /** http449数量 */
        @SerializedName("Http449")
        private Integer http449;

        /** http451数量 */
        @SerializedName("Http451")
        private Integer http451;

        /** http500数量 */
        @SerializedName("Http500")
        private Integer http500;

        /** http501数量 */
        @SerializedName("Http501")
        private Integer http501;

        /** http502数量 */
        @SerializedName("Http502")
        private Integer http502;

        /** http503数量 */
        @SerializedName("Http503")
        private Integer http503;

        /** http504数量 */
        @SerializedName("Http504")
        private Integer http504;

        /** http505数量 */
        @SerializedName("Http505")
        private Integer http505;

        /** http506数量 */
        @SerializedName("Http506")
        private Integer http506;

        /** http507数量 */
        @SerializedName("Http507")
        private Integer http507;

        /** http509数量 */
        @SerializedName("Http509")
        private Integer http509;

        /** http510数量 */
        @SerializedName("Http510")
        private Integer http510;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getHttp100() {
            return http100;
        }

        public void setHttp100(Integer http100) {
            this.http100 = http100;
        }

        public Integer getHttp101() {
            return http101;
        }

        public void setHttp101(Integer http101) {
            this.http101 = http101;
        }

        public Integer getHttp102() {
            return http102;
        }

        public void setHttp102(Integer http102) {
            this.http102 = http102;
        }

        public Integer getHttp200() {
            return http200;
        }

        public void setHttp200(Integer http200) {
            this.http200 = http200;
        }

        public Integer getHttp201() {
            return http201;
        }

        public void setHttp201(Integer http201) {
            this.http201 = http201;
        }

        public Integer getHttp202() {
            return http202;
        }

        public void setHttp202(Integer http202) {
            this.http202 = http202;
        }

        public Integer getHttp203() {
            return http203;
        }

        public void setHttp203(Integer http203) {
            this.http203 = http203;
        }

        public Integer getHttp204() {
            return http204;
        }

        public void setHttp204(Integer http204) {
            this.http204 = http204;
        }

        public Integer getHttp205() {
            return http205;
        }

        public void setHttp205(Integer http205) {
            this.http205 = http205;
        }

        public Integer getHttp206() {
            return http206;
        }

        public void setHttp206(Integer http206) {
            this.http206 = http206;
        }

        public Integer getHttp207() {
            return http207;
        }

        public void setHttp207(Integer http207) {
            this.http207 = http207;
        }

        public Integer getHttp300() {
            return http300;
        }

        public void setHttp300(Integer http300) {
            this.http300 = http300;
        }

        public Integer getHttp301() {
            return http301;
        }

        public void setHttp301(Integer http301) {
            this.http301 = http301;
        }

        public Integer getHttp302() {
            return http302;
        }

        public void setHttp302(Integer http302) {
            this.http302 = http302;
        }

        public Integer getHttp303() {
            return http303;
        }

        public void setHttp303(Integer http303) {
            this.http303 = http303;
        }

        public Integer getHttp304() {
            return http304;
        }

        public void setHttp304(Integer http304) {
            this.http304 = http304;
        }

        public Integer getHttp305() {
            return http305;
        }

        public void setHttp305(Integer http305) {
            this.http305 = http305;
        }

        public Integer getHttp306() {
            return http306;
        }

        public void setHttp306(Integer http306) {
            this.http306 = http306;
        }

        public Integer getHttp307() {
            return http307;
        }

        public void setHttp307(Integer http307) {
            this.http307 = http307;
        }

        public Integer getHttp400() {
            return http400;
        }

        public void setHttp400(Integer http400) {
            this.http400 = http400;
        }

        public Integer getHttp401() {
            return http401;
        }

        public void setHttp401(Integer http401) {
            this.http401 = http401;
        }

        public Integer getHttp402() {
            return http402;
        }

        public void setHttp402(Integer http402) {
            this.http402 = http402;
        }

        public Integer getHttp403() {
            return http403;
        }

        public void setHttp403(Integer http403) {
            this.http403 = http403;
        }

        public Integer getHttp404() {
            return http404;
        }

        public void setHttp404(Integer http404) {
            this.http404 = http404;
        }

        public Integer getHttp405() {
            return http405;
        }

        public void setHttp405(Integer http405) {
            this.http405 = http405;
        }

        public Integer getHttp406() {
            return http406;
        }

        public void setHttp406(Integer http406) {
            this.http406 = http406;
        }

        public Integer getHttp407() {
            return http407;
        }

        public void setHttp407(Integer http407) {
            this.http407 = http407;
        }

        public Integer getHttp408() {
            return http408;
        }

        public void setHttp408(Integer http408) {
            this.http408 = http408;
        }

        public Integer getHttp409() {
            return http409;
        }

        public void setHttp409(Integer http409) {
            this.http409 = http409;
        }

        public Integer getHttp410() {
            return http410;
        }

        public void setHttp410(Integer http410) {
            this.http410 = http410;
        }

        public Integer getHttp411() {
            return http411;
        }

        public void setHttp411(Integer http411) {
            this.http411 = http411;
        }

        public Integer getHttp412() {
            return http412;
        }

        public void setHttp412(Integer http412) {
            this.http412 = http412;
        }

        public Integer getHttp413() {
            return http413;
        }

        public void setHttp413(Integer http413) {
            this.http413 = http413;
        }

        public Integer getHttp414() {
            return http414;
        }

        public void setHttp414(Integer http414) {
            this.http414 = http414;
        }

        public Integer getHttp415() {
            return http415;
        }

        public void setHttp415(Integer http415) {
            this.http415 = http415;
        }

        public Integer getHttp416() {
            return http416;
        }

        public void setHttp416(Integer http416) {
            this.http416 = http416;
        }

        public Integer getHttp417() {
            return http417;
        }

        public void setHttp417(Integer http417) {
            this.http417 = http417;
        }

        public Integer getHttp418() {
            return http418;
        }

        public void setHttp418(Integer http418) {
            this.http418 = http418;
        }

        public Integer getHttp421() {
            return http421;
        }

        public void setHttp421(Integer http421) {
            this.http421 = http421;
        }

        public Integer getHttp422() {
            return http422;
        }

        public void setHttp422(Integer http422) {
            this.http422 = http422;
        }

        public Integer getHttp423() {
            return http423;
        }

        public void setHttp423(Integer http423) {
            this.http423 = http423;
        }

        public Integer getHttp424() {
            return http424;
        }

        public void setHttp424(Integer http424) {
            this.http424 = http424;
        }

        public Integer getHttp425() {
            return http425;
        }

        public void setHttp425(Integer http425) {
            this.http425 = http425;
        }

        public Integer getHttp426() {
            return http426;
        }

        public void setHttp426(Integer http426) {
            this.http426 = http426;
        }

        public Integer getHttp449() {
            return http449;
        }

        public void setHttp449(Integer http449) {
            this.http449 = http449;
        }

        public Integer getHttp451() {
            return http451;
        }

        public void setHttp451(Integer http451) {
            this.http451 = http451;
        }

        public Integer getHttp500() {
            return http500;
        }

        public void setHttp500(Integer http500) {
            this.http500 = http500;
        }

        public Integer getHttp501() {
            return http501;
        }

        public void setHttp501(Integer http501) {
            this.http501 = http501;
        }

        public Integer getHttp502() {
            return http502;
        }

        public void setHttp502(Integer http502) {
            this.http502 = http502;
        }

        public Integer getHttp503() {
            return http503;
        }

        public void setHttp503(Integer http503) {
            this.http503 = http503;
        }

        public Integer getHttp504() {
            return http504;
        }

        public void setHttp504(Integer http504) {
            this.http504 = http504;
        }

        public Integer getHttp505() {
            return http505;
        }

        public void setHttp505(Integer http505) {
            this.http505 = http505;
        }

        public Integer getHttp506() {
            return http506;
        }

        public void setHttp506(Integer http506) {
            this.http506 = http506;
        }

        public Integer getHttp507() {
            return http507;
        }

        public void setHttp507(Integer http507) {
            this.http507 = http507;
        }

        public Integer getHttp509() {
            return http509;
        }

        public void setHttp509(Integer http509) {
            this.http509 = http509;
        }

        public Integer getHttp510() {
            return http510;
        }

        public void setHttp510(Integer http510) {
            this.http510 = http510;
        }
    }

    public static class HttpCodeInfoV2 extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 1xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http1XX")
        private HttpCodeV2Detail http1XX;

        /** 2xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http2XX")
        private HttpCodeV2Detail http2XX;

        /** 3xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http3XX")
        private HttpCodeV2Detail http3XX;

        /** 4xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http4XX")
        private HttpCodeV2Detail http4XX;

        /** 5xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http5XX")
        private HttpCodeV2Detail http5XX;

        /** 6xx信息，参考HttpCodeV2Detail结构 */
        @SerializedName("Http6XX")
        private HttpCodeV2Detail http6XX;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public HttpCodeV2Detail getHttp1XX() {
            return http1XX;
        }

        public void setHttp1XX(HttpCodeV2Detail http1XX) {
            this.http1XX = http1XX;
        }

        public HttpCodeV2Detail getHttp2XX() {
            return http2XX;
        }

        public void setHttp2XX(HttpCodeV2Detail http2XX) {
            this.http2XX = http2XX;
        }

        public HttpCodeV2Detail getHttp3XX() {
            return http3XX;
        }

        public void setHttp3XX(HttpCodeV2Detail http3XX) {
            this.http3XX = http3XX;
        }

        public HttpCodeV2Detail getHttp4XX() {
            return http4XX;
        }

        public void setHttp4XX(HttpCodeV2Detail http4XX) {
            this.http4XX = http4XX;
        }

        public HttpCodeV2Detail getHttp5XX() {
            return http5XX;
        }

        public void setHttp5XX(HttpCodeV2Detail http5XX) {
            this.http5XX = http5XX;
        }

        public HttpCodeV2Detail getHttp6XX() {
            return http6XX;
        }

        public void setHttp6XX(HttpCodeV2Detail http6XX) {
            this.http6XX = http6XX;
        }
    }
}
