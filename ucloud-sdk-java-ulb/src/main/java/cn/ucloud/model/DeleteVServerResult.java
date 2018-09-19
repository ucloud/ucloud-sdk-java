package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 删除VServer 结果类
 * @author: codezhang
 * @date: 2018-09-19 14:24
 **/

public class DeleteVServerResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteVServerResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
