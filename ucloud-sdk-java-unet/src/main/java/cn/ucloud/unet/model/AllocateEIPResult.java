package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 申请弹性IP 结果类
 * @author: codezhang
 * @date: 2018-09-27 10:11
 **/

public class AllocateEIPResult extends BaseResponseResult {

    public static class EIP{
        /**
         * 申请到的EIP资源ID
         */
        @SerializedName("EIPId")
        private String eipId;

        /**
         * 申请到的IPv4地址
         */
        @SerializedName("EIPAddr")
        private List<EIPAddr> eipAddrs;


        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public List<EIPAddr> getEipAddrs() {
            return eipAddrs;
        }

        public void setEipAddrs(List<EIPAddr> eipAddrs) {
            this.eipAddrs = eipAddrs;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class EIPAddr{

        /**
         * 运营商信息如: 国际: International, BGP: Bgp
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * IP地址
         */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    /**
     * 申请到的EIP资源详情 参见 UnetAllocateEIPSet
     */
    @SerializedName("EIPSet")
    private List<EIP> eips;

    /**
     * 请求uuid
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public List<EIP> getEips() {
        return eips;
    }

    public void setEips(List<EIP> eips) {
        this.eips = eips;
    }

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }
}
