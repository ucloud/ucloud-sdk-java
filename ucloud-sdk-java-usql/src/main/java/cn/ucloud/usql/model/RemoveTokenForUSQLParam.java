package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 【待删除】删除授权 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RemoveTokenForUSQLParam extends BaseRequestParam {
    /**
     * 数据源类型
     */
    @UcloudParam("DataSourceType")
    @NotEmpty(message = "dataSourceType can not be empty")
    private String dataSourceType;
    /**
     * 数据源名称
     */
    @UcloudParam("DataSourceName")
    @NotEmpty(message = "dataSourceName can not be empty")
    private String dataSourceName;


    public RemoveTokenForUSQLParam(String dataSourceType
            , String dataSourceName
    ) {
        super("RemoveTokenForUSQL");
        this.dataSourceType = dataSourceType;
        this.dataSourceName = dataSourceName;
    }


    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


}