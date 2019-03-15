package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.constraints.NotEmpty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 修改主备密码 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyURedisGroupPasswordParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;
    /**
     * 组的ID
     */
    @UcloudParam("GroupId")
    @NotEmpty(message = "groupId can not be empty")
    private String groupId;
    /**
     * 新密码字符串，如要取消密码，此值为空字符串
     */
    @NotEmpty(message = "password can not be empty")
    private String password;


    public ModifyURedisGroupPasswordParam(String region
            , String groupId
            , String password
    ) {
        super("ModifyURedisGroupPassword");
        this.region = region;
        this.groupId = groupId;
        this.password = password;
    }

    @UcloudParam("Password")
    public List<Param> checkPassword() throws UnsupportedEncodingException {
        List<Param> params = new ArrayList<>();
        if (password != null && password.length() > 0) {
            params.add(new Param("Password", new
                    String(Base64.encodeBase64((password).getBytes("utf-8")))));
        }
        return params;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}