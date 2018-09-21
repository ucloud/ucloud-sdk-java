package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取VPC互通信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 17:30
 **/

public class DescribeVPCIntercomParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 源VPC短ID
     */
    @NotEmpty(message = "vpcId can not be empty")
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional 地域。 目的所在地域（如果目的VPC和源VPC不在同一个地域，两个地域需要建立跨域通道，且该字段必选）
     */
    @UcloudParam("DstRegion")
    private String dstRegion;



    /**
     * optional 目的项目ID
     */
    @UcloudParam("DstProjectId")
    private String dstProjectId;

    public DescribeVPCIntercomParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "vpcId can not be empty") String vpcId) {
        super("DescribeVPCIntercom");
        this.region = region;
        this.vpcId = vpcId;
    }

    public String getDstRegion() {
        return dstRegion;
    }

    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    public String getDstProjectId() {
        return dstProjectId;
    }

    public void setDstProjectId(String dstProjectId) {
        this.dstProjectId = dstProjectId;
    }

    public String getRegion() {

        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
}
