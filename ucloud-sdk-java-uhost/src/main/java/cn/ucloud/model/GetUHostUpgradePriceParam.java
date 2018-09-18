package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取升级配置价格
 * 获取UHost实例升级配置的价格。
 * 提示信息: 须按照控制台标准机型配置创建主机（例如：无法创建16核1G的非标准机型）。详情请参考控制台。
 * @author: codezhang
 * @date: 2018-09-18 17:43
 **/

public class GetUHostUpgradePriceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
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
    @NotEmpty(message = "uhostId can not be empty")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * optional 虚拟CPU核心数，单位: 个，范围: [1,16]，最小值为1，其他值是2的整数倍 默认值是该主机当前CPU数。
     */
    @UcloudParam("CPU")
    private Integer cpu;

    /**
     * optional 内存容量大小，单位: MB，范围: [2048,65536]，步长: 2048 北京BGP C机房最小支持1024（限Linux系统）。
     * 默认值是该主机当前内存大小。
     */
    @UcloudParam("Memory")
    private Integer memory;

    /**
     * optional 数据盘大小，单位: GB，范围[0,1000]，步长: 10， 默认值是该主机当前数据盘大小。
     */
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * optional 系统大小，单位: GB，范围[20,100]，步长: 10。
     */
    @UcloudParam("BootDiskSpace")
    private Integer bootDiskSpace;

    /**
     * optional 方舟机型。No，Yes。默认是No。
     */
    @UcloudParam("TimemachineFeature")
    private String timeMachineFeature;

    /**
     * optional 网卡升降级（1，表示升级，2表示降级，0表示不变）
     */
    @UcloudParam("NetCapability")
    private Integer netCapAbility;

    /**
     * optional 主机系列
     */
    @UcloudParam("HostType")
    private String hostType;


    public GetUHostUpgradePriceParam( @NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("GetUHostUpgradePrice");
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

    public String getTimeMachineFeature() {
        return timeMachineFeature;
    }

    public void setTimeMachineFeature(String timeMachineFeature) {
        this.timeMachineFeature = timeMachineFeature;
    }

    public Integer getNetCapAbility() {
        return netCapAbility;
    }

    public void setNetCapAbility(Integer netCapAbility) {
        this.netCapAbility = netCapAbility;
    }

    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }
}
