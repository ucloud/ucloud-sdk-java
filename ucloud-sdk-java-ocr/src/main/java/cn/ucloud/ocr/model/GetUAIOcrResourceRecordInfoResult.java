package cn.ucloud.ocr.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取UAI-OCR资源请求记录
 * @Author : codezhang
 * @Date : 2019-04-19 16:26
 **/
public class GetUAIOcrResourceRecordInfoResult extends BaseResponseResult {

    /**
     * 资源请求记录总数
     */
    @SerializedName("TotalRecordCount")
    private Integer totalRecordCount;

    /**
     * 记录的OCR请求总数
     */
    @SerializedName("TotalOcrCount")
    private Integer totalOcrCount;

    /**
     * 资源请求记录的具体信息
     */
    @SerializedName("DataSet")
    private List<UAIOcrResourceRecordInfo> uaiOcrResourceRecordInfos;

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getTotalOcrCount() {
        return totalOcrCount;
    }

    public void setTotalOcrCount(Integer totalOcrCount) {
        this.totalOcrCount = totalOcrCount;
    }

    public List<UAIOcrResourceRecordInfo> getUaiOcrResourceRecordInfos() {
        return uaiOcrResourceRecordInfos;
    }

    public void setUaiOcrResourceRecordInfos(List<UAIOcrResourceRecordInfo> uaiOcrResourceRecordInfos) {
        this.uaiOcrResourceRecordInfos = uaiOcrResourceRecordInfos;
    }
}
