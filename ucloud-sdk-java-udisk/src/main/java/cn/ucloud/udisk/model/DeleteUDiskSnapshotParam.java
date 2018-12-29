package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除云磁盘快照 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 11:48
 */
public class DeleteUDiskSnapshotParam extends BaseRequestParam {
    /**
     * require region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * require SnapshotId 快照Id
     */
    @NotEmpty(message = "snapshotId can not be empty")
    @UcloudParam("SnapshotId")
    private String snapshotId;

    /**
     * optional uDiskId UDisk Id,删除该盘所创建出来的所有快照
     */
    @UcloudParam("UDiskId")
    private String uDiskId;


    public DeleteUDiskSnapshotParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "snapshotId can not be empty") String snapshotId) {
        super("DeleteUDiskSnapshot");
        this.region = region;
        this.zone = zone;
        this.snapshotId = snapshotId;
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

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }
}
