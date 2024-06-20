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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUMemSpaceRequest extends Request {

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

    /** 内存大小, 单位:GB, 范围[1~1024] */
    @NotEmpty
    @UCloudParam("Size")
    private Integer size;

    /** 空间名称,长度(6<=size<=63) */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 协议:memcache, redis (默认redis).注意:redis无single类型 */
    @UCloudParam("Protocol")
    private String protocol;

    /** 空间类型:single(无热备),double(热备)(默认: double) */
    @UCloudParam("Type")
    private String type;

    /** Year , Month, Dynamic 默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长 默认: 1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /**
     * URedis密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。密码需使用base64进行编码，举例如下：# echo -n Password1
     * | base64UGFzc3dvcmQx。
     */
    @UCloudParam("Password")
    private String password;

    /** 跨机房UDRedis，slave所在可用区（必须和Zone在同一Region，且不可相同） */
    @UCloudParam("SlaveZone")
    private String slaveZone;

    /** 分片个数 */
    @UCloudParam("BlockCnt")
    private Integer blockCnt;

    /** 【待废弃】是否是cluster模式（参数为cluster创建redis cluster，其他参数或者不传该参数仍然创建老版本分布式） */
    @UCloudParam("ClusterMode")
    private String clusterMode;

    /** 分布式分片版本（默认版本是4.0，其他版本见DescribeUDRedisBlockVersion） */
    @UCloudParam("Version")
    private String version;

    /** 是否创建性能增强性。默认为false，或者不填，填true为性能增强型。 */
    @UCloudParam("HighPerformance")
    private Boolean highPerformance;

    /** 分布式代理CPU核数，不填或者传0时默认不创建代理 */
    @UCloudParam("ProxySize")
    private Integer proxySize;

    /** 是否创建负载均衡型分布式代理，true时表示创建负载均衡型代理 */
    @UCloudParam("UlbMode")
    private Boolean ulbMode;

    /** 分片端口, 默认为 6379 */
    @UCloudParam("Port")
    private Integer port;

    /** 代理端口, 默认为 6379 */
    @UCloudParam("ProxyPort")
    private Integer proxyPort;

    /** 使用的代金券id */
    @UCloudParam("CouponId")
    private String couponId;

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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSlaveZone() {
        return slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }

    public Integer getBlockCnt() {
        return blockCnt;
    }

    public void setBlockCnt(Integer blockCnt) {
        this.blockCnt = blockCnt;
    }

    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getHighPerformance() {
        return highPerformance;
    }

    public void setHighPerformance(Boolean highPerformance) {
        this.highPerformance = highPerformance;
    }

    public Integer getProxySize() {
        return proxySize;
    }

    public void setProxySize(Integer proxySize) {
        this.proxySize = proxySize;
    }

    public Boolean getUlbMode() {
        return ulbMode;
    }

    public void setUlbMode(Boolean ulbMode) {
        this.ulbMode = ulbMode;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
