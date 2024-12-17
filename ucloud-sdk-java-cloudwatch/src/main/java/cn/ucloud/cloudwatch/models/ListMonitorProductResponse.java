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
package cn.ucloud.cloudwatch.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListMonitorProductResponse extends Response {

    /** 返回数据 */
    @SerializedName("Data")
    private ListMonitorProduct data;

    /** 链路ID */
    @SerializedName("TraceId")
    private String traceId;

    public ListMonitorProduct getData() {
        return data;
    }

    public void setData(ListMonitorProduct data) {
        this.data = data;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class ListMonitorProduct extends Response {

        /** 查询结果总数 */
        @SerializedName("Total")
        private Integer total;

        /** 查询结果列表 */
        @SerializedName("List")
        private List<Product> list;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<Product> getList() {
            return list;
        }

        public void setList(List<Product> list) {
            this.list = list;
        }
    }

    public static class Product extends Response {

        /** ID */
        @SerializedName("Id")
        private Integer id;

        /** 资源类型ID */
        @SerializedName("ProductType")
        private Integer productType;

        /** 资源类型唯一key */
        @SerializedName("ProductKey")
        private String productKey;

        /** 产品名称 */
        @SerializedName("ProductName")
        private String productName;

        /** 产品子名称 */
        @SerializedName("ProductName1")
        private String productName1;

        /** 产品中文名称 */
        @SerializedName("ProductChName")
        private String productChName;

        /** 产品英文名称 */
        @SerializedName("ProductEnName")
        private String productEnName;

        /** {Type: 1|2, Key:string, Name: string}[] -> JSON字符串 */
        @SerializedName("Metas")
        private String metas;

        /** 产品分组 */
        @SerializedName("ProductGroup")
        private String productGroup;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public String getProductKey() {
            return productKey;
        }

        public void setProductKey(String productKey) {
            this.productKey = productKey;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName1() {
            return productName1;
        }

        public void setProductName1(String productName1) {
            this.productName1 = productName1;
        }

        public String getProductChName() {
            return productChName;
        }

        public void setProductChName(String productChName) {
            this.productChName = productChName;
        }

        public String getProductEnName() {
            return productEnName;
        }

        public void setProductEnName(String productEnName) {
            this.productEnName = productEnName;
        }

        public String getMetas() {
            return metas;
        }

        public void setMetas(String metas) {
            this.metas = metas;
        }

        public String getProductGroup() {
            return productGroup;
        }

        public void setProductGroup(String productGroup) {
            this.productGroup = productGroup;
        }
    }
}
