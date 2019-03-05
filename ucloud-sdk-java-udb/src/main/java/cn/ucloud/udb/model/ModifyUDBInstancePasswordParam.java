package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改DB实例的管理员密码 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 18:42
 **/
public class ModifyUDBInstancePasswordParam extends BaseRequestParam {

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
     * SQLServer实例的ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 实例的新密码
     */
    @NotEmpty(message = "password can not be empty")
    @UcloudParam("Password")
    private String password;

    /**
     * sqlserver帐号，仅在sqlserver的情况下填该参数
     */
    @UcloudParam("AccountName")
    private String name;

    public ModifyUDBInstancePasswordParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "dbId can not be empty") String dbId,
                                          @NotEmpty(message = "password can not be empty") String password) {
        super("ModifyUDBInstancePassword");
        this.region = region;
        this.dbId = dbId;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
