package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 从备份恢复数据至UDisk 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 15:55
 */
public class RestoreUDiskParam extends BaseRequestParam {
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
     * require  uDiskId 需要恢复的盘id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * optional SnapshotId 从指定的快照恢复
     */
    @UcloudParam("SnapshotId")
    private String snapshotId;

    /**
     * optional snapshotTime 指定从方舟恢复的备份时间点
     */
    @UcloudParam("SnapshotTime")
    private Integer snapshotTime;

    public RestoreUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "zone can not be empty") String zone,
                             @NotEmpty(message = "uDiskId can not be empty") String uDiskId) {
        super("RestoreUDisk");
        this.region = region;
        this.zone = zone;
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public Integer getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(Integer snapshotTime) {
        this.snapshotTime = snapshotTime;
    }
}
