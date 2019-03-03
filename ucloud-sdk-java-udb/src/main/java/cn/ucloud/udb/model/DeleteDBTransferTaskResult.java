package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 删除数据迁移任务 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 14:55
 **/
public class DeleteDBTransferTaskResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "DeleteDBTransferTaskResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
