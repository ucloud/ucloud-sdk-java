package cn.ucloud.pathx.model;


/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-14 11:12
 **/
public class PathXWhitelist {

    /**
     * IP或IP段
     */
    private String ip;
    /**
     * 端口协议（TCP/UDP）
     */
    private String protocol;
    /**
     * 端口或端口范围（ ':' 隔开）
     */
    private String port;

    public PathXWhitelist(String ip, String protocol, String port) {
        this.ip = ip;
        this.protocol = protocol;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
