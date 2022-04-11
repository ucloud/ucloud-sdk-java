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

public class GetUDBClientConnNumResponse extends Response {

    /** db实例ip和连接数信息 */
    @SerializedName("DataSet")
    private List<ConnNumMap> dataSet;

    public List<ConnNumMap> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ConnNumMap> dataSet) {
        this.dataSet = dataSet;
    }

    public static class ConnNumMap extends Response {

        /** 客户端IP */
        @SerializedName("Ip")
        private String ip;

        /** 该Ip连接数 */
        @SerializedName("Num")
        private Integer num;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }
    }
}
