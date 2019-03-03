package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 拉取sqlserver实例下数据库列表 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 17:21
 **/
public class DescribeSqlserverDatabasesParam extends BaseRequestParam {

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
     * 数据库名称，如果不传，拉取所有
     */
    @NotEmpty(message = "dbName can not be empty")
    @UcloudParam("DBName can not be empty")
    private String dbName;

    /**
     * 返回数据长度，默认为0
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 列表起始位置偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeSqlserverDatabasesParam(@NotEmpty(message = "region can not be empty") String region,
                                           @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("DescribeSqlserverDatabases");
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

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
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

    @Override
    public String toString() {
        return "DescribeSqlserverDatabasesParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", dbName='" + dbName + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
