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
package cn.ucloud.umongodb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUMongoDBVersionResponse extends Response {

    /** */
    @SerializedName("DataSet")
    private List<MongoDBVersion> dataSet;

    public List<MongoDBVersion> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<MongoDBVersion> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MongoDBVersion extends Response {

        /** MongoDB版本 */
        @SerializedName("DBVersion")
        private String dbVersion;

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
        }
    }
}
