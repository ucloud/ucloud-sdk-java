package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:28
 */
public class DescribeUDiskUpgradePriceParam extends BaseRequestParam {
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
     * size 购买UDisk大小,单位:GB,范围[1~2000], 权限位控制可达8T,若需要请申请开通相关权限。
     */
    @NotEmpty(message = "size can not be empty")
    @UcloudParam("Size")
    private int size;

    /**
     * sourceId 升级目标UDisk ID
     */
    @NotEmpty(message = "sourceId can not be empty")
    @UcloudParam("SourceId")
    private String sourceId;

    /**
     * uDataArkMode 是否打开数据方舟, 打开"Yes",关闭"No", 默认关闭
     */
    @NotEmpty(message = "uDataArkMode can not be empty")
    @UcloudParam("UDataArkMode")
    private String uDataArkMode;

    /**
     * diskType 磁盘类型，SSDDataDisk:ssd数据盘,DataDisk:普通数据盘。默认为DataDisk
     */
    @UcloudParam("DiskType")
    private String diskType;

    public DescribeUDiskUpgradePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "zone can not be empty") String zone,
                                          @NotEmpty(message = "projectId can not be empty") String projectId,
                                          @NotEmpty(message = "size can not be empty") int size,
                                          @NotEmpty(message = "sourceId can not be empty") String sourceId,
                                          @NotEmpty(message = "uDataArkMode can not be empty") String uDataArkMode) {
        super("DescribeUDiskUpgradePrice");
        this.region = region;
        this.zone = zone;
        this.projectId = projectId;
        this.size = size;
        this.sourceId = sourceId;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
