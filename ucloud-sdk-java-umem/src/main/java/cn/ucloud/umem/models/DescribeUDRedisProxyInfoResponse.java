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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUDRedisProxyInfoResponse extends Response {

    /** 代理数据集 */
    @SerializedName("DataSet")
    private List<UDRedisProxyInfo> dataSet;

    public List<UDRedisProxyInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDRedisProxyInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDRedisProxyInfo extends Response {

        /** 代理资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 代理id */
        @SerializedName("ProxyId")
        private String proxyId;

        /** 代理ip */
        @SerializedName("Vip")
        private String vip;

        /**
         * 代理状态 [PROXY_CREATING:创建中, PROXY_NORMAL:正常运行, PROXY_FAILED:创建失败, PROXY_CLOSED:关闭,
         * PROXY_INIT_RESIZE:初始化核数调整, PROXY_WAIT_RESIZE:等待核数调整, PROXY_RESIZING:核数调整中,
         * PROXY_RESIZE_ERROR:核数调整失败]
         */
        @SerializedName("State")
        private String state;

        /** 代理CPU核数 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 0 : 物理机版分布式代理, 1: NVME(或SSD)版分布式代理 */
        @SerializedName("ProxyType")
        private Integer proxyType;

        /** 开启外网状态下的外网IP，否则为空 */
        @SerializedName("PublicIp")
        private String publicIp;

        /** 代理是否支持设置为只读 */
        @SerializedName("SupportReadOnly")
        private Boolean supportReadOnly;

        /** 代理是否为只读 */
        @SerializedName("ReadOnly")
        private Boolean readOnly;

        /** 读写分离策略, "Custom": 用户自定义节点权重， "Uniform": 包括主节点在内的所有节点平均读请求， "ReadOnly": 读请求均分至只读节点 */
        @SerializedName("ReadMode")
        private String readMode;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getProxyId() {
            return proxyId;
        }

        public void setProxyId(String proxyId) {
            this.proxyId = proxyId;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getProxyType() {
            return proxyType;
        }

        public void setProxyType(Integer proxyType) {
            this.proxyType = proxyType;
        }

        public String getPublicIp() {
            return publicIp;
        }

        public void setPublicIp(String publicIp) {
            this.publicIp = publicIp;
        }

        public Boolean getSupportReadOnly() {
            return supportReadOnly;
        }

        public void setSupportReadOnly(Boolean supportReadOnly) {
            this.supportReadOnly = supportReadOnly;
        }

        public Boolean getReadOnly() {
            return readOnly;
        }

        public void setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
        }

        public String getReadMode() {
            return readMode;
        }

        public void setReadMode(String readMode) {
            this.readMode = readMode;
        }
    }
}
