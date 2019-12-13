package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import cn.ucloud.usms.util.FileUtil;
import org.apache.commons.codec.binary.Base64;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: codezhang
 * @date: 2019/12/13 4:37 下午
 * @describe: 申请短信签名
 **/
public class CreateUSMSSignatureParam extends BaseRequestParam {

    /**
     * 短信签名名称；长度为2-12个字符,
     * 可包含中文、数字和符号；
     * 无需填写【】或[]，系统会自动添加
     */
    @NotEmpty(message = "sigContent can not be empty")
    @UcloudParam("SigContent")
    private String sigContent;

    /**
     * 签名类型，说明如下：
     * 0-公司或企业的全称或简称；
     * 1-App应用的全称或简称；
     * 2-工信部备案网站的全称或简称；
     * 3-公众号或小程序的全称或简称；
     * 4-商标名的全称或简称；
     * 5-政府/机关事业单位/其他单位的全称或简称；
     */
    @NotNull(message = "sigType can not be null")
    @UcloudParam("SigType")
    private Integer sigType;

    /**
     * 签名用途，0-自用，1-他用；
     */
    @NotNull(message = "sigPurpose can not be null")
    @UcloudParam("SigPurpose")
    private Integer sigPurpose;

    /**
     * 签名的资质证明文件类型，需与签名类型保持一致，说明如下：
     * 0-三证合一/企业营业执照/组织机构代码证书/社会信用代码证书；
     * 1-应用商店后台开发者管理截图；
     * 2-备案服务商的备案成功截图(含域名，网站名称，备案号)；
     * 3-公众号或小程序的管理界面截图；
     * 4-商标注册证书；
     * 5-组织机构代码证书、社会信用代码证书；
     */
    @NotNull(message = "certificateType can not be null")
    @UcloudParam("CertificateType")
    private Integer certificateType;

    /**
     * 短信签名申请原因
     */
    @NotEmpty(message = "description can not be empty")
    @UcloudParam("Description")
    private String description;

    /**
     * 短信签名的资质证明文件
     */
    private String filePath;

    /**
     * 短信签名授权委托文件，需先进行base64编码格式转换，此处填写转换后的字符串。
     * 文件大小不超过4 MB；
     * 当您是代理并使用第三方的签名时（也即SigPurpose为1-他用），该项为必填项；
     */
    private String proxyFilePath;


    public CreateUSMSSignatureParam(@NotEmpty(message = "sigContent can not be empty") String sigContent,
                                    @NotNull(message = "sigType can not be null") Integer sigType,
                                    @NotNull(message = "sigPurpose can not be null") Integer sigPurpose,
                                    @NotNull(message = "certificateType can not be null") Integer certificateType,
                                    @NotEmpty(message = "description can not be empty") String description,
                                    @NotEmpty(message = "filePath can not be empty") String filePath) {
        super("CreateUSMSSignature");
        this.sigContent = sigContent;
        this.sigType = sigType;
        this.sigPurpose = sigPurpose;
        this.certificateType = certificateType;
        this.description = description;
        this.filePath = filePath;
    }


    @UcloudParam("File")
    public List<Param> checkFile() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (filePath == null || filePath.isEmpty()) {
            throw new ValidatorException("file can not be null");
        } else {
            params.add(new Param("File",
                    FileUtil.getFileContent2StringAfterBase64Encode(filePath)));
        }
        return params;
    }


    @UcloudParam("ProxyFile")
    public List<Param> checkProxyFile() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (proxyFilePath != null && !proxyFilePath.isEmpty()) {
            params.add(new Param("ProxyFile",
                    FileUtil.getFileContent2StringAfterBase64Encode(filePath)));
        }
        return params;
    }

    public String getSigContent() {
        return sigContent;
    }

    public void setSigContent(String sigContent) {
        this.sigContent = sigContent;
    }

    public Integer getSigType() {
        return sigType;
    }

    public void setSigType(Integer sigType) {
        this.sigType = sigType;
    }

    public Integer getSigPurpose() {
        return sigPurpose;
    }

    public void setSigPurpose(Integer sigPurpose) {
        this.sigPurpose = sigPurpose;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getProxyFilePath() {
        return proxyFilePath;
    }

    public void setProxyFilePath(String proxyFilePath) {
        this.proxyFilePath = proxyFilePath;
    }
}
