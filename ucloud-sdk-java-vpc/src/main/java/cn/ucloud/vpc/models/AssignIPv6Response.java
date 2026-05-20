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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssignIPv6Response extends Response {

    /** IPv6地址 */
    @SerializedName("IPv6Addresses")
    private List<String> iPv6Addresses;

    /** IP类型 */
    @SerializedName("OperatorName")
    private String operatorName;

    /** IPv6网关 */
    @SerializedName("IPv6Gateway")
    private String iPv6Gateway;

    /** 掩码 */
    @SerializedName("Mask")
    private Integer mask;

    public List<String> getIPv6Addresses() {
        return iPv6Addresses;
    }

    public void setIPv6Addresses(List<String> iPv6Addresses) {
        this.iPv6Addresses = iPv6Addresses;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getIPv6Gateway() {
        return iPv6Gateway;
    }

    public void setIPv6Gateway(String iPv6Gateway) {
        this.iPv6Gateway = iPv6Gateway;
    }

    public Integer getMask() {
        return mask;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }
}
