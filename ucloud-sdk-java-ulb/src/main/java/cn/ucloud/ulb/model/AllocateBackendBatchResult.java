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

    public static class Backend{

        @SerializedName("BackendId")
        private String backendId;

        @SerializedName("ResourceId")
        private String resourceId;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

    /**
     * 所添加的后端资源，（为ULB系统中使用，与资源自身ID无关），
     * 可用于 UpdateBackendAttribute/UpdateBackendAttributeBatch/ReleaseBackend
     */
    @SerializedName("BackendSet")
    private List<Backend> backends;

    public List<Backend> getBackends() {
        return backends;
    }

    public void setBackends(List<Backend> backends) {
        this.backends = backends;
    }
}
