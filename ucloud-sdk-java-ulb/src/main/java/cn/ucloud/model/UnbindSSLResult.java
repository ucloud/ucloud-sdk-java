package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 从VServer解绑SSL证书 结果类
 * @author: codezhang
 * @date: 2018-09-20 19:43
 **/

public class UnbindSSLResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UnbindSSLResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
