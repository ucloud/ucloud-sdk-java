package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 获取短信发送回执信息 参数对象
 * 获取短信发送回执信息。下游服务提供商回执信息返回会有一定延时，建议发送完短信以后，
 * 5-10分钟后再调用该接口拉取回执信息。
 * 若超过12小时未返回，则请联系技术支持确认原因
 * @Author : codezhang
 * @Date : 2019-06-04 17:54
 **/
public class GetUSMSSendReceiptParam extends BaseRequestParam {
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
     * 发送短信时返回的SessionNo集合，SessionNoSet.0,SessionNoSet.1....格式
     */
    private List<String> sessionNos;

    public GetUSMSSendReceiptParam(List<String> sessionNos) {
        super("GetUSMSSendReceipt");
        this.sessionNos = sessionNos;
    }

    @UcloudParam("SessionNos")
    public List<Param> checkPhoneNumbers() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (sessionNos == null || sessionNos.isEmpty()) {
            throw new ValidatorException("sessionNos can not be empty");
        }
        int size = sessionNos.size();
        String sessionNoFormat = "SessionNoSet.%d";
        for (int i = 0; i < size; i++) {
            String sessionNo = sessionNos.get(i);
            if (sessionNo == null || sessionNo.isEmpty()) {
                throw new ValidatorException(String.format("sessionNo[%d] can not be empty", i));
            }
            params.add(new Param(String.format(sessionNoFormat, i), sessionNo));
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

    public List<String> getSessionNos() {
        return sessionNos;
    }

    public void setSessionNos(List<String> sessionNos) {
        this.sessionNos = sessionNos;
    }
}
