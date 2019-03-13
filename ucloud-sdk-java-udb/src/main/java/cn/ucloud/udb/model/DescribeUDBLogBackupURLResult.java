package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB的slowlog备份地址 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 15:16
 **/
public class DescribeUDBLogBackupURLResult extends BaseResponseResult {

    /**
     * DB实例备份文件的地址
     */
    @SerializedName("BackupPath")
    private String backupPath;

    /**
     * 用户网地址
     */
    @SerializedName("UsernetPath")
    private String userNetPath;

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

}
