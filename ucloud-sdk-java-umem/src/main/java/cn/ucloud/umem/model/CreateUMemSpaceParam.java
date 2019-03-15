package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建内存空间 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUMemSpaceParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;
    /**
     * 内存大小, 单位:GB, 范围[1~1024]
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;
    /**
     * 空间名称,长度(6<=size<=63)
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 协议:memcache, redis (默认redis).注意:redis无single类型
     */
    @UcloudParam("Protocol")
    private String protocol;
    /**
     * 空间类型:single(无热备),double(热备)
     */
    @UcloudParam("Type")
    private String type;
    /**
     * Year , Month, Dynamic, Trial 默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     *
     */
    @UcloudParam("Tag")
    private String tag;
    /**
     * URedis密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。
     * 密码需使用base64进行编码，举例如下：# echo -n Password1 | base64UGFzc3dvcmQx。
     */
    private String password;
    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateUMemSpaceParam(String region
            , Integer size
            , String name, String zone
    ) {
        super("CreateUMemSpace");
        this.region = region;
        this.size = size;
        this.name = name;
        this.zone = zone;
    }


    @UcloudParam("Password")
    public List<Param> checkPassword() throws UnsupportedEncodingException {
        List<Param> params = new ArrayList<>();
        if (password != null && password.length() > 0) {
            params.add(new Param("Password", new
                    String(Base64.encodeBase64((password).getBytes("utf-8")))));
        }
        return params;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}