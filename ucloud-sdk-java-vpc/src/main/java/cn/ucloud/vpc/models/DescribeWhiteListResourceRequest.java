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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class DescribeWhiteListResourceRequest extends Request {

    /** 项目id: false */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** NAT网关的Id: false */
    @NotEmpty
    @UCloudParam("NATGWIds")
    private List<String> natgwIds;

    /** 数据偏移量, 默认为0: false */
    @UCloudParam("Offset")
    private Integer offset;

    /** 数据分页值, 默认为20: false */
    @UCloudParam("Limit")
    private Integer limit;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getNATGWIds() {
        return natgwIds;
    }

    public void setNATGWIds(List<String> natgwIds) {
        this.natgwIds = natgwIds;
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
}
