package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取UDB实例的备份黑名单 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 10:12
 **/
public class DescribeUDBBackupBlacklistResult extends BaseResponseResult {

    /**
     * DB的黑名单列表, db.%为指定库 dbname.tablename为指定表
     */
    @SerializedName("Blacklist")
    private List<String> blacklist;

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }

}
