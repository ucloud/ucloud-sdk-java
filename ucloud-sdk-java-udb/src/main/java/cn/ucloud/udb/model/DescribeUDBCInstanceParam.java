package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取数据库专区的信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 10:36
 **/
public class DescribeUDBCInstanceParam extends BaseRequestParam {

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
     * 专区的id
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    public DescribeUDBCInstanceParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUDBCInstance");
        this.region = region;
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

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    @Override
    public String toString() {
        return "DescribeUDBCInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", udbcId='" + udbcId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
