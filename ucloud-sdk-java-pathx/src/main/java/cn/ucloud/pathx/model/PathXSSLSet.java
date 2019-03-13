package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : Describle PathX SSL 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class PathXSSLSet {
    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private String sSLId;
    /**
     * SSL证书的名字
     */
    @SerializedName("SSLName")
    private String sSLName;
    /**
     * SSL证书（用户证书、私钥、ca证书合并）内容md5值
     */
    @SerializedName("SSLMD5")
    private String sSLMD5;
    /**
     * SSL证书的创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * SSL证书绑定的对象
     */
    @SerializedName("SSLBindedTargetSet")
    private List<SSLBindedTargetSet> sSLBindedTargetSet;


    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }


    public String getsSLName() {
        return this.sSLName;
    }

    public void setsSLName(String sSLName) {
        this.sSLName = sSLName;
    }


    public String getsSLMD5() {
        return this.sSLMD5;
    }

    public void setsSLMD5(String sSLMD5) {
        this.sSLMD5 = sSLMD5;
    }


    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


}