package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取防火墙绑定资源 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:26
 */
public class DescribeFirewallResourceResult extends BaseResponseResult {

    /**
     * 满足条件的个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 资源列表，见 ResourceSet
     */
    @SerializedName("ResourceSet")
    private List<Resource> resourceSet;


    public static class Resource {
        /**
         * 绑定资源的资源类型
         */
        @SerializedName("ResourceType")
        private String resourceType;
        /**
         * 绑定该防火墙的资源id
         */
        @SerializedName("ResourceID")
        private String resourceID;
        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;
        /**
         * 内网IP
         */
        @SerializedName("PrivateIP")
        private String privateIP;
        /**
         * 名称
         */
        @SerializedName("Name")
        private String name;
        /**
         * 业务组
         */
        @SerializedName("Tag")
        private String tag;
        /**
         * 备注
         */
        @SerializedName("Remark")
        private String remark;
        /**
         * 状态
         */
        @SerializedName("Status")
        private String status;

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceID() {
            return resourceID;
        }

        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Resource> getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(List<Resource> resourceSet) {
        this.resourceSet = resourceSet;
    }
}
