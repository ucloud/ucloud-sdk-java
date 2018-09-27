package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import com.sun.xml.internal.messaging.saaj.util.Base64;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 重置主机密码 参数类
 * @author: codezhang
 * @date: 2018-09-18 14:31
 **/

public class ResetUHostInstancePasswordParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID
     */
    @NotEmpty(message = "uhostId can not be empty")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * require  UHost新密码（密码格式使用BASE64编码）
     */
    private String password;

    @UcloudParam("Password")
    public List<Param> checkPassord() throws Exception {
        List<Param> list = new ArrayList<>();
        if (this.getPassword() == null || "".equals(this.getPassword())){
            throw  new ValidationException("password can not be empty");
        }else {
            list.add(new Param("Password",  new String(Base64.encode((password).getBytes("utf-8")))));
        }
        return list;
    }


    public ResetUHostInstancePasswordParam(@NotEmpty(message = "region can not be empty") String region,
                                           @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("ResetUHostInstancePassword");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
