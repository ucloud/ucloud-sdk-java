package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除主备redis 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DeleteURedisGroupParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 组ID
     */
    @UcloudParam("GroupId")
    @NotEmpty(message = "groupId can not be empty")
    private String groupId;


    public DeleteURedisGroupParam(String region
            , String groupId
    ) {
        super("DeleteURedisGroup");
        this.region = region;
        this.groupId = groupId;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


}