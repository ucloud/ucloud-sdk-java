package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取SSL证书信息 参数类
 * @author: codezhang
 * @date: 2018-09-20 14:11
 **/

public class DescribeSSLParam  extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional SSL证书的Id
     */
    @UcloudParam("SLLId")
    private String sslId;

    /**
     * optional
     * 数据偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional
     * 数据分页值，默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribeSSLParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeSSL");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
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
