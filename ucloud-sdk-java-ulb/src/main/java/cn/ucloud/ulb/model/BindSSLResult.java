package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 将SSL证书绑定到VServer 结果类
 * @author: codezhang
 * @date: 2018-09-20 19:38
 **/

public class BindSSLResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "BindSSLResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
