package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 更新子网信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 17:09
 **/

public class UpdateSubnetAttributeResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UpdateSubnetAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
