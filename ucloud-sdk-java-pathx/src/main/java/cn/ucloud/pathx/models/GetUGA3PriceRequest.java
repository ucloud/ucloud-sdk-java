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

public class GetUGA3PriceRequest extends Request {

    /** 项目ID。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 共享带宽大小 */
    @NotEmpty
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 源站区域 */
    @NotEmpty
    @UCloudParam("AreaCode")
    private String areaCode;

    /** 购买时间数量，当ChargeType为Month时 Quantity默认为0，代表购买至月底。按年按小时必须为大于0 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 计费方式，默认按月支付。Month: 按月; Year: 按年; Dynamic: 按小时收 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 加速大区,默认返回所有加速大区价格 */
    @UCloudParam("AccelerationArea")
    private String accelerationArea;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public String getAccelerationArea() {
        return accelerationArea;
    }

    public void setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
    }
}
