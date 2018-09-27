package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除内容转发组 结果类
 * @author: codezhang
 * @date: 2018-09-21 10:19
 **/

public class DeletePolicyGroupResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeletePolicyGroupResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
