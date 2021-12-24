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
package cn.ucloud.uhost.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ImportCustomImageRequest extends Request {

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

    /** 镜像名称 */
    @NotEmpty
    @UCloudParam("ImageName")
    private String imageName;

    /** UFile私有空间地址 */
    @NotEmpty
    @UCloudParam("UFileUrl")
    private String uFileUrl;

    /** 操作系统平台，比如CentOS、Ubuntu、Windows、RedHat等，请参考控制台的镜像版本；若导入控制台上没有的操作系统，参数为Other */
    @NotEmpty
    @UCloudParam("OsType")
    private String osType;

    /** 操作系统详细版本，请参考控制台的镜像版本；OsType为Other时，输入参数为Other */
    @NotEmpty
    @UCloudParam("OsName")
    private String osName;

    /** 镜像格式，可选RAW、VHD、VMDK、qcow2 */
    @NotEmpty
    @UCloudParam("Format")
    private String format;

    /** 是否授权。必须填true */
    @NotEmpty
    @UCloudParam("Auth")
    private Boolean auth;

    /** 镜像描述 */
    @UCloudParam("ImageDescription")
    private String imageDescription;

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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getUFileUrl() {
        return uFileUrl;
    }

    public void setUFileUrl(String uFileUrl) {
        this.uFileUrl = uFileUrl;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }
}
