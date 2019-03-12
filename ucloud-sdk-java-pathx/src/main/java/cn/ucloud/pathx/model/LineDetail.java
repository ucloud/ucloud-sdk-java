package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 子线路 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class LineDetail {
    /**
     * 线路源
     */
    @SerializedName("LineFrom")
    private String lineFrom;
    /**
     * 线路目的
     */
    @SerializedName("LineTo")
    private String lineTo;
    /**
     * 线路计费Id
     */
    @SerializedName("LineId")
    private String lineId;
    /**
     * 线路源中文名称
     */
    @SerializedName("LineFromName")
    private String lineFromName;
    /**
     * 线路目的中文名称
     */
    @SerializedName("LineToName")
    private String lineToName;


    public String getLineFrom() {
        return this.lineFrom;
    }

    public void setLineFrom(String lineFrom) {
        this.lineFrom = lineFrom;
    }


    public String getLineTo() {
        return this.lineTo;
    }

    public void setLineTo(String lineTo) {
        this.lineTo = lineTo;
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


}