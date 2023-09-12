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
package cn.ucloud.udb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUDBInstanceByRecoveryRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例名称，至少6位 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 源实例的Id */
    @NotEmpty
    @UCloudParam("SrcDBId")
    private String srcDBId;

    /** 恢复到某个时间点的时间戳(UTC时间格式，默认单位秒) */
    @NotEmpty
    @UCloudParam("RecoveryTime")
    private Integer recoveryTime;

    /** Year， Month， Dynamic，Trial，默认: Dynamic */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 指定是否是否使用SSD，默认使用主库的配置 */
    @UCloudParam("UseSSD")
    private Boolean useSSD;

    /** 专区的Id */
    @UCloudParam("UDBCId")
    private String udbcId;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 是否创建使用ipv6 资源， 默认为false， 或者不填， 创建ipv6为true */
    @UCloudParam("EnableIpV6")
    private Boolean enableIpV6;

    /**
     * 指定需要恢复的表, 如果指定该字段则回档实例只有指定的表数据，格式为(库名.表名)， 指定多个用逗号隔开，eg: [ udb.test, mysql_school.my_student]
     */
    @UCloudParam("Tables")
    private String tables;

    /** 管理员密码 (指定库表回档到新实例时有效) */
    @UCloudParam("AdminPassword")
    private String adminPassword;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrcDBId() {
        return srcDBId;
    }

    public void setSrcDBId(String srcDBId) {
        this.srcDBId = srcDBId;
    }

    public Integer getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(Integer recoveryTime) {
        this.recoveryTime = recoveryTime;
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

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }

    public String getUDBCId() {
        return udbcId;
    }

    public void setUDBCId(String udbcId) {
        this.udbcId = udbcId;
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

    public Boolean getEnableIpV6() {
        return enableIpV6;
    }

    public void setEnableIpV6(Boolean enableIpV6) {
        this.enableIpV6 = enableIpV6;
    }

    public String getTables() {
        return tables;
    }

    public void setTables(String tables) {
        this.tables = tables;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
