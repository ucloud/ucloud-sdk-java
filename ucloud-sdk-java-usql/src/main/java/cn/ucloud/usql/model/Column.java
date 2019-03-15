package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 数据列的名称和类型 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class Column {
    /**
     * 列名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 列的数据类型
     */
    @SerializedName("Type")
    private String type;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}