package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建MongoDB的副本节点（包括仲裁） 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 14:04
 **/
public class CreateUDBReplicationInstanceResult extends BaseResponseResult {

    /**
     * 创建从节点的DBId
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
