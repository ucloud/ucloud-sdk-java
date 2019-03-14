package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取SSL证书信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribePathXSSLParam extends BaseRequestParam {
    /**
     * SSL证书的Id，不传获取项目下整个列表
     */
    @UcloudParam("SSLId")
    private String sSLId;


    public DescribePathXSSLParam(String projectId
    ) {
        super("DescribePathXSSL");
        this.projectId = projectId;
    }


    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}