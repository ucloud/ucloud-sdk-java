package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 增加授权 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddUSQLTokenParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 数据源类型， 如ufile
     */
    @UcloudParam("DataSource")
    @NotEmpty(message = "dataSource can not be empty")
    private String dataSource;
    /**
     * 令牌密钥对中的公钥
     */
    @UcloudParam("AccessKeyId")
    @NotEmpty(message = "accessKeyId can not be empty")
    private String accessKeyId;
    /**
     * 令牌密钥对中的私钥
     */
    @UcloudParam("AccessKeySecret")
    @NotEmpty(message = "accessKeySecret can not be empty")
    private String accessKeySecret;


    public AddUSQLTokenParam(String region
            , String dataSource
            , String accessKeyId
            , String accessKeySecret
    ) {
        super("AddUSQLToken");
        this.region = region;
        this.dataSource = dataSource;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
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

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }


}