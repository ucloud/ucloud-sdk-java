package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 调整高性能umem容量 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ResizeUDredisSpaceParam extends BaseRequestParam {
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
     * 高性能UMem 内存空间Id
     */
    @UcloudParam("SpaceId")
    @NotEmpty(message = "spaceId can not be empty")
    private String spaceId;
    /**
     * 内存大小, 单位:GB (需要大于原size,<= 1024)
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;
    /**
     * 使用的代金券Id
     */
    @UcloudParam("CouponId")
    private String couponId;


    public ResizeUDredisSpaceParam(String region
            , String spaceId
            , Integer size
    ) {
        super("ResizeUDredisSpace");
        this.region = region;
        this.spaceId = spaceId;
        this.size = size;
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

    public String getSpaceId() {
        return this.spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}