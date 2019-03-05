package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 根据配置文件获取UDB实例信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 13:50
 **/
public class DescribeUDBInstanceByParamGroupParam extends BaseRequestParam {

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
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 参数组id
     */
    @NotEmpty(message = "groupId can not be empty")
    @UcloudParam("GroupId")
    private String groupId;

    /**
     * 是否是跨可用区的配置文件
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;

    public DescribeUDBInstanceByParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                                @NotEmpty(message = "zone can not be empty") String zone,
                                                @NotEmpty(message = "groupId can not be empty") String groupId) {
        super("DescribeUDBInstanceByParamGroup");
        this.region = region;
        this.zone = zone;
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}
