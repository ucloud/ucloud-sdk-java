package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :创建数据库 结果类
 * 创建UDB实例（包括创建mysql master节点、mongodb primary/configsvr节点和从备份恢复实例）
 * 提示信息: 创建跨可用区的高可用注意项:
 * 1. 需要参数 BackupZone：值为高可用容灾的ZoneId
 * 2. 参数ParamGroupId: 值为跨可用区的配置文件，可以通过DescribeUDBParamGroup获得
 * @Author : codezhang
 * @Date : 2019-03-01 19:38
 **/
public class CreateUDBInstanceResult extends BaseResponseResult {

    /**
     * db实例id
     */
    @SerializedName("DBId")
    private String dbId;


    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "CreateUDBInstanceResult{" +
                "dbId='" + dbId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
