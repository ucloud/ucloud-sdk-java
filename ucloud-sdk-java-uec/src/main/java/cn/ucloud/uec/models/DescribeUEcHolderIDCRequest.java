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

public class DescribeUEcHolderIDCRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 容器组Cpu核数 */
    @NotEmpty
    @UCloudParam("Cpu")
    private Double cpu;

    /** 容器组内存大小（单位MB） */
    @NotEmpty
    @UCloudParam("Memory")
    private Integer memory;

    /** Idc机房id。默认全部机房 */
    @UCloudParam("IdcId")
    private List<String> idcId;

    /** 0-其它, 1-一线城市单线,2-二线城市单线, 3-全国教育网, 4-全国三通 */
    @UCloudParam("Type")
    private Integer type;

    /** 产品类型，normal标准型，hf高性能型 */
    @UCloudParam("ProductType")
    private String productType;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
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
}
