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
package cn.ucloud.ubill.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetBillDataFileUrlResponse extends Response {

    /** 交易账单文件下载URL */
    @SerializedName("FileUrl")
    private String fileUrl;

    /** 是否有对应数据文件。(该参数返回no，表示文件正在生成中，需要用户发起重试获取。 */
    @SerializedName("IsValid")
    private String isValid;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
