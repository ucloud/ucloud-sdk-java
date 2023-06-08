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

package cn.ucloud.udi.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateMediaTaskRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 存储源
     */
    @NotEmpty
    @UCloudParam("StorageBackend")
    private String storageBackend;
        
    
        
    /**
     * Bucket名称
     */
    @NotEmpty
    @UCloudParam("Bucket")
    private String bucket;
        
    
        
    /**
     * 源文件
     */
    @NotEmpty
    @UCloudParam("SrcKey")
    private String srcKey;
        
    
        
    /**
     * 目标生成文件
     */
    @NotEmpty
    @UCloudParam("DstKey")
    private String dstKey;
        
    
        
    /**
     * 功能名称：例VideoTranscode
     */
    @NotEmpty
    @UCloudParam("Function")
    private String function;
        
    
        
    /**
     * 功能的参数模板ID，需要事先创建模板才可用，也可以使用预设模板，详细可通过DescribeFunctionTemplate接口查询
     */
    @NotEmpty
    @UCloudParam("FunctionParamTemplateId")
    private String functionParamTemplateId;
        
    
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
    
    public String getStorageBackend() {
        return storageBackend;
    }

    public void setStorageBackend(String storageBackend) {
        this.storageBackend = storageBackend;
    }
    
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    public String getSrcKey() {
        return srcKey;
    }

    public void setSrcKey(String srcKey) {
        this.srcKey = srcKey;
    }
    
    public String getDstKey() {
        return dstKey;
    }

    public void setDstKey(String dstKey) {
        this.dstKey = dstKey;
    }
    
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    
    public String getFunctionParamTemplateId() {
        return functionParamTemplateId;
    }

    public void setFunctionParamTemplateId(String functionParamTemplateId) {
        this.functionParamTemplateId = functionParamTemplateId;
    }
    
}









