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
package cn.ucloud.uec.models;

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ImportUEcCustomImageRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 镜像需要导入机房，默认分发到所有机房 */
    @UCloudParam("IdcId")
    private List<String> idcId;

    /** 镜像Id，不传参表示新导入镜像，传参表示已有镜像分发到指定机房 */
    @UCloudParam("ImageId")
    private String imageId;

    /** 镜像名称，不带镜像ID时必填 */
    @UCloudParam("ImageName")
    private String imageName;

    /** UFile镜像文件下载地址，不带镜像ID时必填 */
    @UCloudParam("UFileUrl")
    private String uFileUrl;

    /** 操作系统平台，linux、windows(当前版本暂不支持windows)，不带镜像ID时必填 */
    @UCloudParam("OsType")
    private String osType;

    /** 镜像格式，可选RAW、qcow2， 不带镜像ID时必填 */
    @UCloudParam("Format")
    private String format;

    /** 镜像描述 */
    @UCloudParam("ImageDesc")
    private String imageDesc;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getIdcId() {
        return idcId;
    }

    public void setIdcId(List<String> idcId) {
        this.idcId = idcId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }
}
