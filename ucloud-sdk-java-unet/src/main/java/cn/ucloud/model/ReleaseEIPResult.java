package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 释放弹性IP资源, 所释放弹性IP必须为非绑定状态. 结果类
 * @author: codezhang
 * @date: 2018-09-27 11:16
 **/

public class ReleaseEIPResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ReleaseEIPResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
