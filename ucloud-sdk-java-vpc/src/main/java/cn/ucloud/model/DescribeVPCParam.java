package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取VPC信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:15
 **/

public class DescribeVPCParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 业务组名称
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional VPCIds
     */
    private List<String> vpcIds;

    @UcloudParam("VPCIds")
    public List<Param> checkVpcIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (vpcIds != null) {
            int len = vpcIds.size();
            for (int i = 0; i < len; i++) {
                list.add(new Param("VPCIds."+i,vpcIds.get(i)));
            }
        }
        return list;
    }

    public DescribeVPCParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeVPC");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getVpcIds() {
        return vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }
}
