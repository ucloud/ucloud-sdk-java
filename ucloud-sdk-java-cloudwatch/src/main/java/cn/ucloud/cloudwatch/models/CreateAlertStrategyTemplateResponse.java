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

public class CreateAlertStrategyTemplateResponse extends Response {

    /** 创建告警模板返回对象 */
    @SerializedName("Data")
    private AlertTemplate data;

    public AlertTemplate getData() {
        return data;
    }

    public void setData(AlertTemplate data) {
        this.data = data;
    }

    public static class AlertTemplate extends Response {

        /** 告警模板ID */
        @SerializedName("TemplateID")
        private Integer templateID;

        public Integer getTemplateID() {
            return templateID;
        }

        public void setTemplateID(Integer templateID) {
            this.templateID = templateID;
        }
    }
}
