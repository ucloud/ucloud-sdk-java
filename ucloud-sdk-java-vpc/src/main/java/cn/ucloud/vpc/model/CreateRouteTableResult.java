package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:09
 **/

public class CreateRouteTableResult extends BaseResponseResult {

    /**
     * 路由表ID
     */
    @SerializedName("RouteTableId")
    private String routeTableId;

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

}
