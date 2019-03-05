package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 编辑备份黑名单 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 16:29
 **/
public class EditUDBBackupBlacklistParam extends BaseRequestParam {

    public static class Blacklist {

        private String database;

        private String table;

        /**
         * 黑名单，规范示例,指定库mysql.%;test.%; 指定表city.address;
         *
         * @param database
         * @param table
         */
        public Blacklist(String database, String table) {
            this.database = database;
            this.table = table;
        }

        public String getDatabase() {
            return database;
        }

        public void setDatabase(String database) {
            this.database = database;
        }

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }
    }

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;


    /**
     * 黑名单，规范示例,指定库mysql.%;test.%; 指定表city.address;
     */
    private List<Blacklist> blacklists;

    public EditUDBBackupBlacklistParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "dbId can not be empty") String dbId,
                                       List<Blacklist> blacklists) {
        super("EditUDBBackupBlacklist");
        this.region = region;
        this.dbId = dbId;
        this.blacklists = blacklists;
    }

    @UcloudParam("Blacklist")
    public List<Param> checkBlacklist() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (blacklists == null || blacklists.isEmpty()) {
            throw new ValidationException("blacklists can not be empty");
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < blacklists.size(); i++) {
                if (blacklists.get(i) == null || blacklists.get(i).database == null
                        || blacklists.get(i).database.length() <= 0 || blacklists.get(i).table == null
                        || blacklists.get(i).table.length() <= 0) {
                    throw new ValidationException(String.format("blacklists[%d] is invalid", i));
                } else {
                    builder.append(String.format("%s.%s;", blacklists.get(i).database, blacklists.get(i).table));
                }
            }
            list.add(new Param("Blacklist", builder.toString()));
        }
        return list;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }


}
