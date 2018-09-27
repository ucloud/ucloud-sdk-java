package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 修改弹性IP的外网出口权重 结果类
 * @author: codezhang
 * @date: 2018-09-27 12:20
 **/

public class ModifyEIPWeightResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ModifyEIPWeightResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
