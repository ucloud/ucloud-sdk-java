package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 删除命名的SQL查询 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteNamedQueryResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 删除的已保存SQL的ID
     */
    @SerializedName("NamedQueryId")
    private String namedQueryId;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }


}