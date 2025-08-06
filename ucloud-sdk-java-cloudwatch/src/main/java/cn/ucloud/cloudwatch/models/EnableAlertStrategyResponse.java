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


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class EnableAlertStrategyResponse extends Response {

    /** 返回数据 */
    @SerializedName("Data")
    private AlertStrategyId data;

    public AlertStrategyId getData() {
        return data;
    }

    public void setData(AlertStrategyId data) {
        this.data = data;
    }

    public static class AlertStrategyId extends Response {

        /** 告警策略id */
        @SerializedName("AlertStrategyID")
        private Integer alertStrategyID;

        public Integer getAlertStrategyID() {
            return alertStrategyID;
        }

        public void setAlertStrategyID(Integer alertStrategyID) {
            this.alertStrategyID = alertStrategyID;
        }
    }
}
