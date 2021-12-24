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

public class DescribeUDBInstanceBinlogResponse extends Response {

    /** 获取的Binlog信息列表 UDBInstanceBinlogSet: false */
    @SerializedName("DataSet")
    private List<UDBInstanceBinlogSet> dataSet;

    public List<UDBInstanceBinlogSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBInstanceBinlogSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDBInstanceBinlogSet extends Response {

        /** Binlog文件名: false */
        @SerializedName("Name")
        private String name;

        /** Binlog文件大小: false */
        @SerializedName("Size")
        private Integer size;

        /** Binlog文件生成时间(时间戳): false */
        @SerializedName("BeginTime")
        private Integer beginTime;

        /** Binlog文件结束时间(时间戳): false */
        @SerializedName("EndTime")
        private Integer endTime;

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
    }
}
