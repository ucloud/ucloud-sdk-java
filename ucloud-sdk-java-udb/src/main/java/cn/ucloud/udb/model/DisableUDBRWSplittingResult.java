package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 关闭DB的读写分离功能 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 16:27
 **/
public class DisableUDBRWSplittingResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "DisableUDBRWSplittingResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
