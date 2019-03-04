package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 撤销帐号权限 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 19:15
 **/
public class RevokeAccountPrivilegesParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * sqlserver帐号
     */
    @NotEmpty(message = "accountName can not be empty")
    @UcloudParam("AccountName")
    private String accountName;

    /**
     * sqlserver数据库名
     */
    @NotEmpty(message = "dbName can not be empty")
    @UcloudParam("DBName")
    private String dbName;

    /**
     * DB实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    public RevokeAccountPrivilegesParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "accountName can not be empty") String accountName,
                                        @NotEmpty(message = "dbName can not be empty") String dbName,
                                        @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("RevokeAccountPrivileges");
        this.region = region;
        this.accountName = accountName;
        this.dbName = dbName;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "RevokeAccountPrivilegesParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", accountName='" + accountName + '\'' +
                ", dbName='" + dbName + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
