package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取指定ClassType的udb实例从库信息 参数对象
 * @Author : codezhang
 * @Date : 2019-03-04 15:53
 **/
public class DescribeUDBSlaveOrSecondaryInstanceParam extends BaseRequestParam {

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
     * 数据库实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * DB种类，分为SQL和NOSQL,取值分别为mysql、mongo
     */
    @NotEmpty(message = "classType can not be empty")
    @UcloudParam("ClassType")
    private String classType;

    public DescribeUDBSlaveOrSecondaryInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                                    @NotEmpty(message = "dbId can not be empty") String dbId,
                                                    @NotEmpty(message = "classType can not be empty") String classType) {
        super("DescribeUDBSlaveOrSecondaryInstance");
        this.region = region;
        this.dbId = dbId;
        this.classType = classType;
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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


}
