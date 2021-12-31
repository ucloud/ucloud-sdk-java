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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetEIPPayModeResponse extends Response {

    /** EIP的计费模式, 参见 EIPPayModeSet */
    @SerializedName("EIPPayMode")
    private List<EIPPayModeSet> eipPayMode;

    public List<EIPPayModeSet> getEIPPayMode() {
        return eipPayMode;
    }

    public void setEIPPayMode(List<EIPPayModeSet> eipPayMode) {
        this.eipPayMode = eipPayMode;
    }

    public static class EIPPayModeSet extends Response {

        /** EIP的资源ID */
        @SerializedName("EIPId")
        private String eipId;

        /** EIP的计费模式. 枚举值为：Bandwidth, 带宽计费;Traffic, 流量计费; "ShareBandwidth",共享带宽模式 */
        @SerializedName("EIPPayMode")
        private String eipPayMode;

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public String getEIPPayMode() {
            return eipPayMode;
        }

        public void setEIPPayMode(String eipPayMode) {
            this.eipPayMode = eipPayMode;
        }
    }
}
