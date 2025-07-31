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
package cn.ucloud.cloudwatch.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ListAlertStrategyTemplateRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考GetProjectList接口 */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** */
    @UCloudParam("Filter")
    private Filter filter;

    /** 查询返回数量，默认值300，最大值：300。 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 数据偏移量 (默认0) */
    @UCloudParam("Offset")
    private Integer offset;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public static class Filter extends Request {

        /** 模板id集合，根据模板id获取告警条件模板列表 */
        @UCloudParam("TemplateIDs")
        private List<Integer> templateIDs;

        public List<Integer> getTemplateIDs() {
            return templateIDs;
        }

        public void setTemplateIDs(List<Integer> templateIDs) {
            this.templateIDs = templateIDs;
        }
    }
}
