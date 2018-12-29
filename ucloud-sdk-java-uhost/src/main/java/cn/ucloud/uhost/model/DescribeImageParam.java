package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取镜像列表 参数类
 * @author: codezhang
 * @date: 2018-09-18 16:23
 **/

public class DescribeImageParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * optional 镜像类型。
     * 标准镜像：Base，镜像市场：Business， 自定义镜像：Custom，
     * 默认返回所有类型
     */
    @UcloudParam("ImageType")
    private String imageType;

    /**
     * optional  操作系统类型：Linux， Windows 默认返回所有类型
     */
    @UcloudParam("OsType")
    private String osType;

    /**
     * optional 镜像Id
     */
    @UcloudParam("ImageId")
    private String imageId;

    /**
     * optional 列表起始位置偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional 返回数据长度，默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * optional 是否返回价格：1返回，0不返回；默认不返回
     */
    @UcloudParam("PriceSet")
    private Integer priceSet;

    public DescribeImageParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeImage");
        this.region = region;
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

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public Integer getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(Integer priceSet) {
        this.priceSet = priceSet;
    }
}
