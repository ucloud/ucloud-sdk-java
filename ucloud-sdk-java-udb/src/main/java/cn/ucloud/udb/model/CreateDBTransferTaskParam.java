package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 创建数据迁移任务 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 15:17
 **/
public class CreateDBTransferTaskParam extends BaseRequestParam {

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
     * 任务名称
     */
    @NotEmpty(message = "taskName can not empty")
    @UcloudParam("TaskName")
    private String taskName;

    /**
     * 源库类型（MySQL, MongoDB, PostgreSQL)
     */
    @NotEmpty(message = "srcDBTypeId can not be empty")
    @UcloudParam("SrcDBTypeId")
    private String srcDBTypeId;

    /**
     * 源db实例类型: - uhost-udb: 表示用户云主机自建 - udb-udb: UDB （暂时两者在后端处理上没有区别）
     */
    @UcloudParam("SrcInstanceTypeId")
    @NotEmpty(message = "srcInstanceTypeId can not be empty")
    private String srcInstanceTypeId;

    /**
     * 源库用户名
     */
    @NotEmpty(message = "srcUser can not be empty")
    @UcloudParam("SrcUser")
    private String srcUser;

    /**
     * 源库用户密码
     */
    @NotEmpty(message = "srcPassword can not be empty")
    @UcloudParam("SrcPasswd")
    private String srcPassword;

    /**
     * 源库IP
     */
    @NotEmpty(message = "srcIP can not be empty")
    @UcloudParam("SrcIP")
    private String srcIP;

    /**
     * 源库使用的端口
     */
    @NotNull(message = "srcPort can not be null")
    @UcloudParam("SrcPort")
    private Integer srcPort;

    /**
     * 目标库类型（MySQL, MongoDB, PostgreSQL)
     */
    @NotEmpty(message = "dstDBTypeId can not be empty")
    @UcloudParam("DstDBTypeId")
    private String dstDBTypeId;

    /**
     * 目标库DBId
     */
    @NotEmpty(message = "dstDBId can not be empty")
    @UcloudParam("DstDBId")
    private String dstDBId;

    /**
     * 目标库用户名
     */
    @NotEmpty(message = "dstUser can not be empty")
    @UcloudParam("DstUser")
    private String dstUser;

    /**
     * 目标库用户密码
     */
    @NotEmpty(message = "dstPassword can not be empty")
    @UcloudParam("DstPasswd")
    private String dstPassword;

    /**
     * full表示全量，full_incr表示全量+增量
     */
    @NotEmpty(message = "migrateType can not be empty")
    @UcloudParam("MigrateType")
    private String migrateType;


    public CreateDBTransferTaskParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "taskName can not empty") String taskName,
                                     @NotEmpty(message = "srcDBType can not be empty") String srcDBTypeId,
                                     @NotEmpty(message = "srcInstanceTypeId can not be empty") String srcInstanceTypeId,
                                     @NotEmpty(message = "srcUser can not be empty") String srcUser,
                                     @NotEmpty(message = "srcPassword can not be empty") String srcPassword,
                                     @NotEmpty(message = "srcIP can not be empty") String srcIP,
                                     @NotNull(message = "srcPort can not be null") Integer srcPort,
                                     @NotEmpty(message = "dstDBTypeId can not be empty") String dstDBTypeId,
                                     @NotEmpty(message = "dstDBId can not be empty") String dstDBId,
                                     @NotEmpty(message = "dstUser can not be empty") String dstUser,
                                     @NotEmpty(message = "dstPassword") String dstPassword,
                                     @NotEmpty(message = "migrateType can not be empty") String migrateType) {
        super("CreateDBTransferTask");
        this.region = region;
        this.zone = zone;
        this.taskName = taskName;
        this.srcDBTypeId = srcDBTypeId;
        this.srcInstanceTypeId = srcInstanceTypeId;
        this.srcUser = srcUser;
        this.srcPassword = srcPassword;
        this.srcIP = srcIP;
        this.srcPort = srcPort;
        this.dstDBTypeId = dstDBTypeId;
        this.dstDBId = dstDBId;
        this.dstUser = dstUser;
        this.dstPassword = dstPassword;
        this.migrateType = migrateType;
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

    public String getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(String migrateType) {
        this.migrateType = migrateType;
    }


}
