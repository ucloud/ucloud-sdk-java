package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除VPC互通 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:05
 **/

public class DeleteVPCIntercomResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteVPCIntercomResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
