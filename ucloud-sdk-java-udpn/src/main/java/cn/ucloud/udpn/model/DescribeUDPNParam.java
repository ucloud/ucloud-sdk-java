package cn.ucloud.udpn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

/**
 * @description: 描述 UDPN 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 10:31
 */
public class DescribeUDPNParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    private String region;

    /**
     * 申请到的 UDPN 资源 ID。若为空，则查询该用户在机房所有的专线信息。非默认项目资源，需填写ProjectId
     */
    @UcloudParam("UDPNId")
    private String udpnId;

    /**
     * 列表起始位置偏移量，默认为 0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * 返回数据长度，默认为 20
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribeUDPNParam() {
        super("DescribeUDPN");
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUdpnId() {
        return udpnId;
    }

    public void setUdpnId(String udpnId) {
        this.udpnId = udpnId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
