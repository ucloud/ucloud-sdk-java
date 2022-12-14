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

package cn.ucloud.uphone.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class ImportFileRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 云手机ID
     */
    @NotEmpty
    @UCloudParam("UPhoneIds")
    private List<String> uPhoneIds;
        
    
        
    /**
     * 文件名
     */
    @NotEmpty
    @UCloudParam("FileName")
    private String fileName;
        
    
        
    /**
     * 文件下载链接
     */
    @NotEmpty
    @UCloudParam("URL")
    private String url;
        
    
        
    /**
     * 城市。 参见 [云手机城市列表](https://docs.ucloud.cn/api/uphone-api/describe_u_phone_cities)
     */
    @UCloudParam("CityId")
    private String cityId;
        
    
        
    /**
     * 枚举值。表示当前操作的产品类型，目前固定值【uphone】，表示云手机场景。
     */
    @UCloudParam("ProductType")
    private String productType;
        
    
        
    /**
     * 上传文件为apk时，可强制指定32位还是64位运行
。armeabi-v7a（32位）;不填为系统默认值（64位）
     */
    @UCloudParam("ABI")
    private String abi;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public List<String> getUPhoneIds() {
        return uPhoneIds;
    }

    public void setUPhoneIds(List<String> uPhoneIds) {
        this.uPhoneIds = uPhoneIds;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }
    
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public String getABI() {
        return abi;
    }

    public void setABI(String abi) {
        this.abi = abi;
    }
    
}









