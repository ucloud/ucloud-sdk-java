package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 根据IP获取宿主机上未删除DB列表 参数对象
 * @Author : codezhang
 * @Date : 2019-03-04 13:46
 **/
public class DescribeUDBInstanceByHostIpResult extends BaseResponseResult {

    public static class UDBInstanceByHostIp{

        /**
         * DB实例id
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * UDB虚拟IP
         */
        @SerializedName("VirtualIp")
        private String virtualIP;

        public String getDbId() {
            return dbId;
        }

        public void setDbId(String dbId) {
            this.dbId = dbId;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

    }


    /**
     * 获取的DB实例信息列表 参数见 UDBInstanceByHostIp
     */
    @SerializedName("DateSet")
    private List<UDBInstanceByHostIp> udbInstanceByHostIps;

    public List<UDBInstanceByHostIp> getUdbInstanceByHostIps() {
        return udbInstanceByHostIps;
    }

    public void setUdbInstanceByHostIps(List<UDBInstanceByHostIp> udbInstanceByHostIps) {
        this.udbInstanceByHostIps = udbInstanceByHostIps;
    }
}
