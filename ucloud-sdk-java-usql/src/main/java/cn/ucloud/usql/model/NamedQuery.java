package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 已保存SQL查询详细信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class NamedQuery {
    /**
     * 已保存查询ID
     */
    @SerializedName("NamedQueryId")
    private Integer namedQueryId;
    /**
     * 查询名称
     */
    @SerializedName("QueryName")
    private String queryName;
    /**
     * 查询描述
     */
    @SerializedName("QueryDescription")
    private String queryDescription;
    /**
     * 查询SQL语句
     */
    @SerializedName("QueryString")
    private String queryString;
    /**
     * 查询创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;


    public Integer getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(Integer namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryDescription() {
        return this.queryDescription;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


}