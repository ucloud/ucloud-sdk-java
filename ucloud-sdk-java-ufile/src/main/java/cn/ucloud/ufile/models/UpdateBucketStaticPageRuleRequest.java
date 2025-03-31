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

public class UpdateBucketStaticPageRuleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 存储桶名称 */
    @NotEmpty
    @UCloudParam("Bucket")
    private String bucket;

    /** 启用状态(enable/disable,只有绑定了自定义域名才能开启) */
    @UCloudParam("Status")
    private String status;

    /** 默认首页 */
    @UCloudParam("DefaultIndex")
    private String defaultIndex;

    /** 子目录是否启用重定向 */
    @UCloudParam("SubDirRedirect")
    private String subDirRedirect;

    /** 404规则 */
    @UCloudParam("RuleFor404")
    private String ruleFor404;

    /** 404时的默认页面 */
    @UCloudParam("DefaultPage404")
    private String defaultPage404;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDefaultIndex() {
        return defaultIndex;
    }

    public void setDefaultIndex(String defaultIndex) {
        this.defaultIndex = defaultIndex;
    }

    public String getSubDirRedirect() {
        return subDirRedirect;
    }

    public void setSubDirRedirect(String subDirRedirect) {
        this.subDirRedirect = subDirRedirect;
    }

    public String getRuleFor404() {
        return ruleFor404;
    }

    public void setRuleFor404(String ruleFor404) {
        this.ruleFor404 = ruleFor404;
    }

    public String getDefaultPage404() {
        return defaultPage404;
    }

    public void setDefaultPage404(String defaultPage404) {
        this.defaultPage404 = defaultPage404;
    }
}
