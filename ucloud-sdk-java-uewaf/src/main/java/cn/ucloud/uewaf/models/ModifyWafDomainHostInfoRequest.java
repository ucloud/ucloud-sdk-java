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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ModifyWafDomainHostInfoRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 源站IP信息 */
    @NotEmpty
    @UCloudParam("SrcIP")
    private List<String> srcIP;

    /** 工作区域，用户已购买区域的子集，以逗号分隔，如：cn-bj,cn-sh */
    @NotEmpty
    @UCloudParam("WorkRegions")
    private String workRegions;

    /** 被编辑的域名,域名与记录ID必须选填一项 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 使用HTTP跳转，YES是，NO否，只允许HTTPS:YES,HTTP:NO的情况下使用 */
    @UCloudParam("HTTPRedirection")
    private String httpRedirection;

    /** HTTPS证书编号 */
    @UCloudParam("CertificateID")
    private Integer certificateID;

    /** 获取真实客户端地址字段，如对接CDN等其他代理时使用 */
    @UCloudParam("RealIPHeader")
    private String realIPHeader;

    /** 工作模式，Defence:启用防护规则,Alarm:记录不拦截,Inactive:放行 */
    @UCloudParam("WorkMode")
    private String workMode;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(List<String> srcIP) {
        this.srcIP = srcIP;
    }

    public String getWorkRegions() {
        return workRegions;
    }

    public void setWorkRegions(String workRegions) {
        this.workRegions = workRegions;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getHTTPRedirection() {
        return httpRedirection;
    }

    public void setHTTPRedirection(String httpRedirection) {
        this.httpRedirection = httpRedirection;
    }

    public Integer getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(Integer certificateID) {
        this.certificateID = certificateID;
    }

    public String getRealIPHeader() {
        return realIPHeader;
    }

    public void setRealIPHeader(String realIPHeader) {
        this.realIPHeader = realIPHeader;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }
}
