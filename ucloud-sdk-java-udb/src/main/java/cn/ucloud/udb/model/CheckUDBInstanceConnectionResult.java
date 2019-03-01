package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description :检测ucloudbackup账号连通性
 * @Author : codezhang
 * @Date : 2019-03-01 14:15
 **/
public class CheckUDBInstanceConnectionResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CheckUDBInstanceConnectionResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
