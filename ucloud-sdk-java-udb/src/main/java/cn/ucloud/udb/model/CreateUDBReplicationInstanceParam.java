package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 创建MongoDB的副本节点（包括仲裁） 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 13:56
 **/
public class CreateUDBReplicationInstanceParam extends BaseRequestParam {

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
    private String zone;

    /**
     * primary节点的DBId,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "srcId can not be empty")
    @UcloudParam("SrcId")
    private String srcId;

    /**
     * 实例名称，至少6位
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * 端口号，默认27017，取值范围3306至65535。
     */
    @UcloudParam("Port")
    private Integer port;

    /**
     * 是否是仲裁节点，默认false，仲裁节点按最小机型创建
     */
    @UcloudParam("IsArbiter")
    private Boolean isArbiter;

    /**
     * 是否使用SSD，默认不使用
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBReplicationInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                             @NotEmpty(message = "srcId can not be empty") String srcId,
                                             @NotEmpty(message = "name can not be empty") String name) {
        super("CreateUDBReplicationInstance");
        this.region = region;
        this.srcId = srcId;
        this.name = name;
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

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getArbiter() {
        return isArbiter;
    }

    public void setArbiter(Boolean arbiter) {
        isArbiter = arbiter;
    }

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
