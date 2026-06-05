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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class DownloadListPaidOrdersResponse extends Response {

    /** 下载文件信息 */
    @SerializedName("Data")
    private DownloadFileData data;

    public DownloadFileData getData() {
        return data;
    }

    public void setData(DownloadFileData data) {
        this.data = data;
    }

    public static class DownloadFileData extends Response {

        /** 文件下载链接（US3 预签名 URL，请在有效期内立即下载） */
        @SerializedName("DownloadURL")
        private String downloadURL;

        /** 文件名 */
        @SerializedName("FileName")
        private String fileName;

        /** 文件大小（字节） */
        @SerializedName("FileSize")
        private Integer fileSize;

        public String getDownloadURL() {
            return downloadURL;
        }

        public void setDownloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public Integer getFileSize() {
            return fileSize;
        }

        public void setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
        }
    }
}
