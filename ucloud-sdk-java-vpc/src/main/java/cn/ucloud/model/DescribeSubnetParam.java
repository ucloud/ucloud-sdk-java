package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取子网信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 16:09
 **/

public class DescribeSubnetParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * optional 子网id数组，适用于一次查询多个子网信息
     */
    private List<String> subnetIds;

    @UcloudParam("SubnetIds")
    public List<Param> checkSubnetIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (subnetIds != null) {
            int len = subnetIds.size();
            for (int i = 0; i < len; i++) {
                String id = subnetIds.get(i);
                if (id == null || id.length() <= 0){
                    throw  new ValidationException("SubnetIds["+i+"] can not be empty");
                }else {
                    list.add(new Param("SubnetIds."+i,id));
                }
            }
        }
        return list;
    }


    /**
     * optional 子网id，适用于一次查询一个子网信息
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional VPC资源id
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional 业务组名称，默认为Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 业务组
     */
    @UcloudParam("BusinessId")
    private String businessId;

    /**
     * optional 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;


    /**
     * optional 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;


    public DescribeSubnetParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeSubnet");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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
