package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新负载均衡属性 参数类
 * Name Tag Remark 三个参数必传一个
 * @author: codezhang
 * @date: 2018-09-19 11:39
 **/

public class UpdateULBAttributeParam extends BaseRequestParam {

    /**
     *
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     *
     */
    @UcloudParam("ULBId")
    @NotEmpty(message = "ulbId can not be empty")
    private String ulbId;

    /**
     * 名称
     */
    @UcloudParam("Name")
    private String name;

    /**
     * 业务
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * 备注
     */
    @UcloudParam("Remark")
    private String  remark;

    public UpdateULBAttributeParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "ulbId can not be empty") String ulbId) {
        super("UpdateULBAttribute");
        this.region = region;
        this.ulbId = ulbId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
