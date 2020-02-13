package cn.ucloud.ubill.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2020/2/13 12:12 下午
 * @describe:
 **/
public class ResourceTag {

    @SerializedName("KeyId")
    private String keyId;

    @SerializedName("Value")
    private String value;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
