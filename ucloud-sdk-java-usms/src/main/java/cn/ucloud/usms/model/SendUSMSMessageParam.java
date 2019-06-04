package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 发送短信息 参数类
 * 发送短信息。短信字数超过70个后，按照每66个进行切割(因为要加上1/3), 2/3)等字样，占用4个字长)。
 * 短信最大长度不能超过600个字。每个汉字、数字、字母、字符都按一个字计
 * @Author : codezhang
 * @Date : 2019-06-04 17:14
 **/
public class SendUSMSMessageParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 电话号码数组，电话号码格式为(60)1xxxxxxxx，
     * ()中为国际长途区号(如中国为86或0086，两种格式都支持)，
     * 后面为电话号码.若不传入国际区号，如1851623xxxx，则默认为国内手机号
     */
    private List<String> phoneNumbers;

    /**
     * 模板参数数组，以TempalteParams.0，TempalteParams.1.。。格式。
     * 若模板ID指定的模板无可变参数，则不传入该参数。模板参数个数与模板不匹配，则不允许发送
     */
    private List<String> templateParams;

    @NotEmpty(message = "templateId can not be empty")
    @UcloudParam("TemplateId")
    private String templateId;

    /**
     * 使用的签名，如果不输入则使用默认签名，若没有申请默认签名不允许发送；若输入的签名没有申请，则无法发送
     * 否
     */
    @UcloudParam("SigContent")
    private String sigContent;

    public SendUSMSMessageParam(List<String> phoneNumbers,
                                String templateId) {
        super("SendUSMSMessage");
        this.phoneNumbers = phoneNumbers;
        this.templateId = templateId;
    }

    @UcloudParam("PhoneNumbers")
    public List<Param> checkPhoneNumbers() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (phoneNumbers == null || phoneNumbers.isEmpty()) {
            throw new ValidatorException("phoneNumbers can not be empty");
        }
        int size = phoneNumbers.size();
        String phoneNumberFormat = "PhoneNumbers.%d";
        for (int i = 0; i < size; i++) {
            String phoneNumber = phoneNumbers.get(i);
            if (phoneNumber == null || phoneNumber.isEmpty()) {
                throw new ValidatorException(String.format("phoneNumbers[%d] can not be empty", i));
            }
            params.add(new Param(String.format(phoneNumberFormat, i), phoneNumber));
        }
        return params;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getSigContent() {
        return sigContent;
    }

    public void setSigContent(String sigContent) {
        this.sigContent = sigContent;
    }
}
