package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : DescribeURedisVersion 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class URedisVersionSet {
    /**
     * Redis版本
     */
    @SerializedName("Version")
    private String version;


    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}