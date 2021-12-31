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

public class ModifyRouteRuleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 通过DescribeRouteTable拿到 */
    @NotEmpty
    @UCloudParam("RouteTableId")
    private String routeTableId;

    /**
     * 格式: RouteRuleId | 目的网段 | 下一跳类型（支持INSTANCE、VIP） | 下一跳 |优先级（保留字段，填写0即可）| 备注 |
     * 增、删、改标志（add/delete/update） 。"添加"示例: test_id | 10.8.0.0/16 | instance | uhost-xd8ja | 0 |
     * Default Route Rule| add (添加的RouteRuleId填任意非空字符串) 。"删除"示例: routerule-xk3jxa | 10.8.0.0/16 |
     * instance | uhost-xd8ja | 0 | Default Route Rule| delete (RouteRuleId来自DescribeRouteTable中)
     * 。“修改”示例: routerule-xk3jxa | 10.8.0.0/16 | instance | uhost-cjksa2 | 0 | Default Route Rule|
     * update (RouteRuleId来自DescribeRouteTable中)
     */
    @NotEmpty
    @UCloudParam("RouteRule")
    private List<String> routeRule;

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

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public List<String> getRouteRule() {
        return routeRule;
    }

    public void setRouteRule(List<String> routeRule) {
        this.routeRule = routeRule;
    }
}
