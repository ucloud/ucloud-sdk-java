package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 【待删除】获取USQL相关授权列表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListTokensForUSQLParam extends BaseRequestParam {
    /**
     * 数据源类型
     */
    @UcloudParam("DataSourceType")
    private String dataSourceType;


    public ListTokensForUSQLParam() {
        super("ListTokensForUSQL");
    }


    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }


}