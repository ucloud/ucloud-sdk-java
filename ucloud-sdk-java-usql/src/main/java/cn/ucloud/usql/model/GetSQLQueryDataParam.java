package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取SQL查询结果 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryDataParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * SQL查询ID
     */
    @UcloudParam("QueryId")
    @NotEmpty(message = "queryId can not be empty")
    private String queryId;
    /**
     * 获取的数据记录数上限
     */
    @UcloudParam("Limit")
    @NotNull(message = "limit can not be null")
    private Integer limit;
    /**
     * 数据记录偏移，从开始位置获取的时候不需要填写。
     */
    @UcloudParam("Marker")
    private String marker;


    public GetSQLQueryDataParam(String region
            , String queryId
            , Integer limit
    ) {
        super("GetSQLQueryData");
        this.region = region;
        this.queryId = queryId;
        this.limit = limit;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getQueryId() {
        return this.queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}