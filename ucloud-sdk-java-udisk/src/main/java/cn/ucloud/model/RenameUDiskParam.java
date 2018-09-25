package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:56
 */
public class RenameUDiskParam extends BaseRequestParam {
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
     * uDiskId 重命名的UDisk的Id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * uDiskName 重命名UDisk的name
     */
    @NotEmpty(message = "uDiskName can not be empty")
    @UcloudParam("UDiskName")
    private String uDiskName;

    public RenameUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "zone can not be empty") String zone,
                            @NotEmpty(message = "uDiskId can not be empty") String uDiskId,
                            @NotEmpty(message = "UDiskName can not be empty") String uDiskName) {
        super("RenameUDisk");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
        this.uDiskName = uDiskName;
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

    public String getuDiskName() {
        return uDiskName;
    }

    public void setuDiskName(String uDiskName) {
        this.uDiskName = uDiskName;
    }
}
