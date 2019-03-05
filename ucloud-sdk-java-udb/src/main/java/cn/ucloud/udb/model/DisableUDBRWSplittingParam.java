package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 关闭读写分离功能 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 16:25
 **/
public class DisableUDBRWSplittingParam extends BaseRequestParam {


    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
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
     * DB实例ID（master)
     */
    @NotEmpty(message = "masterDBId can not be empty")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    public DisableUDBRWSplittingParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "zone can not be empty") String zone,
                                      @NotEmpty(message = "masterDBId can not be empty") String masterDBId) {
        super("DisableUDBRWSplitting");
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

}
