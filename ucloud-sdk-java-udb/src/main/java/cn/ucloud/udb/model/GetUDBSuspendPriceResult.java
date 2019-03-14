package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 删除资源时的回退差价 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:35
 **/
public class GetUDBSuspendPriceResult extends BaseResponseResult {

    /**
     * 退款金额
     */
    @SerializedName("TotalPrice")
    private Integer totalPrice;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
