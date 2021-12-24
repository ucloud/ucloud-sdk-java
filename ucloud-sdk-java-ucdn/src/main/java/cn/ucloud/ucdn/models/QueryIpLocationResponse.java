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

public class QueryIpLocationResponse extends Response {

    /** IP信息列表 */
    @SerializedName("Data")
    private List<IpLocationInfo> data;

    public List<IpLocationInfo> getData() {
        return data;
    }

    public void setData(List<IpLocationInfo> data) {
        this.data = data;
    }

    public static class IpLocationInfo extends Response {

        /** 客户端请求的ip */
        @SerializedName("Ip")
        private String ip;

        /** 地区 */
        @SerializedName("Area")
        private String area;

        /** 运营商 */
        @SerializedName("Isp")
        private String isp;

        /** 城市 */
        @SerializedName("City")
        private String city;

        /** ip是否存在 */
        @SerializedName("Exist")
        private Boolean exist;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Boolean getExist() {
            return exist;
        }

        public void setExist(Boolean exist) {
            this.exist = exist;
        }
    }
}
