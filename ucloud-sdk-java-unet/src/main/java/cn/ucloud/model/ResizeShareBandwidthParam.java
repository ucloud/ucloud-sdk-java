package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 调整共享带宽的带宽值 参数类
 * @author: codezhang
 * @date: 2018-09-27 17:33
 **/

public class ResizeShareBandwidthParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 带宽值，单位为Mb，范围 [20-5000] (最大值受地域限制)
     */
    @NotNull(message = "shareBandwidth can not be null")
    @UcloudParam("ShareBandwidth")
    private Integer shareBandwidth;

    /**
     * require 共享带宽的Id
     */
    @NotEmpty(message = "shareBandwidthId can not be empty")
    @UcloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    public ResizeShareBandwidthParam( @NotEmpty(message = "region can not be empty") String region,
                                      @NotNull(message = "shareBandwidth can not be null") Integer shareBandwidth,
                                      @NotEmpty(message = "shareBandwidthId can not be empty") String shareBandwidthId) {
        super("ResizeShareBandwidth");
        this.region = region;
        this.shareBandwidth = shareBandwidth;
        this.shareBandwidthId = shareBandwidthId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getShareBandwidth() {
        return shareBandwidth;
    }

    public void setShareBandwidth(Integer shareBandwidth) {
        this.shareBandwidth = shareBandwidth;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }
}
