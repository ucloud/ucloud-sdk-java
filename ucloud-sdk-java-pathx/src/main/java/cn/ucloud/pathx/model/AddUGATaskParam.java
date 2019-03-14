package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 添加加速配置端口 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class AddUGATaskParam extends BaseRequestParam {
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;

    /**
     * tcp 端口号
     */
    private List<Integer> tcpPorts;

    /**
     * udp 端口号
     */
    private List<Integer> udpPorts;

    /**
     * http 端口号
     */
    private List<Integer> httpPorts;

    /**
     * https 端口号
     */
    private List<Integer> httpsPorts;

    public AddUGATaskParam(String projectId
            , String uGAId
    ) {
        super("AddUGATask");
        this.projectId = projectId;
        this.uGAId = uGAId;
    }

    @UcloudParam("tcpPorts")
    public List<Param> checkTCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (tcpPorts != null && !tcpPorts.isEmpty()) {
            int size = tcpPorts.size();
            for (int i = 0; i < size; i++) {
                if (tcpPorts.get(i) == null){
                    throw new ValidationException(String.format("tcpPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("TCP.%d",i),tcpPorts.get(i)));
                }
            }
        }
        return params;
    }

    @UcloudParam("udpPorts")
    public List<Param> checkUCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (udpPorts != null && !udpPorts.isEmpty()) {
            int size = udpPorts.size();
            for (int i = 0; i < size; i++) {
                if (udpPorts.get(i) == null){
                    throw new ValidationException(String.format("udpPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("UDP.%d",i),udpPorts.get(i)));
                }
            }
        }
        return params;
    }

    @UcloudParam("httpPorts")
    public List<Param> checkHTTPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (httpPorts != null && !httpPorts.isEmpty()) {
            int size = httpPorts.size();
            for (int i = 0; i < size; i++) {
                if (httpPorts.get(i) == null){
                    throw new ValidationException(String.format("httpPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("HTTP.%d",i),httpPorts.get(i)));
                }
            }
        }
        return params;
    }

    @UcloudParam("httpsPorts")
    public List<Param> checkHTTPSPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (httpsPorts != null && !httpsPorts.isEmpty()) {
            int size = httpsPorts.size();
            for (int i = 0; i < size; i++) {
                if (httpsPorts.get(i) == null){
                    throw new ValidationException(String.format("httpsPorts[%d] can not be null",i));
                }else {
                    params.add(new Param(String.format("HTTPS.%d",i),httpsPorts.get(i)));
                }
            }
        }
        return params;
    }

    public List<Integer> getTcpPorts() {
        return tcpPorts;
    }

    public void setTcpPorts(List<Integer> tcpPorts) {
        this.tcpPorts = tcpPorts;
    }

    public List<Integer> getUdpPorts() {
        return udpPorts;
    }

    public void setUdpPorts(List<Integer> udpPorts) {
        this.udpPorts = udpPorts;
    }

    public List<Integer> getHttpPorts() {
        return httpPorts;
    }

    public void setHttpPorts(List<Integer> httpPorts) {
        this.httpPorts = httpPorts;
    }

    public List<Integer> getHttpsPorts() {
        return httpsPorts;
    }

    public void setHttpsPorts(List<Integer> httpsPorts) {
        this.httpsPorts = httpsPorts;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}