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

public class GetUMongoDBLogResponse extends Response {

    /** 查询到的日志内容，一段纯文本 */
    @SerializedName("Log")
    private String log;

    /** 支持的最大行数 */
    @SerializedName("MaxLine")
    private Integer maxLine;

    /** 是否已被截断 */
    @SerializedName("IsTruncate")
    private Boolean isTruncate;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Integer getMaxLine() {
        return maxLine;
    }

    public void setMaxLine(Integer maxLine) {
        this.maxLine = maxLine;
    }

    public Boolean getIsTruncate() {
        return isTruncate;
    }

    public void setIsTruncate(Boolean isTruncate) {
        this.isTruncate = isTruncate;
    }
}
