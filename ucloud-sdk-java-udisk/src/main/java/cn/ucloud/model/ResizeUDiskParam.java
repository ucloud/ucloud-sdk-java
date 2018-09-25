package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:58
 */
public class ResizeUDiskParam extends BaseRequestParam {
    /**
     * region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * uDiskId UDisk Id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * size 调整后大小, 单位:GB, 范围[1~2000],权限位控制可达8000,若需要请申请开通相关权限。
     */
    @NotEmpty(message = "size can not be empty")
    @UcloudParam("Size")
    private int size;

    /**
     * couponId 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public ResizeUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "zone can not be empty") String zone,
                            @NotEmpty(message = "uDiskId can not be empty") String uDiskId,
                            @NotEmpty(message = "size can not be empty") int size) {
        super("ResizeUDisk");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
        this.size = size;
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
