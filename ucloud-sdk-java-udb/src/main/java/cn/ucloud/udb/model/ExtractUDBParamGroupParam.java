package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取配置文件内容 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 17:13
 **/
public class ExtractUDBParamGroupParam extends BaseRequestParam {

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
     * 配置id
     */
    @NotNull(message = "groupId can not be null")
    @UcloudParam("GroupId")
    private Integer groupId;

    /**
     * 是否跨可用区，RegionFlag为true时表示跨可用区配置文件
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;

    public ExtractUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotNull(message = "groupId can not be null") Integer groupId) {
        super("ExtractUDBParamGroup");
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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    @Override
    public String toString() {
        return "ExtractUDBParamGroupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", groupId=" + groupId +
                ", regionFlag=" + regionFlag +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
