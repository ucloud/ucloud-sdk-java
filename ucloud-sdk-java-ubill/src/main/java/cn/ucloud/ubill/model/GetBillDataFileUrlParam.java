package cn.ucloud.ubill.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotNull;

/**
 * @author: codezhang
 * @date: 2020/2/13 1:10 下午
 * @describe: 生成账单数据文件下载的 url
 **/
public class GetBillDataFileUrlParam extends BaseRequestParam {

    /**
     * 账期（时间戳格式）
     */
    @NotNull(message = "billPeriod can not be null")
    @UcloudParam("BillPeriod")
    private Integer billPeriod;

    /**
     * 账单类型，传 0 时获取账单总览报表，传 1 获取账单明细报表
     */
    @NotNull(message = "billType can not be null")
    @UcloudParam("BillType")
    private Integer billType;

    /**
     * 获取账单总览报表时，账单的支付状态，传 0 时获取待支付账单，传 1 时获取已支付账单。获取账单明细报表时该参数无效
     */
    @UcloudParam("PaidType")
    private Integer paidType;

    public GetBillDataFileUrlParam(Integer billPeriod,Integer billType) {
        super("GetBillDataFileUrl");
        this.billPeriod = billPeriod;
        this.billType = billType;
    }

    public Integer getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(Integer billPeriod) {
        this.billPeriod = billPeriod;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getPaidType() {
        return paidType;
    }

    public void setPaidType(Integer paidType) {
        this.paidType = paidType;
    }
}
