/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.udisk.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CloneUDiskRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 实例名称
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 克隆父Disk的Id
     */
    @NotEmpty
    @UCloudParam("SourceId")
    private String sourceId;
        
    
        
    /**
     * 【开启数据方舟入口已关闭】是否开启数据方舟。Yes：开启，No：不开启，默认值：No
     */
    @UCloudParam("UDataArkMode")
    private String uDataArkMode;
        
    
        
    /**
     * 是否开启快照服务（开启快照服务，可免费开启数据方舟）。Yes：开启，No：不开启，默认值：No
     */
    @UCloudParam("SnapshotService")
    private String snapshotService;
        
    
        
    /**
     * 购买时长 默认: 1
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * Disk注释
     */
    @UCloudParam("Comment")
    private String comment;
        
    
        
    /**
     * Year , Month, Dynamic，Postpay，Trial 默认: Month
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 业务组 默认：Default
     */
    @UCloudParam("Tag")
    private String tag;
        
    
        
    /**
     * RDMA集群id。指定RSSD云盘克隆到对应的RDMA集群。
     */
    @UCloudParam("RdmaClusterId")
    private String rdmaClusterId;
        
    
        
    /**
     * Host实例ID。克隆出的云盘可直接挂载到该主机上。
     */
    @UCloudParam("HostId")
    private String hostId;
        
    
        
    /**
     * 新克隆UDisk的大小,单位:GB。指定Size须大于等于源盘Size，小于源盘Size或者不指定该参数均按源盘Size克隆新盘。普通数据盘：范围[1~8000]；SSD数据盘：范围[1~8000]；RSSD数据盘：范围[1~32000]；高效数据盘：范围[1~32000]。
     */
    @UCloudParam("Size")
    private Integer size;
        
    
        
    /**
     * 快照服务备份策略。默认采用基础版套餐开通，“Base”：基础版，“ Ultimate”：旗舰版，“ Custom”：自定义备份链
     */
    @UCloudParam("BackupMode")
    private String backupMode;
        
    
        
    /**
     * BackupMode为Custom时，进行设置, 以12小时秒级为基础进行倍数扩增，如12、24、36、48
     */
    @UCloudParam("Journal")
    private Integer journal;
        
    
        
    /**
     * BackupMode为Custom时，进行设置, 以24小时级为基础进行倍数扩增，如24、48、72、96
     */
    @UCloudParam("Hour")
    private Integer hour;
        
    
        
    /**
     * BackupMode为Custom时，进行设置, 以5天级为基础进行倍数扩增，如5、10、15、20、25、30
     */
    @UCloudParam("Day")
    private Integer day;
        
    
        
    /**
     * 使用的代金券id
     */
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
    
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getRdmaClusterId() {
        return rdmaClusterId;
    }

    public void setRdmaClusterId(String rdmaClusterId) {
        this.rdmaClusterId = rdmaClusterId;
    }
    
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public String getBackupMode() {
        return backupMode;
    }

    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }
    
    public Integer getJournal() {
        return journal;
    }

    public void setJournal(Integer journal) {
        this.journal = journal;
    }
    
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
}









