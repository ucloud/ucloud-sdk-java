package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 启用读写分离功能 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 16:25
 **/
public class EnableUDBRWSplittingParam extends BaseRequestParam {


    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例ID（master)
     */
    @NotEmpty(message = "masterDBId can not be empty")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    /**
     * 备份的可用区。用于创建跨可用区读写分离的一个节点，跨机房的读写分离必须有这个参数
     */
    @UcloudParam("BackupZone")
    private String backupZone;

    public EnableUDBRWSplittingParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "masterDBId can not be empty") String masterDBId) {
        super("EnableUDBRWSplitting");
        this.region = region;
        this.zone = zone;
        this.masterDBId = masterDBId;
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

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

}
