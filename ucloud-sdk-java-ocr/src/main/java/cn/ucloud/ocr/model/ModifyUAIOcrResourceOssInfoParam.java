package cn.ucloud.ocr.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :修改UAI-OCR资源对象存储信息
 * @Author : codezhang
 * @Date : 2019-04-19 16:14
 **/
public class ModifyUAIOcrResourceOssInfoParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 待修改的资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 修改后的对象存储公钥
     */
    @NotEmpty(message = "ossPublicKey can not be empty")
    @UcloudParam("OssPublicKey")
    private String ossPublicKey;

    /**
     * 修改后的对象存储私钥
     */
    @NotEmpty(message = "ossPrivateKey can not be empty")
    @UcloudParam("OssPrivateKey")
    private String ossPrivateKey;

    public ModifyUAIOcrResourceOssInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "resourceId can not be empty") String resourceId,
                                            @NotEmpty(message = "ossPublicKey can not be empty") String ossPublicKey,
                                            @NotEmpty(message = "ossPrivateKey can not be empty") String ossPrivateKey) {
        super("ModifyUAIOcrResourceOssInfo");
        this.region = region;
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
