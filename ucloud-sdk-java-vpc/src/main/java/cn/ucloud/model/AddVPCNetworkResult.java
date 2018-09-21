package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description:  添加VPC网段 结果类
 * @author: codezhang
 * @date: 2018-09-21 15:29
 **/

public class AddVPCNetworkResult extends BaseResponseResult {

    @Override
    public String toString() {
        return "AddVPCNetworkResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
