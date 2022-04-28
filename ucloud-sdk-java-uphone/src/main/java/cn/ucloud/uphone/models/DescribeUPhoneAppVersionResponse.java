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
package cn.ucloud.uphone.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUPhoneAppVersionResponse extends Response {

    /** AppVersionInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 云手机应用版本实例列表，每项参数可见数据模型 [AppVersionInstance](#AppVersionInstance) */
    @SerializedName("AppVersions")
    private List<AppVersionInstance> appVersions;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AppVersionInstance> getAppVersions() {
        return appVersions;
    }

    public void setAppVersions(List<AppVersionInstance> appVersions) {
        this.appVersions = appVersions;
    }

    public static class AppVersionInstance extends Response {

        /** 应用的唯一标识ID */
        @SerializedName("AppId")
        private String appId;

        /** 应用版本的唯一标识ID */
        @SerializedName("AppVersionId")
        private String appVersionId;

        /** 应用版本名。 */
        @SerializedName("AppVersionName")
        private String appVersionName;

        /** 应用包名。 */
        @SerializedName("PackageName")
        private String packageName;

        /** 应用版本相关的Apk文件存放的公网URL地址。 */
        @SerializedName("URL")
        private String url;

        /** 创建时间，格式为Unix时间戳。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间，格式为Unix时间戳。 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 应用版本描述。 */
        @SerializedName("Description")
        private String description;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public String getAppVersionId() {
            return appVersionId;
        }

        public void setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
        }

        public String getAppVersionName() {
            return appVersionName;
        }

        public void setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getURL() {
            return url;
        }

        public void setURL(String url) {
            this.url = url;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
