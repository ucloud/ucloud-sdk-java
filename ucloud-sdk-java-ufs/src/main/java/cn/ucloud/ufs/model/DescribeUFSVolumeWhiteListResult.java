package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取文件系统白名单 结果类
 * @author: codezhang
 * @date: 2018-10-08 16:56
 **/

public class DescribeUFSVolumeWhiteListResult extends BaseResponseResult {


    public static class WhiteListInfo{

        /**
         * 云主机ID
         */
        @SerializedName("UHostId")
        private String uhostId;

        public String getUhostId() {
            return uhostId;
        }

        public void setUhostId(String uhostId) {
            this.uhostId = uhostId;
        }

    }

    /**
     * 白名单主机总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 白名单主机总数
     */
    @SerializedName("DataSet")
    private List<WhiteListInfo> whiteListInfos;


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<WhiteListInfo> getWhiteListInfos() {
        return whiteListInfos;
    }

    public void setWhiteListInfos(List<WhiteListInfo> whiteListInfos) {
        this.whiteListInfos = whiteListInfos;
    }

}
