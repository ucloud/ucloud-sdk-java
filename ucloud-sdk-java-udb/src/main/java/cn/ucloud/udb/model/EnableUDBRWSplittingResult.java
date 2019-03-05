package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 启用读写分离功能 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:07
 **/
public class EnableUDBRWSplittingResult extends BaseResponseResult {

    /**
     * DB实例ID（主库）
     */
    @SerializedName("MasterDBId")
    private String masterDBId;

    /**
     * 读写分离访问IP
     */
    @SerializedName("RWIP")
    private String rwIP;

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public String getRwIP() {
        return rwIP;
    }

    public void setRwIP(String rwIP) {
        this.rwIP = rwIP;
    }

}
