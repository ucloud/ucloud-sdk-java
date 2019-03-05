package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 列出UDB配置节点信息 结果对象
 * @Author : codezhang
 * @Date : 2019-03-04 18:10
 **/
public class ListUDBConfigSvrResult extends BaseResponseResult {

    public static class UDBConfigSvr {

        /**
         * DB实例Id
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * DB实例名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * DB类型Id
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

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

        public String getDbTypeId() {
            return dbTypeId;
        }

        public void setDbTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

    }

    /**
     * DB配置节点信息
     */
    @SerializedName("DataSet")
    private List<UDBConfigSvr> udbConfigSvrs;

    public List<UDBConfigSvr> getUdbConfigSvrs() {
        return udbConfigSvrs;
    }

    public void setUdbConfigSvrs(List<UDBConfigSvr> udbConfigSvrs) {
        this.udbConfigSvrs = udbConfigSvrs;
    }

}
