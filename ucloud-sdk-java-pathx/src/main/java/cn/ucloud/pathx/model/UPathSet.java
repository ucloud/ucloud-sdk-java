package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : uga信息中携带的upath信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class UPathSet {
    /**
     * UPath名字
     */
    @SerializedName("UPathName")
    private String uPathName;
    /**
     * UPath ID号
     */
    @SerializedName("UPathId")
    private String uPathId;
    /**
     * 带宽
     */
    @SerializedName("Bandwidth")
    private Integer bandwidth;
    /**
     * 线路ID
     */
    @SerializedName("LineId")
    private String lineId;
    /**
     * 线路起点中文名字，加速区域
     */
    @SerializedName("LineFromName")
    private String lineFromName;
    /**
     * 线路对端中文名字，源站区域
     */
    @SerializedName("LineToName")
    private String lineToName;

    /**
     * 线路对端英文代号，源站区域
     */
    @SerializedName("LineTo")
    private String lineTo;

    /**
     * 线路起点英文代号，加速区域
     */
    @SerializedName("LineFrom")
    private String lineFrom;

    /**
     * 线路对端IP
     */
    @SerializedName("OutPublicIpList")
    private List<OutPublicIpInfo> outPublicIpList;

    public String getLineFrom() {
        return lineFrom;
    }

    public void setLineFrom(String lineFrom) {
        this.lineFrom = lineFrom;
    }

    public String getLineTo() {
        return lineTo;
    }

    public void setLineTo(String lineTo) {
        this.lineTo = lineTo;
    }

    public String getuPathName() {
        return this.uPathName;
    }

    public void setuPathName(String uPathName) {
        this.uPathName = uPathName;
    }

    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineFromName() {
        return this.lineFromName;
    }

    public void setLineFromName(String lineFromName) {
        this.lineFromName = lineFromName;
    }

    public String getLineToName() {
        return this.lineToName;
    }

    public void setLineToName(String lineToName) {
        this.lineToName = lineToName;
    }


    public List<OutPublicIpInfo> getOutPublicIpList() {
        return this.outPublicIpList;
    }

    public void setOutPublicIpList(List<OutPublicIpInfo> outPublicIpList) {
        this.outPublicIpList = outPublicIpList;
    }


}