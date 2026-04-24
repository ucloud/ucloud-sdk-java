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
package cn.ucloud.uhids.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class SwitchAgentFunctionVersionRequest extends Request {

    /** 项目ID */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 功能版本(0-基础版 1-企业版) */
    @NotEmpty
    @UCloudParam("FuncVersion")
    private Integer funcVersion;

    /** 操作的Agent列表，以逗号分隔，如全部则设成ALL */
    @NotEmpty
    @UCloudParam("AgentList")
    private String agentList;

    /** 付费类型 月付或年付 */
    @NotEmpty
    @UCloudParam("ChargeType")
    private Integer chargeType;

    /** 购买数量 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 代金券 */
    @UCloudParam("Coupon")
    private String coupon;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getFuncVersion() {
        return funcVersion;
    }

    public void setFuncVersion(Integer funcVersion) {
        this.funcVersion = funcVersion;
    }

    public String getAgentList() {
        return agentList;
    }

    public void setAgentList(String agentList) {
        this.agentList = agentList;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
}
