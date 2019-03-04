package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 重启云数据库 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 19:14
 **/
public class RestartUDBInstanceResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "RestartUDBInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
