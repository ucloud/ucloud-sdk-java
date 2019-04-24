package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取可用的UAI安全审查资源类型
 * @Author : codezhang
 * @Date : 2019-04-17 10:43
 **/
public class GetUAICensorAvailResourceTypeResult extends BaseResponseResult {

    /**
     * 支持的资源类型总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 支持资源类型的具体信息
     */
    @SerializedName("DataSet")
    private List<UAICensorResourceTypeInfo> typeInfos;


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UAICensorResourceTypeInfo> getTypeInfos() {
        return typeInfos;
    }

    public void setTypeInfos(List<UAICensorResourceTypeInfo> typeInfos) {
        this.typeInfos = typeInfos;
    }
}
