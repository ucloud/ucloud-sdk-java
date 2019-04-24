package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取UAI安全审查资源列表
 * @Author : codezhang
 * @Date : 2019-04-17 14:09
 **/
public class GetUAICensorResourceListParam extends BaseRequestParam {

    /**
     * 地域
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 查询限制条数，默认无限制
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 查询起始偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;


    public GetUAICensorResourceListParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "zone can not be empty") String zone) {
        super("GetUAICensorResourceList");
        this.region = region;
        this.zone = zone;
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
