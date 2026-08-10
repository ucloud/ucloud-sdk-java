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
package cn.ucloud.ukms.models;


import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ListScheduleDeletionKeysRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 输出列表起始位置，默认从0开始 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 输出列表数量，默认返回200个 */
    @UCloudParam("Limit")
    private Integer limit;

    /**
     * 列表排序方式, 可选项: "-created_time",
     * "created_time","plan_delete_time","-plan_delete_time";默认按-plan_delete_time 计划删除时间升序返回
     */
    @UCloudParam("OrderBy")
    private String orderBy;

    /** 按密钥 ID 或别名模糊过滤 */
    @UCloudParam("Alias")
    private String alias;

    /** UKMS 实例资源 ID */
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 排序方向，默认 desc */
    @UCloudParam("Sort")
    private String sort;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
