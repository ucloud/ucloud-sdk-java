package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 某一时刻的监控数据 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class MatricPoint {
    /**
     *
     */
    @SerializedName("Timestamp")
    private Integer timestamp;
    /**
     *
     */
    @SerializedName("Value")
    private Integer value;


    public Integer getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }


    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}