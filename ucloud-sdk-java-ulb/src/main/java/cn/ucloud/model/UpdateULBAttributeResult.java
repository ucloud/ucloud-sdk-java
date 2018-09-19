package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 更新负载均衡属性
 * @author: codezhang
 * @date: 2018-09-19 11:43
 **/

public class UpdateULBAttributeResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UpdateULBAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
