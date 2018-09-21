package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 绑定子网的路由表 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:16
 **/

public class AssociateRouteTableResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "AssociateRouteTableResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
