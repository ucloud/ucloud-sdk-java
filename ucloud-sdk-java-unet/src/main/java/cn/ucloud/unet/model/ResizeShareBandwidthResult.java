package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 调整共享带宽的带宽值 结果类
 * @author: codezhang
 * @date: 2018-09-27 17:33
 **/

public class ResizeShareBandwidthResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ResizeShareBandwidthResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
