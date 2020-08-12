package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 18:02
 */
public class OriginConf {
    /**
     * 源站ip即cdn服务器回源访问的ip地址。多个源站ip，可以这样表述，如：["1.1.1.1","2.2.2.2"]
     */
    @SerializedName("OriginIpList")
    private List<String> originIpList;
    /**
     * 回源Http请求头部Host，默认是加速域名
     */
    @SerializedName("OriginHost")
    private String originHost;
    /**
     * 回源端口
     */
    @SerializedName("OriginPort")
    private Integer originPort;
    /**
     * 1如果为false表示BackupOriginIp为空，表示没有备份源站，忽略BackupOriginIp，BackupOriginHost字段；2如果为true表示BackupOriginIp.n必须至少有一个备份源站地址
     */
    @SerializedName("BackupOriginEnable")
    private Boolean backupOriginEnable;
    /**
     * 备份源站ip即cdn服务器回源访问的ip地址。多个源站ip，可以这样表述，如：["1.1.1.1","2.2.2.2"]
     */
    @SerializedName("BackupOriginIpList")
    private List<String> backupOriginIpList;
    /**
     * 备份回源Http请求头部Host，默认是加速域名
     */
    @SerializedName("BackupOriginHost")
    private String backupOriginHost;
    /**
     * 主源响应的回源错误码（如：404|500），默认空字符串
     */
    @SerializedName("OriginErrorCode")
    private String originErrorCode;
    /**
     * 回主源的回源失败数，默认1
     */
    @SerializedName("OriginErrorNum")
    private Integer originErrorNum;
    /**
     * 源站协议http，http|https 默认http
     */
    @SerializedName("OriginProtocol")
    private String originProtocol;
    /**
     * 跟随301跳转 0=不跟随 1=跟随
     */
    @SerializedName("OriginFollow301")
    private Integer originFollow301;


    public List<String> getOriginIpList() {
        return originIpList;
    }

    public void setOriginIpList(List<String> originIpList) {
        this.originIpList = originIpList;
    }

    public String getOriginHost() {
        return originHost;
    }

    public void setOriginHost(String originHost) {
        this.originHost = originHost;
    }

    public Integer getOriginPort() {
        return originPort;
    }

    public void setOriginPort(Integer originPort) {
        this.originPort = originPort;
    }

    public Boolean getBackupOriginEnable() {
        return backupOriginEnable;
    }

    public void setBackupOriginEnable(Boolean backupOriginEnable) {
        this.backupOriginEnable = backupOriginEnable;
    }

    public List<String> getBackupOriginIpList() {
        return backupOriginIpList;
    }

    public void setBackupOriginIpList(List<String> backupOriginIpList) {
        this.backupOriginIpList = backupOriginIpList;
    }

    public String getBackupOriginHost() {
        return backupOriginHost;
    }

    public void setBackupOriginHost(String backupOriginHost) {
        this.backupOriginHost = backupOriginHost;
    }

    public String getOriginErrorCode() {
        return originErrorCode;
    }

    public void setOriginErrorCode(String originErrorCode) {
        this.originErrorCode = originErrorCode;
    }

    public Integer getOriginErrorNum() {
        return originErrorNum;
    }

    public void setOriginErrorNum(Integer originErrorNum) {
        this.originErrorNum = originErrorNum;
    }

    public String getOriginProtocol() {
        return originProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
    }

    public Integer getOriginFollow301() {
        return originFollow301;
    }

    public void setOriginFollow301(Integer originFollow301) {
        this.originFollow301 = originFollow301;
    }
}
