package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建苹果审核加速通道 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    @NotNull(message = "quantity can not be null")
    private Integer quantity;
    /**
     * 加速地区，AppStore默认是“中国”，GlobalSSH支持“洛杉矶”，“新加坡”，“香港”，“法兰克福”，“东京”
     */
    @UcloudParam("Location")
    @NotEmpty(message = "location can not be empty")
    private String location;
    /**
     * 计费模式
     */
    @UcloudParam("ChargeType")
    @NotEmpty(message = "chargeType can not be empty")
    private String chargeType;
    /**
     * AppStore: 苹果审核加速, GlobalSSH: 全球运维通道
     */
    @UcloudParam("UGAType")
    @NotEmpty(message = "uGAType can not be empty")
    private String uGAType;
    /**
     * 加速实例名称
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 加速源IP，多个IP用逗号隔开(,)隔开;IPList和Domain二选一必填
     */
    @UcloudParam("IPList")
    private String iPList;
    /**
     * 加速源域名;IPList和Domain二选一必填
     */
    @UcloudParam("Domain")
    private String domain;


    /**
     * tcp端口
     */
    private List<Integer> tcpPorts;
    /**
     * udp端口
     */
    private List<Integer> udpPorts;

    /**
     * globalSSH提供CName的三级域名
     */
    @UcloudParam("PreCName")
    private String preCName;
    /**
     * 代金券
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateCommonUGAInstanceParam(String projectId
            , Integer quantity
            , String location
            , String chargeType
            , String uGAType
            , String name
    ) {
        super("CreateCommonUGAInstance");
        this.projectId = projectId;
        this.quantity = quantity;
        this.location = location;
        this.chargeType = chargeType;
        this.uGAType = uGAType;
        this.name = name;
    }

    @UcloudParam("TCP")
    public List<Param> checkTCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (tcpPorts != null) {
            int size = tcpPorts.size();
            for (int i = 0; i < size; i++) {
                Integer port = tcpPorts.get(i);
                if (port == null) {
                    throw new ValidationException(String.format("tcpPorts[%d] can not be null", i));
                }
                params.add(new Param(String.format("TCP.%d", i), port));
            }
        }
        return params;
    }

    @UcloudParam("UDP")
    public List<Param> checkUDPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (udpPorts != null) {
            int size = udpPorts.size();
            for (int i = 0; i < size; i++) {
                Integer port = udpPorts.get(i);
                if (port == null) {
                    throw new ValidationException(String.format("udpPorts[%d] can not be null", i));
                }
                params.add(new Param(String.format("UDP.%d", i), port));
            }
        }
        return params;
    }
    public List<Integer> getTcpPorts() {
        return tcpPorts;
    }

    public void setTcpPorts(List<Integer> tcpPorts) {
        this.tcpPorts = tcpPorts;
    }

    public List<Integer> getUdpPorts() {
        return udpPorts;
    }

    public void setUdpPorts(List<Integer> udpPorts) {
        this.udpPorts = udpPorts;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getuGAType() {
        return this.uGAType;
    }

    public void setuGAType(String uGAType) {
        this.uGAType = uGAType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiPList() {
        return this.iPList;
    }

    public void setiPList(String iPList) {
        this.iPList = iPList;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPreCName() {
        return this.preCName;
    }

    public void setPreCName(String preCName) {
        this.preCName = preCName;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}