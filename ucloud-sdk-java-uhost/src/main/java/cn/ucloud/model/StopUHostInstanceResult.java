package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 关闭主机操作结果类
 * @author: codezhang
 * @date: 2018-09-17 14:19
 **/

public class StopUHostInstanceResult extends BaseResponseResult {

    /**
     * 主机实例编号
     */
    private String uhostId;

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    @Override
    public String toString() {
        return "StopUHostInstanceResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
