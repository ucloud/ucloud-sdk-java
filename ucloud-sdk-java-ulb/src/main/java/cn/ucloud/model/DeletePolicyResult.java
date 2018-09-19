package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description:  删除转发策略 结果类
 * @author: codezhang
 * @date: 2018-09-19 18:48
 **/

public class DeletePolicyResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeletePolicyResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
