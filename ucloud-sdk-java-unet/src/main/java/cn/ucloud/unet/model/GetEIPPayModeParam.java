package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取弹性IP计费方式 参数类
 * @author: codezhang
 * @date: 2018-09-27 14:00
 **/

public class GetEIPPayModeParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 弹性IP的资源Id
     */
    private List<String> eipIds;

    @UcloudParam("EIPID")
    public List<Param> checkEIPIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (eipIds == null) {
            throw new ValidationException("eipIds can not be null");
        } else {
            int len = eipIds.size();
            if (len <= 0) {
                throw new ValidationException("eipIds can not be empty");
            }
            for (int i = 0; i < len; i++) {
                String id = eipIds.get(i);
                if (id == null || id.length() <= 0){
                    throw new ValidationException("eipIds["+i+"] can not be empty");
                }
                list.add(new Param("EIPId."+i,id));
            }
        }
        return list;
    }

    public GetEIPPayModeParam( @NotEmpty(message = "region can not be empty") String region) {
        super("GetEIPPayMode");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getEipIds() {
        return eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }
}
