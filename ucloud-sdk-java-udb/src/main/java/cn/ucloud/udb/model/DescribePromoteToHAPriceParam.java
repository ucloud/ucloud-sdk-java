package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取单点升级高可用实例的差价 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 16:58
 **/
public class DescribePromoteToHAPriceParam extends BaseRequestParam {

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
     * DB实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    public DescribePromoteToHAPriceParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("DescribePromoteToHAPrice");
        this.region = region;
        this.dbId = dbId;
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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "DescribePromoteToHAPriceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
