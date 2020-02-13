package cn.ucloud.ubill.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: codezhang
 * @date: 2020/2/13 11:56 上午
 * @describe:
 **/
public class DescribeOrderDetailInfoResult extends BaseResponseResult {

    /**
     * 订单信息
     */
    @SerializedName("OrderInfos")
    private List<OrderInfo> orderInfos;

    public List<OrderInfo> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<OrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
    }
}
