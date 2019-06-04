package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除云主机 参数类
 * @author: codezhang
 * @date: 2018-09-17 18:44
 **/

public class TerminateUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String Region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost资源Id 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @UcloudParam("UHostId")
    @NotEmpty(message = "uhostId can not be empty")
    private String uhostId;

    /**
     * optional 是否直接删除，0表示按照原来的逻辑（有回收站权限，则进入回收站），1表示直接删除
     */
    @UcloudParam("Destroy")
    private Integer Destroy;

    /**
     * optional 是否释放绑定的EIP。true: 解绑EIP后，并释放；其他值或不填：解绑EIP。
     */
    @UcloudParam("ReleaseEIP")
    private Boolean releaseEIP;

    /**
     * 是否删除挂载的数据盘。true删除，其他不删除。
     */
    @UcloudParam("ReleaseUDisk")
    private Boolean releaseUDisk;

    /**
     * optional 是否释放绑定的EIP。yes: 解绑EIP后，并释放；其他值或不填：解绑EIP。
     */
    @Deprecated
    private String eipReleased;


    public TerminateUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("TerminateUHostInstance");
        this.Region = region;
        this.uhostId = uhostId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public Integer getDestroy() {
        return Destroy;
    }

    public void setDestroy(Integer destroy) {
        Destroy = destroy;
    }

    public Boolean getReleaseEIP() {
        return releaseEIP;
    }

    public void setReleaseEIP(Boolean releaseEIP) {
        this.releaseEIP = releaseEIP;
    }

    public Boolean getReleaseUDisk() {
        return releaseUDisk;
    }

    public void setReleaseUDisk(Boolean releaseUDisk) {
        this.releaseUDisk = releaseUDisk;
    }

    @Deprecated
    public String getEipReleased() {
        return eipReleased;
    }

    @Deprecated
    public void setEipReleased(String eipReleased) {
        this.eipReleased = eipReleased;
    }
}
