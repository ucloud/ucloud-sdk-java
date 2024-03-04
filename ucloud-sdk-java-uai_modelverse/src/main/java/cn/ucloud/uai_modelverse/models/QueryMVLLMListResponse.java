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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryMVLLMListResponse extends Response {

    /** 语言模型列表 */
    @SerializedName("LLMInfoList")
    private List<LLMInfo> llmInfoList;

    /** 状态码描述 */
    @SerializedName("Msg")
    private String msg;

    public List<LLMInfo> getLLMInfoList() {
        return llmInfoList;
    }

    public void setLLMInfoList(List<LLMInfo> llmInfoList) {
        this.llmInfoList = llmInfoList;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class LLMInfo extends Response {

        /** 模型ID */
        @SerializedName("LLMID")
        private String llmid;

        /** 模型名称 */
        @SerializedName("LLMName")
        private String llmName;

        /** 模型类型 */
        @SerializedName("LLMType")
        private Integer llmType;

        /** 模型描述 */
        @SerializedName("LLMDes")
        private String llmDes;

        /** 模型token单价 */
        @SerializedName("LLMPrice")
        private Double llmPrice;

        public String getLLMID() {
            return llmid;
        }

        public void setLLMID(String llmid) {
            this.llmid = llmid;
        }

        public String getLLMName() {
            return llmName;
        }

        public void setLLMName(String llmName) {
            this.llmName = llmName;
        }

        public Integer getLLMType() {
            return llmType;
        }

        public void setLLMType(Integer llmType) {
            this.llmType = llmType;
        }

        public String getLLMDes() {
            return llmDes;
        }

        public void setLLMDes(String llmDes) {
            this.llmDes = llmDes;
        }

        public Double getLLMPrice() {
            return llmPrice;
        }

        public void setLLMPrice(Double llmPrice) {
            this.llmPrice = llmPrice;
        }
    }
}
