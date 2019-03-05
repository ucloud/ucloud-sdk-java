package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :  核查db是否可以升级为高可用 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 14:49
 **/
public class CheckUDBInstanceToHAAllowanceResult extends BaseResponseResult {

    /**
     * Yes ，No ，Yes即可以升级，No为不可以升级
     */
    @SerializedName("Allowance")
    private String allowance;


    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }
}
