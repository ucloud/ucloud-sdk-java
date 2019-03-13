package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 设置USQL授权的状态 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class EnableUSQLTokenResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 数据源名称， 如ufile
     */
    @SerializedName("DataSourceType")
    private String dataSourceType;
    /**
     * true： 该授权已经启用
     * false: 该授权已经关闭
     */
    @SerializedName("Enable")
    private Boolean enable;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


}