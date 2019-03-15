package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 更改加速线路名字 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUPathNameParam extends BaseRequestParam {
    /**
     * UPath ID
     */
    @UcloudParam("UPathId")
    @NotEmpty(message = "uPathId can not be empty")
    private String uPathId;
    /**
     * 名字
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;


    public ModifyUPathNameParam(String projectId
            , String uPathId
            , String name
    ) {
        super("ModifyUPathName");
        this.projectId = projectId;
        this.uPathId = uPathId;
        this.name = name;
    }


    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}