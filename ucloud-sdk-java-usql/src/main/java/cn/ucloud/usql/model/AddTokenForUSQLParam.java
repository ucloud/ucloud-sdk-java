package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 【待删除】增加授权 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddTokenForUSQLParam extends BaseRequestParam {
    /**
     *
     */
    @UcloudParam("DataSourceType")
    @NotEmpty(message = "dataSourceType can not be empty")
    private String dataSourceType;
    /**
     *
     */
    @UcloudParam("DataSourceName")
    @NotEmpty(message = "dataSourceName can not be empty")
    private String dataSourceName;
    /**
     *
     */
    @UcloudParam("PublicKey")
    @NotEmpty(message = "publicKey can not be empty")
    private String publicKey;
    /**
     *
     */
    @UcloudParam("PrivateKey")
    @NotEmpty(message = "privateKey can not be empty")
    private String privateKey;


    public AddTokenForUSQLParam(String dataSourceType
            , String dataSourceName
            , String publicKey
            , String privateKey
    ) {
        super("AddTokenForUSQL");
        this.dataSourceType = dataSourceType;
        this.dataSourceName = dataSourceName;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
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

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }


}