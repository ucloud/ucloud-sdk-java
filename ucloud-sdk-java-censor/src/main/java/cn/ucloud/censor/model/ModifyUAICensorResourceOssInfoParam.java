package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 更改UAI安全审查资源对象存储信息
 * @Author : codezhang
 * @Date : 2019-04-17 15:14
 **/
public class ModifyUAICensorResourceOssInfoParam extends BaseRequestParam {

    /**
     * 地域
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 待修改资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 修改后的对象存储访问公钥或token
     */
    @NotEmpty(message = "OssPublicKey can not be empty")
    @UcloudParam("OssPublicKey")
    private String ossPublicKey;

    /**
     * 对象存储访问私钥或token
     */
    @NotEmpty(message = "ossPrivateKey can not be empty")
    @UcloudParam("OssPrivateKey")
    private String ossPrivateKey;

    public ModifyUAICensorResourceOssInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                               @NotEmpty(message = "zone can not be empty") String zone,
                                               @NotEmpty(message = "resourceId can not be empty") String resourceId,
                                               @NotEmpty(message = "OssPublicKey can not be empty") String ossPublicKey,
                                               @NotEmpty(message = "ossPrivateKey can not be empty") String ossPrivateKey) {
        super("ModifyUAICensorResourceOssInfo");
        this.region = region;
        this.zone = zone;
        this.resourceId = resourceId;
        this.ossPublicKey = ossPublicKey;
        this.ossPrivateKey = ossPrivateKey;
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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getOssPublicKey() {
        return ossPublicKey;
    }

    public void setOssPublicKey(String ossPublicKey) {
        this.ossPublicKey = ossPublicKey;
    }

    public String getOssPrivateKey() {
        return ossPrivateKey;
    }

    public void setOssPrivateKey(String ossPrivateKey) {
        this.ossPrivateKey = ossPrivateKey;
    }
}
