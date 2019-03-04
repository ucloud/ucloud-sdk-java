package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :  关闭云数据库 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 19:33
 **/
public class StopUDBInstanceParam extends BaseRequestParam {

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
     * 是否使用强制手段关闭DB，默认是false
     */
    @UcloudParam("ForceToKill")
    private Boolean forceToKill;

    public StopUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("StopUDBInstance");
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

    public Boolean getForceToKill() {
        return forceToKill;
    }

    public void setForceToKill(Boolean forceToKill) {
        this.forceToKill = forceToKill;
    }

    @Override
    public String toString() {
        return "StopUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", forceToKill=" + forceToKill +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
