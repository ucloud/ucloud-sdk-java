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
package cn.ucloud.ucompshare.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeCommunityImagesRequest extends Request {

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

    /** 镜像Id。支持指定镜像Id查询 */
    @UCloudParam("CompShareImageId")
    private String compShareImageId;

    /** 镜像名称。模糊搜索 */
    @UCloudParam("Name")
    private String name;

    /** 搜索指定作者发布的镜像 */
    @UCloudParam("Author")
    private String author;

    /** 列表起始位置偏移量，默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 返回数据长度，默认为20，最大100 */
    @UCloudParam("Limit")
    private String limit;

    /** 按标签名称搜索，精确匹配 */
    @UCloudParam("Tag")
    private String tag;

    /** */
    @UCloudParam("SortCondition")
    private SortCondition sortCondition;

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

    public String getCompShareImageId() {
        return compShareImageId;
    }

    public void setCompShareImageId(String compShareImageId) {
        this.compShareImageId = compShareImageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public SortCondition getSortCondition() {
        return sortCondition;
    }

    public void setSortCondition(SortCondition sortCondition) {
        this.sortCondition = sortCondition;
    }

    public static class SortCondition extends Request {

        /**
         * 排序条件。 - Favor：按热度排序，获取热点镜像； - PubTime：按发布时间排序，获取最新社区镜像； - Price 按价格排序； - CreatedCount
         * 按使用量排序； 默认："PubTime"
         */
        @UCloudParam("Field")
        private String field;

        /** 是否升序排列 */
        @UCloudParam("ASC")
        private String asc;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getASC() {
            return asc;
        }

        public void setASC(String asc) {
            this.asc = asc;
        }
    }
}
