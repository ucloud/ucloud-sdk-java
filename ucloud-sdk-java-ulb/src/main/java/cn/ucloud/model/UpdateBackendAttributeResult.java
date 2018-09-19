package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 更新后端实例属性 结果类
 * @author: codezhang
 * @date: 2018-09-19 17:40
 **/

public class UpdateBackendAttributeResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UpdateBackendAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
