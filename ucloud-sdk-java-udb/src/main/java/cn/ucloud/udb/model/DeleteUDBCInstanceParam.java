package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 删除数据库专区 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 15:26
 **/
public class DeleteUDBCInstanceParam extends BaseRequestParam {

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
     * 专区ID
     */
    @NotEmpty(message = "udbcId can not be empty")
    @UcloudParam("UDBCId")
    private String udbcId;

    public DeleteUDBCInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   @NotEmpty(message = "udbcId can not be empty") String udbcId) {
        super("DeleteUDBCInstance");
        this.region = region;
        this.zone = zone;
        this.udbcId = udbcId;
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
        return "DeleteUDBCInstanceParam{" +
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
