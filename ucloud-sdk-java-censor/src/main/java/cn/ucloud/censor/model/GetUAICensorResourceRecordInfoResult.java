package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取UAI安全审查资源请求记录
 * @Author : codezhang
 * @Date : 2019-04-18 16:49
 **/
public class GetUAICensorResourceRecordInfoResult extends BaseResponseResult {

    /**
     * 记录总数
     */
    @SerializedName("TotalRecordCount")
    private Integer totalRecordCount;

    /**
     * 记录的审查请求总数
     */
    @SerializedName("TotalCensorCount")
    private Integer totalCensorCount;

    /**
     * 记录的具体信息
     */
    @SerializedName("DataSet")
    private List<UAICensorResourceRecordInfo> recordInfos;

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getTotalCensorCount() {
        return totalCensorCount;
    }

    public void setTotalCensorCount(Integer totalCensorCount) {
        this.totalCensorCount = totalCensorCount;
    }

    public List<UAICensorResourceRecordInfo> getRecordInfos() {
        return recordInfos;
    }

    public void setRecordInfos(List<UAICensorResourceRecordInfo> recordInfos) {
        this.recordInfos = recordInfos;
    }
}
