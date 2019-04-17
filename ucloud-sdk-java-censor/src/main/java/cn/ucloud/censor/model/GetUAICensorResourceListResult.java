package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 14:12
 **/
public class GetUAICensorResourceListResult extends BaseResponseResult {

    /**
     * 资源总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 资源具体信息
     */
    @SerializedName("DataSet")
    private List<UAICensorResourceInfo> resourceInfos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UAICensorResourceInfo> getResourceInfos() {
        return resourceInfos;
    }

    public void setResourceInfos(List<UAICensorResourceInfo> resourceInfos) {
        this.resourceInfos = resourceInfos;
    }
}
