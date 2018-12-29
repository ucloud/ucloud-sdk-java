package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除弹性IP上已附加带宽包 参数类
 * @author: codezhang
 * @date: 2018-09-27 16:14
 **/

public class DeleteBandwidthPackageParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 带宽包资源ID
     */
    @NotEmpty(message = "bandwidthPackageId can not be empty")
    @UcloudParam("BandwidthPackageId")
    private String bandwidthPackageId;

    public DeleteBandwidthPackageParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "bandwidthPackageId can not be empty") String bandwidthPackageId) {
        super("DeleteBandwidthPackage");
        this.region = region;
        this.bandwidthPackageId = bandwidthPackageId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }
}
