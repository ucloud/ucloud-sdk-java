package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取命名查询列表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListNamedQueriesParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 返回的SQL查询记录上限，默认值为20
     */
    @UcloudParam("Limit")
    private Integer limit;
    /**
     * SQL查询记录开始位置，默认值为0
     */
    @UcloudParam("Offset")
    private Integer offset;
    /**
     * SQL查询类型， 默认为空时，则用户私有的SQL查询， example时，则为示例SQL
     */
    @UcloudParam("Type")
    private String type;


    public ListNamedQueriesParam(String region
    ) {
        super("ListNamedQueries");
        this.region = region;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}