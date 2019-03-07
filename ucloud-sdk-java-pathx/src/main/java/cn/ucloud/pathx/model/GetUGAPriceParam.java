package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UGA价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GetUGAPriceParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 绑定到UPath的数量
     */
    @UcloudParam("UPathNum")
    @NotNull(message = "uPathNum can not be null")
    private Integer uPathNum;
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 计费类型
     */
    @UcloudParam("ChargeType")
    private String chargeType;


    public GetUGAPriceParam(String projectId
            , Integer uPathNum
    ) {
        super("GetUGAPrice");
        this.projectId = projectId;
        this.uPathNum = uPathNum;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getUPathNum() {
        return this.uPathNum;
    }

    public void setUPathNum(Integer uPathNum) {
        this.uPathNum = uPathNum;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


}