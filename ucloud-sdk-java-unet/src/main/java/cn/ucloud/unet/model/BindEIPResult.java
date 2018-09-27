package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 将尚未使用的弹性IP绑定到指定的资源 结果类
 * @author: codezhang
 * @date: 2018-09-27 11:25
 **/

public class BindEIPResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "BindEIPResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
