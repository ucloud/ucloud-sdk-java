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
package cn.ucloud.uvms.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class SendUVMSMessageResponse extends Response {

    /** 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 ReqUuid。 */
    @SerializedName("ReqUuid")
    private String reqUuid;

    /** 本次提交发送语音的唯一ID，可根据该值查询本次发送详情 */
    @SerializedName("SessionNo")
    private String sessionNo;

    /** 本次提交的自定义业务标识ID，仅当发送时传入有效的UserId，才返回该字段。 */
    @SerializedName("UserId")
    private String userId;

    public String getReqUuid() {
        return reqUuid;
    }

    public void setReqUuid(String reqUuid) {
        this.reqUuid = reqUuid;
    }

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
