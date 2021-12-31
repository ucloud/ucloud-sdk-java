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

public class GetAvailableResourceForPolicyResponse extends Response {

    /** 支持资源类型的信息 */
    @SerializedName("DataSet")
    private List<GetAvailableResourceForPolicyDataSet> dataSet;

    public List<GetAvailableResourceForPolicyDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<GetAvailableResourceForPolicyDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class GetAvailableResourceForPolicyDataSet extends Response {

        /** 资源的Id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源对应的内网Ip */
        @SerializedName("PrivateIP")
        private String privateIP;

        /**
         * 资源类型。"uhost"：云主机； "upm"，物理云主机； "hadoophost"：hadoop节点； "fortresshost"：堡垒机： "udockhost"，容器
         */
        @SerializedName("ResourceType")
        private String resourceType;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }
    }
}
