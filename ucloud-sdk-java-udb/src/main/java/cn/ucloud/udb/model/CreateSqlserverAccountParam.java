package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 创建sqlserver帐号 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 18:26
 **/
public class CreateSqlserverAccountParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
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
     * 帐号名
     */
    @NotEmpty(message = "accountName can not be empty")
    @UcloudParam("AccountName")
    private String accountName;

    /**
     * 帐号密码
     */
    @NotEmpty(message = "accountPassword can not be empty")
    @UcloudParam("AccountPassword")
    private String accountPassword;

    /**
     * DB实例Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    public CreateSqlserverAccountParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "accountName can not be empty") String accountName,
                                       @NotEmpty(message = "accountPassword can not be empty") String accountPassword,
                                       @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("CreateSqlServerAccountParam");
        this.region = region;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
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

    public String getAccountPasswored() {
        return accountPassword;
    }

    public void setAccountPasswored(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "CreateSqlserverAccountParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
