package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 全球加速实例信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class UGAAInfo {
    /**
     * 全球加速ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * 流量转发方式，包括L4、L7
     */
    @SerializedName("ForwardType")
    private String forwardType;
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

    /**
     * 线路出口IP地址
     */
    @SerializedName("OutPublicIpList")
    private List<OutPublicIpInfo> outPublicIpInfos;


    /**
     * UGA 4层转发器配置，记录接入或回源端口，接入或回源协议信息
     */
    private List<UGAL4Forwarder> l4Forwarders;


    /**
     * UGA 7层转发器配置，记录接入或回源端口，接入或回源协议信息 如绑定证书会返回证书ID
     */
    private List<UGAL7Forwarder> l7Forwarders;


    public List<UGAL4Forwarder> getL4Forwarders() {
        return l4Forwarders;
    }

    public void setL4Forwarders(List<UGAL4Forwarder> l4Forwarders) {
        this.l4Forwarders = l4Forwarders;
    }

    public List<UGAL7Forwarder> getL7Forwarders() {
        return l7Forwarders;
    }

    public void setL7Forwarders(List<UGAL7Forwarder> l7Forwarders) {
        this.l7Forwarders = l7Forwarders;
    }

    public List<OutPublicIpInfo> getOutPublicIpInfos() {
        return outPublicIpInfos;
    }

    public void setOutPublicIpInfos(List<OutPublicIpInfo> outPublicIpInfos) {
        this.outPublicIpInfos = outPublicIpInfos;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }

    public String getForwardType() {
        return this.forwardType;
    }

    public void setForwardType(String forwardType) {
        this.forwardType = forwardType;
    }

    public String getcName() {
        return this.cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<String> getiPList() {
        return this.iPList;
    }

    public void setiPList(List<String> iPList) {
        this.iPList = iPList;
    }

    public String getuGAName() {
        return this.uGAName;
    }

    public void setuGAName(String uGAName) {
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


    public List<UPathSet> getuPathSet() {
        return this.uPathSet;
    }

    public void setuPathSet(List<UPathSet> uPathSet) {
        this.uPathSet = uPathSet;
    }


    public List<UGAATask> getTaskSet() {
        return this.taskSet;
    }

    public void setTaskSet(List<UGAATask> taskSet) {
        this.taskSet = taskSet;
    }


}