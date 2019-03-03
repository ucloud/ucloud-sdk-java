package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 删除sqlserver高可用镜像数据库 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 15:11
 **/
public class DeleteSqlserverDatabaseResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "DeleteSqlserverDatabaseResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
