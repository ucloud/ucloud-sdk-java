package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 删除授权 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RemoveUSQLTokenResult extends BaseResponseResult {
    /**
     * 服务区域
     */
    @SerializedName("Region")
    private String region;
    /**
     * 数据源类型， 如ufile
     */
    @SerializedName("DataSource")
    private String dataSource;

    @SerializedName("Request")
    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }


}