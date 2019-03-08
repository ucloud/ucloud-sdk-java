package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 一段时间内的监控数据 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class MetricPeriod  {
            /**
            * 出口带宽
            */
            @SerializedName("NetworkOut")
                private List<MatricPoint> networkOut;
            /**
            * 入口带宽
            */
            @SerializedName("NetworkIn")
                private List<MatricPoint> networkIn;
            /**
            * 出口使用率
            */
            @SerializedName("NetworkOutUsage")
                private List<MatricPoint> networkOutUsage;
            /**
            * 入口使用率
            */
            @SerializedName("NetworkInUsage")
                private List<MatricPoint> networkInUsage;
            /**
            * 
            */
            @SerializedName("BandIn")
                private List<MatricPoint> bandIn;
            /**
            * 
            */
            @SerializedName("BandOut")
                private List<MatricPoint> bandOut;




}