package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 将新创建的db恢复到指定db某个指定时间点
 * @Author : codezhang
 * @Date : 2019-03-01 22:23
 **/
public class CreateUDBInstanceByRecoveryResult extends BaseResponseResult {

    /**
     * db实例id
     */
    @SerializedName("DBId")
    private String dbId;

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "CreateUDBInstanceByRecoveryResult{" +
                "dbId='" + dbId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
