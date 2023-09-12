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

public class AddWafDomainHostInfoRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要防护的域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 工作区域，用户已购买区域的子集，以逗号分隔，如：cn-bj,cn-sh */
    @NotEmpty
    @UCloudParam("WorkRegions")
    private String workRegions;

    /** 工作模式，Defence:启用防护规则,Alarm:记录不拦截,Inactive:放行；默认Alarm */
    @UCloudParam("WorkMode")
    private String workMode;

    /** 源站IP端口信息，格式为：http://192.168.1.1或http://192.168.1.1:80；兼容http:192.168.1.1:80，支持CNAME */
    @UCloudParam("SrcIP")
    private List<String> srcIP;

    /** HTTPS证书编号，源站前缀为https时必填 */
    @UCloudParam("CertificateID")
    private Integer certificateID;

    /** 使用HTTP跳转，YES是，NO否，只允许HTTPS:YES,HTTP:NO的情况下使用且只配置了https 443端口的源站 */
    @UCloudParam("HTTPRedirection")
    private String httpRedirection;

    /** 标识该域名使用独享防御IP，YES是，NO否；启用将为改域名分配一个独享防御IP */
    @UCloudParam("ExclusiveIP")
    private String exclusiveIP;

    /** 获取真实客户端地址字段，如对接CDN等其他代理时使用 */
    @UCloudParam("RealIPHeader")
    private String realIPHeader;

    /** 是否使用HTTPS卸载，YES/NO */
    @UCloudParam("HTTPBack")
    private String httpBack;

    /** 流量标记，格式为key:value */
    @UCloudParam("SourceIndicate")
    private String sourceIndicate;

    /** 是否开启HTTP2， YES开启，其他关闭 */
    @UCloudParam("Http2")
    private String http2;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getWorkRegions() {
        return workRegions;
    }

    public void setWorkRegions(String workRegions) {
        this.workRegions = workRegions;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public List<String> getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(List<String> srcIP) {
        this.srcIP = srcIP;
    }

    public Integer getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(Integer certificateID) {
        this.certificateID = certificateID;
    }

    public String getHTTPRedirection() {
        return httpRedirection;
    }

    public void setHTTPRedirection(String httpRedirection) {
        this.httpRedirection = httpRedirection;
    }

    public String getExclusiveIP() {
        return exclusiveIP;
    }

    public void setExclusiveIP(String exclusiveIP) {
        this.exclusiveIP = exclusiveIP;
    }

    public String getRealIPHeader() {
        return realIPHeader;
    }

    public void setRealIPHeader(String realIPHeader) {
        this.realIPHeader = realIPHeader;
    }

    public String getHTTPBack() {
        return httpBack;
    }

    public void setHTTPBack(String httpBack) {
        this.httpBack = httpBack;
    }

    public String getSourceIndicate() {
        return sourceIndicate;
    }

    public void setSourceIndicate(String sourceIndicate) {
        this.sourceIndicate = sourceIndicate;
    }

    public String getHttp2() {
        return http2;
    }

    public void setHttp2(String http2) {
        this.http2 = http2;
    }
}
