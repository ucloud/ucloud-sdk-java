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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateVPCIPv6Request extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** VPC资源ID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** */
    @UCloudParam("IPv6NetworkConfig")
    private List<IPv6NetworkConfig> iPv6NetworkConfig;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public List<IPv6NetworkConfig> getIPv6NetworkConfig() {
        return iPv6NetworkConfig;
    }

    public void setIPv6NetworkConfig(List<IPv6NetworkConfig> iPv6NetworkConfig) {
        this.iPv6NetworkConfig = iPv6NetworkConfig;
    }

    public static class IPv6NetworkConfig extends Request {

        /** 需要保留的所有网段 */
        @NotEmpty
        @UCloudParam("IPv6Network")
        private String iPv6Network;

        /** 网段对应的运营商类型 */
        @NotEmpty
        @UCloudParam("OperatorName")
        private String operatorName;

        /** 网段分类：Default--默认网段、Custom--客户自带网段 */
        @UCloudParam("Type")
        private String type;

        public String getIPv6Network() {
            return iPv6Network;
        }

        public void setIPv6Network(String iPv6Network) {
            this.iPv6Network = iPv6Network;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
