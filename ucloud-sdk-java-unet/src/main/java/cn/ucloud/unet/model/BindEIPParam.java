package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 将尚未使用的弹性IP绑定到指定的资源 参数类
 * @author: codezhang
 * @date: 2018-09-27 11:25
 **/

public class BindEIPParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require EIP资源ID
     */
    @NotEmpty(message = "eipId can not be empty")
    @UcloudParam("EIPId")
    private String eipId;

    /**
     * require
     * 弹性IP请求绑定的资源类型, 枚举值为:
     * uhost: 云主机;
     * vrouter: 虚拟路由器;
     * ulb: 负载均衡器
     * upm: 物理机;
     * hadoophost: 大数据集群;
     * fortresshost：堡垒机；
     * udockhost：容器；
     * udhost：私有专区主机；
     * natgw：natgw；
     * udb：udb；
     * vpngw：ipsec vpn；
     * ucdr：云灾备；
     * dbaudit：数据库审计；
     */
    @UcloudParam("ResourceType")
    @NotEmpty(message = "resourceType can not be empty")
    private String resourceType;

    /**
     * require 弹性IP请求绑定的资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    public BindEIPParam( @NotEmpty(message = "region can not be empty") String region,
                         @NotEmpty(message = "eipId can not be empty") String eipId,
                         @NotEmpty(message = "resourceType can not be empty") String resourceType,
                         @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("BindEIP");
        this.region = region;
        this.eipId = eipId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
