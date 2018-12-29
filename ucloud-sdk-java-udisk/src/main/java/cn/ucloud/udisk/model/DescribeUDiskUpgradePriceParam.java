package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取云磁盘配置改变的价格 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:28
 */
public class DescribeUDiskUpgradePriceParam extends BaseRequestParam {
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
     * require size 购买UDisk大小,单位:GB,范围[1~2000], 权限位控制可达8T,若需要请申请开通相关权限。
     */
    @NotNull(message = "size can not be empty")
    @UcloudParam("Size")
    private Integer size ;

    /**
     * require sourceId 升级目标UDisk ID
     */
    @NotEmpty(message = "sourceId can not be empty")
    @UcloudParam("SourceId")
    private String sourceId;

    /**
     * require uDataArkMode 是否打开数据方舟, 打开"Yes",关闭"No", 默认关闭
     */
    @NotEmpty(message = "uDataArkMode can not be empty")
    @UcloudParam("UDataArkMode")
    private String uDataArkMode ;

    /**
     * optional diskType 磁盘类型，SSDDataDisk:ssd数据盘,DataDisk:普通数据盘。默认为DataDisk
     */
    @UcloudParam("DiskType")
    private String diskType;

    public DescribeUDiskUpgradePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "zone can not be empty") String zone,
                                          @NotEmpty(message = "projectId can not be empty") String projectId,
                                          @NotEmpty(message = "size can not be empty") Integer size,
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
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
