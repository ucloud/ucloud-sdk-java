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

public class BindAlertStrategyRequest extends Request {

    /** 项目ID */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 告警策略id数组 */
    @NotEmpty
    @UCloudParam("AlertStrategyIDs")
    private List<Integer> alertStrategyIDs;

    /** 资源数组 */
    @NotEmpty
    @UCloudParam("Resources")
    private List<String> resources;

    /** 产品类型名称 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<Integer> getAlertStrategyIDs() {
        return alertStrategyIDs;
    }

    public void setAlertStrategyIDs(List<Integer> alertStrategyIDs) {
        this.alertStrategyIDs = alertStrategyIDs;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
