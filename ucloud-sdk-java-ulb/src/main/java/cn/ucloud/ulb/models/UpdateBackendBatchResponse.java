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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpdateBackendBatchResponse extends Response {

    /** 返回ulb对每个rs的修改是否成功 */
    @SerializedName("BackendSet")
    private List<BackendMsg> backendSet;

    public List<BackendMsg> getBackendSet() {
        return backendSet;
    }

    public void setBackendSet(List<BackendMsg> backendSet) {
        this.backendSet = backendSet;
    }

    public static class BackendMsg extends Response {

        /** rs的资源ID */
        @SerializedName("BackendId")
        private String backendId;

        /** 修改rs返回的消息 */
        @SerializedName("SubMessage")
        private String subMessage;

        /** 修改rs的返回值 */
        @SerializedName("SubRetCode")
        private Integer subRetCode;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
        }

        public String getSubMessage() {
            return subMessage;
        }

        public void setSubMessage(String subMessage) {
            this.subMessage = subMessage;
        }

        public Integer getSubRetCode() {
            return subRetCode;
        }

        public void setSubRetCode(Integer subRetCode) {
            this.subRetCode = subRetCode;
        }
    }
}
