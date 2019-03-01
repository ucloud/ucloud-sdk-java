package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 创建sqlserver帐号 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 18:30
 **/
public class CreateSqlserverAccountResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CreateSqlserverAccountResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
