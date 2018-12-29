package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 模拟主机掉电 参数类
 * 直接关闭UHost实例电源，无需等待实例正常关闭。
 * 警示信息: 该操作可能会影响数据完整性或导致文件系统损坏
 * @author: codezhang
 * @date: 2018-09-18 15:08
 **/

public class PoweroffUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID 参见 [DescribeUHostInstance](./describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be empty")
    @UcloudParam("UHostId")
    private String uhostId;

    public PoweroffUHostInstanceParam( @NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("PoweroffUHostInstance");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }
}
