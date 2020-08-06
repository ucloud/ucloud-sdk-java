package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 批量获取加速域名配置 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:03
 */
public class BatchDescribeNewUcdnDomainResult extends BaseResponseResult {
    /**
     * 满足条件的域名个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 最大域名数量，默认20
     */
    @SerializedName("MaxDomainNum")
    private Integer maxDomainNum;

    /**
     * 当前计费方式，10-流量付费 20-带宽日峰值 30-月95计费，31-月日均峰值， 32-月第四峰值 33-日均峰值之和 34- 日95再取平均 40-未选择计费方式
     */
    @SerializedName("ChargeType")
    private Integer chargeType;

    /**
     * 表示最后一次切换的计费方式，10=流量付费 20=带宽日峰值 30=按月后付费 40=未选择计费方式
     */
    @SerializedName("LastChargeType")
    private Integer lastChargeType;

    /**
     * 标识欠费的数组，数组含有下列元素值， 1=国内流量有欠费 2=国外流量有欠费 3=国内带宽有欠费 4=国外带宽有欠费
     */
    @SerializedName("Arrearage")
    private List<String> arrearage;

    /**
     * vip标示，yes-是 no-否
     */
    @SerializedName("Vip")
    private String vip;

    @SerializedName("DomainSet")
    private List<DomainInfo> domainSet;


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getMaxDomainNum() {
        return maxDomainNum;
    }

    public void setMaxDomainNum(Integer maxDomainNum) {
        this.maxDomainNum = maxDomainNum;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getLastChargeType() {
        return lastChargeType;
    }

    public void setLastChargeType(Integer lastChargeType) {
        this.lastChargeType = lastChargeType;
    }

    public List<String> getArrearage() {
        return arrearage;
    }

    public void setArrearage(List<String> arrearage) {
        this.arrearage = arrearage;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public List<DomainInfo> getDomainSet() {
        return domainSet;
    }

    public void setDomainSet(List<DomainInfo> domainSet) {
        this.domainSet = domainSet;
    }
}
