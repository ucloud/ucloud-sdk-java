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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddCORSRuleRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** Bucket名称 */
    @NotEmpty
    @UCloudParam("BucketName")
    private String bucketName;

    /** 指定允许的跨域请求的来源，使用通配符(*)表示允许所有来源的跨域请求（多个Origin用‘,’分隔） */
    @NotEmpty
    @UCloudParam("AllowedOrigin")
    private String allowedOrigin;

    /** 指定允许的跨域请求方法。支持的方法名有：GET、PUT、POST、DELETE、HEAD、OPTIONS（多个Method用‘,’分隔） */
    @NotEmpty
    @UCloudParam("AllowedMethod")
    private String allowedMethod;

    /** 指定允许的跨域请求头（多个Header用‘,’分隔） */
    @UCloudParam("AllowedHeader")
    private String allowedHeader;

    /** 指定允许用户从应用程序中访问的响应头（多个ExposeHeader用‘,’分隔） */
    @UCloudParam("ExposeHeader")
    private String exposeHeader;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getAllowedOrigin() {
        return allowedOrigin;
    }

    public void setAllowedOrigin(String allowedOrigin) {
        this.allowedOrigin = allowedOrigin;
    }

    public String getAllowedMethod() {
        return allowedMethod;
    }

    public void setAllowedMethod(String allowedMethod) {
        this.allowedMethod = allowedMethod;
    }

    public String getAllowedHeader() {
        return allowedHeader;
    }

    public void setAllowedHeader(String allowedHeader) {
        this.allowedHeader = allowedHeader;
    }

    public String getExposeHeader() {
        return exposeHeader;
    }

    public void setExposeHeader(String exposeHeader) {
        this.exposeHeader = exposeHeader;
    }
}
