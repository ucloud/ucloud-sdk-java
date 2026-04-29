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
package cn.ucloud.tidb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateTiDBClusterServiceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 集群名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 集群密码 */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** VPC id */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 公网Ulb ID */
    @NotEmpty
    @UCloudParam("PubUlbId")
    private String pubUlbId;

    /** 容灾类型：10:同可用区，20:跨可用区，默认是同可用区 */
    @NotEmpty
    @UCloudParam("DTType")
    private String dtType;

    /** */
    @UCloudParam("NodeConfig")
    private List<NodeConfig> nodeConfig;

    /** 计费模式。枚举值为： Year，按年付费； Month，按月付费； Dynamic，按小时付费（需开启权限）。默认为月付 */
    @NotEmpty
    @UCloudParam("ChargeType")
    private String chargeType;

    /** */
    @UCloudParam("OrderDetail")
    private List<OrderDetail> orderDetail;

    /** 代金券Id */
    @NotEmpty
    @UCloudParam("Coupon")
    private String coupon;

    /** 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末 */
    @NotEmpty
    @UCloudParam("Quantity")
    private Double quantity;

    /** 指定Ip地址 */
    @UCloudParam("Ip")
    private String ip;

    /** 指定端口 */
    @UCloudParam("Port")
    private String port;

    /** 活动ID。若有产品折扣，则由各产品与计费约定。 */
    @UCloudParam("PromotionId")
    private String promotionId;

    /** 活动ID。 */
    @UCloudParam("ActivityId")
    private Integer activityId;

    /** 活动规则ID。 */
    @UCloudParam("RuleId")
    private Integer ruleId;

    /** 集群版本号 */
    @UCloudParam("DbVersion")
    private String dbVersion;

    /** 参数模版ID */
    @UCloudParam("TemplateId")
    private String templateId;

    /** 告警策略IDs */
    @UCloudParam("AlertStrategyIds")
    private List<Integer> alertStrategyIds;

    /** */
    @UCloudParam("SecGroupInfo")
    private List<SecGroupInfo> secGroupInfo;

    /** */
    @UCloudParam("Labels")
    private List<Labels> labels;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getPubUlbId() {
        return pubUlbId;
    }

    public void setPubUlbId(String pubUlbId) {
        this.pubUlbId = pubUlbId;
    }

    public String getDTType() {
        return dtType;
    }

    public void setDTType(String dtType) {
        this.dtType = dtType;
    }

    public List<NodeConfig> getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(List<NodeConfig> nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<Integer> getAlertStrategyIds() {
        return alertStrategyIds;
    }

    public void setAlertStrategyIds(List<Integer> alertStrategyIds) {
        this.alertStrategyIds = alertStrategyIds;
    }

    public List<SecGroupInfo> getSecGroupInfo() {
        return secGroupInfo;
    }

    public void setSecGroupInfo(List<SecGroupInfo> secGroupInfo) {
        this.secGroupInfo = secGroupInfo;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public static class Labels extends Request {

        /** 用户资源标签的键值 */
        @UCloudParam("Key")
        private String key;

        /** 用户资源标签的值 */
        @UCloudParam("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class NodeConfig extends Request {

        /** 节点类型 */
        @NotEmpty
        @UCloudParam("ServerType")
        private String serverType;

        /** 节点数量 */
        @NotEmpty
        @UCloudParam("NodeCount")
        private Integer nodeCount;

        /** 节点规格ID */
        @NotEmpty
        @UCloudParam("ConfigId")
        private String configId;

        /** 节点磁盘容量 */
        @NotEmpty
        @UCloudParam("DiskSize")
        private Integer diskSize;

        public String getServerType() {
            return serverType;
        }

        public void setServerType(String serverType) {
            this.serverType = serverType;
        }

        public Integer getNodeCount() {
            return nodeCount;
        }

        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }
    }

    public static class OrderDetail extends Request {

        /** 计费项名称，CPU / MEM / DISK */
        @NotEmpty
        @UCloudParam("ProductName")
        private String productName;

        /** 计费项数量 */
        @NotEmpty
        @UCloudParam("Multiple")
        private Integer multiple;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getMultiple() {
            return multiple;
        }

        public void setMultiple(Integer multiple) {
            this.multiple = multiple;
        }
    }

    public static class SecGroupInfo extends Request {

        /** 安全组 ID。至多可以同时绑定5个安全组。 */
        @UCloudParam("SecGroupId")
        private String secGroupId;

        /** 安全组优先级。取值范围[1, 5] */
        @UCloudParam("Priority")
        private Integer priority;

        public String getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(String secGroupId) {
            this.secGroupId = secGroupId;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }
    }
}
