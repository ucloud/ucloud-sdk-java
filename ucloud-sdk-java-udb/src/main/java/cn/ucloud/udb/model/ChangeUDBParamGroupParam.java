package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改配置文件 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 11:46
 **/
public class ChangeUDBParamGroupParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例Id
     */
    @UcloudParam("DBId")
    @NotEmpty(message = "dbId can not be empty")
    private String dbId;

    /**
     * 参数组Id
     */
    @UcloudParam("GroupId")
    @NotEmpty(message = "groupId can not be empty")
    private String groupId;

    public ChangeUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "dbId can not be empty") String dbId,
                                    @NotEmpty(message = "groupId can not be empty") String groupId) {
        super("ChangeUDBParamGroup");
        this.region = region;
        this.dbId = dbId;
        this.groupId = groupId;
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
