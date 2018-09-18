package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 导入镜像 参数对象
 * 把UFile的镜像文件导入到UHost，生成自定义镜像
 * @author: codezhang
 * @date: 2018-09-18 15:21
 **/

public class ImportCustomImageParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * require 镜像名称
     */
    @UcloudParam("ImageName")
    @NotEmpty(message = "imageName can not be empty")
    private String imageName;

    /**
     * require UFile私有空间地址
     */
    @UcloudParam("UFileUrl")
    @NotEmpty(message = "ufileUrl can not be empty")
    private String ufileUrl;

    /**
     * require
     * 操作系统平台，比如CentOS、Ubuntu、Windows、RedHat等，请参考控制台的镜像版本；
     * 若导入控制台上没有的操作系统，参数为Other
     */
    @UcloudParam("OsType")
    @NotEmpty(message = "osType can not be empty")
    private String osType;

    /**
     * require 操作系统详细版本，请参考控制台的镜像版本；OsType为Other时，输入参数为Other
     */
    @UcloudParam("OsName")
    @NotEmpty(message = "osName can not be empty")
    private String osName;


    /**
     *  require 镜像格式，可选RAW、VHD、VMDK、qcow2
     */
    @UcloudParam("Format")
    @NotEmpty(message = "format can not be empty")
    private String format;

    /**
     * require 是否授权。必须填true
     */
    @UcloudParam("Auth")
    @NotEmpty(message = "auth can not ne null")
    private Boolean auth;

    /**
     * optional 镜像描述
     */
    @UcloudParam("ImageDescription")
    private String imageDescription;


    public ImportCustomImageParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "imageName can not be empty") String imageName,
                                  @NotEmpty(message = "ufileUrl can not be empty") String ufileUrl,
                                  @NotEmpty(message = "osType can not be empty") String osType,
                                  @NotEmpty(message = "osName can not be empty") String osName,
                                  @NotEmpty(message = "format can not be empty") String format,
                                  @NotEmpty(message = "auth can not ne null") Boolean auth) {
        super("ImportCustomImage");
        this.region = region;
        this.imageName = imageName;
        this.ufileUrl = ufileUrl;
        this.osType = osType;
        this.osName = osName;
        this.format = format;
        this.auth = auth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getUfileUrl() {
        return ufileUrl;
    }

    public void setUfileUrl(String ufileUrl) {
        this.ufileUrl = ufileUrl;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }
}
