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
package cn.ucloud.udisk.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUDiskPriceRequest extends Request {

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

    /**
     * 购买UDisk大小,单位:GB,普通数据盘：范围[1~8000]；SSD数据盘：范围[1~8000]；普通系统盘：范围[1~8000]；SSD系统盘：范围[1~4000]；RSSD数据盘：范围[1~32000]；RSSD系统盘：范围[1~4000]；高效数据盘：范围[1~32000]；高效系统盘：范围[1~500]。
     */
    @NotEmpty
    @UCloudParam("Size")
    private Integer size;

    /** Year , Month, Dynamic，Postpay，Trial 默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买UDisk的时长，默认值为1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 【开启数据方舟入口已关闭】是否开启数据方舟。Yes：开启，No：不开启，默认值：No */
    @UCloudParam("UDataArkMode")
    private String uDataArkMode;

    /** 是否开启快照服务（开启快照服务，可免费开启数据方舟）。Yes：开启，No：不开启，默认值：No */
    @UCloudParam("SnapshotService")
    private String snapshotService;

    /**
     * UDisk 类型:
     * DataDisk（普通数据盘），SSDDataDisk（SSD数据盘），RSSDDataDisk(RSSD数据盘)，EfficiencyDataDisk（高效数据盘），SystemDisk（普通系统盘），SSDSystemDisk（SSD系统盘），RSSDSystemDisk(RSSD系统盘)，EfficiencySystemDisk（高效系统盘），默认值（DataDisk）
     */
    @UCloudParam("DiskType")
    private String diskType;

    /** 是否将快照服务(数据方舟)，云硬盘放入一张订单, 是："Yes",否："No"，默认是"No" */
    @UCloudParam("IsTotalPrice")
    private String isTotalPrice;

    /** 云主机机型（V2.0），枚举值["N", "C", "G", "O", "OM"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。 */
    @UCloudParam("MachineType")
    private String machineType;

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

    public String getUDataArkMode() {
        return uDataArkMode;
    }

    public void setUDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public String getSnapshotService() {
        return snapshotService;
    }

    public void setSnapshotService(String snapshotService) {
        this.snapshotService = snapshotService;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getIsTotalPrice() {
        return isTotalPrice;
    }

    public void setIsTotalPrice(String isTotalPrice) {
        this.isTotalPrice = isTotalPrice;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
}
