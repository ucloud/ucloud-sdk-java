package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建UDB实例的slave 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 14:40
 **/
public class CreateUDBSlaveResult extends BaseResponseResult {

    /**
     * 创建slave的DBId
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
