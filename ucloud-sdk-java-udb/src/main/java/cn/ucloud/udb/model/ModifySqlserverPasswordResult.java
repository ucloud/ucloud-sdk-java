package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 更改sqlserver密码 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 18:37
 **/
public class ModifySqlserverPasswordResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ModifySqlserverPasswordResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
