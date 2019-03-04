package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 读写分离中间件重启 参数类
 * 读写分离中间件重启，对应docker重启，但是ip不变
 * @Author : codezhang
 * @Date : 2019-03-04 19:09
 **/
public class RestartRWSplittingParam extends BaseRequestParam {
    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例ID
     */
    @NotEmpty(message = "masterDBId can not be empty")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    public RestartRWSplittingParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   @NotEmpty(message = "masterDBId can not be empty") String masterDBId) {
        super("RestartRWSplitting");
        this.region = region;
        this.zone = zone;
        this.masterDBId = masterDBId;
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

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    @Override
    public String toString() {
        return "RestartRWSplittingParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", masterDBId='" + masterDBId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
