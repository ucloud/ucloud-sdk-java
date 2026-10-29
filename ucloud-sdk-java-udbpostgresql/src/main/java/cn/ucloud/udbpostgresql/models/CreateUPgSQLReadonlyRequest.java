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
package cn.ucloud.udbpostgresql.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUPgSQLReadonlyRequest extends Request {

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

    /** Db名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** DB端口 */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** 磁盘空间 */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** 机器配置类型，2核4G的机器:o.pgsql2m.medium */
    @NotEmpty
    @UCloudParam("MachineType")
    private String machineType;

    /** 同步的源库 */
    @NotEmpty
    @UCloudParam("SrcInstanceID")
    private String srcInstanceID;

    /** 子网ID */
    @UCloudParam("SubnetID")
    private String subnetID;

    /** VPCID */
    @UCloudParam("VPCID")
    private String vpcid;

    /** */
    @UCloudParam("Labels")
    private List<Labels> labels;

    /** */
    @UCloudParam("SecGroupId")
    private List<SecGroupId> secGroupId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getSrcInstanceID() {
        return srcInstanceID;
    }

    public void setSrcInstanceID(String srcInstanceID) {
        this.srcInstanceID = srcInstanceID;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public String getVPCID() {
        return vpcid;
    }

    public void setVPCID(String vpcid) {
        this.vpcid = vpcid;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public List<SecGroupId> getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(List<SecGroupId> secGroupId) {
        this.secGroupId = secGroupId;
    }

    public static class Labels extends Request {

        /** 用户资源标签的键值 */
        @UCloudParam("Key")
        private String key;

        /** 用户资源标签值 */
        @UCloudParam("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class SecGroupId extends Request {

        /** 安全组id */
        @UCloudParam("Id")
        private String id;

        /** 安全组优先级 */
        @UCloudParam("Priority")
        private Integer priority;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }
    }
}
