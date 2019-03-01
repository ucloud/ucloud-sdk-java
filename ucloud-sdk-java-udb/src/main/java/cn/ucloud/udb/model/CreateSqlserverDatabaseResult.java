package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 创建sqlserver高可用镜像数据库
 * @Author : codezhang
 * @Date : 2019-03-01 18:41
 **/
public class CreateSqlserverDatabaseResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CreateSqlserverDatabaseResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
