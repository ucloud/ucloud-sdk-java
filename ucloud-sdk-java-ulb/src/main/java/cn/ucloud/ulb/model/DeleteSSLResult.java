package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除SSL 结果类
 * @author: codezhang
 * @date: 2018-09-20 19:25
 **/

public class DeleteSSLResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteSSLResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
