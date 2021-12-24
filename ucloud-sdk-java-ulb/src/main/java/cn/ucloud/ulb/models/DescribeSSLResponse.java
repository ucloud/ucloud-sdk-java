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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeSSLResponse extends Response {

    /** 满足条件的SSL证书总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** SSL证书详细信息，具体结构见 ULBSSLSet: false */
    @SerializedName("DataSet")
    private List<ULBSSLSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ULBSSLSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ULBSSLSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class ULBSSLSet extends Response {

        /** SSL证书的Id: false */
        @SerializedName("SSLId")
        private String sslId;

        /** SSL证书的名字: false */
        @SerializedName("SSLName")
        private String sslName;

        /** SSL证书类型，暂时只有 Pem 一种类型: false */
        @SerializedName("SSLType")
        private String sslType;

        /** SSL证书的内容: false */
        @SerializedName("SSLContent")
        private String sslContent;

        /** SSL证书的创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** SSL证书的HASH值: false */
        @SerializedName("HashValue")
        private String hashValue;

        /** SSL证书绑定到的对象: false */
        @SerializedName("BindedTargetSet")
        private List<SSLBindedTargetSet> bindedTargetSet;

        public String getSSLId() {
            return sslId;
        }

        public void setSSLId(String sslId) {
            this.sslId = sslId;
        }

        public String getSSLName() {
            return sslName;
        }

        public void setSSLName(String sslName) {
            this.sslName = sslName;
        }

        public String getSSLType() {
            return sslType;
        }

        public void setSSLType(String sslType) {
            this.sslType = sslType;
        }

        public String getSSLContent() {
            return sslContent;
        }

        public void setSSLContent(String sslContent) {
            this.sslContent = sslContent;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getHashValue() {
            return hashValue;
        }

        public void setHashValue(String hashValue) {
            this.hashValue = hashValue;
        }

        public List<SSLBindedTargetSet> getBindedTargetSet() {
            return bindedTargetSet;
        }

        public void setBindedTargetSet(List<SSLBindedTargetSet> bindedTargetSet) {
            this.bindedTargetSet = bindedTargetSet;
        }
    }

    public static class SSLBindedTargetSet extends Response {

        /** SSL证书绑定到的VServer的资源ID: false */
        @SerializedName("VServerId")
        private String vServerId;

        /** 对应的VServer的名字: false */
        @SerializedName("VServerName")
        private String vServerName;

        /** VServer 所属的ULB实例的资源ID: false */
        @SerializedName("ULBId")
        private String ulbId;

        /** ULB实例的名称: false */
        @SerializedName("ULBName")
        private String ulbName;

        public String getVServerId() {
            return vServerId;
        }

        public void setVServerId(String vServerId) {
            this.vServerId = vServerId;
        }

        public String getVServerName() {
            return vServerName;
        }

        public void setVServerName(String vServerName) {
            this.vServerName = vServerName;
        }

        public String getULBId() {
            return ulbId;
        }

        public void setULBId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getULBName() {
            return ulbName;
        }

        public void setULBName(String ulbName) {
            this.ulbName = ulbName;
        }
    }
}
