package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 删除负载均衡 结果类
 * @author: codezhang
 * @date: 2018-09-19 11:33
 **/

public class DeleteULBResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteULBResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
