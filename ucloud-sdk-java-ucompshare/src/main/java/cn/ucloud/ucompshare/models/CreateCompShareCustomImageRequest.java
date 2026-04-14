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

public class CreateCompShareCustomImageRequest extends Request {

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

    /** 实例Id */
    @NotEmpty
    @UCloudParam("UHostId")
    private String uHostId;

    /** 镜像名称。不允许与账号下其他镜像名称重复 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 镜像描述信息 */
    @UCloudParam("Description")
    private String description;

    /** */
    @UCloudParam("Softwares")
    private Softwares softwares;

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

    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Softwares getSoftwares() {
        return softwares;
    }

    public void setSoftwares(Softwares softwares) {
        this.softwares = softwares;
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

        /** 【array of string】镜像的应用列表 */
        @UCloudParam("Application")
        private List<String> application;

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

        public List<String> getApplication() {
            return application;
        }

        public void setApplication(List<String> application) {
            this.application = application;
        }
    }
}
