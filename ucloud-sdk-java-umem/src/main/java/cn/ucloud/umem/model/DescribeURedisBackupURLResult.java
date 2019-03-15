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


    public String getBackupURL() {
        return this.backupURL;
    }

    public void setBackupURL(String backupURL) {
        this.backupURL = backupURL;
    }


}