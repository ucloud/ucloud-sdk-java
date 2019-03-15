package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建主备Redis备份 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateURedisBackupResult extends BaseResponseResult {
    /**
     * 备份id
     */
    @SerializedName("BackupId")
    private String backupId;


    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }


}