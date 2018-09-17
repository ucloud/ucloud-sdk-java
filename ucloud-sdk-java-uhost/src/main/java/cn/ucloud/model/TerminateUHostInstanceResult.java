package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 删除云主机实例 结果对象
 * @author: codezhang
 * @date: 2018-09-17 18:51
 **/

public class TerminateUHostInstanceResult extends BaseResponseResult {

    /**
     * UHost 实例 Id
     */
    @SerializedName("UHostIds")
    private List<String> uhostIds;

    /**
     * 放入回收站:"Yes", 彻底删除：“No”
     */
    @SerializedName("InRecycle")
    private String inRecycle;

    public List<String> getUhostIds() {
        return uhostIds;
    }

    public void setUhostIds(List<String> uhostIds) {
        this.uhostIds = uhostIds;
    }

    public String getInRecycle() {
        return inRecycle;
    }

    public void setInRecycle(String inRecycle) {
        this.inRecycle = inRecycle;
    }
}
