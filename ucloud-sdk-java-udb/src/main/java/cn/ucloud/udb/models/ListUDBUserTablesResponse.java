/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUDBUserTablesResponse extends Response {

    /** 用户库表的集合 */
    @SerializedName("Tables")
    private List<UDBDatabaseData> tables;

    public List<UDBDatabaseData> getTables() {
        return tables;
    }

    public void setTables(List<UDBDatabaseData> tables) {
        this.tables = tables;
    }

    public static class TableData extends Response {

        /** 表名称 */
        @SerializedName("TableName")
        private String tableName;

        /** 表所属的库名称 */
        @SerializedName("DBName")
        private String dbName;

        /** 表的引擎（innodb, myisam） */
        @SerializedName("Engine")
        private String engine;

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getDBName() {
            return dbName;
        }

        public void setDBName(String dbName) {
            this.dbName = dbName;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }
    }

    public static class UDBDatabaseData extends Response {

        /** 数据库名称 */
        @SerializedName("DBName")
        private String dbName;

        /** 该库所有的表集合 */
        @SerializedName("TableDataSet")
        private List<TableData> tableDataSet;

        public String getDBName() {
            return dbName;
        }

        public void setDBName(String dbName) {
            this.dbName = dbName;
        }

        public List<TableData> getTableDataSet() {
            return tableDataSet;
        }

        public void setTableDataSet(List<TableData> tableDataSet) {
            this.tableDataSet = tableDataSet;
        }
    }
}
