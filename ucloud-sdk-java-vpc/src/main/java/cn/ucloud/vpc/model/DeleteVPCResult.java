package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除VPC 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:09
 **/

public class DeleteVPCResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "DeleteVPCResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
