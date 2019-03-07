package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建苹果审核加速通道 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class CreateCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
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
    // TODO 需要人工接入 CreateCommonUGAInstance =》 TCP.n
    // TODO 需要人工接入 CreateCommonUGAInstance =》 UDP.n
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


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getUGAType() {
        return this.uGAType;
    }

    public void setUGAType(String uGAType) {
        this.uGAType = uGAType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIPList() {
        return this.iPList;
    }

    public void setIPList(String iPList) {
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