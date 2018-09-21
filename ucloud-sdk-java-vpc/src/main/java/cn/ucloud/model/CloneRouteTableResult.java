package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 克隆路由表 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:34
 **/

public class CloneRouteTableResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CloneRouteTableResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
