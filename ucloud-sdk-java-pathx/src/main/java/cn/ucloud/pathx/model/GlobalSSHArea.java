package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : GlobalSSH覆盖地区,包括关联的UCloud机房信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GlobalSSHArea {
    /**
     * GlobalSSH覆盖的地区,如香港、东京、洛杉矶等
     */
    @SerializedName("Area")
    private String area;
    /**
     * 地区代号,以地区AirPort Code
     */
    @SerializedName("AreaCode")
    private String areaCode;
    /**
     * ucloud机房代号构成的数组，如["hk","us-ca"]
     */
    @SerializedName("RegionSet")
    private List<String> regionSet;


    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


}