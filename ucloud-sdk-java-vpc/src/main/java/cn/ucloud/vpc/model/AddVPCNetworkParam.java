package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 添加VPC网段 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:56
 **/

public class AddVPCNetworkParam extends BaseRequestParam {

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

    public AddVPCNetworkParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "vpcId can not be empty") String vpcId) {
        super("AddVPCNetwork");
        this.region = region;
        this.vpcId = vpcId;
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

    public List<String> getNetwork() {
        return network;
    }

    public void setNetwork(List<String> network) {
        this.network = network;
    }
}
