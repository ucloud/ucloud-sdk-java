package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 删除云数据库 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 15:40
 **/
public class DeleteUDBInstanceResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "DeleteUDBInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
