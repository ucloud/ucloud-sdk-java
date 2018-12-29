package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取VServer信息 参数类
 * 获取ULB下的VServer的详细信息
 * 警示信息: VServerId 对应 CreateVServer 返回的 VServerId 或者 DescribeULB 返回的 ULBVServerSet 中的 VServerId
 * @author: codezhang
 * @date: 2018-09-19 12:06
 **/

public class DescribeVServerParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例的Id
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * optional VServer实例的Id；若指定则返回指定的VServer实例的信息；
     * 若不指定则返回当前负载均衡实例下所有VServer的信息
     */
    @UcloudParam("VServerId")
    private String vserverId;

    /**
     * optional 数据分页值
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     *  optional 数据偏移量
     */
    @UcloudParam("Offset")
    private Integer offset;


    public DescribeVServerParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "ulbId can not be empty") String ulbId) {
        super("DescribeVServer");
        this.region = region;
        this.ulbId = ulbId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
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
}
