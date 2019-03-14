package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 克隆路由表 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:34
 **/

public class CloneRouteTableResult extends BaseResponseResult {
    /**
     * 克隆后的新路由表ID
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
