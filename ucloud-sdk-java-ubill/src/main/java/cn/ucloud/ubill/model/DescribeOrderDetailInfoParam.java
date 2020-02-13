package cn.ucloud.ubill.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import sun.security.krb5.internal.PAData;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: codezhang
 * @date: 2020/2/13 10:15 上午
 * @describe:
 **/
public class DescribeOrderDetailInfoParam extends BaseRequestParam {

    /**
     * 开始时间
     */
    @UcloudParam("BeginTime")
    private Integer beginTime;

    /**
     * 结束时间(时间跨度不超过3个月)
     */
    @UcloudParam("EndTime")
    private Integer endTime;

    /**
     * 业务组
     */
    private List<String> tags;

    /**
     * 地区(默认全部)
     */
    private List<String> azGroups;

    /**
     * 可用区，原：数据中心(默认全部)
     */
    private List<String> regions;

    /**
     * 产品类型(默认全部)[全部产品类型]
     */
    private List<String> resourceTypes;

    /**
     * 订单类型(默认全部)[全部订单类型]
     */
    private List<String> orderTypes;

    /**
     * 付费类别(默认全部OrderType)[全部计费方式]
     */
    private List<String> chargeTypes;

    /**
     * 订单状态(默认全部可选参数)[OS_FINISHED;OS_UNDO]
     */
    private List<String> orderStates;

    /**
     * 是否开过发票(默认全部可选参数)[INVO_ON:未开过;INVO_OFF:开过]
     */
    private List<String> invoiceds;

    /**
     * 返回数据长度(默认为25)[1~100]
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 数据偏移量(默认为0)
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * 资源ID(短ID)
     */
    private List<String> resourceIds;

    /**
     * 交易订单号(该字段存在时,可以不传BeginTime和EndTime)
     */
    private List<String> tradeNos;

    /**
     * ‘true’表示查询全部(默认全部)其他选项按项目组查询
     */
    private Boolean queryAll;

    public DescribeOrderDetailInfoParam() {
        super("DescribeOrderDetailInfo");
    }

    @UcloudParam("Tags")
    public List<Param> checkArrayParams(){
        List<Param> params = new ArrayList<>();
        params.addAll(checkSimpleArrayParam(tags, "Tags.%d"));
        params.addAll(checkSimpleArrayParam(azGroups,"AzGroups.%d"));
        params.addAll(checkSimpleArrayParam(regions,"Regions.%d"));
        params.addAll(checkSimpleArrayParam(resourceTypes,"ResourceTypes.%d"));
        params.addAll(checkSimpleArrayParam(orderTypes,"OrderTypes.%d"));
        params.addAll(checkSimpleArrayParam(chargeTypes,"ChargeTypes.%d"));
        params.addAll(checkSimpleArrayParam(orderStates,"OrderStates.%d"));
        params.addAll(checkSimpleArrayParam(invoiceds,"Invoiceds.%d"));
        params.addAll(checkSimpleArrayParam(resourceIds,"ResourceIds.%d"));
        params.addAll(checkSimpleArrayParam(tradeNos,"TradeNos.%d"));
        return params;
    }

    private List<Param> checkSimpleArrayParam(List<String> values,String format) throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (values != null && !values.isEmpty()) {
            int size = values.size();
            for (int i = 0; i < size; i++) {
                String paramName = String.format(format, i);
                String paramValue = values.get(i);
                params.add(new Param(paramName, paramValue));
            }
        }
        return params;
    }


    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getAzGroups() {
        return azGroups;
    }

    public void setAzGroups(List<String> azGroups) {
        this.azGroups = azGroups;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<String> getChargeTypes() {
        return chargeTypes;
    }

    public void setChargeTypes(List<String> chargeTypes) {
        this.chargeTypes = chargeTypes;
    }

    public List<String> getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(List<String> orderStates) {
        this.orderStates = orderStates;
    }

    public List<String> getInvoiceds() {
        return invoiceds;
    }

    public void setInvoiceds(List<String> invoiceds) {
        this.invoiceds = invoiceds;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public List<String> getTradeNos() {
        return tradeNos;
    }

    public void setTradeNos(List<String> tradeNos) {
        this.tradeNos = tradeNos;
    }

    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }
}
