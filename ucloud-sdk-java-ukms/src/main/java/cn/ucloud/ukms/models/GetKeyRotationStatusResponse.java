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
package cn.ucloud.ukms.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetKeyRotationStatusResponse extends Response {

    /** 是否开启自动轮转。取值：true、false。 */
    @SerializedName("KeyRotationEnabled")
    private Boolean keyRotationEnabled;

    /** 密钥资源长 ID。 */
    @SerializedName("KeyId")
    private String keyId;

    /** 轮转周期，单位天；未开启时返回 0。 */
    @SerializedName("RotationPeriodInDays")
    private Integer rotationPeriodInDays;

    /** 下次轮转时间，Unix 时间戳。 */
    @SerializedName("NextRotationDate")
    private Integer nextRotationDate;

    /** 按需轮转开始时间，Unix 时间戳。 */
    @SerializedName("OnDemandRotationStartDate")
    private Integer onDemandRotationStartDate;

    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Integer getRotationPeriodInDays() {
        return rotationPeriodInDays;
    }

    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    public Integer getNextRotationDate() {
        return nextRotationDate;
    }

    public void setNextRotationDate(Integer nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
    }

    public Integer getOnDemandRotationStartDate() {
        return onDemandRotationStartDate;
    }

    public void setOnDemandRotationStartDate(Integer onDemandRotationStartDate) {
        this.onDemandRotationStartDate = onDemandRotationStartDate;
    }
}
