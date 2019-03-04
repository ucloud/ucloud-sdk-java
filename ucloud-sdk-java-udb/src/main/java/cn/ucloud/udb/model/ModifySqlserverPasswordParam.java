package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 更改sqlserver密码
 * @Author : codezhang
 * @Date : 2019-03-04 18:35
 **/

public class ModifySqlserverPasswordParam extends BaseRequestParam {

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
     * SQLServer实例的ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * sqlserver账户名称
     */
    @UcloudParam("AccountName")
    @NotEmpty(message = "accountName can not be empty")
    private String accountName;

    /**
     * 新密码
     */
    @NotEmpty(message = "newPassword can not be empty")
    @UcloudParam("NewPassword")
    private String newPassword;

    public ModifySqlserverPasswordParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "zone can not be empty") String zone,
                                        @NotEmpty(message = "dbId can not be empty") String dbId,
                                        @NotEmpty(message = "accountName can not be empty") String accountName,
                                        @NotEmpty(message = "newPassword can not be empty") String newPassword) {
        super("ModifySqlserverPassword");
        this.region = region;
        this.zone = zone;
        this.dbId = dbId;
        this.accountName = accountName;
        this.newPassword = newPassword;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "ModifySqlserverPasswordParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
