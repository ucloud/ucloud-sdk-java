package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:03
 */
public class DescribeBandwidthUsageParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * limit 返回数据分页值, 取值范围为 [0,10000000] 之间的整数, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit = 20;

    /**
     * offset 返回数据偏移量, 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset = 0;

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
                if (StringUtils.isBlank(eipId))
                    throw new ValidatorException("eipId[" + i + "] can not be empty");

                list.add(new Param("EIP." + i, eipId));
            }
        }

        return list;
    }

    public DescribeBandwidthUsageParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeBandwidthUsage");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public List<String> getEipIds() {
        return eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }
}
