package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改数据迁移任务 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 18:19
 **/
public class ModifyDBTransferTaskParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 任务Id
     */
    @NotEmpty(message = "taskId can not be empty")
    @UcloudParam("TaskId")
    private String taskId;

    /**
     * 任务名称
     */
    @UcloudParam("TaskName")
    private String taskName;

    /**
     * 源库类型（MySQL, MongoDB, PostgreSQL)
     */
    @UcloudParam("SrcDBTypeId")
    private String srcDBTypeId;

    /**
     * 源db实例类型: - uhost-udb: 表示用户云主机自建 - udb-udb: UDB （暂时两者在后端处理上没有区别）
     */
    @UcloudParam("SrcInstanceTypeId")
    private String srcInstanceTypeId;

    /**
     * 源库用户名
     */
    @UcloudParam("SrcUser")
    private String srcUser;

    /**
     * 源库用户密码
     */
    @UcloudParam("SrcPassword")
    private String srcPassword;

    /**
     * 源库IP
     */
    @UcloudParam("SrcIP")
    private String srcIP;

    /**
     * 源库使用的端口
     */
    @UcloudParam("SrcPort")
    private Integer srcPort;

    /**
     * 目标库类型（MySQL, MongoDB, PostgreSQL)
     */
    @UcloudParam("DstDBTypeId")
    private String dstDBTypeId;

    /**
     * 目标库DBId
     */
    @UcloudParam("DstDBId")
    private String dstDBId;

    /**
     * 目标库用户名
     */
    @UcloudParam("DstUser")
    private String dstUser;

    /**
     * 目标库用户密码
     */
    @UcloudParam("DstPassword")
    private String dstPassword;

    /**
     * 目标库所在region
     */
    @UcloudParam("DstRegion")
    private String dstRegion;

    /**
     * 目标库所在zone
     */
    @UcloudParam("DstZone")
    private String dstZone;

    /**
     * full表示全量，full_incr表示全量+增量
     */
    @UcloudParam("MigrateType")
    private String migrateType;

    public ModifyDBTransferTaskParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "taskId can not be empty") String taskId) {
        super("ModifyDBTransferTask");
        this.region = region;
        this.zone = zone;
        this.taskId = taskId;
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSrcDBTypeId() {
        return srcDBTypeId;
    }

    public void setSrcDBTypeId(String srcDBTypeId) {
        this.srcDBTypeId = srcDBTypeId;
    }

    public String getSrcInstanceTypeId() {
        return srcInstanceTypeId;
    }

    public void setSrcInstanceTypeId(String srcInstanceTypeId) {
        this.srcInstanceTypeId = srcInstanceTypeId;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    public String getSrcPassword() {
        return srcPassword;
    }

    public void setSrcPassword(String srcPassword) {
        this.srcPassword = srcPassword;
    }

    public String getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }

    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public String getDstDBTypeId() {
        return dstDBTypeId;
    }

    public void setDstDBTypeId(String dstDBTypeId) {
        this.dstDBTypeId = dstDBTypeId;
    }

    public String getDstDBId() {
        return dstDBId;
    }

    public void setDstDBId(String dstDBId) {
        this.dstDBId = dstDBId;
    }

    public String getDstUser() {
        return dstUser;
    }

    public void setDstUser(String dstUser) {
        this.dstUser = dstUser;
    }

    public String getDstPassword() {
        return dstPassword;
    }

    public void setDstPassword(String dstPassword) {
        this.dstPassword = dstPassword;
    }

    public String getDstRegion() {
        return dstRegion;
    }

    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    public String getDstZone() {
        return dstZone;
    }

    public void setDstZone(String dstZone) {
        this.dstZone = dstZone;
    }

    public String getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(String migrateType) {
        this.migrateType = migrateType;
    }

}
