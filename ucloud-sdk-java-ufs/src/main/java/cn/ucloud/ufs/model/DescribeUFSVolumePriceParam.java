package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取文件系统价格 参数类
 * @author: codezhang
 * @date: 2018-10-08 16:19
 **/

public class DescribeUFSVolumePriceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 文件系统大小，大小1024G ~ 25600G (1T ~ 25T)，必须为1024的整数倍。
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;

    /**
     * optional
     * 计费模式，枚举值为：
     * Year，按年付费；
     * Month，按月付费；
     * Dynamic，按需付费（需开启权限）；
     * Trial，试用（需开启权限）
     * 默认为Dynamic
     */
    @UcloudParam("ChangeType")
    private String changeType;

    /**
     * optional 购买UFS的时长， 默认为1
     */
    @UcloudParam("Quantity")
    private Integer quantity;


    public DescribeUFSVolumePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotNull(message = "size can not be null") Integer size) {
        super("DescribeUFSVolumePrice");
        this.region = region;
        this.size = size;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
