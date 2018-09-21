package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取子网资源信息  结果类
 * @author: codezhang
 * @date: 2018-09-21 16:44
 **/

public class DescribeSubnetResourceResult extends BaseResponseResult {


    public static class SubnetResource{

        /**
         * IP地址
         */
        @SerializedName("IP")
        private String ip;

        /**
         * 名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 资源ID
         */
        @SerializedName("ResourceId")
        private String resourceId;


        /**
         * 资源类型
         */
        @SerializedName("ResourceType")
        private String resourceType;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        @Override
        public String toString() {
            return "SubnetResource{" +
                    "ip='" + ip + '\'' +
                    ", name='" + name + '\'' +
                    ", resourceId='" + resourceId + '\'' +
                    ", resourceType='" + resourceType + '\'' +
                    '}';
        }
    }

    /**
     * 满足条件的数目
     */
    @SerializedName("TotalCount")
    private Integer totalCount;


    /**
     * 子网资源
     */
    @SerializedName("DataSet")
    private List<SubnetResource> subnetResources;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SubnetResource> getSubnetResources() {
        return subnetResources;
    }

    public void setSubnetResources(List<SubnetResource> subnetResources) {
        this.subnetResources = subnetResources;
    }

    @Override
    public String toString() {
        return "DescribeSubnetResourceResult{" +
                "totalCount=" + totalCount +
                ", subnetResources=" + subnetResources +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
