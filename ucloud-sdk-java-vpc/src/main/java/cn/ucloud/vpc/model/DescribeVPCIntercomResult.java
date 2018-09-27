package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 17:44
 **/

public class DescribeVPCIntercomResult extends BaseResponseResult {


    public static class VPCIntercom{

        /**
         * 项目Id
         */
        @SerializedName("ProjectId")
        private String projectId;

        /**
         * VPC的地址空间
         */
        @SerializedName("Network")
        private List<String> networks;

        /**
         * 所属地域
         */
        @SerializedName("DstRegion")
        private String dstRegion;

        /**
         * VPC名字
         */
        @SerializedName("Name")
        private String name;

        /**
         * VPCId
         */
        @SerializedName("VPCId")
        private String vpcId;

        /**
         * 业务组（未分组显示为 Default）
         */
        @SerializedName("Tag")
        private String tag;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public List<String> getNetworks() {
            return networks;
        }

        public void setNetworks(List<String> networks) {
            this.networks = networks;
        }

        public String getDstRegion() {
            return dstRegion;
        }

        public void setDstRegion(String dstRegion) {
            this.dstRegion = dstRegion;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }


        @Override
        public String toString() {
            return "VPCIntercom{" +
                    "projectId='" + projectId + '\'' +
                    ", networks=" + networks +
                    ", dstRegion='" + dstRegion + '\'' +
                    ", name='" + name + '\'' +
                    ", vpcId='" + vpcId + '\'' +
                    ", tag='" + tag + '\'' +
                    '}';
        }
    }

    /**
     *  联通VPC信息数组
     */
    @SerializedName("DataSet")
    private List<VPCIntercom> vpcIntercoms;

    public List<VPCIntercom> getVpcIntercoms() {
        return vpcIntercoms;
    }

    public void setVpcIntercoms(List<VPCIntercom> vpcIntercoms) {
        this.vpcIntercoms = vpcIntercoms;
    }

    @Override
    public String toString() {
        return "DescribeVPCIntercomResult{" +
                "vpcIntercoms=" + vpcIntercoms +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
