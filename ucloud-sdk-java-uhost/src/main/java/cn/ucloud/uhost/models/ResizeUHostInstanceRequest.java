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
package cn.ucloud.uhost.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ResizeUHostInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html) */
    @NotEmpty
    @UCloudParam("UHostId")
    private String uHostId;

    /** 虚拟CPU核数。可选参数：1-240（可选范围与UHostType相关）。默认值为当前实例的CPU核数 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 内存大小。单位：MB。范围 ：[1024, 1966080]，取值为1024的倍数（可选范围与UHostType相关）。默认值为当前实例的内存大小。 */
    @UCloudParam("Memory")
    private Integer memory;

    /** GPU卡核心数。仅GPU机型支持此字段（可选范围与MachineType+GpuType相关） */
    @UCloudParam("GPU")
    private Integer gpu;

    /** 网卡升降级（1，表示升级，2表示降级，0表示不变） */
    @UCloudParam("NetCapValue")
    private Integer netCapValue;

    /** 扩容结束后是否立即开机，默认为false， 如果设置为true，则扩容成功后立即开机； 抢占式和后付费云主机暂不支持当前功能； */
    @UCloudParam("AutoStart")
    private Boolean autoStart;

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

    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getGPU() {
        return gpu;
    }

    public void setGPU(Integer gpu) {
        this.gpu = gpu;
    }

    public Integer getNetCapValue() {
        return netCapValue;
    }

    public void setNetCapValue(Integer netCapValue) {
        this.netCapValue = netCapValue;
    }

    public Boolean getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
    }
}
