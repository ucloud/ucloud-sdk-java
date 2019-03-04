package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 描述读写分离功能 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 16:04
 **/
public class DescribeUDBSplittingInfoParam extends BaseRequestParam {

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
     * DB实例ID
     */
    @NotEmpty(message = "masterDBId can not be null")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    public DescribeUDBSplittingInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "zone can not be empty") String zone,
                                         @NotEmpty(message = "masterDBId can not be null") String masterDBId) {
        super("DescribeUDBSplittingInfo");
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
        return "DescribeUDBSplittingInfoParam{" +
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
