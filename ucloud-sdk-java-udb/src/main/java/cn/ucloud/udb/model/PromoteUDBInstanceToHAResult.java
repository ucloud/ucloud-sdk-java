package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 普通db升级为高可用 结果类
 * 普通db升级为高可用(只针对mysql5.5及以上版本)
 * @Author : codezhang
 * @Date : 2019-03-04 18:51
 **/
public class PromoteUDBInstanceToHAResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "PromoteUDBInstanceToHAResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
