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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUFileQuotaInfoResponse extends Response {

    /** 配额信息数据集 */
    @SerializedName("DataSet")
    private List<UFileQuotaDataSetItem> dataSet;

    public List<UFileQuotaDataSetItem> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileQuotaDataSetItem> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFileQuotaDataSetItem extends Response {

        /** 可用地域 */
        @SerializedName("Region")
        private String region;

        /** 是否欠费：1表示欠费；0表示未欠费 */
        @SerializedName("Owe")
        private Integer owe;

        /** 剩余存储容量 */
        @SerializedName("Storage")
        private UFileQuotaLeft storage;

        /** 剩余下载流量 */
        @SerializedName("DownloadFlow")
        private UFileQuotaLeft downloadFlow;

        /** 剩余请求次数 */
        @SerializedName("RequestCnt")
        private UFileQuotaLeft requestCnt;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getOwe() {
            return owe;
        }

        public void setOwe(Integer owe) {
            this.owe = owe;
        }

        public UFileQuotaLeft getStorage() {
            return storage;
        }

        public void setStorage(UFileQuotaLeft storage) {
            this.storage = storage;
        }

        public UFileQuotaLeft getDownloadFlow() {
            return downloadFlow;
        }

        public void setDownloadFlow(UFileQuotaLeft downloadFlow) {
            this.downloadFlow = downloadFlow;
        }

        public UFileQuotaLeft getRequestCnt() {
            return requestCnt;
        }

        public void setRequestCnt(UFileQuotaLeft requestCnt) {
            this.requestCnt = requestCnt;
        }
    }

    public static class UFileQuotaLeft extends Response {

        /** 配额剩余量 */
        @SerializedName("Left")
        private Double left;

        public Double getLeft() {
            return left;
        }

        public void setLeft(Double left) {
            this.left = left;
        }
    }
}
