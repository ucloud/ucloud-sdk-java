package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 绑定PathX SSL证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class BindPathXSSLParam extends BaseRequestParam {
    /**
     * 证书ID
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sSLId can not be empty")
    private String sSLId;
    /**
     * UGA实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;

    /**
     * 绑定SSL证书的端口。Port.0 Port.1对应多个Port。如果Port不存在则不会绑定
     */
    private List<Integer> ports;

    public BindPathXSSLParam(String sSLId
            , String uGAId, List<Integer> ports
    ) {
        super("BindPathXSSL");
        this.sSLId = sSLId;
        this.uGAId = uGAId;
        this.ports = ports;
    }

    @UcloudParam("ports")
    public List<Param> checkTCPPorts() throws ValidationException {
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
        }
        return params;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}