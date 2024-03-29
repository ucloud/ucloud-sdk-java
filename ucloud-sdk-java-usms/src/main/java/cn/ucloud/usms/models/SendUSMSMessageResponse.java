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
package cn.ucloud.usms.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class SendUSMSMessageResponse extends Response {

    /** 本次提交发送的短信的唯一ID，可根据该值查询本次发送的短信列表 */
    @SerializedName("SessionNo")
    private String sessionNo;

    /** 本次提交的自定义业务标识ID，仅当发送时传入有效的UserId，才返回该字段。 */
    @SerializedName("UserId")
    private String userId;

    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
