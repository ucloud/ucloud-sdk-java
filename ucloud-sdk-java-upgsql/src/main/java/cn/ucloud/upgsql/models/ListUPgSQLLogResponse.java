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
package cn.ucloud.upgsql.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUPgSQLLogResponse extends Response {

    /** 数据库日志信息列表 */
    @SerializedName("DataSet")
    private List<LogSet> dataSet;

    public List<LogSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<LogSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class LogSet extends Response {

        /** */
        @SerializedName("BeginTime")
        private Integer beginTime;

        /** */
        @SerializedName("EndTime")
        private Integer endTime;

        /** */
        @SerializedName("Name")
        private String name;

        /** */
        @SerializedName("Size")
        private Integer size;

        public Integer getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }
    }
}
