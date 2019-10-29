package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取带宽用量 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:03
 */
public class DescribeBandwidthUsageResult extends BaseResponseResult {
    /**
     * 满足条件的个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 单个弹性IP的带宽用量详细信息, 详见 UnetBandwidthUsageEIPSet, 如没有弹性IP资源则没有该返回值。
     */
    @SerializedName("EIPSet")
    private List<EIP> eIPSet;

    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public static class EIP {
        /**
         * 最近5分钟带宽用量, 单位Mbps
         */
        @SerializedName("CurBandwidth")
        private Integer curBandwidth;
        /**
         * 弹性IP资源ID
         */
        @SerializedName("EIPId")
        private String eIPId;

        public Integer getCurBandwidth() {
            return curBandwidth;
        }

        public void setCurBandwidth(Integer curBandwidth) {
            this.curBandwidth = curBandwidth;
        }

        public String geteIPId() {
            return eIPId;
        }

        public void seteIPId(String eIPId) {
            this.eIPId = eIPId;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<EIP> geteIPSet() {
        return eIPSet;
    }

    public void seteIPSet(List<EIP> eIPSet) {
        this.eIPSet = eIPSet;
    }

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }
}
