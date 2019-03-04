package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 更新配置 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 19:52
 **/
public class UpdateUDBParamGroupParam extends BaseRequestParam {

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
     * 配置参数组id，使用DescribeUDBParamGroup获得
     */
    @NotNull(message = "groupId can not be null")
    @UcloudParam("GroupId")
    private Integer groupId;

    /**
     * 参数名称
     */
    @NotEmpty(message = "key can not be empty")
    @UcloudParam("Key")
    private String key;

    /**
     * 参数值
     */
    @NotEmpty(message = "value can not be empty")
    @UcloudParam("Value")
    private String value;

    /**
     * 该配置文件是否是地域级别配置文件， 默认是false
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;

    public UpdateUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotNull(message = "groupId can not be null") Integer groupId,
                                    @NotEmpty(message = "key can not be empty") String key,
                                    @NotEmpty(message = "value can not be empty") String value) {
        super("UpdateUDBParamGroup");
        this.region = region;
        this.zone = zone;
        this.groupId = groupId;
        this.key = key;
        this.value = value;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    @Override
    public String toString() {
        return "UpdateUDBParamGroupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", groupId=" + groupId +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", regionFlag=" + regionFlag +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
