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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUMongoDBConfigTemplateRequest extends Request {

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

    /** 模板名称 */
    @NotEmpty
    @UCloudParam("TemplateName")
    private String templateName;

    /** 集群类型 */
    @NotEmpty
    @UCloudParam("ClusterType")
    private String clusterType;

    /** mongo版本 */
    @NotEmpty
    @UCloudParam("MongodbVersion")
    private String mongodbVersion;

    /** 基础模板 */
    @NotEmpty
    @UCloudParam("BaseTemplateId")
    private String baseTemplateId;

    /** 模板描述 */
    @UCloudParam("Description")
    private String description;

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

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public String getMongodbVersion() {
        return mongodbVersion;
    }

    public void setMongodbVersion(String mongodbVersion) {
        this.mongodbVersion = mongodbVersion;
    }

    public String getBaseTemplateId() {
        return baseTemplateId;
    }

    public void setBaseTemplateId(String baseTemplateId) {
        this.baseTemplateId = baseTemplateId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
