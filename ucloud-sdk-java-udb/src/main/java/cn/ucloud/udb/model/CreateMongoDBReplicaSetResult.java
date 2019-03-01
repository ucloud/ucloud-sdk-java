package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 创建DB副本集 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 18:23
 **/
public class CreateMongoDBReplicaSetResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CreateMongoDBReplicaSetResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
