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

public class DescribeUEcVHostResponse extends Response {

    /** 满足条件的节点总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 节点列表: false */
    @SerializedName("NodeList")
    private List<NodeInfo> nodeList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NodeInfo> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<NodeInfo> nodeList) {
        this.nodeList = nodeList;
    }

    public static class NodeInfo extends Response {

        /** 节点名称: false */
        @SerializedName("NodeName")
        private String nodeName;

        /** 节点ID: false */
        @SerializedName("NodeId")
        private String nodeId;

        /** Cpu核数: false */
        @SerializedName("CoreNum")
        private Integer coreNum;

        /** 节点内存大小，单位GB: false */
        @SerializedName("MemSize")
        private Integer memSize;

        /** 系统盘大小， 单位GB: false */
        @SerializedName("SysDiskSize")
        private Integer sysDiskSize;

        /** 数据盘大小， 单位GB: false */
        @SerializedName("DiskSize")
        private Integer diskSize;

        /** 节点状态，1部署中，2待启动，3启动中，4运行中，5正在停止，6已停止，7正在更新，8正在重启，9正在删除， 10已经删除,11异常: false */
        @SerializedName("State")
        private Integer state;

        /** 节点带宽限制， 单位Mbs: false */
        @SerializedName("NetLimit")
        private Integer netLimit;

        /** 机房ID: false */
        @SerializedName("IdcId")
        private String idcId;

        /** 机房名称: false */
        @SerializedName("OcName")
        private String ocName;

        /** 省份: false */
        @SerializedName("Province")
        private String province;

        /** 城市: false */
        @SerializedName("City")
        private String city;

        /** 运营商类型： 0-其它, 1-一线城市单线,2-二线城市单线, 3-全国教育网, 4-全国三通: false */
        @SerializedName("Type")
        private Integer type;

        /** 付费类型：1按时, 2按月,3按年: false */
        @SerializedName("ChargeType")
        private Integer chargeType;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 过期时间: false */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** 镜像名称: false */
        @SerializedName("ImageName")
        private String imageName;

        /** 外网ip集合（详情参考NodeIpList）: false */
        @SerializedName("NodeIpList")
        private List<NodeIpList> nodeIpList;

        /** 防火墙Id: false */
        @SerializedName("FirewallId")
        private String firewallId;

        /** 机器类型(normal-经济型,hf-标准型,g-GPU型): false */
        @SerializedName("ProductType")
        private String productType;

        /** 内网ip列表: false */
        @SerializedName("InnerIps")
        private List<String> innerIps;

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public Integer getCoreNum() {
            return coreNum;
        }

        public void setCoreNum(Integer coreNum) {
            this.coreNum = coreNum;
        }

        public Integer getMemSize() {
            return memSize;
        }

        public void setMemSize(Integer memSize) {
            this.memSize = memSize;
        }

        public Integer getSysDiskSize() {
            return sysDiskSize;
        }

        public void setSysDiskSize(Integer sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public Integer getNetLimit() {
            return netLimit;
        }

        public void setNetLimit(Integer netLimit) {
            this.netLimit = netLimit;
        }

        public String getIdcId() {
            return idcId;
        }

        public void setIdcId(String idcId) {
            this.idcId = idcId;
        }

        public String getOcName() {
            return ocName;
        }

        public void setOcName(String ocName) {
            this.ocName = ocName;
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

        public Integer getChargeType() {
            return chargeType;
        }

        public void setChargeType(Integer chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public List<NodeIpList> getNodeIpList() {
            return nodeIpList;
        }

        public void setNodeIpList(List<NodeIpList> nodeIpList) {
            this.nodeIpList = nodeIpList;
        }

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public List<String> getInnerIps() {
            return innerIps;
        }

        public void setInnerIps(List<String> innerIps) {
            this.innerIps = innerIps;
        }
    }

    public static class NodeIpList extends Response {

        /** 外网ip: false */
        @SerializedName("Ip")
        private String ip;

        /** 运营商: false */
        @SerializedName("Isp")
        private String isp;

        /** 运营商名称: false */
        @SerializedName("IspName")
        private String ispName;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        public String getIspName() {
            return ispName;
        }

        public void setIspName(String ispName) {
            this.ispName = ispName;
        }
    }
}
