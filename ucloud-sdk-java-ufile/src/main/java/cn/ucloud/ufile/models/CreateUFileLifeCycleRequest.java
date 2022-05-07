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

public class CreateUFileLifeCycleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 生命周期名称 */
    @NotEmpty
    @UCloudParam("LifeCycleName")
    private String lifeCycleName;

    /** 生命周期所适用的前缀；*为整个存储空间文件；一条规则只支持一个文件前缀； */
    @NotEmpty
    @UCloudParam("Prefix")
    private String prefix;

    /** Enabled -- 启用，Disabled -- 不启用 */
    @NotEmpty
    @UCloudParam("Status")
    private String status;

    /** 存储空间名称 */
    @NotEmpty
    @UCloudParam("BucketName")
    private String bucketName;

    /** 指定一个过期天数N，文件会在其最近更新时间点的N天后过期，自动删除；参数范围：[7,36500]，0代表不启用 */
    @UCloudParam("Days")
    private Integer days;

    /** 指定一个过期天数N，文件会在其最近更新时间点的N天后，自动变为归档存储类型；参数范围：[7,36500]，0代表不启用 */
    @UCloudParam("ArchivalDays")
    private Integer archivalDays;

    /** 指定一个过期天数N，文件会在其最近更新时间点的N天后，自动变为低频存储类型；参数范围：[7,36500]，0代表不启用 */
    @UCloudParam("IADays")
    private Integer iaDays;

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

    public String getLifeCycleName() {
        return lifeCycleName;
    }

    public void setLifeCycleName(String lifeCycleName) {
        this.lifeCycleName = lifeCycleName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getArchivalDays() {
        return archivalDays;
    }

    public void setArchivalDays(Integer archivalDays) {
        this.archivalDays = archivalDays;
    }

    public Integer getIADays() {
        return iaDays;
    }

    public void setIADays(Integer iaDays) {
        this.iaDays = iaDays;
    }
}
