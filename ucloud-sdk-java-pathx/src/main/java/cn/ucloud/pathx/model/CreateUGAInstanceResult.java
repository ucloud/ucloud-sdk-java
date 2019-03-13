package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建全球加速配置项 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreateUGAInstanceResult extends BaseResponseResult {
    /**
     * 加速配置ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * 加速域名 用户可把业务域名CName到此域名上。注意：未绑定线路情况时 加速域名解析不出IP。
     */
    @SerializedName("CName")
    private String cName;


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


    public String getcName() {
        return this.cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


}