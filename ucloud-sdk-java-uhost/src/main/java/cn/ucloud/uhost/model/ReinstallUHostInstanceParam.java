package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 重装系统
 * 重新安装指定UHost实例的操作系统
 * 警示信息:
 * 1.请确认在重新安装之前，该实例已被关闭；
 * 2.将原系统重装为不同类型的系统时(Linux-&gt;Windows)，不可选择保留数据盘；
 * 3.重装不同版本的系统时(CentOS6-&gt;CentOS7)，若选择保留数据盘，请注意数据盘的文件系统格式；
 * @author: codezhang
 * @date: 2018-09-18 17:01
 **/

public class ReinstallUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例资源ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be null")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * optional 如果创建UHost实例时LoginMode为Password，则必须填写，
     * 如果LoginMode为KeyPair，不需要填写 （密码格式使用BASE64编码；LoginMode不可变更）
     */
    private String password;

    @UcloudParam("Password")
    private List<Param> checkPassord() throws Exception{
        List<Param> list = new ArrayList<>();
        if (password == null){
            throw new ValidationException("password can not be empty");
        }else {
            list.add(new Param("Password",  new String(Base64.encodeBase64((password).getBytes("utf-8")))));
        }
        return  list;
    }

    /**
     * optional 镜像Id，默认使用原镜像 参见 [DescribeImage](describe_image.html)
     */
    @UcloudParam("ImageId")
    private String imageId;

    /**
     * optional string
     * 是否保留数据盘，保留：Yes，不报留：No， 默认：Yes；如果是从Windows重装为Linux或反之，则无法保留数据盘
     */
    @UcloudParam("ReserveDisk")
    private String reserveDisk;

    /**
     * optional 云灾备指明191
     */
    @UcloudParam("ResourceType")
    private Integer resourceType;

    /**
     * optional 针对非私有子网主机，可自定义DNS。n可为0-2
     */
    private List<String> dnsServers;

    @UcloudParam("DNSServers")
    public List<Param> checkDnsServers() throws  Exception{
        List<Param> list = new ArrayList<>();
        if (this.dnsServers != null){
            int len = this.dnsServers.size();
            for (int i = 0;i<len;i++){
                String dns = this.dnsServers.get(i);
                if (dns != null && dns.length() > 0){
                    list.add(new Param("DNSServers."+i,dns));
                }
            }
        }
        return list;
    }

    public ReinstallUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "uhostId can not be null") String uhostId) {
        super("ReinstallUHostInstance");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getReserveDisk() {
        return reserveDisk;
    }

    public void setReserveDisk(String reserveDisk) {
        this.reserveDisk = reserveDisk;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public List<String> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }
}
