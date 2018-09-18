package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.exception.ValidatorException;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 11:16
 **/

public class GetUHostInstancePriceParam extends BaseRequestParam {

    public class UhostDisk {
        /**
         * require 磁盘大小，单位GB。系统盘的默认大小为镜像大小。数据盘必传。
         */
        //@NotEmpty(message = "uhost.disk.size can not be empty")
        private Integer size;


        /**
         * require
         * 磁盘类型。枚举值：
         * LOCAL_NORMAL 普通本地盘 |
         * CLOUD_NORMAL 普通云盘  |
         * LOCAL_SSD SSD本地盘    |
         * CLOUD_SSD SSD云盘     |
         * EXCLUSIVE_LOCAL_DISK 大数据，
         * 默认为LOCAL_NORMAL。
         * 磁盘仅支持有限组合，详情请查询控制台。
         */
        //@NotEmpty(message = "uhost.disk.type can not be empty")
        private String type;

        /**
         * require
         * 是否是系统盘。枚举值：True|False
         */
        //@NotEmpty(message = "uhost.disk.isboot can not be null")
        private Boolean isBoot;

        /**
         * optional
         * 磁盘备份
         * NONE| DATAARK
         */
        private String backupType;

        public UhostDisk(@NotEmpty(message = "uhost.disk.size can not be empty") Integer size,
                         @NotEmpty(message = "uhost.disk.type can not be empty") String type,
                         @NotEmpty(message = "uhost.disk.isboot can not be null") Boolean isBoot) {
            this.size = size;
            this.type = type;
            this.isBoot = isBoot;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getBoot() {
            return isBoot;
        }

        public void setBoot(Boolean boot) {
            isBoot = boot;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }
    }

    public GetUHostInstancePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "imageId can not be empty") String imageId,
                                      @NotEmpty(message = "cpu can not be empty") Integer cpu,
                                      @NotEmpty(message = "memory can not be empty") Integer memory,
                                      @NotEmpty(message = "count can not be empty") Integer count) {
        super("GetUHostInstancePrice");
        this.region = region;
        this.imageId = imageId;
        this.cpu = cpu;
        this.memory = memory;
        this.count = count;
    }

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require 镜像Id，可通过 [DescribeImage](describe_image.html) 获取镜像ID
     */
    @UcloudParam("ImageId")
    @NotEmpty(message = "imageId can not be empty")
    private String imageId;

    /**
     * require 虚拟CPU核心数，单位: 个，范围: [1,16]，最小值为1，其他值是2的整数倍
     */
    @UcloudParam("CPU")
    @NotEmpty(message = "cpu can not be empty")
    private Integer cpu;

    /**
     * require 内存容量大小，单位: MB，范围: [2048,65536]，步长: 2048。
     */
    @UcloudParam("Memory")
    @NotEmpty(message = "memory can not be empty")
    private Integer memory;

    /**
     * 购买台数，范围[1,5]
     */
    @UcloudParam("Count")
    @NotEmpty(message = "count can not be empty")
    private  Integer count;

    /**
     * 磁盘信息
     */
    private List<UhostDisk> disks;

    @UcloudParam("UhostDisk")
    public List<Param> checkUhostDisk() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getDisks() != null && this.getDisks().size() > 0) {
            List<UhostDisk> uhostDisks = this.getDisks();
            int len = uhostDisks.size();
            for (int i = 0; i < len; i++) {
                UhostDisk disk = uhostDisks.get(i);
                if (disk == null) {
                    throw new ValidatorException("uhost.disk[" + i + "] can not be null");
                } else {
                    if (disk.getSize() == null || disk.getSize() <= 0) {
                        throw new ValidatorException("uhost.disk[" + i + "].size can not be null or size <= 0");
                    }
                    if (disk.getBoot() == null) {
                        throw new ValidatorException("uhost.disk[" + i + "].isBoot can not be null");
                    }
                    if (disk.getType() == null || disk.getType().length() <= 0) {
                        throw new ValidatorException("uhost.disk[" + i + "].type can not be null");
                    }
                    list.add(new Param("Disks." + i + ".Size", disk.getSize()));
                    list.add(new Param("Disks." + i + ".Type", disk.getType()));
                    list.add(new Param("Disks." + i + ".IsBoot", disk.getBoot()));
                    if (disk.backupType != null && disk.getBackupType().length() > 0) {
                        list.add(new Param("Disks." + i + ".BackupType", disk.getBackupType()));
                    }
                }
            }
        }
        return list;
    }


    /**
     * optional GPU核心数，单位：个，范围[0，4]
     */
    @UcloudParam("GPU")
    private Integer gpu;

    /**
     * optional 计费类型。Year，Month，Dynamic，默认返回全部计费方式对应的价格
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional 磁盘类型，同时设定系统盘和数据盘，
     * 枚举值为：LocalDisk，本地磁盘;
     * UDisk，云硬盘;
     * 默认为LocalDisk 仅部分可用区支持云硬盘方式的主机存储方式，具体请查询控制台。
     */
    @UcloudParam("StorageType")
    private String storageType;

    /**
     *optional 数据盘大小，单位: GB，范围[0,1000]，步长: 10，默认值: 0
     */
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * optional 网络增强 默认是Normal， 目前仅支持Normal（不开启） 和 Super（开启网络增强）。
     * 不同机房的网络增强支持情况不同。详情请参考控制台。
     */
    @UcloudParam("NetCapability")
    private String netCapAbility;

    /**
     * optional 方舟机型。No，Yes。默认是No。
     */
    @UcloudParam("TimemachineFeature")
    private String timeMachineFeature;

    /**
     * optional
     * 主机类型 Normal: 标准机型
     * SSD：SSD机型
     * BigData:大数据
     * GPU:GPU型G1(原GPU型)
     * GPU_G2:GPU型G2
     * 不同机房的主机类型支持情况不同。详情请参考控制台。
     */
    @UcloudParam("UHostType")
    private String uhostType;

    /**
     * optional 1：普通云主机；2：抢占性云主机；默认普通
     */
    @UcloudParam("LifeCycle")
    private Integer lifeCycle;

    /**
     * optional 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。
     */
    @UcloudParam("Quantity")
    private Integer quantity;

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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<UhostDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<UhostDisk> disks) {
        this.disks = disks;
    }

    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getNetCapAbility() {
        return netCapAbility;
    }

    public void setNetCapAbility(String netCapAbility) {
        this.netCapAbility = netCapAbility;
    }

    public String getTimeMachineFeature() {
        return timeMachineFeature;
    }

    public void setTimeMachineFeature(String timeMachineFeature) {
        this.timeMachineFeature = timeMachineFeature;
    }

    public String getUhostType() {
        return uhostType;
    }

    public void setUhostType(String uhostType) {
        this.uhostType = uhostType;
    }

    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
