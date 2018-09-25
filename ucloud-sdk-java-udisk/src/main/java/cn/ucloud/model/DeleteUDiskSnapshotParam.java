package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 11:48
 */
public class DeleteUDiskSnapshotParam extends BaseRequestParam {
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
     * projectId 项目编号
     */
    @UcloudParam("ProjectId")
    private String projectId;

    /**
     * SnapshotId 快照Id
     */
    @NotEmpty(message = "snapshotId can not be empty")
    @UcloudParam("SnapshotId")
    private String snapshotId;

    /**
     * uDiskId UDisk Id,删除该盘所创建出来的所有快照
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

    @Override
    public String getProjectId() {
        return projectId;
    }

    @Override
    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
