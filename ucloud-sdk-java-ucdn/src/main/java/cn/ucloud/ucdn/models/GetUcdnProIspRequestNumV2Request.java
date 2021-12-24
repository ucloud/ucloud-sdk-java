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

public class GetUcdnProIspRequestNumV2Request extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 查询的起始日期，格式为Unix Timestamp 忽略时间部分 */
    @NotEmpty
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 查询的结束日期，格式为Unix Timestamp 忽略时间部分 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 域名id，创建域名时生成的id。默认全部域名 */
    @UCloudParam("DomainId")
    private List<String> domainId;

    /** 省份代码，可以传多个，不传则查询所有省份 */
    @UCloudParam("Province")
    private List<String> province;

    /** 运营商代码，一次只能查询一个运营商，不传递默认取所有运营商 */
    @UCloudParam("Isp")
    private String isp;

    /** 时间粒度（0表示按照5分钟粒度，1表示按照1小时粒度，2表示按照一天粒度，3表示按照一分钟粒度） */
    @UCloudParam("Type")
    private Integer type;

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

    public List<String> getProvince() {
        return province;
    }

    public void setProvince(List<String> province) {
        this.province = province;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
