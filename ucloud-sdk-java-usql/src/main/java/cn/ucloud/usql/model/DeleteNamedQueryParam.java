package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除命名的SQL查询 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteNamedQueryParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 已命名的SQL查询ID
     */
    @UcloudParam("NamedQueryId")
    @NotEmpty(message = "namedQueryId can not be empty")
    private String namedQueryId;


    public DeleteNamedQueryParam(String region
            , String namedQueryId
    ) {
        super("DeleteNamedQuery");
        this.region = region;
        this.namedQueryId = namedQueryId;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }


}