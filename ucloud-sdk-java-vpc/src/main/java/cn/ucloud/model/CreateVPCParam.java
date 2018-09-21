package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建VPC 参数类
 * @author: codezhang
 * @date: 2018-09-21 11:24
 **/

public class CreateVPCParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require VPC名称
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * require VPC网段
     */
    private List<String> network;

    @UcloudParam("Network")
    public List<Param> checkNetwork() throws Exception {
        List<Param> list = new ArrayList<>();
        if (network == null) {
            throw new ValidationException("network can not be null");
        } else {
            int len = network.size();
            for (int i = 0; i < len; i++) {
                String net = network.get(i);
                if (net == null || net.length() <= 0){
                    throw new ValidationException("network["+i+"] can not be null or empty");
                }else {
                    list.add(new Param("Network."+i, net));
                }
            }
        }
        return list;
    }

    /**
     * optional 业务组名称
     */
    private String tag;

    /**
     * optional 备注
     */
    private String remark;

    /**
     * optional VPC类型
     */
    private Integer type;

    public CreateVPCParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "name can not be empty") String name) {
        super("CreateVPC");
        this.region = region;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNetwork() {
        return network;
    }

    public void setNetwork(List<String> network) {
        this.network = network;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
