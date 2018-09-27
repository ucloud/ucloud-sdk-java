package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:26
 */
public class DescribeFirewallResourceResult extends BaseResponseResult {
    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("ResourceSet")
    private List<Resource> resourceSet;


    public static class Resource {
        @SerializedName("ResourceType")
        private String resourceType;
        @SerializedName("ResourceID")
        private String resourceID;
        @SerializedName("Zone")
        private int zone;
        @SerializedName("PrivateIP")
        private String privateIP;
        @SerializedName("Name")
        private String name;
        @SerializedName("Tag")
        private String tag;
        @SerializedName("Remark")
        private String remark;
        @SerializedName("Status")
        private int status;

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

        public int getZone() {
            return zone;
        }

        public void setZone(int zone) {
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Resource> getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(List<Resource> resourceSet) {
        this.resourceSet = resourceSet;
    }
}
