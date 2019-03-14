package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建苹果审核加速通道 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreateCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    @NotEmpty(message = "quantity can not be empty")
    private String quantity;
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
     * TCP端口号，端口必填，
     * GlobalSSH只能添加一个TCP端口；
     * AppStore可以同时加多个TCP和UDP端口，如TCP.0，TCP.1，UDP.0等
     */
    private List<Integer> tcpPorts;

    /**
     * UDP端口号，端口必填，
     * GlobalSSH只能添加一个TCP端口；
     * AppStore可以同时加多个TCP和UDP端口，如TCP.0，TCP.1，UDP.0等
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
            , String quantity
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

    @UcloudParam("tcpPorts")
    public List<Param> checkTCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (tcpPorts != null && !tcpPorts.isEmpty()) {
            int size = tcpPorts.size();
            for (int i = 0; i < size; i++) {
                if (tcpPorts.get(i) == null){
                    throw new ValidationException(String.format("tcpPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("TCP.%d",i),tcpPorts.get(i)));
                }
            }
        }else {
            throw new ValidationException("tcpPorts can not be empty");
        }
        return params;
    }

    @UcloudParam("udpPorts")
    public List<Param> checkUCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (udpPorts != null && !udpPorts.isEmpty()) {
            int size = udpPorts.size();
            for (int i = 0; i < size; i++) {
                if (udpPorts.get(i) == null){
                    throw new ValidationException(String.format("udpPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("UDP.%d",i),udpPorts.get(i)));
                }
            }
        }else {
            throw new ValidationException("udpPorts can not be empty");
        }
        return params;
    }


    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
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