package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取云磁盘快照信息 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:06
 */
public class DescribeUDiskSnapshotParam extends BaseRequestParam {
    /**
     * require region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * optional offset 数据偏移量, 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional limit 返回数据长度, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit = 20;


    /**
     * optional uDiskId UDiskId,返回该盘所做快照.(必须同时传Zone)
     */
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * optional snapshotId 快照id，SnapshotId , UDiskId 同时传SnapshotId优先
     */
    @UcloudParam("SnapshotId")
    private String snapshotId;

    public DescribeUDiskSnapshotParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUDiskSnapshot");
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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
}
