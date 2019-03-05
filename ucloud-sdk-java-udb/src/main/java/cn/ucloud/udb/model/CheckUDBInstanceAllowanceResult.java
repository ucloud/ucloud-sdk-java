package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 核查UDB资源余量 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 13:55
 **/
public class CheckUDBInstanceAllowanceResult extends BaseResponseResult {
    /**
     * 资源核查部分成功情况下，成功个数
     */
    @SerializedName("Count")
    private Integer count;


}
