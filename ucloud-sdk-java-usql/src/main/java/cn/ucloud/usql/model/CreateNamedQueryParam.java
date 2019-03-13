package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建命名SQL查询 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateNamedQueryParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * SQL查询的保存名称
     */
    @UcloudParam("QueryName")
    @NotEmpty(message = "queryName can not be empty")
    private String queryName;
    /**
     * SQL查询的SQL语句
     */
    @UcloudParam("QueryString")
    @NotEmpty(message = "queryString can not be empty")
    private String queryString;
    /**
     * SQL查询的描述
     */
    @UcloudParam("QueryDescription")
    private String queryDescription;


    public CreateNamedQueryParam(String region
            , String queryName
            , String queryString
    ) {
        super("CreateNamedQuery");
        this.region = region;
        this.queryName = queryName;
        this.queryString = queryString;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getQueryDescription() {
        return this.queryDescription;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }


}