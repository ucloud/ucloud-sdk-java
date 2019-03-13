package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改UDB自动备份策略 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 19:42
 **/
public class UpdateUDBInstanceBackupStrategyParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 实例的Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 备份的整点时间，范围[0,23]
     */
    @UcloudParam("BackupTime")
    private Integer backupTime;

    /**
     * 备份时期标记位。共7位，每一位为一周中一天的备份情况，
     * 0表示关闭当天备份，1表示打开当天备份。
     * 最右边的一位为星期天的备份开关，其余从右到左依次为星期一到星期六的备份配置开关，
     * 每周必须至少设置两天备份。
     * 例如：1100000表示打开星期六和星期五的备份功能
     */
    @UcloudParam("BackupDate")
    private Integer backupDate;

    /**
     * 当导出某些数据遇到问题后，是否强制导出其他剩余数据 默认是false
     */
    @UcloudParam("ForceDump")
    private Boolean forceDump;

    public UpdateUDBInstanceBackupStrategyParam(@NotEmpty(message = "region can not be empty") String region,
                                                @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("UpdateUDBInstanceBackupStrategy");
        this.region = region;
        this.dbId = dbId;
    }

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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public Integer getBackupDate() {
        return backupDate;
    }

    public void setBackupDate(Integer backupDate) {
        this.backupDate = backupDate;
    }

    public Boolean getForceDump() {
        return forceDump;
    }

    public void setForceDump(Boolean forceDump) {
        this.forceDump = forceDump;
    }

}
