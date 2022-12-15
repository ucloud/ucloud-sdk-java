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

public class CreateUEcVHostResponse extends Response {

    
        
    /**
     * 节点id（详情参考NodeList）
     */
    @SerializedName("NodeList")
    private List<NodeList> nodeList;
        
    
    public List<NodeList> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<NodeList> nodeList) {
        this.nodeList = nodeList;
    }
    
        public static class NodeList extends Response {
            
        
    /**
     * 虚拟机资源id
     */
    @SerializedName("NodeId")
    private String nodeId;
        
    
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
    
        }
}









