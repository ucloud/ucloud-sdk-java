package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 删除sqlserver帐号 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 14:58
 **/
public class DeleteSqlserverAccountParam extends BaseRequestParam {

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
     * DB实例Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * sqlserver帐号
     */
    @NotEmpty(message = "accountName can not be empty")
    @UcloudParam("AccountName")
    private String accountName;

    public DeleteSqlserverAccountParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "dbId can not be empty") String dbId,
                                       @NotEmpty(message = "accountName can not be empty") String accountName) {
        super("DeleteSqlserverAccount");
        this.region = region;
        this.dbId = dbId;
        this.accountName = accountName;
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


}
