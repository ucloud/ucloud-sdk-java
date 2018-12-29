package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 删除子网 结果类
 * @author: codezhang
 * @date: 2018-09-21 16:04
 **/

public class DeleteSubnetResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteSubnetResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
