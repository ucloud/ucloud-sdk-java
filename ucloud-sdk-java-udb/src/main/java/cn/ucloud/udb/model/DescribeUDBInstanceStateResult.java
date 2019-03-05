package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB实例状态 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 14:40
 **/
public class DescribeUDBInstanceStateResult extends BaseResponseResult {
    /**
     * DB状态标记
     * Init：初始化中；
     * Fail：安装失败；
     * Starting：启动中；
     * Running ： 运行 ；
     * Shutdown：关闭中；
     * Shutoff ：已关闭；
     * Delete：已删除；
     * Upgrading：升级中；
     * Promoting： 提升为独库进行中；
     * Recovering： 恢复中；
     * Recover fail：恢复失败。
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
