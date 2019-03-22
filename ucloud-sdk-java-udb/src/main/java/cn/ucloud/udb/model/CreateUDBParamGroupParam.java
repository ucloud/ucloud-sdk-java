package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 从已有配置文件创建新配置文件 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 22:28
 **/
public class CreateUDBParamGroupParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 新配置参数组名称
     */
    @NotEmpty(message = "groupName can not be empty")
    @UcloudParam("GroupName")
    private String groupName;

    /**
     * 参数组描述
     */
    @NotEmpty(message = "description can not be empty")
    @UcloudParam("Description")
    private String description;

    /**
     * 源参数组id
     */
    @NotNull(message = "srcGroupId can not be null")
    @UcloudParam("SrcGroupId")
    private Integer srcGroupId;


    /**
     * DB类型id，mysql/mongodb/postgesql按版本细分
     * 1：mysql-5.1，2：mysql-5.5，
     * 3：percona-5.5，4：mysql-5.6，
     * 5：percona-5.6，6：mysql-5.7，
     * 7：percona-5.7，8：mariadb-10.0，
     * 9：mongodb-2.4，10：mongodb-2.6，
     * 11：mongodb-3.0，12：mongodb-3.2,
     * 13：postgresql-9.4，14：postgresql-9.6
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;


    /**
     * 是否是地域级别的配置文件，默认是false
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;


    public CreateUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "groupName can not be empty") String groupName,
                                    @NotEmpty(message = "description can not be empty") String description,
                                    @NotNull(message = "srcGroupId can not be null") Integer srcGroupId,
                                    @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId) {
        super("CreateUDBParamGroup");
        this.region = region;
        this.zone = zone;
        this.groupName = groupName;
        this.description = description;
        this.srcGroupId = srcGroupId;
        this.dbTypeId = dbTypeId;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSrcGroupId() {
        return srcGroupId;
    }

    public void setSrcGroupId(Integer srcGroupId) {
        this.srcGroupId = srcGroupId;
    }

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

}
