package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 取消传输任务 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 11:39
 **/
public class CancelDBTransferTaskResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "CancelDBTransferTaskResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
