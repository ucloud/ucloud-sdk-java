package cn.ucloud.ocr.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取可用UAI-OCR资源类型
 * @Author : codezhang
 * @Date : 2019-04-19 15:28
 **/
public class GetUAIOcrAvailResourceTypeResult extends BaseResponseResult {

    /**
     * 可用资源类型总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * OCR资源类型的具体信息
     */
    @SerializedName("DataSet")
    private List<UAIOcrResourceTypeInfo> uaiOcrResourceTypeInfos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UAIOcrResourceTypeInfo> getUaiOcrResourceTypeInfos() {
        return uaiOcrResourceTypeInfos;
    }

    public void setUaiOcrResourceTypeInfos(List<UAIOcrResourceTypeInfo> uaiOcrResourceTypeInfos) {
        this.uaiOcrResourceTypeInfos = uaiOcrResourceTypeInfos;
    }
}
