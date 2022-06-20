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
package cn.ucloud.uec.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUEcHolderRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 机房id */
    @NotEmpty
    @UCloudParam("IdcId")
    private String idcId;

    /** 容器组Cpu总核数 */
    @NotEmpty
    @UCloudParam("CpuCore")
    private Double cpuCore;

    /** 容器组总内存，单位MB */
    @NotEmpty
    @UCloudParam("MemSize")
    private Integer memSize;

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 容器组名称（默认default） */
    @UCloudParam("Name")
    private String name;

    /** 机型（normal-经济型，hf-标准型，默认normal） */
    @UCloudParam("ProductType")
    private String productType;

    /** 重启策略（0总是，1失败是，2永不，默认0） */
    @UCloudParam("RestartStrategy")
    private Integer restartStrategy;

    /** 绑定外网ip（yes-绑定，no-不绑定，默认no） */
    @UCloudParam("ElasticIp")
    private String elasticIp;

    /** 外网绑定的带宽（单位M，默认0，只有当ElasticIp为yes时，默认1） */
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 防火墙ID */
    @UCloudParam("FirewallId")
    private String firewallId;

    /** 付费方式（2按月、3按年。默认2，默认月付） */
    @UCloudParam("ChargeType")
    private Integer chargeType;

    /** 月数或者年数（默认值：1，当为按月计费时，0表示计费到月底，默认值为0） */
    @UCloudParam("ChargeQuantity")
    private Integer chargeQuantity;

    /** */
    @UCloudParam("Pack")
    private List<Pack> pack;

    /** */
    @UCloudParam("Image")
    private List<Image> image;

    /** */
    @UCloudParam("Storage")
    private List<Storage> storage;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
    }

    public Double getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(Double cpuCore) {
        this.cpuCore = cpuCore;
    }

    public Integer getMemSize() {
        return memSize;
    }

    public void setMemSize(Integer memSize) {
        this.memSize = memSize;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getRestartStrategy() {
        return restartStrategy;
    }

    public void setRestartStrategy(Integer restartStrategy) {
        this.restartStrategy = restartStrategy;
    }

    public String getElasticIp() {
        return elasticIp;
    }

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChargeQuantity() {
        return chargeQuantity;
    }

    public void setChargeQuantity(Integer chargeQuantity) {
        this.chargeQuantity = chargeQuantity;
    }

    public List<Pack> getPack() {
        return pack;
    }

    public void setPack(List<Pack> pack) {
        this.pack = pack;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public List<Storage> getStorage() {
        return storage;
    }

    public void setStorage(List<Storage> storage) {
        this.storage = storage;
    }

    public static class Pack extends Request {

        /** 容器名称 */
        @UCloudParam("Name")
        private String name;

        /** 容器Cpu核数 */
        @UCloudParam("CpuCore")
        private Double cpuCore;

        /** 容器内存，单位MB */
        @UCloudParam("MemSize")
        private Integer memSize;

        /** 容器镜像名称 */
        @UCloudParam("ImageName")
        private String imageName;

        /** 容器工作目录 */
        @UCloudParam("WorkDir")
        private String workDir;

        /** 开启容器的命令 */
        @UCloudParam("Cmd")
        private String cmd;

        /** 容器参数（多个用；隔开） */
        @UCloudParam("Args")
        private String args;

        /** 容器环境变量（多个用；隔开,如：key1:value1;key2:value2） */
        @UCloudParam("Environment")
        private String environment;

        /** 容器配置字典（多个用；隔开，如：/data1:resId1;/data2:resId2） */
        @UCloudParam("ConfigDict")
        private String configDict;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getCpuCore() {
            return cpuCore;
        }

        public void setCpuCore(Double cpuCore) {
            this.cpuCore = cpuCore;
        }

        public Integer getMemSize() {
            return memSize;
        }

        public void setMemSize(Integer memSize) {
            this.memSize = memSize;
        }

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getWorkDir() {
            return workDir;
        }

        public void setWorkDir(String workDir) {
            this.workDir = workDir;
        }

        public String getCmd() {
            return cmd;
        }

        public void setCmd(String cmd) {
            this.cmd = cmd;
        }

        public String getArgs() {
            return args;
        }

        public void setArgs(String args) {
            this.args = args;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public String getConfigDict() {
            return configDict;
        }

        public void setConfigDict(String configDict) {
            this.configDict = configDict;
        }
    }

    public static class Storage extends Request {

        /** 存储卷挂载路径 */
        @UCloudParam("Path")
        private String path;

        /** 存储卷资源id */
        @UCloudParam("ResourceId")
        private String resourceId;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

    public static class Image extends Request {

        /** 镜像用户名和密码（如镜像名：密码） */
        @UCloudParam("Message")
        private String message;

        /** 镜像仓库地址 */
        @UCloudParam("StoreAddress")
        private String storeAddress;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStoreAddress() {
            return storeAddress;
        }

        public void setStoreAddress(String storeAddress) {
            this.storeAddress = storeAddress;
        }
    }
}
