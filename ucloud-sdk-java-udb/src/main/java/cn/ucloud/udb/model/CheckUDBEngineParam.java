package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 检查数据库是否存在某种引擎的表，
 * 用于检查创建从库时是否需要锁库创建。
 * 只有由MyISAM引擎的表的库创建从库才需要锁库   参数类
 * @Author : codezhang
 * @Date : 2019-03-01 12:00
 **/
public class CheckUDBEngineParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;


    /**
     * 可用区。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 资源id，支持单点，高可用，跨可用区高可用
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 引擎类型，如MyISAM, InnoDB
     */
    @NotEmpty(message = "engineType can not be empty")
    @UcloudParam("EngineType")
    private String engineType;

    public CheckUDBEngineParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotEmpty(message = "dbId can not be empty") String dbId,
                               @NotEmpty(message = "engineType can not be empty") String engineType) {
        super("CheckUDBEngineParam");
        this.region = region;
        this.dbId = dbId;
        this.engineType = engineType;
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

}
