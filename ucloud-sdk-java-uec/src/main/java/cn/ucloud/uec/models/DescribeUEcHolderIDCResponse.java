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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUEcHolderIDCResponse extends Response {

    /** 机房列表，具体参考下面IdcInfo: false */
    @SerializedName("IdcList")
    private List<IdcInfo> idcList;

    public List<IdcInfo> getIdcList() {
        return idcList;
    }

    public void setIdcList(List<IdcInfo> idcList) {
        this.idcList = idcList;
    }

    public static class IdcInfo extends Response {

        /** 机房ID: false */
        @SerializedName("IdcId")
        private String idcId;

        /** 机房名称: false */
        @SerializedName("Name")
        private String name;

        /** 运营商: false */
        @SerializedName("Isp")
        private String isp;

        /** 省份: false */
        @SerializedName("Province")
        private String province;

        /** 城市: false */
        @SerializedName("City")
        private String city;

        /** 运营商类型：0-其它, 1-一线城市单线,2-二线城市单线, 3-全国教育网, 4-全国三通: false */
        @SerializedName("Type")
        private Integer type;

        /** 机房可创建节点最大数量: false */
        @SerializedName("MaxNodeCnt")
        private Integer maxNodeCnt;

        public String getIdcId() {
            return idcId;
        }

        public void setIdcId(String idcId) {
            this.idcId = idcId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getMaxNodeCnt() {
            return maxNodeCnt;
        }

        public void setMaxNodeCnt(Integer maxNodeCnt) {
            this.maxNodeCnt = maxNodeCnt;
        }
    }
}
