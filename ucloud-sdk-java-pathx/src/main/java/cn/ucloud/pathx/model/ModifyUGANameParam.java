package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 更改加速配置名字 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUGANameParam extends BaseRequestParam {
    /**
     * UGAID。加速配置实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    /**
     * 名字
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;


    public ModifyUGANameParam(String projectId
            , String uGAId
            , String name
    ) {
        super("ModifyUGAName");
        this.projectId = projectId;
        this.uGAId = uGAId;
        this.name = name;
    }


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}