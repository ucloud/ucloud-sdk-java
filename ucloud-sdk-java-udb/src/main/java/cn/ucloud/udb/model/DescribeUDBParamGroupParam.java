package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取参数信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 15:38
 **/
public class DescribeUDBParamGroupParam extends BaseRequestParam {

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
     * 分页显示的条目数，列表操作则指定
     */
    @NotNull(message = "limit can not be null")
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 分页显示的起始偏移，列表操作则指定
     */
    @UcloudParam("Offset")
    @NotNull(message = "offset can not be null")
    private Integer offset;

    /**
     * 参数组id，如果指定则获取描述，否则是列表操作，需要 指定Offset/Limit
     */
    @UcloudParam("GroupId")
    private String groupId;

    /**
     * 是否选取专区中配置
     */
    @UcloudParam("IsInUDBC")
    private Boolean isInUDBC;

    /**
     * 当请求没有填写Zone时，如果指定为true，表示只拉取跨可用区的相关配置文件，
     * 否则，拉取所有机房的配置文件（包括每个单可用区和跨可用区）
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;

    /**
     * 如果未指定GroupId，则可选是否选取特定DB类型的配置(sql, nosql, postgresql, sqlserver)
     */
    @UcloudParam("ClassType")
    private String classType;

    public DescribeUDBParamGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotNull(message = "limit can not be null") Integer limit,
                                      @NotNull(message = "offset can not be null") Integer offset) {
        super("DescribeUDBParamGroup");
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Boolean getInUDBC() {
        return isInUDBC;
    }

    public void setInUDBC(Boolean inUDBC) {
        isInUDBC = inUDBC;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


}
