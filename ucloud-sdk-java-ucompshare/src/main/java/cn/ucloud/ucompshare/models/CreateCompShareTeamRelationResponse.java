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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class CreateCompShareTeamRelationResponse extends Response {

    /**
     * 错误信息Map：key：被邀请成员的公司Id ，value ：报错信息ErrorInfo（object），ErrorInfo.Message 报错信息，ErrorInfo.Code
     * 报错Code
     */
    @SerializedName("ErrorMap")
    private Object errorMap;

    public Object getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Object errorMap) {
        this.errorMap = errorMap;
    }
}
