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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUK8SVersionsResponse extends Response {

    /** UK8S 版本信息列表。 */
    @SerializedName("Data")
    private List<UK8SVersionData> data;

    public List<UK8SVersionData> getData() {
        return data;
    }

    public void setData(List<UK8SVersionData> data) {
        this.data = data;
    }

    public static class UK8SVersionData extends Response {

        /** K8S 版本 */
        @SerializedName("K8sVersion")
        private String k8sVersion;

        /** Containerd 版本 */
        @SerializedName("ContainerdVersion")
        private String containerdVersion;

        public String getK8sVersion() {
            return k8sVersion;
        }

        public void setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
        }

        public String getContainerdVersion() {
            return containerdVersion;
        }

        public void setContainerdVersion(String containerdVersion) {
            this.containerdVersion = containerdVersion;
        }
    }
}
