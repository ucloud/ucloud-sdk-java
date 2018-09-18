package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 普通升级为方舟机型 结果类
 * @author: codezhang
 * @date: 2018-09-18 18:43
 **/

public class UpgradeToArkUHostInstanceResult extends BaseResponseResult {

    /**
     * UHost主机的资源ID数组
     */
    @SerializedName("UHostSet")
    private List<String> uhostSet;

    public List<String> getUhostSet() {
        return uhostSet;
    }

    public void setUhostSet(List<String> uhostSet) {
        this.uhostSet = uhostSet;
    }

    @Override
    public String toString() {
        return "UpgradeToArkUHostInstanceResult{" +
                "uhostSet=" + uhostSet +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
