package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB实例备份状态 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 12:00
 **/
public class DescribeUDBInstanceBackupStateResult extends BaseResponseResult {

    /**
     * 备份状态
     * 0 Backuping // 备份中
     * 1 Success // 备份成功
     * 2 Failed // 备份失败
     * 3 Expired // 备份过期
     */
    @SerializedName("State")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
