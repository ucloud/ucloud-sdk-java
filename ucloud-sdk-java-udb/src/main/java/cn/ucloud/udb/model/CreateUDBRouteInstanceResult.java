package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建mongos实例 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 14:26
 **/
public class CreateUDBRouteInstanceResult extends BaseResponseResult {

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

}
