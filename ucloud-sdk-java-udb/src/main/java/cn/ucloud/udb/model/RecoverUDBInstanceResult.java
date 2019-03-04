package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 将db恢复到某个指定时间点 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 18:58
 **/
public class RecoverUDBInstanceResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "RecoverUDBInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
