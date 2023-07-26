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

public class DescribeUPhoneModelRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 【数组】要获得信息的 UPhoneModel 名称。调用方式举例：UPhoneModelNames.0=希望获取信息的 UPhoneModel1，UPhoneModelNames.1=UPhoneModel2。 如果不传入，则返回当前 城市 所有符合条件的 UPhoneModel。
     */
    @UCloudParam("UPhoneModelNames")
    private List<String> uPhoneModelNames;
        
    
        
    /**
     * 列表起始位置偏移量，默认为0
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
        
    /**
     * 返回数据长度，默认为20，最大100
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * 枚举值。表示当前操作的产品类型，目前固定值【uphone】，表示云手机场景。
     */
    @UCloudParam("ProductType")
    private String productType;
        
    
        
    /**
     * 使用场景：海外(OVERSEA)，境内(INLAND)
     */
    @UCloudParam("Scene")
    private String scene;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public List<String> getUPhoneModelNames() {
        return uPhoneModelNames;
    }

    public void setUPhoneModelNames(List<String> uPhoneModelNames) {
        this.uPhoneModelNames = uPhoneModelNames;
    }
    
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
    
}









