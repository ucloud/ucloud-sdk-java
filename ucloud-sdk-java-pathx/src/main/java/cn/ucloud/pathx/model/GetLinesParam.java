package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取线路数 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GetLinesParam extends BaseRequestParam {
    /**
     * 开始时间时间戳
     */
    @UcloudParam("BeginTime")
    private Integer beginTime;
    /**
     * 结束时间时间戳
     */
    @UcloudParam("EndTime")
    private Integer endTime;
    /**
     *
     */
    @UcloudParam("LineName")
    private String lineName;


    public GetLinesParam() {
        super("GetLines");
    }


    public Integer getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getLineName() {
        return this.lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }


}