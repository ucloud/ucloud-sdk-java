package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:03
 */
public class DescribeBandwidthUsageResult extends BaseResponseResult {
    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("EIPSet")
    private List<EIP> eIPSet;


    public static class EIP {
        @SerializedName("CurBandwidth")
        private float curBandwidth;
        @SerializedName("EIPId")
        private String eIPId;

        public float getCurBandwidth() {
            return curBandwidth;
        }

        public void setCurBandwidth(float curBandwidth) {
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

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<EIP> geteIPSet() {
        return eIPSet;
    }

    public void seteIPSet(List<EIP> eIPSet) {
        this.eIPSet = eIPSet;
    }
}
