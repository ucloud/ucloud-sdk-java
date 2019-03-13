package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : USQL授权列表 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class Tokens {
    /**
     * 数据源名称， 如ufile
     */
    @SerializedName("DataSource")
    private String dataSource;
    /**
     * true：启用， false：禁用
     */
    @SerializedName("Enable")
    private Boolean enable;


    public String getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


}