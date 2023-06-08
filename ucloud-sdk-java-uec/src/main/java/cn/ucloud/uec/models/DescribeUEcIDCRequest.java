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

package cn.ucloud.uec.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribeUEcIDCRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 节点cpu核数
     */
    @NotEmpty
    @UCloudParam("Cpu")
    private Integer cpu;
        
    
        
    /**
     * 节点内存大小， 单位GB
     */
    @NotEmpty
    @UCloudParam("Memory")
    private Integer memory;
        
    
        
    /**
     * Idc机房id。默认全部机房
     */
    @UCloudParam("IdcId")
    private List<String> idcId;
        
    
        
    /**
     * 0-其它, 1-一线城市单线,2-二线城市单线, 3-全国教育网, 4-全国三通
     */
    @UCloudParam("Type")
    private Integer type;
        
    
        
    /**
     * 产品类型：normal（经济型），hf（标准型）,g(GPU型)
     */
    @UCloudParam("ProductType")
    private String productType;
        
    
        
    /**
     * Gpu卡核心数
     */
    @UCloudParam("Gpu")
    private Integer gpu;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }
    
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    public List<String> getIdcId() {
        return idcId;
    }

    public void setIdcId(List<String> idcId) {
        this.idcId = idcId;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }
    
}









