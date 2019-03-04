package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 根据备份获取UDB实例信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 13:40
 **/
public class DescribeUDBInstanceByBackupResult extends BaseResponseResult {

    /**
     * UDB实例模式类型
     */
    @SerializedName("InstanceMode")
    private String instanceMode;

    /**
     * DB类型id
     */
    @SerializedName("UDBTypeId")
    private String udbTypeId;

    /**
     * UDB实例类型
     */
    @SerializedName("InstanceType")
    private String InstanceType;

    /**
     * 内存限制(MB)
     */
    @SerializedName("MemoryLimit")
    private Integer memoryLimit;

    /**
     * 磁盘空间(GB)
     */
    @SerializedName("DiskSpace")
    private Integer diskSpace;

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getUdbTypeId() {
        return udbTypeId;
    }

    public void setUdbTypeId(String udbTypeId) {
        this.udbTypeId = udbTypeId;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "DescribeUDBInstanceByBackupResult{" +
                "instanceMode='" + instanceMode + '\'' +
                ", udbTypeId='" + udbTypeId + '\'' +
                ", InstanceType='" + InstanceType + '\'' +
                ", memoryLimit=" + memoryLimit +
                ", diskSpace=" + diskSpace +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
