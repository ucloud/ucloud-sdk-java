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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateCompShareImageRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 镜像Id */
    @NotEmpty
    @UCloudParam("CompShareImageId")
    private String compShareImageId;

    /** 可见性 0：私密；1：公开 */
    @UCloudParam("Visibility")
    private Integer visibility;

    /** 镜像封面图。Base64编码后的字符串 */
    @UCloudParam("Cover")
    private String cover;

    /** 镜像描述信息 */
    @UCloudParam("Description")
    private String description;

    /** 镜像详情描述信息，支持富文本 */
    @UCloudParam("Readme")
    private String readme;

    /** 镜像标签列表，最多支持3个标签 */
    @UCloudParam("Tags")
    private List<String> tags;

    /** 镜像框架信息 */
    @UCloudParam("Framework")
    private String framework;

    /** 镜像软件信息 */
    @UCloudParam("Softwares")
    private String softwares;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCompShareImageId() {
        return compShareImageId;
    }

    public void setCompShareImageId(String compShareImageId) {
        this.compShareImageId = compShareImageId;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getSoftwares() {
        return softwares;
    }

    public void setSoftwares(String softwares) {
        this.softwares = softwares;
    }
}
