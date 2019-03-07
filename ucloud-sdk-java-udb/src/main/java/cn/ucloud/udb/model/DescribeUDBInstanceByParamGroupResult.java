package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 根据配置文件获取UDB实例信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 13:53
 **/
public class DescribeUDBInstanceByParamGroupResult extends BaseResponseResult {

    public static class UDBInstanceByParamGroup {

        /**
         * DB实例Id
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * 实例名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * DB实例虚ip
         */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /**
         * 端口号
         */
        @SerializedName("Port")
        private Integer port;

        /**
         * DB状态标记
         */
        @SerializedName("State")
        private String state;

        /**
         * DB实例创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * DB实例过期时间
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /**
         * DB实例角色
         */
        @SerializedName("Role")
        private String role;

        public String getDbId() {
            return dbId;
        }

        public void setDbId(String dbId) {
            this.dbId = dbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    /**
     * DB实例信息列表
     */
    @SerializedName("DataSet")
    private List<UDBInstanceByParamGroup> udbInstanceByParamGroups;

    public List<UDBInstanceByParamGroup> getUdbInstanceByParamGroups() {
        return udbInstanceByParamGroups;
    }

    public void setUdbInstanceByParamGroups(List<UDBInstanceByParamGroup> udbInstanceByParamGroups) {
        this.udbInstanceByParamGroups = udbInstanceByParamGroups;
    }
}
