package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 根据IP获取宿主机上未删除DB列表 参数对象
 * @Author : codezhang
 * @Date : 2019-03-04 13:44
 **/
public class DescribeUDBInstanceByHostIpParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 宿主机IP
     */
    @NotEmpty(message = "hostIP can not be empty")
    @UcloudParam("HostIp")
    private String hostIP;


    public DescribeUDBInstanceByHostIpParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "zone can not be empty") String zone,
                                            @NotEmpty(message = "hostIP can not be empty") String hostIP) {
        super("DescribeUDBInstanceByHostIp");
        this.region = region;
        this.zone = zone;
        this.hostIP = hostIP;
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

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }
}
