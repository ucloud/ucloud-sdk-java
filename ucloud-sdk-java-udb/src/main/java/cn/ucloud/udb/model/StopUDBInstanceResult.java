package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 关闭云数据库 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 19:34
 **/
public class StopUDBInstanceResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "StopUDBInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
