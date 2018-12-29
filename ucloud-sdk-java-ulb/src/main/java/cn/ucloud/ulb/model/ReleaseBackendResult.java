package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 释放后端实例 结果类
 * @author: codezhang
 * @date: 2018-09-19 15:13
 **/

public class ReleaseBackendResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ReleaseBackendResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
