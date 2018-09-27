package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 删除弹性IP上已附加带宽包 结果类
 * @author: codezhang
 * @date: 2018-09-27 16:15
 **/

public class DeleteBandwidthPackageResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteBandwidthPackageResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
