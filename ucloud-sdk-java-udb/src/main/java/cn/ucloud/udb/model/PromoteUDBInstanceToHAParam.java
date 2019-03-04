package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 普通db升级为高可用 参数类
 * 普通db升级为高可用(只针对mysql5.5及以上版本)
 * @Author : codezhang
 * @Date : 2019-03-04 18:49
 **/
public class PromoteUDBInstanceToHAParam extends BaseRequestParam {
    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;
    
    /**
     * DB实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    public PromoteUDBInstanceToHAParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("PromoteUDBInstanceToHA");
        this.region = region;
        this.dbId = dbId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "PromoteUDBInstanceToHAParam{" +
                "region='" + region + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
