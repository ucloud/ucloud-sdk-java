package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 全球加速实例信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class UGAAInfo {
    /**
     * 全球加速ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * 全球加速cname
     */
    @SerializedName("CName")
    private String cName;
    /**
     * 加速源IP列表
     */
    @SerializedName("IPList")
    private List<String> iPList;
    /**
     * 加速实例名称
     */
    @SerializedName("UGAName")
    private String uGAName;
    /**
     * 加速源域名
     */
    @SerializedName("Domain")
    private String domain;
    /**
     * 加速地区
     */
    @SerializedName("Location")
    private String location;
    /**
     * 绑定的加速线路
     */
    @SerializedName("UPathSet")
    private List<UPathSet> uPathSet;
    /**
     * 端口配置信息
     */
    @SerializedName("TaskSet")
    private List<UGAATask> taskSet;


    public String getUGAId() {
        return this.uGAId;
    }

    public void setUGAId(String uGAId) {
        this.uGAId = uGAId;
    }


    public String getCName() {
        return this.cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }


    public String getUGAName() {
        return this.uGAName;
    }

    public void setUGAName(String uGAName) {
        this.uGAName = uGAName;
    }


    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}