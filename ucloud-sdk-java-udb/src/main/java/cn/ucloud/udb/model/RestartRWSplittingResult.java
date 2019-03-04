package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 读写分离中间件重启 结果类
 * 读写分离中间件重启，对应docker重启，但是ip不变
 * @Author : codezhang
 * @Date : 2019-03-04 19:11
 **/
public class RestartRWSplittingResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "RestartRWSplittingResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
