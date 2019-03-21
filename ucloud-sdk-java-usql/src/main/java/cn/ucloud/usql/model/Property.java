package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-21 12:52
 **/
public class Property {

    @SerializedName("Name")
    private String name;

    @SerializedName("Value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
