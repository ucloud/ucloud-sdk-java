package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 查询主备Redis 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisGroupParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 组的ID,如果指定则获取描述，否则为列表操 作,需指定Offset/Limit
     */
    @UcloudParam("GroupId")
    private String groupId;
    /**
     * 分页显示的起始偏移, 默认值为0
     */
    @UcloudParam("Offset")
    private Integer offset;
    /**
     * 分页显示的条目数, 默认值为20
     */
    @UcloudParam("Limit")
    private Integer limit;


    public DescribeURedisGroupParam(String region
    ) {
        super("DescribeURedisGroup");
        this.region = region;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


}