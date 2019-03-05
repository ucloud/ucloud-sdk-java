package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 检查数据库是否存在某种引擎的表 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 13:38
 **/
public class CheckUDBEngineResult extends BaseResponseResult {

    /**
     * 是否存在该类型的表，true为存在，false表示不存在
     */
    @SerializedName("Used")
    private Boolean used;


    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

}
