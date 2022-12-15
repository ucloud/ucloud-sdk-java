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

package cn.ucloud.udb.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class SetUDBRWSplittingRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * DB实例ID（master)
     */
    @NotEmpty
    @UCloudParam("MasterDBId")
    private String masterDBId;
        
    
        
    /**
     * 读写分离策略
     */
    @NotEmpty
    @UCloudParam("ReadModel")
    private String readModel;
        
    
        
    /**
     * DBIds.0 代表UDB主节点， DBIds.1 到DBIds.n 代表1到N个从节点
     */
    @NotEmpty
    @UCloudParam("DBIds")
    private List<String> dbIds;
        
    
        
    /**
     * udb主从节点的只读比例。ReadPercents.0代表主节点的只读比例，ReadPercents.1代表从节点1的读写比例， 以此类推
     */
    @UCloudParam("ReadPercents")
    private List<String> readPercents;
        
    
        
    /**
     * 时间阙值
     */
    @UCloudParam("DelayThreshold")
    private Integer delayThreshold;
        
    
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
    
    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }
    
    public String getReadModel() {
        return readModel;
    }

    public void setReadModel(String readModel) {
        this.readModel = readModel;
    }
    
    public List<String> getDBIds() {
        return dbIds;
    }

    public void setDBIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }
    
    public List<String> getReadPercents() {
        return readPercents;
    }

    public void setReadPercents(List<String> readPercents) {
        this.readPercents = readPercents;
    }
    
    public Integer getDelayThreshold() {
        return delayThreshold;
    }

    public void setDelayThreshold(Integer delayThreshold) {
        this.delayThreshold = delayThreshold;
    }
    
}









