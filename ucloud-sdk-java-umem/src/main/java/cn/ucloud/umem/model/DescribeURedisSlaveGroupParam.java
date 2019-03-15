package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 查询主备Redis关联Slave 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisSlaveGroupParam extends BaseRequestParam {
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
     * 依赖的Master URedis Group ID
     */
    @UcloudParam("MasterGroupId")
    @NotEmpty(message = "masterGroupId can not be empty")
    private String masterGroupId;
    /**
     * Slave Redis Group ID,指定此ID，返回单个实例信息；否则返回Master Redis Group对应所有Slave Redis Group信息
     */
    @UcloudParam("GroupId")
    private String groupId;
    /**
     *
     */
    @UcloudParam("Offset")
    private String offset;
    /**
     *
     */
    @UcloudParam("Limit")
    private String limit;


    public DescribeURedisSlaveGroupParam(String region
            , String masterGroupId
    ) {
        super("DescribeURedisSlaveGroup");
        this.region = region;
        this.masterGroupId = masterGroupId;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getMasterGroupId() {
        return this.masterGroupId;
    }

    public void setMasterGroupId(String masterGroupId) {
        this.masterGroupId = masterGroupId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getOffset() {
        return this.offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return this.limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }


}