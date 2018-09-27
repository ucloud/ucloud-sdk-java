package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 16:27
 */
public class DescribeUDiskParam extends BaseRequestParam {
    /**
     * region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * uDiskId UDisk Id(留空返回全部)
     */
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * offset 数据偏移量, 默认为0
     */
    @UcloudParam("Offset")
    private int offset;

    /**
     * limit 返回数据长度, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit = 20;

    /**
     * diskType 普通数据盘:DataDisk|普通系统盘:SystemDisk|SSD数据盘:SSDDataDisk; 为空拉取所有
     */
    @UcloudParam("DiskType")
    private String diskType;

    public DescribeUDiskParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUDisk");
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
