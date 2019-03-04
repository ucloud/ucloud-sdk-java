package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 设置读写分离 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 19:29
 **/
public class SetUDBRWSplittingResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "SetUDBRWSplittingResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
