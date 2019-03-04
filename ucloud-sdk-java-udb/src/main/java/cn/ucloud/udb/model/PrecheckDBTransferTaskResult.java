package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 数据迁移预检查 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 18:48
 **/
public class PrecheckDBTransferTaskResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "PrecheckDBTransferTaskResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
