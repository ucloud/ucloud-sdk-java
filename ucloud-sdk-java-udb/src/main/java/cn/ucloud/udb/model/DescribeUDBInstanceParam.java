package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取云数据库信息 参数类
 * 获取UDB实例信息，支持两类操作：
 * （1）指定DBId用于获取该db的信息；
 * （2）指定ClassType、Offset、Limit用于列表操作，查询某一个类型db。
 * @Author : codezhang
 * @Date : 2019-03-04 11:11
 **/
public class DescribeUDBInstanceParam extends BaseRequestParam {

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
     * DB种类，如果是列表操作，则需要指定,不区分大小写，其取值如下：
     * mysql: SQL mongo: NOSQL postgresql: postgresql
     */
    @NotEmpty(message = "classType can not be empty")
    @UcloudParam("ClassType")
    private String classType;

    /**
     * 分页显示数量，列表操作则指定
     */
    @UcloudParam("Limit")
    @NotNull(message = "limit can not be null")
    private Integer limit;

    /**
     * 分页显示起始偏移位置，列表操作则指定
     */
    @UcloudParam("Offset")
    @NotNull(message = "offset can not be null")
    private Integer offset;

    /**
     * DB实例id，如果指定则获取描述，否则为列表操作，
     * 指定Offset/Limit/ClassType DBId可通过DescribeUDBInstance获取
     */
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 是否查看专区里面DB
     */
    @UcloudParam("IsInUDBC")
    private Boolean isInUDBC;

    /**
     * IsInUDBC为True,UDBCId为空，说明查看整个可用区的专区的db，如果UDBId不为空则只查看此专区下面的db
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    /**
     * 当只获取这个特定DBId的信息时，如果有该选项，那么把这个DBId实例的所有从库信息一起拉取并返回
     */
    @UcloudParam("IncludeSlaves")
    private Boolean includeSlaves;

    public DescribeUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotNull(message = "limit can not be null") Integer limit,
                                    @NotNull(message = "offset can not be null") Integer offset) {
        super("DescribeUDBInstance");
        this.region = region;
        this.limit = limit;
        this.offset = offset;
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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public Boolean getInUDBC() {
        return isInUDBC;
    }

    public void setInUDBC(Boolean inUDBC) {
        isInUDBC = inUDBC;
    }

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    public Boolean getIncludeSlaves() {
        return includeSlaves;
    }

    public void setIncludeSlaves(Boolean includeSlaves) {
        this.includeSlaves = includeSlaves;
    }

    @Override
    public String toString() {
        return "DescribeUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", classType='" + classType + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", dbId='" + dbId + '\'' +
                ", isInUDBC=" + isInUDBC +
                ", udbcId='" + udbcId + '\'' +
                ", includeSlaves=" + includeSlaves +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
