package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建一个可以创建UDB的用户专享的区域 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 19:08
 **/
public class CreateUDBCInstanceResult extends BaseResponseResult {

    /**
     * 新建的数据库专区ID
     */
    @SerializedName("UDBCId")
    private String udbcId;


    public String getUdbCId() {
        return udbcId;
    }

    public void setUdbCId(String udbcId) {
        this.udbcId = udbcId;
    }

}
