package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 解绑PathX SSL 证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class UnBindPathXSSLParam extends BaseRequestParam {
    /**
     * UGA实例ID。
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    /**
     * SSL证书ID。
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sSLId can not be empty")
    private String sSLId;

    /**
     * 解绑SSL证书的端口。Port.0 Port.1格式 端口错误则解绑失败。
     */
    private List<Integer> ports;

    public UnBindPathXSSLParam(String uGAId
            , String sSLId, List<Integer> ports
    ) {
        super("UnBindPathXSSL");
        this.uGAId = uGAId;
        this.sSLId = sSLId;
        this.ports = ports;
    }

    @UcloudParam("ports")
    public List<Param> checkHTTPSPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (ports != null && !ports.isEmpty()) {
            int size = ports.size();
            for (int i = 0; i < size; i++) {
                if (ports.get(i) == null) {
                    throw new ValidationException(String.format("ports[%d] can not be null", i));
                } else {
                    params.add(new Param(String.format("Port.%d", i), ports.get(i)));
                }
            }
        } else {
            throw new ValidationException("ports can not be empty");
        }
        return params;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }

    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}