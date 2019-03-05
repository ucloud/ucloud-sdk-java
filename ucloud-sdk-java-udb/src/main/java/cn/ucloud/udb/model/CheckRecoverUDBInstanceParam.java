package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 核查db是否可以使用回档功能 参数对象
 * @Author : codezhang
 * @Date : 2019-03-01 11:53
 **/
public class CheckRecoverUDBInstanceParam extends BaseRequestParam {

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
    private String zone;

    /**
     * 源实例的Id(只支持普通版DB不支持高可用)
     */
    @NotEmpty(message = "srcDBId can not be empty")
    @UcloudParam("SrcDBId")
    private String srcDBId;

    public CheckRecoverUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "srcDBId can not be empty") String srcDBId) {
        super("CheckRecoverUDBInstance");
        this.region = region;
        this.srcDBId = srcDBId;
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

    public String getSrcDBId() {
        return srcDBId;
    }

    public void setSrcDBId(String srcDBId) {
        this.srcDBId = srcDBId;
    }

}
