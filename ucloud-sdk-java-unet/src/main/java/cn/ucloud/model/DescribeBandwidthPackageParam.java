package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取某地域下的带宽包信息 参数类
 * @author: codezhang
 * @date: 2018-09-27 15:46
 **/

public class DescribeBandwidthPackageParam extends BaseRequestParam {


    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 返回数据分页值, 取值范围为 [0,10000000] 之间的整数, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * optional 返回数据偏移量, 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeBandwidthPackageParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeBandwidthPackage");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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
