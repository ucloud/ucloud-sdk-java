package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 备份UDB指定时间段的errorlog 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 11:24
 **/
public class BackupUDBInstanceErrorLogResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "BackupUDBInstanceErrorLogResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
