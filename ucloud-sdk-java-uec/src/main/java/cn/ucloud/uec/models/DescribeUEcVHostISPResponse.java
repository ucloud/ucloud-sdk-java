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


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUEcVHostISPResponse extends Response {

    
        
    /**
     * 节点运营商列表
     */
    @SerializedName("NodeIspList")
    private List<NodeIspList> nodeIspList;
        
    
    public List<NodeIspList> getNodeIspList() {
        return nodeIspList;
    }

    public void setNodeIspList(List<NodeIspList> nodeIspList) {
        this.nodeIspList = nodeIspList;
    }
    
        public static class NodeIspList extends Response {
            
        
    /**
     * 省份
     */
    @SerializedName("Province")
    private String province;
        
    
        
    /**
     * 城市
     */
    @SerializedName("City")
    private String city;
        
    
        
    /**
     * 线路类型
     */
    @SerializedName("LineType")
    private String lineType;
        
    
        
    /**
     * 机房运营商名称
     */
    @SerializedName("IspName")
    private String ispName;
        
    
        
    /**
     * 机房名称
     */
    @SerializedName("IdcName")
    private String idcName;
        
    
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }
    
    public String getIspName() {
        return ispName;
    }

    public void setIspName(String ispName) {
        this.ispName = ispName;
    }
    
    public String getIdcName() {
        return idcName;
    }

    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }
    
        }
}









