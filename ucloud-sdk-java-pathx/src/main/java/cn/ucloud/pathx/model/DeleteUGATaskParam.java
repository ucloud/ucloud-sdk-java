package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 删除加速配置端口 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUGATaskParam extends BaseRequestParam {
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;

    /**
     * tcp端口
     */
    private List<Integer> tcpPorts;
    /**
     * udp端口
     */
    private List<Integer> udpPorts;


    public DeleteUGATaskParam(String projectId
            , String uGAId
    ) {
        super("DeleteUGATask");
        this.projectId = projectId;
        this.uGAId = uGAId;
    }
    @UcloudParam("TCP")
    public List<Param> checkTCPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (tcpPorts != null) {
            int size = tcpPorts.size();
            for (int i = 0; i < size; i++) {
                Integer port = tcpPorts.get(i);
                if (port == null) {
                    throw new ValidationException(String.format("tcpPorts[%d] can not be null", i));
                }
                params.add(new Param(String.format("TCP.%d", i), port));
            }
        }
        return params;
    }

    @UcloudParam("UDP")
    public List<Param> checkUDPPorts() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (udpPorts != null) {
            int size = udpPorts.size();
            for (int i = 0; i < size; i++) {
                Integer port = udpPorts.get(i);
                if (port == null) {
                    throw new ValidationException(String.format("udpPorts[%d] can not be null", i));
                }
                params.add(new Param(String.format("UDP.%d", i), port));
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


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}