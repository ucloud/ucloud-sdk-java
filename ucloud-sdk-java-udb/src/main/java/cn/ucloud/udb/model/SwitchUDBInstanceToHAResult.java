package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 普通UDB切换为高可用 结果类
 * 普通UDB切换为高可用，原db状态为WaitForSwitch时，调用该api
 * @Author : codezhang
 * @Date : 2019-03-04 19:40
 **/
public class SwitchUDBInstanceToHAResult extends BaseResponseResult {

    /**
     * 切换后高可用db实例的Id
     */
    @SerializedName("DBId")
    private String dbId;

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }


}
