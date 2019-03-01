package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 备份云数据库 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 11:05
 **/
public class BackupUDBInstanceResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "BackupUDBInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
