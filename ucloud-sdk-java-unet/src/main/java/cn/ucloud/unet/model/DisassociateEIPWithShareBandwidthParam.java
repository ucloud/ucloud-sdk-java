package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 将EIP移出共享带宽 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:54
 */
public class DisassociateEIPWithShareBandwidthParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 共享带宽ID
     */
    @NotEmpty(message = "shareBandwidthId can not be empty")
    @UcloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    /**
     * require 移出共享带宽后，EIP的外网带宽, 单位为Mbps. 各地域带宽范围如下： 流量计费[1-200],带宽计费[1-800]
     */
    @NotNull(message = "bandwidth can not be empty")
    @UcloudParam("Bandwidth")
    private Integer bandwidth;

    /**
     * optional 移出共享带宽后，EIP的计费模式. 枚举值: "Traffic", 流量计费; "Bandwidth", 带宽计费; 默认为 "Bandwidth".
     */
    @UcloudParam("PayMode")
    private String payMode;



    /**
     * eipIds EIP的资源Id
     */
    private List<String> eipIds;

    @UcloudParam("EIPIds")
    public List<Param> checkEIPIds() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getEipIds() != null && !this.getEipIds().isEmpty()) {
            List<String> eipIds = this.getEipIds();
            for (int i = 0, len = eipIds.size(); i < len; i++) {
                String eipId = eipIds.get(i);
                if (StringUtils.isBlank(eipId)){
                    throw new ValidatorException("eipId[" + i + "] can not be empty");
                }
                list.add(new Param("EIPIds." + i, eipId));
            }
        }
        return list;
    }

    public DisassociateEIPWithShareBandwidthParam(@NotEmpty(message = "region can not be empty") String region,
                                                  @NotEmpty(message = "shareBandwidthId can not be empty") String shareBandwidthId,
                                                  @NotNull(message = "bandwidth can not be empty") Integer bandwidth) {
        super("DisassociateEIPWithShareBandwidth");
        this.region = region;
        this.shareBandwidthId = shareBandwidthId;
        this.bandwidth = bandwidth;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public List<String> getEipIds() {
        return eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }
}
