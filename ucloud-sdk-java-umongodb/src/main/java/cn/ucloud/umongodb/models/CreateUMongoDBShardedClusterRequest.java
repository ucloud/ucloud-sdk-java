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
package cn.ucloud.umongodb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUMongoDBShardedClusterRequest extends Request {

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

    /** 副本集实例名称，至少6位 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 副本集的Mongodb的版本，例如MongoDB 3.6, MongoDB 4.2 */
    @NotEmpty
    @UCloudParam("DBVersion")
    private String dbVersion;

    /** 管理员密码 */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /** Mongos节点数量 */
    @NotEmpty
    @UCloudParam("MongosNodeCount")
    private Integer mongosNodeCount;

    /** 分片数量 */
    @NotEmpty
    @UCloudParam("ShardCount")
    private Integer shardCount;

    /** 每个分片中节点数量 */
    @NotEmpty
    @UCloudParam("NodeCount")
    private Integer nodeCount;

    /** 数据节点磁盘空间(GB):取值范围 20~32000，仅支持 10 的整数倍 */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** 数据节点机型配置,如 o.mongo2m.medium */
    @NotEmpty
    @UCloudParam("MachineTypeId")
    private String machineTypeId;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 实例所在的业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** 付费方式：Year， Month， Dynamic，Trial，默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** mongo服务端口 */
    @UCloudParam("ListenPort")
    private Integer listenPort;

    /** 参数配置模版id */
    @UCloudParam("TemplateId")
    private String templateId;

    /** Mongos节点机型配置 */
    @UCloudParam("MongosMachineTypeId")
    private String mongosMachineTypeId;

    /** */
    @UCloudParam("Labels")
    private List<Labels> labels;

    /** */
    @UCloudParam("SecGroupId")
    private List<SecGroupId> secGroupId;

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

    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getMongosNodeCount() {
        return mongosNodeCount;
    }

    public void setMongosNodeCount(Integer mongosNodeCount) {
        this.mongosNodeCount = mongosNodeCount;
    }

    public Integer getShardCount() {
        return shardCount;
    }

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getListenPort() {
        return listenPort;
    }

    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getMongosMachineTypeId() {
        return mongosMachineTypeId;
    }

    public void setMongosMachineTypeId(String mongosMachineTypeId) {
        this.mongosMachineTypeId = mongosMachineTypeId;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public List<SecGroupId> getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(List<SecGroupId> secGroupId) {
        this.secGroupId = secGroupId;
    }

    public static class Labels extends Request {

        /** 用户资源标签的键值 */
        @UCloudParam("Key")
        private String key;

        /** 用户资源标签值 */
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

    public static class SecGroupId extends Request {

        /** 安全组 ID。至多可以同时绑定5个安全组。 */
        @UCloudParam("Id")
        private String id;

        /** 安全组优先级。取值范围[1, 5] */
        @UCloudParam("Priority")
        private Integer priority;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }
    }
}
