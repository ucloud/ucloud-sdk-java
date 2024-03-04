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

import java.util.List;

public class SetUFileRefererRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 存储空间名称 */
    @NotEmpty
    @UCloudParam("BucketName")
    private String bucketName;

    /** 开启关闭referer防盗链;关闭防盗链会清空防盗链参数设置，开启防盗链必须指定 RefererType、Referers；开启：on， 关闭：off; */
    @NotEmpty
    @UCloudParam("RefererStatus")
    private String refererStatus;

    /** RefererType为白名单时，RefererAllowNull为false代表不允许空referer访问，为true代表允许空referer访问; 此参数默认为 true; */
    @UCloudParam("RefererAllowNull")
    private Boolean refererAllowNull;

    /**
     * 防盗链Referer类型，支持三种类型， 1代表设置黑名单、2代表设置白名单， 3代表同时设置黑白名单; （其中1和2是为了向前兼容，后续调用只应该传递类型3）
     * RefererStatus为"on"时此参数必填；
     */
    @UCloudParam("RefererType")
    private Integer refererType;

    /** 防盗链Referer规则，支持正则表达式（不支持符号';')，该字段已弃用，请使用WhiteList.n或BlackList.n */
    @UCloudParam("Referers")
    private List<String> referers;

    /** 白名单列表中的一项 */
    @UCloudParam("WhiteList")
    private List<String> whiteList;

    /** 黑名单列表中的一项 */
    @UCloudParam("BlackList")
    private List<String> blackList;

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

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRefererStatus() {
        return refererStatus;
    }

    public void setRefererStatus(String refererStatus) {
        this.refererStatus = refererStatus;
    }

    public Boolean getRefererAllowNull() {
        return refererAllowNull;
    }

    public void setRefererAllowNull(Boolean refererAllowNull) {
        this.refererAllowNull = refererAllowNull;
    }

    public Integer getRefererType() {
        return refererType;
    }

    public void setRefererType(Integer refererType) {
        this.refererType = refererType;
    }

    public List<String> getReferers() {
        return referers;
    }

    public void setReferers(List<String> referers) {
        this.referers = referers;
    }

    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }
}
