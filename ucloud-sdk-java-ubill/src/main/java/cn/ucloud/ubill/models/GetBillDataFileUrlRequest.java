/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.ubill.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class GetBillDataFileUrlRequest extends Request {

    
        
    /**
     * 账单类型，枚举值：\\ > 0: 账单总览报表; \\ > 1: 账单明细报表
     */
    @NotEmpty
    @UCloudParam("BillType")
    private Integer billType;
        
    
        
    /**
     * 账期: YYYY-MM格式的字符串，例如 ”2021-08“
     */
    @NotEmpty
    @UCloudParam("BillingCycle")
    private String billingCycle;
        
    
        
    /**
     * 账期: 时间戳格式，已弃用，请使用BillingCycle
     */
    @UCloudParam("BillPeriod")
    private Integer billPeriod;
        
    
        
    /**
     * 账单支付状态，  (获取账单明细报表，不需要填写该参数)，枚举值：\\ > 0: 0待支付总览账单(只支持当前月份的账期);\\ > 1: 已支付账单总览
     */
    @UCloudParam("PaidType")
    private Integer paidType;
        
    
        
    /**
     * 账单语言版本，枚举值：\\ > ”“: 默认中文;\\ > ”EN“: 英文版本
     */
    @UCloudParam("RequireVersion")
    private String requireVersion;
        
    
        
    /**
     * 文件版本，固定值"v1"。
     */
    @UCloudParam("Version")
    private String version;
        
    
        
    /**
     * 文件格式，枚举值：\\ > ”csv“: csv格式;\\ > ”pdf“: pdf格式(已支付总览文件 从2023年03月开始支持PDF)
     */
    @UCloudParam("Format")
    private String format;
        
    
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
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
}









