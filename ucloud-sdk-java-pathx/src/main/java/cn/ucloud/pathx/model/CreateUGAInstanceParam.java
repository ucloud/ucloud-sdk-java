package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建全球加速配置项 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateUGAInstanceParam extends BaseRequestParam {
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

    @UcloudParam("ChargeType")
    private String chargeType;

    @UcloudParam("Quantity")
    private Integer quantity;

    @UcloudParam("IsHighNet")
    private Boolean isHighNet;

    @NotEmpty(message = "location can not be empty")
    @UcloudParam("Location")
    private String location;

    /**
     * tcp端口
     */
    private List<Integer> tcpPorts;
    /**
     * udp端口
     */
    private List<Integer> udpPorts;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getHighNet() {
        return isHighNet;
    }

    public void setHighNet(Boolean highNet) {
        isHighNet = highNet;
    }

    public CreateUGAInstanceParam(String projectId
            , String name, String location
    ) {
        super("CreateUGAInstance");
        this.projectId = projectId;
        this.name = name;
        this.location = location;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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


}