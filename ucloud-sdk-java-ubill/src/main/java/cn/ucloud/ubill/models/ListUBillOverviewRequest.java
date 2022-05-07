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
package cn.ucloud.ubill.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ListUBillOverviewRequest extends Request {

    /** 账期，YYYY-MM格式，例如2022-02，只支持2018-05之后的查询 */
    @NotEmpty
    @UCloudParam("BillingCycle")
    private String billingCycle;

    /** 账单维度, product 按产品聚合,project 按项目聚合，user 按子账号聚合 */
    @NotEmpty
    @UCloudParam("Dimension")
    private String dimension;

    /** 是否显示已入账账单, 1 已入账, 0 待入账 (默认0 ) */
    @UCloudParam("HideUnpaid")
    private Integer hideUnpaid;

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Integer getHideUnpaid() {
        return hideUnpaid;
    }

    public void setHideUnpaid(Integer hideUnpaid) {
        this.hideUnpaid = hideUnpaid;
    }
}
