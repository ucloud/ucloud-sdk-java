package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 开通共享带宽 结果类
 * @author: codezhang
 * @date: 2018-09-27 16:40
 **/

public class AllocateShareBandwidthResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "AllocateShareBandwidthResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
