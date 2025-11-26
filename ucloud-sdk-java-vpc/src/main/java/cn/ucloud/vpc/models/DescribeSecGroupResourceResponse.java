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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeSecGroupResourceResponse extends Response {

    /** 详见SecGroupResourceInfo */
    @SerializedName("DataSet")
    private List<SecGroupResourceInfo> dataSet;

    /** 安全组绑定的资源总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<SecGroupResourceInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SecGroupResourceInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class SecGroupResourceInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private Integer zone;

        /** 绑定的虚拟网卡的名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 资源绑定的虚拟网卡的ID */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 绑定的虚拟网卡的类型，“uni”，虚拟网卡 */
        @SerializedName("SubResourceType")
        private String subResourceType;

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 内网IP */
        @SerializedName("PrivateIp")
        private String privateIp;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /**
         * 资源类型。"unatgw"，NAT网关； "uhost"，云主机； "upm"，物理云主机； "hadoophost"，hadoop节点； "fortresshost"，堡垒机；
         * "udhost"，私有专区主机；"udockhost"，容器；"dbaudit"，数据库审计，“uni”，虚拟网卡。
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        public Integer getZone() {
            return zone;
        }

        public void setZone(Integer zone) {
            this.zone = zone;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
