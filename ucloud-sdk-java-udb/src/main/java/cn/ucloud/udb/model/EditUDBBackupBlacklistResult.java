package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 编辑备份黑名单 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:04
 **/
public class EditUDBBackupBlacklistResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "EditUDBBackupBlacklistResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
