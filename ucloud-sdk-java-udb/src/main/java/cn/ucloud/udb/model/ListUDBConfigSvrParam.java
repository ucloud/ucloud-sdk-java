package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-04 17:49
 **/
public class ListUDBConfigSvrParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 分页显示数量，默认为100
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 分页显示起始偏移位置，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    public ListUDBConfigSvrParam(@NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "zone can not be empty") String zone) {
        super("ListUDBConfigSvr");
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
