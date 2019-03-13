package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 增加授权 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddUSQLTokenResult extends BaseResponseResult {
    /**
     * 服务区域
     */
    @SerializedName("Region")
    private String region;
    /**
     * 令牌对应的数据源名称， 如ufile
     */
    @SerializedName("DataSource")
    private String dataSource;


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