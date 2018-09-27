package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:56
 */
public class AttachUDiskParam extends BaseRequestParam {
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
     * uHostId UHost实例ID
     */
    @NotEmpty(message = "uHostId can not be empty")
    @UcloudParam("UHostId")
    private String uHostId;

    /**
     * uDiskId 需要挂载的UDisk实例ID
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    public AttachUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "zone can not be empty") String zone,
                            @NotEmpty(message = "uHostId can not be empty") String uHostId,
                            @NotEmpty(message = "uDiskId can not be empty") String uDiskId) {
        super("AttachUDisk");
        this.region = region;
        this.zone = zone;
        this.uHostId = uHostId;
        this.uDiskId = uDiskId;
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

    public String getuHostId() {
        return uHostId;
    }

    public void setuHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }
}
