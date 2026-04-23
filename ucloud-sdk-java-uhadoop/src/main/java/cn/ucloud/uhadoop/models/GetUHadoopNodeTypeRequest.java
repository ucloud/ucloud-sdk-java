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
package cn.ucloud.uhadoop.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUHadoopNodeTypeRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 框架版本，例如3.2.1-udh3.0，通过ListUHadoopFrameworkApp接口获取 */
    @UCloudParam("FrameworkVersion")
    private String frameworkVersion;

    /** 角色，master|core|task */
    @UCloudParam("NodeRole")
    private String nodeRole;

    /** 机型名称 */
    @UCloudParam("NodeType")
    private String nodeType;

    /**
     * 框架，例如Hadoop|MR|HDFS|StarRocks ， Hadoop框架包含存储与计算服务， MR集群包含计算服务，
     * HDFS只包含存储服务，StarRocks为StarRocks集群
     */
    @UCloudParam("Framework")
    private String framework;

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

    public String getFrameworkVersion() {
        return frameworkVersion;
    }

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
