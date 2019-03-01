package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 清除UDB实例的log 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 15:06
 **/
public class ClearUDBLogResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ClearUDBLogResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
