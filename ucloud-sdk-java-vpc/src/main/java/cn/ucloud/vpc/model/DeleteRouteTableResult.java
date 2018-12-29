package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除自定义路由表 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:42
 **/

public class DeleteRouteTableResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteRouteTableResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
