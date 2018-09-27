package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 更新弹性IP属性 结果类
 * @author: codezhang
 * @date: 2018-09-27 11:01
 **/

public class UpdateEIPAttributeResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UpdateEIPAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
