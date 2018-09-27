package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 设置弹性IP计费方式 参数类
 * 设置弹性IP计费模式, 切换时会涉及付费/退费.
 * @author: codezhang
 * @date: 2018-09-27 14:25
 **/

public class SetEIPPayModeResult extends BaseResponseResult  {
    @Override
    public String toString() {
        return "SetEIPPayModeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
