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

public class PublishCompShareImageRequest extends Request {

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

    /** 镜像价格。单位：元，支持00.00 */
    @NotEmpty
    @UCloudParam("Price")
    private Double price;

    /** 封面。base64编码的图片 */
    @UCloudParam("Cover")
    private String cover;

    /** 【array of string】镜像标签。最多支持3个标签 */
    @UCloudParam("Tags")
    private List<String> tags;

    /** 镜像描述信息 */
    @UCloudParam("Description")
    private String description;

    /** 镜像详情描述【富文本】 */
    @UCloudParam("Readme")
    private String readme;

    /** */
    @UCloudParam("Softwares")
    private Softwares softwares;

    /** 发布社区镜像名称 */
    @UCloudParam("CommunityImageName")
    private String communityImageName;

    /** 是否支持自启动 false: 不支持 true:支持 */
    @UCloudParam("AutoStart")
    private String autoStart;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
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

    public Softwares getSoftwares() {
        return softwares;
    }

    public void setSoftwares(Softwares softwares) {
        this.softwares = softwares;
    }

    public String getCommunityImageName() {
        return communityImageName;
    }

    public void setCommunityImageName(String communityImageName) {
        this.communityImageName = communityImageName;
    }

    public String getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(String autoStart) {
        this.autoStart = autoStart;
    }

    public static class Softwares extends Request {

        /** 镜像框架名称 */
        @UCloudParam("Framework")
        private String framework;

        /** 镜像框架版本 */
        @UCloudParam("FrameworkVersion")
        private String frameworkVersion;

        /** 镜像CUDA版本 */
        @UCloudParam("CUDAVersion")
        private String cudaVersion;

        /** 镜像应用列表 */
        @UCloudParam("Applications")
        private List<String> applications;

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
        }

        public String getFrameworkVersion() {
            return frameworkVersion;
        }

        public void setFrameworkVersion(String frameworkVersion) {
            this.frameworkVersion = frameworkVersion;
        }

        public String getCUDAVersion() {
            return cudaVersion;
        }

        public void setCUDAVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
        }

        public List<String> getApplications() {
            return applications;
        }

        public void setApplications(List<String> applications) {
            this.applications = applications;
        }
    }
}
