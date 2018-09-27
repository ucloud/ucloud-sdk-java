package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description:  更新内容转发组属性 结果类
 * @author: codezhang
 * @date: 2018-09-21 10:27
 **/

public class UpdatePolicyGroupAttributeResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "UpdatePolicyGroupAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
