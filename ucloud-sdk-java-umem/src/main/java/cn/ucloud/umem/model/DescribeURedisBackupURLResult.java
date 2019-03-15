package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取主备Redis备份下载链接 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisBackupURLResult extends BaseResponseResult {
    /**
     * 备份文件公网的地址
     */
    @SerializedName("BackupURL")
    private String backupURL;

    @SerializedName("BackupPath")
    private String backupPath;

    @SerializedName("InnerBackupPath")
    private String innerBackupPath;

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public String getInnerBackupPath() {
        return innerBackupPath;
    }

    public void setInnerBackupPath(String innerBackupPath) {
        this.innerBackupPath = innerBackupPath;
    }

    public String getBackupURL() {
        return this.backupURL;
    }

    public void setBackupURL(String backupURL) {
        this.backupURL = backupURL;
    }


}