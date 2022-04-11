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

public class GetBillDataFileUrlRequest extends Request {

    /** 账单类型，传 0 时获取账单总览报表，传 1 获取账单明细报表 */
    @NotEmpty
    @UCloudParam("BillType")
    private Integer billType;

    /** 账期(字符串格式，YYYY-MM，例如2021-08). 若BillingCycle 和 BillPeriod同时存在，BillingCycle 优先 */
    @NotEmpty
    @UCloudParam("BillingCycle")
    private String billingCycle;

    /** 此字段不推荐使用，建议使用BillingCycle. 若BillingCycle 和 BillPeriod同时存在，BillingCycle 优先 */
    @UCloudParam("BillPeriod")
    private Integer billPeriod;

    /** 获取账单总览报表时，账单的支付状态，传 0 时获取待支付账单，传 1 时获取已支付账单。获取账单明细报表时该参数无效 */
    @UCloudParam("PaidType")
    private Integer paidType;

    /** 如需求其他语言版本的账单则使用此参数。默认中文。如 RequireVersion = "EN"，则提供英文版本账单。 */
    @UCloudParam("RequireVersion")
    private String requireVersion;

    /** 文件版本，若为"v1"表示获取带有子用户信息的账单，可以为空 */
    @UCloudParam("Version")
    private String version;

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public Integer getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(Integer billPeriod) {
        this.billPeriod = billPeriod;
    }

    public Integer getPaidType() {
        return paidType;
    }

    public void setPaidType(Integer paidType) {
        this.paidType = paidType;
    }

    public String getRequireVersion() {
        return requireVersion;
    }

    public void setRequireVersion(String requireVersion) {
        this.requireVersion = requireVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
