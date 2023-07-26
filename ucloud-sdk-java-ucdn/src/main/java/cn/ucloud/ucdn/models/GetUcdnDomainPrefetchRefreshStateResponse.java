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
package cn.ucloud.ucdn.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUcdnDomainPrefetchRefreshStateResponse extends Response {

    /** 已提交预热个数 */
    @SerializedName("SubmitPrefetchCount")
    private Integer submitPrefetchCount;

    /** 已提交的文件刷新个数 */
    @SerializedName("SubmitRefreshFile")
    private Integer submitRefreshFile;

    /** 已提交的目录刷新个数 */
    @SerializedName("SubmitRefreshDir")
    private Integer submitRefreshDir;

    /** 预热配额 */
    @SerializedName("PrefetchQuota")
    private Integer prefetchQuota;

    /** 文件刷新配额 */
    @SerializedName("RefreshFileQuota")
    private Integer refreshFileQuota;

    /** 目录刷新配额 */
    @SerializedName("RefreshDirQuota")
    private Integer refreshDirQuota;

    public Integer getSubmitPrefetchCount() {
        return submitPrefetchCount;
    }

    public void setSubmitPrefetchCount(Integer submitPrefetchCount) {
        this.submitPrefetchCount = submitPrefetchCount;
    }

    public Integer getSubmitRefreshFile() {
        return submitRefreshFile;
    }

    public void setSubmitRefreshFile(Integer submitRefreshFile) {
        this.submitRefreshFile = submitRefreshFile;
    }

    public Integer getSubmitRefreshDir() {
        return submitRefreshDir;
    }

    public void setSubmitRefreshDir(Integer submitRefreshDir) {
        this.submitRefreshDir = submitRefreshDir;
    }

    public Integer getPrefetchQuota() {
        return prefetchQuota;
    }

    public void setPrefetchQuota(Integer prefetchQuota) {
        this.prefetchQuota = prefetchQuota;
    }

    public Integer getRefreshFileQuota() {
        return refreshFileQuota;
    }

    public void setRefreshFileQuota(Integer refreshFileQuota) {
        this.refreshFileQuota = refreshFileQuota;
    }

    public Integer getRefreshDirQuota() {
        return refreshDirQuota;
    }

    public void setRefreshDirQuota(Integer refreshDirQuota) {
        this.refreshDirQuota = refreshDirQuota;
    }
}
