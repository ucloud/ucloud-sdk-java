package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

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
