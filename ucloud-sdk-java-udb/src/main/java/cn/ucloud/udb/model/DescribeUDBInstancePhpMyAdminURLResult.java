package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB实例的PhpMyAdmin地址 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 14:15
 **/
public class DescribeUDBInstancePhpMyAdminURLResult extends BaseResponseResult {

    /**
     * PhpMyAdmin的地址
     */
    @SerializedName("PMAPath")
    private String pmaPath;

    public String getPmaPath() {
        return pmaPath;
    }

    public void setPmaPath(String pmaPath) {
        this.pmaPath = pmaPath;
    }

}
