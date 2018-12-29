package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 修改主机配置 参数类
 * 修改指定UHost实例的资源配置，如CPU核心数，内存容量大小，磁盘空间大小,网络增强等。
 * 警示信息: 1.修改配置前，请确认该实例已经被关闭。 2.修改磁盘空间大小后，请在启动后按照说明，进入操作系统进行操作。
 * 提示信息: 须按照控制台标准机型配置创建主机（例如：无法创建16核1G的非标准机型）。详情请参考控制台。
 * @author: codezhang
 * @date: 2018-09-18 11:52
 **/
public class ResizeUHostInstanceParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be null")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be null")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * optional 虚拟CPU核数，单位：个，
     * 系列1范围：[1,16]，系列2范围：[1,32]，最小值为1，其他值是2的倍数，
     * 默认值为当前实例的CPU核数
     */
    @UcloudParam("CPU")
    private Integer cpu;

    /**
     * optional 内存大小，单位：MB，范围[2048,131072]，步长：2048，
     * 默认值为当前实例的内存大小（BGP-C数据中心最小支持1024，限Linux系统）
     */
    @UcloudParam("Memory")
    private Integer memory;

    /**
     * optional
     * 数据盘大小，单位：GB，范围[10,1000]；
     * SSD机型，单位：GB，范围[100,500]；步长：10，默认值为当前实例的数据盘大小，
     * 数据盘不支持缩容，因此不允许输入比当前实例数据盘大小 小的值
     */
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * optional
     * 系统盘大小，单位：GB，范围[20,100]，步长：10，
     * 系统盘不支持缩容，因此不允许输入比当前实例系统盘小的值
     */
    @UcloudParam("BootDiskSpace")
    private Integer bootDiskSpace;

    /**
     * optional 网卡升降级（1，表示升级，2表示降级，0表示不变）
     */
    @UcloudParam("NetCapValue")
    private Integer netCapValue;

    public ResizeUHostInstanceParam(@NotEmpty(message = "region can not be null") String region,
                                    @NotEmpty(message = "uhostId can not be null") String uhostId) {
        super("ResizeUHostInstance");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Integer getBootDiskSpace() {
        return bootDiskSpace;
    }

    public void setBootDiskSpace(Integer bootDiskSpace) {
        this.bootDiskSpace = bootDiskSpace;
    }

    public Integer getNetCapValue() {
        return netCapValue;
    }

    public void setNetCapValue(Integer netCapValue) {
        this.netCapValue = netCapValue;
    }
}
