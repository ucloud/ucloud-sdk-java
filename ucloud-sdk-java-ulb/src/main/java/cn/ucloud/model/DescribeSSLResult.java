package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-20 14:13
 **/

public class DescribeSSLResult extends BaseResponseResult {


    public static class SSLBindedTarget {

        /**
         * SSL证书绑定到的VServer的资源ID
         */
        @SerializedName("VServerId")
        private String vserverId;

        /**
         * 对应的VServer的名字
         */
        @SerializedName("VServerName")
        private String vserverName;

        /**
         * VServer 所属的ULB实例的资源ID
         */
        @SerializedName("ULBId")
        private String ulbId;

        /**
         * ULB实例的名称
         */
        @SerializedName("ULBName")
        private String ulbName;

        public String getVserverId() {
            return vserverId;
        }

        public void setVserverId(String vserverId) {
            this.vserverId = vserverId;
        }

        public String getVserverName() {
            return vserverName;
        }

        public void setVserverName(String vserverName) {
            this.vserverName = vserverName;
        }

        public String getUlbId() {
            return ulbId;
        }

        public void setUlbId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getUlbName() {
            return ulbName;
        }

        public void setUlbName(String ulbName) {
            this.ulbName = ulbName;
        }

        @Override
        public String toString() {
            return "SSLBindedTarget{" +
                    "vserverId='" + vserverId + '\'' +
                    ", vserverName='" + vserverName + '\'' +
                    ", ulbId='" + ulbId + '\'' +
                    ", ulbName='" + ulbName + '\'' +
                    '}';
        }
    }


    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private String sslId;


    /**
     * SSL证书的名字
     */
    @SerializedName("SSLName")
    private String sslName;

    /**
     * SSL证书类型，暂时只有 Pem 一种类型
     */
    @SerializedName("SSLType")
    private String sslType;

    /**
     * SSL证书的内容
     */
    @SerializedName("SSLContent")
    private String sslContent;

    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;

    /**
     * SSL证书绑定到的对象
     */
    @SerializedName("SSLBindedTargetSet")
    private List<SSLBindedTarget> sslBindedTargets;


    @Override
    public String toString() {
        return "DescribeSSLResult{" +
                "sslId='" + sslId + '\'' +
                ", sslName='" + sslName + '\'' +
                ", sslType='" + sslType + '\'' +
                ", sslContent='" + sslContent + '\'' +
                ", createTime=" + createTime +
                ", sslBindedTargets=" + sslBindedTargets +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public String getSslType() {
        return sslType;
    }

    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    public String getSslContent() {
        return sslContent;
    }

    public void setSslContent(String sslContent) {
        this.sslContent = sslContent;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public List<SSLBindedTarget> getSslBindedTargets() {
        return sslBindedTargets;
    }

    public void setSslBindedTargets(List<SSLBindedTarget> sslBindedTargets) {
        this.sslBindedTargets = sslBindedTargets;
    }
}
