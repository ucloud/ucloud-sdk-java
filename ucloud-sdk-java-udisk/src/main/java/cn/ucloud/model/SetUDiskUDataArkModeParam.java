package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 17:38
 */
public class SetUDiskUDataArkModeParam extends BaseRequestParam {
    /**
     * region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * uDiskId 需要设置数据方舟的UDisk的Id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * uDataArkMode 是否开启数据方舟，开启:"Yes", 不支持:"No"
     */
    @NotEmpty(message = "uDataArkMode can not be empty")
    @UcloudParam("UDataArkMode")
    private String uDataArkMode;


    public SetUDiskUDataArkModeParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "uDiskId can not be empty") String uDiskId,
                                     @NotEmpty(message = "projectId can not be empty") String projectId,
                                     @NotEmpty(message = "uDataArkMode can not be empty") String uDataArkMode) {
        super("SetUDiskUDataArkMode");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
        this.projectId = projectId;
        this.uDataArkMode = uDataArkMode;
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public String getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }
}
