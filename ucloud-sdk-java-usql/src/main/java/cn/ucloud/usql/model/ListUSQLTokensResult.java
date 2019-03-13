package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取USQL相关授权列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListUSQLTokensResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 授权令牌总数
     */
    @SerializedName("TotalCount")
    private String totalCount;
    /**
     * 授权令牌集合
     */
    @SerializedName("Tokens")
    private List<Tokens> tokens;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }


    public List<Tokens> getTokens() {
        return this.tokens;
    }

    public void setTokens(List<Tokens> tokens) {
        this.tokens = tokens;
    }


}