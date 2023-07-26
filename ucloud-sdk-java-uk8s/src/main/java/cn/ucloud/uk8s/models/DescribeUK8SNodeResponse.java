/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.uk8s.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUK8SNodeResponse extends Response {

    
        
    /**
     * 节点名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 字符串数组，每一项是类似 "kubernetes.io/arch=amd64" 的标签
     */
    @SerializedName("Labels")
    private List<String> labels;
        
    
        
    /**
     * 字符串数组，每一项是类似 "node.alpha.kubernetes.io/ttl=0" 的注解
     */
    @SerializedName("Annotations")
    private List<String> annotations;
        
    
        
    /**
     * 时间戳，单位是 秒
     */
    @SerializedName("CreationTimestamp")
    private Integer creationTimestamp;
        
    
        
    /**
     * 字符串，如："UCloud://cn-sh2-02//uk8s-vsc0vgob-n-mpzxc" 
     */
    @SerializedName("ProviderID")
    private String providerID;
        
    
        
    /**
     * 内核版本，如："4.19.0-6.el7.ucloud.x86_64"
     */
    @SerializedName("KernelVersion")
    private String kernelVersion;
        
    
        
    /**
     * 操作系统类型，如："CentOS Linux 7 (Core)"
     */
    @SerializedName("OSImage")
    private String osImage;
        
    
        
    /**
     * 容器运行时版本，如："docker://18.9.9"
     */
    @SerializedName("ContainerRuntimeVersion")
    private String containerRuntimeVersion;
        
    
        
    /**
     * kubelet 版本
     */
    @SerializedName("KubeletVersion")
    private String kubeletVersion;
        
    
        
    /**
     * kubeproxy 版本
     */
    @SerializedName("KubeProxyVersion")
    private String kubeProxyVersion;
        
    
        
    /**
     * 内部 IP 地址
     */
    @SerializedName("InternalIP")
    private String internalIP;
        
    
        
    /**
     * 主机名
     */
    @SerializedName("Hostname")
    private String hostname;
        
    
        
    /**
     * 已分配到当前节点的 Pod 数量
     */
    @SerializedName("AllocatedPodCount")
    private Integer allocatedPodCount;
        
    
        
    /**
     * 节点允许的可分配 Pod 最大数量
     */
    @SerializedName("PodCapacity")
    private Integer podCapacity;
        
    
        
    /**
     * 是否禁止调度
     */
    @SerializedName("Unschedulable")
    private Boolean unschedulable;
        
    
        
    /**
     * 节点 CPU 总量
     */
    @SerializedName("CPUCapacity")
    private String cpuCapacity;
        
    
        
    /**
     * 节点内存总量
     */
    @SerializedName("MemoryCapacity")
    private String memoryCapacity;
        
    
        
    /**
     * 节点上已分配 Pod 的内存请求量
     */
    @SerializedName("MemoryRequests")
    private String memoryRequests;
        
    
        
    /**
     * 节点上已分配 Pod 的内存请求量占内存总量的比例，如返回值为 "4.5"，则意味着请求量占总量的 4.5%
     */
    @SerializedName("MemoryRequestsFraction")
    private String memoryRequestsFraction;
        
    
        
    /**
     * 节点上已分配 Pod 的内存限制量
     */
    @SerializedName("MemoryLimits")
    private String memoryLimits;
        
    
        
    /**
     * 节点上已分配 Pod 的内存限制量占内存总量的比例，如返回值为 "18"，则意味着限制量占总量的 18%
     */
    @SerializedName("MemoryLimitsFraction")
    private String memoryLimitsFraction;
        
    
        
    /**
     * 节点上已分配 Pod 的 CPU 请求量
     */
    @SerializedName("CPURequests")
    private String cpuRequests;
        
    
        
    /**
     * 节点上已分配 Pod 的 CPU 请求量占 CPU 总量的比例
     */
    @SerializedName("CPURequestsFraction")
    private String cpuRequestsFraction;
        
    
        
    /**
     * 节点上已分配 Pod 的 CPU 限制值
     */
    @SerializedName("CPULimits")
    private String cpuLimits;
        
    
        
    /**
     * 节点上已分配 Pod 的 CPU 限制值占 CPU 总量的比例
     */
    @SerializedName("CPULimitsFraction")
    private String cpuLimitsFraction;
        
    
        
    /**
     * 节点状态数组
     */
    @SerializedName("Conditions")
    private List<K8SNodeCondition> conditions;
        
    
        
    /**
     * 节点上镜像名称数组
     */
    @SerializedName("ContainerImages")
    private List<String> containerImages;
        
    
        
    /**
     * 字符串数组，每一项是类似 "node-role.kubernetes.io/master:NoSchedule" 的污点
     */
    @SerializedName("Taints")
    private List<String> taints;
        
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
    
    public List<String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<String> annotations) {
        this.annotations = annotations;
    }
    
    public Integer getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Integer creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }
    
    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(String providerID) {
        this.providerID = providerID;
    }
    
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }
    
    public String getOSImage() {
        return osImage;
    }

    public void setOSImage(String osImage) {
        this.osImage = osImage;
    }
    
    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    public void setContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }
    
    public String getKubeletVersion() {
        return kubeletVersion;
    }

    public void setKubeletVersion(String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
    }
    
    public String getKubeProxyVersion() {
        return kubeProxyVersion;
    }

    public void setKubeProxyVersion(String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
    }
    
    public String getInternalIP() {
        return internalIP;
    }

    public void setInternalIP(String internalIP) {
        this.internalIP = internalIP;
    }
    
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    public Integer getAllocatedPodCount() {
        return allocatedPodCount;
    }

    public void setAllocatedPodCount(Integer allocatedPodCount) {
        this.allocatedPodCount = allocatedPodCount;
    }
    
    public Integer getPodCapacity() {
        return podCapacity;
    }

    public void setPodCapacity(Integer podCapacity) {
        this.podCapacity = podCapacity;
    }
    
    public Boolean getUnschedulable() {
        return unschedulable;
    }

    public void setUnschedulable(Boolean unschedulable) {
        this.unschedulable = unschedulable;
    }
    
    public String getCPUCapacity() {
        return cpuCapacity;
    }

    public void setCPUCapacity(String cpuCapacity) {
        this.cpuCapacity = cpuCapacity;
    }
    
    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }
    
    public String getMemoryRequests() {
        return memoryRequests;
    }

    public void setMemoryRequests(String memoryRequests) {
        this.memoryRequests = memoryRequests;
    }
    
    public String getMemoryRequestsFraction() {
        return memoryRequestsFraction;
    }

    public void setMemoryRequestsFraction(String memoryRequestsFraction) {
        this.memoryRequestsFraction = memoryRequestsFraction;
    }
    
    public String getMemoryLimits() {
        return memoryLimits;
    }

    public void setMemoryLimits(String memoryLimits) {
        this.memoryLimits = memoryLimits;
    }
    
    public String getMemoryLimitsFraction() {
        return memoryLimitsFraction;
    }

    public void setMemoryLimitsFraction(String memoryLimitsFraction) {
        this.memoryLimitsFraction = memoryLimitsFraction;
    }
    
    public String getCPURequests() {
        return cpuRequests;
    }

    public void setCPURequests(String cpuRequests) {
        this.cpuRequests = cpuRequests;
    }
    
    public String getCPURequestsFraction() {
        return cpuRequestsFraction;
    }

    public void setCPURequestsFraction(String cpuRequestsFraction) {
        this.cpuRequestsFraction = cpuRequestsFraction;
    }
    
    public String getCPULimits() {
        return cpuLimits;
    }

    public void setCPULimits(String cpuLimits) {
        this.cpuLimits = cpuLimits;
    }
    
    public String getCPULimitsFraction() {
        return cpuLimitsFraction;
    }

    public void setCPULimitsFraction(String cpuLimitsFraction) {
        this.cpuLimitsFraction = cpuLimitsFraction;
    }
    
    public List<K8SNodeCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<K8SNodeCondition> conditions) {
        this.conditions = conditions;
    }
    
    public List<String> getContainerImages() {
        return containerImages;
    }

    public void setContainerImages(List<String> containerImages) {
        this.containerImages = containerImages;
    }
    
    public List<String> getTaints() {
        return taints;
    }

    public void setTaints(List<String> taints) {
        this.taints = taints;
    }
    
        public static class K8SNodeCondition extends Response {
            
        
    /**
     * Condition 类型，如 MemoryPressure、DiskPressure、PIDPressure、Ready
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 状态，False、True
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 最后一次上报状态的时间
     */
    @SerializedName("LastProbeTime")
    private String lastProbeTime;
        
    
        
    /**
     * 最后一次状态转变时间
     */
    @SerializedName("LastTransitionTime")
    private String lastTransitionTime;
        
    
        
    /**
     * 状态变化的原因
     */
    @SerializedName("Reason")
    private String reason;
        
    
        
    /**
     * 状态变化的描述信息
     */
    @SerializedName("Message")
    private String message;
        
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }
    
    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }
    
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
        }
}









