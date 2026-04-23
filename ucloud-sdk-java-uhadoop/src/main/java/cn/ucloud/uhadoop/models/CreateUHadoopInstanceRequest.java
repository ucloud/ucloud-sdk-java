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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUHadoopInstanceRequest extends Request {

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

    /** 集群机器的登录密码 */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** 版本,例如：3.2.1-udh3.0,通过ListUHadoopFrameworkApp接口获取 */
    @NotEmpty
    @UCloudParam("FrameworkVersion")
    private String frameworkVersion;

    /**
     * 节点配置，里面包括NodeType（机型），NodeRole（节点类别，值为其中之一：master|core|task），Count（数量），DataDiskType（数据盘类别），DataDiskSize（数据盘大小），DataDiskNum（数据盘数量），BootDiskType（系统盘类型），BootDiskSize（系统盘大小），通过GetUHadoopNodeType接口获取，示例为：
     * InstanceGroupConfigs.0.NodeType=o.hadoop2m.xlarge InstanceGroupConfigs.0.NodeRole=master
     * InstanceGroupConfigs.0.Count=2 InstanceGroupConfigs.0.DataDiskType=CLOUD_RSSD
     * InstanceGroupConfigs.0.DataDiskSize=100 InstanceGroupConfigs.0.DataDiskNum=1
     * InstanceGroupConfigs.0.BootDiskType=CLOUD_RSSD InstanceGroupConfigs.0.BootDiskSize=50
     * InstanceGroupConfigs.1.NodeType=o.hadoop2m.xlarge InstanceGroupConfigs.1.NodeRole=core
     * InstanceGroupConfigs.1.Count=3 InstanceGroupConfigs.1.DataDiskType=CLOUD_RSSD
     * InstanceGroupConfigs.1.DataDiskSize=200 InstanceGroupConfigs.1.DataDiskNum=1
     * InstanceGroupConfigs.1.BootDiskType=CLOUD_RSSD InstanceGroupConfigs.1.BootDiskSize=50
     */
    @NotEmpty
    @UCloudParam("InstanceGroupConfigs")
    private List<String> instanceGroupConfigs;

    /** VPCId */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 集群需要安装的组件，格式：组件#版本 通过ListUHadoopFrameworkApp接口获取，例如：Spark#3.3.0 */
    @NotEmpty
    @UCloudParam("AppConfig")
    private List<String> appConfig;

    /**
     * 框架，值为'Hadoop'|'HDFS'|'MR'|'StarRocks'之一,框架，例如Hadoop|MR|HDFS|StarRocks Hadoop框架包含存储与计算服务
     * MR集群包含计算服务 HDFS只包含存储服务,StarRocks为StarRocks集群
     */
    @NotEmpty
    @UCloudParam("Framework")
    private String framework;

    /** 支付类别，默认：Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 数量，默认1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 工作组ID，默认Default */
    @UCloudParam("BusinessId")
    private String businessId;

    /** Framework为‘MR’时，存储集群ID */
    @UCloudParam("StorgeClusterId")
    private String storgeClusterId;

    /** 目前只支持传‘udb’ */
    @UCloudParam("StandAloneMetaStore")
    private String standAloneMetaStore;

    /** 是否开启安全组 */
    @UCloudParam("IsSecurityEnabled")
    private String isSecurityEnabled;

    /** 安全组ID，字符串数组，IsSecurityEnabled为true时生效 */
    @UCloudParam("SecGroupIds")
    private String secGroupIds;

    /** US3 bucket名称，仅支持框架为StarRocks存算分离时传入 */
    @UCloudParam("US3Bucket")
    private String us3Bucket;

    /** US3 配置公钥，仅支持框架为StarRocks存算分离时传入 */
    @UCloudParam("US3AccessKey")
    private String us3AccessKey;

    /** US3 配置私钥，仅支持框架为StarRocks存算分离时传入 */
    @UCloudParam("US3SecretKey")
    private String us3SecretKey;

    /** US3 Token名称，仅支持框架为StarRocks存算分离时传入 */
    @UCloudParam("US3TokenName")
    private String us3TokenName;

    /** 实例名称，默认为实例ID */
    @UCloudParam("InstanceName")
    private String instanceName;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFrameworkVersion() {
        return frameworkVersion;
    }

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    public List<String> getInstanceGroupConfigs() {
        return instanceGroupConfigs;
    }

    public void setInstanceGroupConfigs(List<String> instanceGroupConfigs) {
        this.instanceGroupConfigs = instanceGroupConfigs;
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

    public List<String> getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(List<String> appConfig) {
        this.appConfig = appConfig;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getStorgeClusterId() {
        return storgeClusterId;
    }

    public void setStorgeClusterId(String storgeClusterId) {
        this.storgeClusterId = storgeClusterId;
    }

    public String getStandAloneMetaStore() {
        return standAloneMetaStore;
    }

    public void setStandAloneMetaStore(String standAloneMetaStore) {
        this.standAloneMetaStore = standAloneMetaStore;
    }

    public String getIsSecurityEnabled() {
        return isSecurityEnabled;
    }

    public void setIsSecurityEnabled(String isSecurityEnabled) {
        this.isSecurityEnabled = isSecurityEnabled;
    }

    public String getSecGroupIds() {
        return secGroupIds;
    }

    public void setSecGroupIds(String secGroupIds) {
        this.secGroupIds = secGroupIds;
    }

    public String getUS3Bucket() {
        return us3Bucket;
    }

    public void setUS3Bucket(String us3Bucket) {
        this.us3Bucket = us3Bucket;
    }

    public String getUS3AccessKey() {
        return us3AccessKey;
    }

    public void setUS3AccessKey(String us3AccessKey) {
        this.us3AccessKey = us3AccessKey;
    }

    public String getUS3SecretKey() {
        return us3SecretKey;
    }

    public void setUS3SecretKey(String us3SecretKey) {
        this.us3SecretKey = us3SecretKey;
    }

    public String getUS3TokenName() {
        return us3TokenName;
    }

    public void setUS3TokenName(String us3TokenName) {
        this.us3TokenName = us3TokenName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
}
