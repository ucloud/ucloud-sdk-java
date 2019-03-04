package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 对sqlserver帐号授权 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:40
 **/
public class GrantAccountPrivilegesResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "GrantAccountPrivilegesResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
