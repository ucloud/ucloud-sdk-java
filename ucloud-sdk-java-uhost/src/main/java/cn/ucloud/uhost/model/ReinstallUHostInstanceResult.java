package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 重装系统 结果类
 * @author: codezhang
 * @date: 2018-09-18 17:13
 **/

public class ReinstallUHostInstanceResult extends BaseResponseResult {

    /**
     * UHost实例资源ID
     */
    @SerializedName("UHostId")
    private String uhostId;

    @SerializedName("TotalCount")
    private Integer totalCount;

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
