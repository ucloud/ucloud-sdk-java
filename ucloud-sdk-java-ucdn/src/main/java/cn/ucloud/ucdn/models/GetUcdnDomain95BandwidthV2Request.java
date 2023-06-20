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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class GetUcdnDomain95BandwidthV2Request extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 查询的起始日期，格式为Unix Timestamp */
    @NotEmpty
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 查询的结束日期，格式为Unix Timestamp */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 域名id，创建域名时生成的id。默认全部域名 */
    @UCloudParam("DomainId")
    private List<String> domainId;

    /** 查询带宽区域 cn代表国内 abroad代表海外 不填默认为全部区域 */
    @UCloudParam("Areacode")
    private String areacode;

    /** 是否是动态加速 默认是false */
    @UCloudParam("IsDcdn")
    private Boolean isDcdn;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<String> getDomainId() {
        return domainId;
    }

    public void setDomainId(List<String> domainId) {
        this.domainId = domainId;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public Boolean getIsDcdn() {
        return isDcdn;
    }

    public void setIsDcdn(Boolean isDcdn) {
        this.isDcdn = isDcdn;
    }
}
