package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 新建VPC互通 结果类
 * @author: codezhang
 * @date: 2018-09-21 17:22
 **/

public class CreateVPCIntercomResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CreateVPCIntercomResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
