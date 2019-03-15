package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 设置USQL授权的状态 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class EnableUSQLTokenParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 数据源类型，如ufile
     */
    @UcloudParam("DataSource")
    @NotEmpty(message = "dataSource can not be empty")
    private String dataSource;
    /**
     * 0: 关闭， 1: 开启
     */
    @UcloudParam("State")
    @NotNull(message = "state can not be null")
    private Integer state;


    public EnableUSQLTokenParam(String region
            , String dataSource
            , Integer state
    ) {
        super("EnableUSQLToken");
        this.region = region;
        this.dataSource = dataSource;
        this.state = state;
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

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}