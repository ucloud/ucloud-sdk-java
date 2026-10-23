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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ListUMInferAPIKeyV2Request extends Request {

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

    /** 按 API Key 资源 ID 精确过滤；为空不限制 */
    @UCloudParam("KeyId")
    private String keyId;

    /** 从 0 开始的页号，默认 0；不是记录偏移量 */
    @UCloudParam("Offset")
    private String offset;

    /** 每页条数；0 表示不限制条数 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 默认 false，排除已删除记录；true 包含已删除记录 */
    @UCloudParam("AllStatus")
    private Integer allStatus;

    /** 不传不限制；0 启用，1 禁用 */
    @UCloudParam("SandBoxDisabled")
    private String sandBoxDisabled;

    /** true 按创建时间升序，false 降序 */
    @UCloudParam("SortByCreateTimeAsc")
    private Boolean sortByCreateTimeAsc;

    /** true 按更新时间升序，false 降序；优先于创建时间排序 */
    @UCloudParam("SortByUpdateTimeAsc")
    private Boolean sortByUpdateTimeAsc;

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

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getAllStatus() {
        return allStatus;
    }

    public void setAllStatus(Integer allStatus) {
        this.allStatus = allStatus;
    }

    public String getSandBoxDisabled() {
        return sandBoxDisabled;
    }

    public void setSandBoxDisabled(String sandBoxDisabled) {
        this.sandBoxDisabled = sandBoxDisabled;
    }

    public Boolean getSortByCreateTimeAsc() {
        return sortByCreateTimeAsc;
    }

    public void setSortByCreateTimeAsc(Boolean sortByCreateTimeAsc) {
        this.sortByCreateTimeAsc = sortByCreateTimeAsc;
    }

    public Boolean getSortByUpdateTimeAsc() {
        return sortByUpdateTimeAsc;
    }

    public void setSortByUpdateTimeAsc(Boolean sortByUpdateTimeAsc) {
        this.sortByUpdateTimeAsc = sortByUpdateTimeAsc;
    }
}
