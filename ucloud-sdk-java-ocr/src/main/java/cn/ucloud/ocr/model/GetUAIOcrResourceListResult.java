package cn.ucloud.ocr.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :获取UAI-OCR资源列表
 * @Author : codezhang
 * @Date : 2019-04-19 15:46
 **/
public class GetUAIOcrResourceListResult extends BaseResponseResult {

    /**
     * 获取的资源总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * UAI-OCR资源的具体信息
     */
    @SerializedName("DataSet")
    private List<UAIOcrResourceInfo> uaiOcrResourceInfos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UAIOcrResourceInfo> getUaiOcrResourceInfos() {
        return uaiOcrResourceInfos;
    }

    public void setUaiOcrResourceInfos(List<UAIOcrResourceInfo> uaiOcrResourceInfos) {
        this.uaiOcrResourceInfos = uaiOcrResourceInfos;
    }
}
