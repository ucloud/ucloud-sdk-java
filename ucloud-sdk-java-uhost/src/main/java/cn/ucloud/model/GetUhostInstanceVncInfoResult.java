package cn.ucloud.model;

/**
 * @description: 获取指定UHost实例的管理VNC配置详细信息 结果类
 * @author: codezhang
 * @date: 2018-09-13 11:04
 **/

public class GetUhostInstanceVncInfoResult {
    /**
     * 操作返回码
     */
    private Integer retCode;
    /**
     * 操作名称
     */
    private String action;
    /**
     * UHost实例ID
     */
    private String uHostId;
    /**
     * VNC登录IP
     */
    private String vncIP;
    /**
     * VNC登录端口
     */
    private Integer vncPort;
    /**
     * VNC登录密码
     */
    private String vncPassword;

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getuHostId() {
        return uHostId;
    }

    public void setuHostId(String uHostId) {
        this.uHostId = uHostId;
    }


}
