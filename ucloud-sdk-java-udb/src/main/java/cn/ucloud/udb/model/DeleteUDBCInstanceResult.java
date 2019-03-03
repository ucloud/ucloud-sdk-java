package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 删除数据库专区 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 15:31
 **/
public class DeleteUDBCInstanceResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "DeleteUDBCInstanceResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
