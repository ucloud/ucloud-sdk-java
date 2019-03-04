package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 导入配置 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 19:56
 **/
public class UploadUDBParamGroupParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB类型id，DB类型id，mysql/mongodb/postgesql按版本细分
     * 1：mysql-5.1，2：mysql-5.5，3：percona-5.5，4：mysql-5.6，
     * 5：percona-5.6，6：mysql-5.7，7：percona-5.7，8：mariadb-10.0，
     * 9：mongodb-2.4，10：mongodb-2.6，11：mongodb-3.0，12：mongodb-3.2,
     * 13：postgresql-9.4，14：postgresql-9.6
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;

    /**
     * 配置参数组名称
     */
    @NotEmpty(message = "groupName can not be empty")
    @UcloudParam("GroupName")
    private String groupName;

    /**
     * 描述
     */
    @NotEmpty(message = "description can not be empty")
    @UcloudParam("Description")
    private String description;

    /**
     * 配置内容，导入的配置内容采用base64编码
     */
    @NotEmpty(message = "content can not be empty")
    @UcloudParam("Content")
    private String content;

    /**
     * 该配置文件是否是地域级别配置文件， 默认是false
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;

    /**
     * 配置文件子类型 0-未知, 1-Shardsvr-MMAPv1,
     * 2-Shardsvr-WiredTiger, 3-Configsvr-MMAPv1,
     * 4-Configsvr-WiredTiger, 5-Mongos
     */
    @UcloudParam("ParamGroupTypeId")
    private Integer paramGroupTypeId;

    public UploadUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId,
                                    @NotEmpty(message = "groupName can not be empty") String groupName,
                                    @NotEmpty(message = "description can not be empty") String description,
                                    @NotEmpty(message = "content can not be empty") String content) {
        super("UploadUDBParamGroup");
        this.region = region;
        this.zone = zone;
        this.dbTypeId = dbTypeId;
        this.groupName = groupName;
        this.description = description;
        this.content = content;
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

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    public Integer getParamGroupTypeId() {
        return paramGroupTypeId;
    }

    public void setParamGroupTypeId(Integer paramGroupTypeId) {
        this.paramGroupTypeId = paramGroupTypeId;
    }

    @Override
    public String toString() {
        return "UploadUDBParamGroupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbTypeId='" + dbTypeId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", regionFlag=" + regionFlag +
                ", paramGroupTypeId=" + paramGroupTypeId +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
