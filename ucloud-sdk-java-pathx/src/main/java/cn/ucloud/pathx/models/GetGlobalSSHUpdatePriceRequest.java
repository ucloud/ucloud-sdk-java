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
package cn.ucloud.pathx.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetGlobalSSHUpdatePriceRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 升级后的实例类型。枚举值，Enterprise:企业版；Basic:基础版。 */
    @NotEmpty
    @UCloudParam("InstanceType")
    private String instanceType;

    /** 实例ID，唯一资源标识。从免费版升级到付费版可不填，其他情况必填。 */
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 购买周期，如果ChargeType为Month，Quantity可以不填默认为0；其他情况必须为正整数。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 计费类型：Dynamic，Month，Year。从免费版升级到付费版必须传，其他情况不需要传 */
    @UCloudParam("ChargeType")
    private String chargeType;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
}
