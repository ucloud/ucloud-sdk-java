package cn.ucloud.ocr.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :获取UAI-OCR资源列表
 * @Author : codezhang
 * @Date : 2019-04-19 15:44
 **/
public class GetUAIOcrResourceListParam extends BaseRequestParam {


    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 查询限制条数，默认无限制
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 查询起始偏移量，默认为0，仅在Limit非零时有效
     */
    @UcloudParam("Offset")
    private Integer offset;

    public GetUAIOcrResourceListParam(@NotEmpty(message = "region can not be empty") String region) {
        super("GetUAIOcrResourceList");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
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
}
