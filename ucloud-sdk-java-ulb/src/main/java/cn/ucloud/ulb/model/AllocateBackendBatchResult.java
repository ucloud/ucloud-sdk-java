package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 批量添加VServer后端节点 结果类
 * @author: codezhang
 * @date: 2018-09-19 16:01
 **/

public class AllocateBackendBatchResult extends BaseResponseResult {

    /**
     * 所添加的后端资源ID，（为ULB系统中使用，与资源自身ID无关），
     * 可用于 UpdateBackendAttribute/UpdateBackendAttributeBatch/ReleaseBackend
     */
    @SerializedName("BackendId")
    private List<String> backendIds;

    public List<String> getBackendIds() {
        return backendIds;
    }

    public void setBackendIds(List<String> backendIds) {
        this.backendIds = backendIds;
    }

}
