package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:09
 **/

public class ReleaseVIPResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "ReleaseVIPResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
