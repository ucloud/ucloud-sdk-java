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

public class UpdateUDBInstanceBackupStrategyRequest extends Request {

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

    /** 主节点的Id */
    @NotEmpty
    @UCloudParam("DBId")
    private String dbId;

    /** 备份的整点时间，范围[0,23] */
    @UCloudParam("BackupTime")
    private Integer backupTime;

    /**
     * 备份时期标记位。共7位，每一位为一周中一天的备份情况，0表示关闭当天备份，1表示打开当天备份。最右边的一位为星期天的备份开关，其余从右到左依次为星期一到星期六的备份配置开关，每周必须至少设置两天备份。例如：1100000表示打开星期六和星期五的备份功能
     */
    @UCloudParam("BackupDate")
    private String backupDate;

    /** 当导出某些数据遇到问题后，是否强制导出其他剩余数据 默认是false 需要同时设置BackupDate字段 */
    @UCloudParam("ForceDump")
    private Boolean forceDump;

    /**
     * 选择默认的备份方式，可选nobackup表示不备份， snapshot 表示使用快照备份，logic
     * 表示使用逻辑备份。需要同时设置BackupDate字段。（快照备份即物理备份。SSD版本的mysql实例支持设置为snapshot，NVMe版本的mysql实例支持设置为xtrabackup）
     */
    @UCloudParam("BackupMethod")
    private String backupMethod;

    /** 自动备份转存到用户自己的bucket 的tokenid， 需要用户自己自己设置权限 */
    @UCloudParam("UserTokenID")
    private String userTokenID;

    /** 自动备份转存到用户自己的bucket名称，要包含到对应的token id里 */
    @UCloudParam("UserBucket")
    private String userBucket;

    /** 是否开启binlog备份, 默认为未开启 */
    @UCloudParam("EnableBinlogBackup")
    private Boolean enableBinlogBackup;

    /** 远端binlog保存时长(天) */
    @UCloudParam("BinlogRemoteSaveDays")
    private Integer binlogRemoteSaveDays;

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

    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public String getBackupDate() {
        return backupDate;
    }

    public void setBackupDate(String backupDate) {
        this.backupDate = backupDate;
    }

    public Boolean getForceDump() {
        return forceDump;
    }

    public void setForceDump(Boolean forceDump) {
        this.forceDump = forceDump;
    }

    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public String getUserTokenID() {
        return userTokenID;
    }

    public void setUserTokenID(String userTokenID) {
        this.userTokenID = userTokenID;
    }

    public String getUserBucket() {
        return userBucket;
    }

    public void setUserBucket(String userBucket) {
        this.userBucket = userBucket;
    }

    public Boolean getEnableBinlogBackup() {
        return enableBinlogBackup;
    }

    public void setEnableBinlogBackup(Boolean enableBinlogBackup) {
        this.enableBinlogBackup = enableBinlogBackup;
    }

    public Integer getBinlogRemoteSaveDays() {
        return binlogRemoteSaveDays;
    }

    public void setBinlogRemoteSaveDays(Integer binlogRemoteSaveDays) {
        this.binlogRemoteSaveDays = binlogRemoteSaveDays;
    }
}
