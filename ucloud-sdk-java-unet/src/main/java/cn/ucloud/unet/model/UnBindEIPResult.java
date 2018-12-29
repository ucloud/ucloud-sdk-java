package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 将弹性IP从资源上解绑 结果类
 * @author: codezhang
 * @date: 2018-09-27 11:53
 **/

public class UnBindEIPResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UnBindEIPResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
