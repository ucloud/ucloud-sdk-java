package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  获取文件系统列表 参数类
 * @author: codezhang
 * @date: 2018-10-08 14:44
 **/

public class DescribeUFSVolumeParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 文件系统ID
     */
    @UcloudParam("VolumeId")
    private String volumeId;


    /**
     * optional 文件列表起始
     */
    @UcloudParam("Offset")
    private Integer offset;


    /**
     * optional 文件列表长度
     */
    @UcloudParam("Limit")
    private Integer limit;


    public DescribeUFSVolumeParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUFSVolume");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
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
