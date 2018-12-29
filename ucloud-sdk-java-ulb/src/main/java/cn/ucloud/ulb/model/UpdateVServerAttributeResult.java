package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 更新VServer属性 结果类
 * @author: codezhang
 * @date: 2018-09-19 14:43
 **/

public class UpdateVServerAttributeResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "UpdateVServerAttributeResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
