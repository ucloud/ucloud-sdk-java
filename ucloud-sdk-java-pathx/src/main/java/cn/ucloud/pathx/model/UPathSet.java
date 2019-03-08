package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : uga信息中携带的upath信息 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UPathSet  {
            /**
            * UPath名字
            */
            @SerializedName("UPathName")
                private String uPathName;
            /**
            * UPath ID号
            */
            @SerializedName("UPathId")
                private String uPathId;
            /**
            * 带宽
            */
            @SerializedName("Bandwidth")
                private String bandwidth;
            /**
            * 线路ID
            */
            @SerializedName("LineId")
                private String lineId;
            /**
            * 线路起点名字
            */
            @SerializedName("LineFromName")
                private String lineFromName;
            /**
            * 线路对端名字
            */
            @SerializedName("LineToName")
                private String lineToName;
            /**
            * 线路对端IP
            */
            @SerializedName("OutPublicIpList")
                private List<OutPublicIpInfo> outPublicIpList;


                public String getUPathName() {
                return this.uPathName;
                }

                public void setUPathName(String uPathName) {
                this.uPathName = uPathName;
                }




                public String getUPathId() {
                return this.uPathId;
                }

                public void setUPathId(String uPathId) {
                this.uPathId = uPathId;
                }




                public String getBandwidth() {
                return this.bandwidth;
                }

                public void setBandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                }




                public String getLineId() {
                return this.lineId;
                }

                public void setLineId(String lineId) {
                this.lineId = lineId;
                }




                public String getLineFromName() {
                return this.lineFromName;
                }

                public void setLineFromName(String lineFromName) {
                this.lineFromName = lineFromName;
                }




                public String getLineToName() {
                return this.lineToName;
                }

                public void setLineToName(String lineToName) {
                this.lineToName = lineToName;
                }






}