package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  获取内容转发组信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 10:02
 **/

public class DescribePolicyGroupParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * optional 内容转发策略组ID
     */
    @UcloudParam("GroupId")
    private String groupId;


    /**
     * optional
     * 数据偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional
     * 数据分页值，默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribePolicyGroupParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribePolicyGroup");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
