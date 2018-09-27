package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 调整弹性IP的外网带宽 参数类
 * @author: codezhang
 * @date: 2018-09-27 12:00
 **/

public class ModifyEIPBandwidthResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ModifyEIPBandwidthResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
